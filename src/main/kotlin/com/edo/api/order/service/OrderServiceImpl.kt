package com.edo.api.service

import com.edo.api.entities.user.Order
import com.edo.api.entities.user.OrderItem
import com.edo.api.entities.user.OrderResult
import com.edo.api.repository.OrderRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*
import com.edo.api.service.ProductService // Importe a interface ProductService

@Service
class OrderServiceImpl(
        private val orderRepository: OrderRepository,
        private val productService: ProductService
) : OrderService {

    @Transactional
    override fun placeOrder(order: Order): OrderResult {
        val orderResult = OrderResult()

        for (orderItem in order.orderItems) {
            val product = productService.getProductById(orderItem.productId)

            if (product.isPresent) {
                val availableQuantity = product.get().quantityAvailable
                if (availableQuantity >= orderItem.quantity) {
                    // O produto está disponível em estoque, processa o pedido
                    val updatedQuantity = availableQuantity - orderItem.quantity
                    product.get().quantityAvailable = updatedQuantity
                    productService.updateProduct(product.get())

                    // Adicione o pedido à lista de pedidos processados
                    orderResult.addProcessedItem(orderItem)
                } else {
                    // O produto não está disponível em estoque
                    orderResult.addUnavailableItem(orderItem)
                }
            } else {
                // Produto não encontrado
                orderResult.addNotFoundItem(orderItem)
            }
        }

        // Salve o pedido no banco de dados
        orderRepository.save(order)

        return orderResult
    }
}

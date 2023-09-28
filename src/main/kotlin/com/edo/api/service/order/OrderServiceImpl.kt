package com.edo.api.order.service

import com.edo.api.entities.user.Order
import com.edo.api.controller.controller.order.OrderController
import com.edo.api.order.repository.OrderRepository
import com.edo.api.product.service.ProductService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class OrderServiceImpl(
        private val orderRepository: OrderRepository,
        private val productService: ProductService
) : OrderService {

    @Transactional
    override fun placeOrder(order: Order): OrderController {
        val orderResult = OrderController()

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

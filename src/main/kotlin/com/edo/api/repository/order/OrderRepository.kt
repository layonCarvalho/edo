<<<<<<< HEAD:src/main/kotlin/com/edo/api/order/repository/OrderRepository.kt
package com.edo.api.order.repository
=======
package com.edo.api.repository.repository.order
>>>>>>> 03033b46db96af684443b670fe0642a82eb2f5fe:src/main/kotlin/com/edo/api/repository/order/OrderRepository.kt

import com.edo.api.order.entities.Order
import org.springframework.data.jpa.repository.JpaRepository

interface OrderRepository : JpaRepository<Order, Long>

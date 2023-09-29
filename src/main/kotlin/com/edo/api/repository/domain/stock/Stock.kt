package com.edo.api.repository.domain.stock



import javax.persistence.*


@Entity
@Table(schema = "public", name = "tb_stock")
open class Stock (

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "id_stock", nullable = false)
        open var id: Long? = null
)
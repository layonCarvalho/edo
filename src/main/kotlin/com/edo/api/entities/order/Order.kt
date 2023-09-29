package com.edo.api.entities.order



import javax.persistence.*


@Entity
@Table(schema = "public", name = "tb_order")
open class Order (

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "id_order", nullable = false)
        open var id: Long? = null
)



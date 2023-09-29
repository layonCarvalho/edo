package com.edo.api.entities.product



import javax.persistence.*


@Entity
@Table(schema = "public", name = "tb_produto")
open class Product (

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "id_produto", nullable = false)
        open var id: Long? = null,

        @Column(name = "name")
        var name: String? = null,

        @Column(name = "description")
        var description: String? = null,

        @Column(name = "price")
        var price: Double? = null,

        @Column(name = "quantityAvailable")
        var quantityAvailable: Int? = null
)
package com.edo.api.entities.stock



import javax.persistence.*


@Entity
@Table(schema = "public", name = "tb_stock")
open class Stock (

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "id_stock", nullable = false)
        open var id: Long? = null
)
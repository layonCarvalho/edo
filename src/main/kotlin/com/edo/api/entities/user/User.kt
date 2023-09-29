package com.edo.api.entities.user


import javax.persistence.*


@Entity
@Table(schema = "public", name = "tb_usuario")
open class User (

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_usuario", nullable = false)
    open var id: Long? = null,

    @Column(name = "username")
    open val username: String? = null,

    @Column(name = "//TODO - EVOLUIR ENUM")
    open val password: String? = null
)

/*

fun List<Asset>.toEntity() = map { it.toEntity() }

fun Asset.toEntity() = AssetEntity(id = id,
								 name = assetName,
								 fullValue = fullValue,
								type = type,
								 manager = manager
								// active = active,
							//	 dateCreate = dateCreate,
							//	 dateUpdate = dateUpdate,
						//		 dateExclude = dateExclude
		 )

fun List<AssetEntity>.toDomain() = map { it.toDomain() }

fun AssetEntity.toDomain() = Asset(id = id,
	assetName = name,
	type = type,
	fullValue = fullValue,
	manager = manager,
	active = active,
	dateCreate = dateCreate,
	dateUpdate = dateUpdate,
	dateExclude = dateExclude)




data class User(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val username: String,
    val password: String
)

 */



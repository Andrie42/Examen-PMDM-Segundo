package com.app.andreaamadolain_pmdm_segunda.data.model

data class ProductoDto(
    val _id: String,
    val name: String,
    val description: String,
    val price: Double,
    val category: String,
    val image: String,
    val active: Boolean
)
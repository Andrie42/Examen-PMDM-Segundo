package com.app.andreaamadolain_pmdm_segunda.data.repository

import com.app.andreaamadolain_pmdm_segunda.data.model.ProductoDto
import com.app.andreaamadolain_pmdm_segunda.data.remote.ProductosApi

class ProductosRepository(private val api: ProductosApi) {
    suspend fun getProducts(): List<ProductoDto> =
        api.getProducts().results
}
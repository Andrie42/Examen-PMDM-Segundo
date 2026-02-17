package com.app.andreaamadolain_pmdm_segunda.data.remote

import com.app.andreaamadolain_pmdm_segunda.data.model.ProductoDto
import com.app.andreaamadolain_pmdm_segunda.data.model.SimpleResponse
import retrofit2.http.GET

interface ProductosApi {
    @GET("products")
    suspend fun getProducts(): SimpleResponse<ProductoDto>
}
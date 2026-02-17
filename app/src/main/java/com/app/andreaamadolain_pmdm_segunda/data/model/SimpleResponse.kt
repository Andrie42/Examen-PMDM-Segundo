package com.app.andreaamadolain_pmdm_segunda.data.model

// Se utiliza un wrapper para poder obviar la paginación del array de resultados de la API

data class SimpleResponse<T>(
    val results: List<T>
)
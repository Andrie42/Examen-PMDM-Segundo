package com.app.andreaamadolain_pmdm_segunda.presentation.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.andreaamadolain_pmdm_segunda.data.remote.ProductosNetWork
import com.app.andreaamadolain_pmdm_segunda.data.repository.ProductosRepository
import com.app.andreaamadolain_pmdm_segunda.data.model.ProductoDto
import kotlinx.coroutines.launch

class ProductosViewModel : ViewModel() {

    private val repository = ProductosRepository(ProductosNetWork.api)

    var state by mutableStateOf<UiState<List<ProductoDto>>>(UiState.Loading)
        private set

    init {
        loadProducts()
    }

    fun loadProducts() {
        viewModelScope.launch {
            state = UiState.Loading
            state = try {
                UiState.Success(repository.getProducts())
            } catch (e: Exception) {
                UiState.Error(e.message ?: "Error al cargar los productos")
            }
        }
    }

}
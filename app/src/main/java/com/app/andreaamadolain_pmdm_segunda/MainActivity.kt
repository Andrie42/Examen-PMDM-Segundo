package com.app.andreaamadolain_pmdm_segunda

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Surface
import androidx.lifecycle.viewmodel.compose.viewModel
import com.app.andreaamadolain_pmdm_segunda.presentation.viewmodel.ProductosViewModel
import com.app.andreaamadolain_pmdm_segunda.ui.screens.ListaProductosScreen
import com.app.andreaamadolain_pmdm_segunda.ui.theme.AndreaAmadoLain_PMDM_SegundaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndreaAmadoLain_PMDM_SegundaTheme {
                Surface() {
                    val vm: ProductosViewModel = viewModel()
                    ListaProductosScreen(vm)
                }
            }
        }
    }
}
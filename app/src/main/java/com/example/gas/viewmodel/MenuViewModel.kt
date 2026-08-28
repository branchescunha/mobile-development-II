package com.example.gas.viewmodel

import androidx.lifecycle.ViewModel
import com.example.gas.model.MenuItem

class MenuViewModel : ViewModel() {

    fun obterItensDoMenu(): List<MenuItem> {
        return listOf(
            MenuItem("SOBRE", "ℹ️"),
            MenuItem("CALCULADORA\nCOMBUSTÍVEL", "⛽"),
            MenuItem("CARROS\nGASOLINA", "🚗"),
            MenuItem("CADASTRO\nCARRO", "➕")
        )
    }
}
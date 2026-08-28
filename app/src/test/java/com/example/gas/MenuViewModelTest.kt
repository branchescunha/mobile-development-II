package com.example.gas

import com.example.gas.model.MenuItem
import com.example.gas.viewmodel.MenuViewModel
import org.junit.Assert.assertEquals
import org.junit.Test

class MenuViewModelTest {

    @Test
    fun menuContemAsQuatroOpcoesEsperadas() {
        val viewModel = MenuViewModel()

        val esperado = listOf(
            MenuItem("SOBRE", "ℹ️"),
            MenuItem("CALCULADORA\nCOMBUSTÍVEL", "⛽"),
            MenuItem("CARROS\nGASOLINA", "🚗"),
            MenuItem("CADASTRO\nCARRO", "➕")
        )

        assertEquals(esperado, viewModel.obterItensDoMenu())
    }
}
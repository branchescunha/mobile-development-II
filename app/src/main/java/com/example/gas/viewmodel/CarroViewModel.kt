package com.example.gas.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.gas.model.Carro

class CarroViewModel: ViewModel() {
    private val _carros = MutableLiveData<List<Carro>>()

    val carros: LiveData<List<Carro>> get() = _carros

    init {
        _carros.value = listOf(
            Carro("Byd Dolphin"),
            Carro("Toyota Hilux"),
            Carro("Chevrolet Opala"),
            )
    }
}
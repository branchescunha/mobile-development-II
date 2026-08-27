package com.example.gas.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.gas.model.CombustivelModel

class CombustivelViewModel: ViewModel() {
    private val calculadora = CombustivelModel()
    private val _resultado = MutableLiveData<String>()
    val resultado: LiveData<String> get() = _resultado

    fun calcular(etanol:String,gasolina:String){
        val precoEtanol = etanol.toDouble()
        val precoGasolina = gasolina.toDouble()

        val retorno = calculadora.calcular(precoEtanol,precoGasolina)

        if(retorno == "Gasolina"){
            _resultado.value = "Compensa abastecer com Gasolina"
        }else{
            _resultado.value = "Compensa abastecer com Etanol"
        }
    }

    fun limpar(){
        _resultado.value = ""
    }
}
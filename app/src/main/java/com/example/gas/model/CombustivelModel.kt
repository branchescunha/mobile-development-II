package com.example.gas.model

class CombustivelModel {
    fun calcular(precoEtanol:Double,precoGasolina:Double):String{
        var resultado:Double = precoEtanol/precoGasolina

        if(resultado>=0.7){
            return "Gasolina"
        }else{
            return "Etanol"
        }
    }
}
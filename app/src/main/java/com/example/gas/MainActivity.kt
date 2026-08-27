package com.example.gas

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.gas.databinding.ActivityMainBinding
import com.example.gas.viewmodel.CombustivelViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: CombustivelViewModel by viewModels ()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        configurarObserver()
        configurarEventos()
    }

    private fun configurarObserver(){
        viewModel.resultado.observe(this){
            resultado -> binding.txtResultado.text = resultado
        }
    }

    private fun configurarEventos(){
        binding.btnCalcular.setOnClickListener {
            val precoEtanol = binding.edtEtanol.text.toString()
            val precoGasolina = binding.edtGasolina.text.toString()

            viewModel.calcular(precoEtanol,precoGasolina)
        }

        binding.btnLimpar.setOnClickListener {
            viewModel.limpar()
            binding.edtEtanol.text.clear()
            binding.edtGasolina.text.clear()
        }

        binding.btnListar.setOnClickListener {
            val intent = Intent(this, CarroActivity::class.java)
            startActivity(intent)
        }
    }
}
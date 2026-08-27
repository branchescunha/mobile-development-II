package com.example.gas

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.gas.databinding.ActivityCarroActivityBinding
import com.example.gas.viewmodel.CarroViewModel

class CarroActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCarroActivityBinding
    private val viewModel: CarroViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Default Config
        enableEdgeToEdge()
        // setContentView(R.layout.activity_carro_activity)
        // Config para uso do binding

        binding = ActivityCarroActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //End Default Config

        viewModel.carros.observe(this) { carros ->
            val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, carros)
            binding.listViewCarros.adapter = adapter
        }
    }
}
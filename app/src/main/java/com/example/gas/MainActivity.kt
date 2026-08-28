package com.example.gas

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.gas.databinding.ActivityMainBinding
import com.example.gas.databinding.ItemMenuCardBinding
import com.example.gas.model.MenuItem
import com.example.gas.viewmodel.MenuViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MenuViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val menuItems = viewModel.obterItensDoMenu()

        val adapter = MenuAdapter(menuItems)
        binding.gridView.adapter = adapter

        binding.gridView.setOnItemClickListener { _, _, position, _ ->
            when (position) {
                0 -> {
                    Toast.makeText(
                        this,
                        "Sobre",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                1 -> {
                    val intent = Intent(
                        this,
                        CombustivelActivity::class.java
                    )
                    startActivity(intent)
                }

                2 -> {
                    val intent = Intent(
                        this,
                        CarroActivity::class.java
                    )
                    startActivity(intent)
                }

                3 -> {
                    Toast.makeText(
                        this,
                        "Cadastro de carro",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }

    inner class MenuAdapter(
        private val items: List<MenuItem>
    ) : BaseAdapter() {

        override fun getCount(): Int {
            return items.size
        }

        override fun getItem(position: Int): MenuItem {
            return items[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(
            position: Int,
            convertView: View?,
            parent: ViewGroup?
        ): View {

            val itemBinding: ItemMenuCardBinding
            val view: View

            if (convertView == null) {
                itemBinding = ItemMenuCardBinding.inflate(
                    LayoutInflater.from(parent?.context),
                    parent,
                    false
                )

                view = itemBinding.root
                view.tag = itemBinding
            } else {
                itemBinding = convertView.tag as ItemMenuCardBinding
                view = convertView
            }

            val currentItem = items[position]

            itemBinding.tvIcon.text = currentItem.emoji
            itemBinding.tvMenuTitle.text = currentItem.title

            return view
        }
    }
}
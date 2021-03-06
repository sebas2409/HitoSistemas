package com.watermelon.hito_sistemas

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.watermelon.hito_sistemas.databinding.ActivityGruposBinding

class Grupos : AppCompatActivity() {
    private lateinit var binding: ActivityGruposBinding

    private val viewModel:AlumnoViewModel by lazy {
        ViewModelProvider(this)[AlumnoViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityGruposBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val numeroIntegrantes= intent.getIntExtra("numero",4)
        val lista = viewModel.grouping(numeroIntegrantes).toTypedArray()
        //binding.tvGruposCreados.append(lista.size.toString())

        binding.rvGrupos.layoutManager=LinearLayoutManager(this)
        binding.rvGrupos.adapter= GruposAdapter(lista)


    }
}
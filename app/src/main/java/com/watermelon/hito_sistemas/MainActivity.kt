package com.watermelon.hito_sistemas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.NumberPicker
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.watermelon.hito_sistemas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: AlumnoViewModel by lazy {
        ViewModelProvider(this)[AlumnoViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.rvAlumnList.layoutManager = LinearLayoutManager(this)
        binding.rvAlumnList.adapter = AlumnoAdapter(viewModel.lista)

        binding.btnAddAlumn.setOnClickListener{addAlumn()}
        binding.btnCreateGroup.setOnClickListener { createGroup() }
    }

    private fun createGroup() {
        val numberPicker = NumberPicker(this)
        numberPicker.maxValue=6
        numberPicker.minValue=1
        AlertDialog.Builder(this)
            .setView(numberPicker)
            .setTitle("Elige el numero de integrantes")
            .setPositiveButton("Ok"){_,_ ->
                val numero = numberPicker.value
                val intent= Intent(this,Grupos::class.java)
                intent.putExtra("numero", numero)
                startActivity(intent)
            }
            .create().show()
    }

    private fun addAlumn(){
        val view = EditText(this)
        view.hint="Nombre del alumno"
        AlertDialog.Builder(this)
            .setTitle("Ingresa el nombre del alumno")
            .setView(view)
            .setPositiveButton("Añadir"){dialog,_ ->
                val nombre = view.text.toString()
                viewModel.add(nombre)
                Log.i("grupos", viewModel.grouping(4).toString())
                dialog.dismiss()
            }
            .create().show()
    }
}
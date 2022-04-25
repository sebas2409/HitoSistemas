package com.watermelon.hito_sistemas

import androidx.lifecycle.ViewModel

class AlumnoViewModel: ViewModel() {

    val lista: ArrayList<String> = ArrayList()



    fun add(nombre: String){
        lista.add(nombre)
    }

    fun grouping(num: Int): List<List<String>> {
        return lista.chunked(num)
    }
}
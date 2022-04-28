package com.watermelon.hito_sistemas

import androidx.lifecycle.ViewModel

class AlumnoViewModel: ViewModel() {

    val lista2: ArrayList<String> = arrayListOf("Adrian","Portilla","Alamo","Johan","Sanchez","Ivan","Cervecitas","Iker",
    "Sergio","Isla","Astrid","Juan del campo","Angel","Victor","Bryan","Dani","Guti","Villalobos","Sebas","Diego","Mario","Rafa","Otro Valverde","Luquero")



    fun add(nombre: String){
        lista2.add(nombre)
    }

    fun grouping(num: Int): List<List<String>> {
        lista2.shuffle()
        return lista2.chunked(num)

    }
}

package com.watermelon.hito_sistemas

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.watermelon.hito_sistemas.databinding.AlumnHolderBinding

class AlumnoAdapter(val lista: ArrayList<String>):RecyclerView.Adapter<AlumnoAdapter.AlumnoHolder>() {


    class AlumnoHolder(val binding: AlumnHolderBinding):RecyclerView.ViewHolder(binding.root){}


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlumnoHolder {
        val binding = AlumnHolderBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return AlumnoHolder(binding)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: AlumnoHolder, position: Int) {
        holder.binding.tvNumero.text = (position+1).toString()
        holder.binding.tvNombre.text = lista[position]
    }

    override fun getItemCount(): Int {
       return lista.size
    }
}
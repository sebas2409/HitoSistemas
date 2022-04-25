package com.watermelon.hito_sistemas

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.watermelon.hito_sistemas.databinding.GruposHolderBinding

class GruposAdapter(private val grupos: List<List<String>>,
                    private val lista: ArrayList<String>,
                    private val numero: Int): RecyclerView.Adapter<GruposAdapter.GruposHolder>() {

    class GruposHolder(val binding: GruposHolderBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GruposHolder {
        val binding = GruposHolderBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return GruposHolder(binding)
    }

    override fun onBindViewHolder(holder: GruposHolder, position: Int) {
           grupos.forEach {
               holder.binding.tvGrupos.append(it.toString())
           }
    }

    override fun getItemCount(): Int {
        return lista.size/numero
    }
}
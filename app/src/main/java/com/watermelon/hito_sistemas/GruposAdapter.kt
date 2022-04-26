package com.watermelon.hito_sistemas

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.watermelon.hito_sistemas.databinding.GruposHolderBinding

class GruposAdapter(private val lista: Array<List<String>>): RecyclerView.Adapter<GruposAdapter.GruposHolder>() {

    class GruposHolder(val binding: GruposHolderBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GruposHolder {
        val binding = GruposHolderBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return GruposHolder(binding)
    }

    override fun onBindViewHolder(holder: GruposHolder, position: Int) {
        val listaGrupos = arrayListOf<String>()
        for (element in lista){
            listaGrupos.add(element.toString())
        }
        holder.binding.tvGrupos.append(listaGrupos[position])
    }

    override fun getItemCount(): Int {
        return lista.size
    }
}
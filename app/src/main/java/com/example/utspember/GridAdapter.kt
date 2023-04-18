package com.example.utspember

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.utspember.databinding.GridListBinding

class GridAdapter(private val list: ArrayList<Data>) : RecyclerView.Adapter<GridAdapter.MainViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridAdapter.MainViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.grid_list, parent, false)
        return MainViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: GridAdapter.MainViewHolder, position: Int) {
        val data = list[position]
        holder.bind(data)
    }

    class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val binding = GridListBinding.bind(itemView)
        fun bind(data: Data) {
            binding.textviewNama.text = data.nama
            binding.textviewUmur.text = data.umur
            binding.img.setImageResource(data.img)
        }

    }
}
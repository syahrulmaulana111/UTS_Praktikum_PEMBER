package com.example.utspember

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.utspember.databinding.ListListBinding

class ListAdapter(private val list: ArrayList<Data>) : RecyclerView.Adapter<ListAdapter.MainViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAdapter.MainViewHolder {
        return MainViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_list, parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ListAdapter.MainViewHolder, position: Int) {
        val data = list[position]
        holder.bind(data)
    }

    class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val binding = ListListBinding.bind(itemView)
        fun bind(data: Data) {
            binding.textviewNama.text = data.nama
            binding.textviewUmur.text = data.umur
            binding.img.setImageResource(data.img)
        }

    }
}
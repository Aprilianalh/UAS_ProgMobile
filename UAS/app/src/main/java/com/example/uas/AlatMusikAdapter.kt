package com.example.uas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_alat.view.*

class AlatMusikAdapter (private val itemFac: List<AlatMusik>, private val clickListener: (AlatMusik) -> Unit) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    // override untuk mengubah suatu fungsi pada parent
    //menyatakan suatu item dalam view holder baru
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_alat, parent, false)
        return PartViewHolder(view)
    }

    // menyetel materi item yang ditentukan dalam RecyclerView
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(itemFac[position], clickListener)
    }

    // mengembalikan jumlah data yang hendak ditampilkan
    override fun getItemCount() = itemFac.size
    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data: AlatMusik, clickListener: (AlatMusik) -> Unit) {
            itemView.foto_alat.setImageResource(data.picture)
            itemView.list_alat.text = data.name
            itemView.setOnClickListener {
                clickListener(data) }
        }
    }
}

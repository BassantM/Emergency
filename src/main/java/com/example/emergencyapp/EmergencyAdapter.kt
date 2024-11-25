package com.example.emergencyapp

import android.app.Activity
import android.content.Intent
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView

class EmergencyAdapter(val activity: Activity, val emergency:ArrayList<Emergency>)
    : RecyclerView.Adapter<EmergencyAdapter.MVH>() {
    class MVH (view:View):RecyclerView.ViewHolder(view) {
        val card:CardView = view.findViewById(R.id.parent)
        val text: TextView = view.findViewById(R.id.tv)
        val pic:ImageView = view.findViewById(R.id.image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MVH {
        val view = activity.layoutInflater.inflate(R.layout.emergency_list_tem , parent, false)
        return MVH(view)
    }

    override fun onBindViewHolder(holder: MVH, position: Int) {
        holder.card.setOnClickListener {
            val i = Intent(Intent.ACTION_DIAL, "tel: ${emergency[position].number}".toUri())
            activity.startActivity(i)
        }
        holder.text.text = emergency[position].name
        holder.pic.setImageResource(emergency[position].pic)

    }
    override fun getItemCount()= emergency.size

}



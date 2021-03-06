package com.example.contactbook

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(val userList: ArrayList<User>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.user_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvName.text = userList[position].name
        holder.tvMobile.text = userList[position].mobile
        if(userList[position].img==3)
        {
            holder.ivUser.setImageResource(R.drawable.woman)
        }
        else if (userList[position].img==1){
            holder.ivUser.setImageResource(R.drawable.man)
        }
        holder.ivUser.setOnClickListener{
            val intent = Intent(holder.ivUser.context,Detailedview::class.java)
            intent.putExtra("user_name",userList[position].name)
            intent.putExtra("mobile_number",userList[position].mobile)
            holder.ivUser.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return userList.size
    }
    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

        val ivUser : ImageView= itemView.findViewById(R.id.ivUser)
        val tvName : TextView = itemView.findViewById(R.id.tvName)
        val tvMobile : TextView = itemView.findViewById(R.id.tvMobile)

    }


}
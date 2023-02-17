package com.example.retrofit2

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofit2.databinding.ItemdogBinding
import com.squareup.picasso.Picasso

class DogViewHolder (view: View):RecyclerView.ViewHolder(view){
    private val binding = ItemdogBinding.bind(view)

    fun bind(image:String){

        Picasso.get().load(image).into(binding.ivDog)

    }
}
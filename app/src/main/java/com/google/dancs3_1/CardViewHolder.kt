package com.google.dancs3_1

import android.widget.ExpandableListView
import androidx.recyclerview.widget.RecyclerView

import com.google.dancs3_1.databinding.CardCellBinding



class CardViewHolder(
    private val cardCellBinding: CardCellBinding,
    private val clicktListener: CoffeeClicktListener
):RecyclerView.ViewHolder(cardCellBinding.root )

{
     fun bindCoffee(coffee: coffee) {
         cardCellBinding.cover.setImageResource(coffee.img)
         cardCellBinding.title.text = coffee.tvnName
         cardCellBinding.gia.text = coffee.tvgia


         cardCellBinding.cardView.setOnClickListener {

             clicktListener.onClick(coffee)
         }


     }
}
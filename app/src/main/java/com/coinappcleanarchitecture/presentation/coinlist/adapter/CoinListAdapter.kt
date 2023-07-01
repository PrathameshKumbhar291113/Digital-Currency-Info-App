package com.coinappcleanarchitecture.presentation.coinlist.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.bumptech.glide.Glide
import com.coinappcleanarchitecture.databinding.CoinListItemBinding
import com.coinappcleanarchitecture.network.model.Coins
import java.lang.Exception
import kotlin.math.log

class CoinListAdapter(
    private val context: Context,
    private var coinList : ArrayList<Coins>
) : RecyclerView.Adapter<CoinListAdapter.CoinListViewHolder>(){

    inner class CoinListViewHolder(val binding: CoinListItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindData(coinsSetData: Coins) {
            Log.e("API", "bindData: ${coinsSetData.name}", )
            Glide.with(context).load(coinsSetData.image).into(binding.coinImg)
            binding.coinName.text = coinsSetData.name
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoinListViewHolder {
        return CoinListViewHolder(
            CoinListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun getItemCount(): Int {
        Log.e("API", "getItemCount: ${coinList.size}")
        return coinList.size
    }


    override fun onBindViewHolder(holder: CoinListViewHolder, position: Int)
        = holder.bindData(coinList[position])

    @SuppressLint("NotifyDataSetChanged")
    fun setData(data: ArrayList<Coins>){
        coinList = data
        notifyDataSetChanged()
    }
}
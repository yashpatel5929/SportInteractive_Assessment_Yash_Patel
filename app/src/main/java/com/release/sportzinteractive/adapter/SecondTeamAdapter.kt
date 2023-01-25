package com.release.sportzinteractive.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.release.sportzinteractive.databinding.PlayerListItemBinding
import com.release.sportzinteractive.model.CustomPlayerDataClass

class SecondTeamAdapter(private val playersArrayList: ArrayList<CustomPlayerDataClass>): RecyclerView.Adapter<SecondTeamAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: PlayerListItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SecondTeamAdapter.ViewHolder {
        val binding = PlayerListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SecondTeamAdapter.ViewHolder, position: Int) {
        with(holder){
            binding.teamPlayerName.text = playersArrayList.get(position).Name_Full
        }
    }

    override fun getItemCount(): Int {
        return playersArrayList.size
    }
}
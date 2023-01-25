package com.release.sportzinteractive.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.release.sportzinteractive.databinding.PlayerListItemBinding
import com.release.sportzinteractive.model.CustomPlayerDataClass

class PlayersAdapter() : RecyclerView.Adapter<PlayersAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: PlayerListItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    private var currentPosition = -1

    private val playersArrayList = ArrayList<CustomPlayerDataClass>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayersAdapter.ViewHolder {
        val binding = PlayerListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PlayersAdapter.ViewHolder, position: Int) {
        val isExpanded = position == currentPosition
        with(holder){
            binding.playerDetailCard.setVisibility(if (isExpanded) View.VISIBLE else View.GONE)
            itemView.isActivated = isExpanded
            itemView.setOnClickListener {
                currentPosition =
                    if (isExpanded) -1 else position
                notifyDataSetChanged()
            }
            binding.teamPlayerName.text = playersArrayList.get(position).Name_Full

            if(playersArrayList.get(position).Batting!!.isNotEmpty()){
                binding.playerBattingStyle.text = "Batting Style : ${playersArrayList.get(position).Batting}"
            }

            if(playersArrayList.get(position).BowllingStyle!!.isNotEmpty()){
                binding.playerBowlingStyle.text = "Bowling Style : ${playersArrayList.get(position).BowllingStyle}"
            }

            if(playersArrayList.get(position).IsCaptain!!){
                binding.imgCaptain.visibility = View.VISIBLE
            }else{
                binding.imgCaptain.visibility = View.GONE
            }
        }
    }

    override fun getItemCount(): Int {
        return playersArrayList.size
    }

    fun addTeamData(firstTeamData: ArrayList<CustomPlayerDataClass>,secondTeamData: ArrayList<CustomPlayerDataClass>) {
        playersArrayList.clear()
        playersArrayList.addAll(firstTeamData)
        playersArrayList.addAll(secondTeamData)
        notifyDataSetChanged()
    }

    fun addFirstTeamData(playerDataList: ArrayList<CustomPlayerDataClass>) {
        playersArrayList.clear()
        playersArrayList.addAll(playerDataList)
        notifyDataSetChanged()
    }

    fun addSecondTeamData(secondTeamAdapter: ArrayList<CustomPlayerDataClass>) {
        playersArrayList.clear()
        playersArrayList.addAll(secondTeamAdapter)
        notifyDataSetChanged()
    }
}
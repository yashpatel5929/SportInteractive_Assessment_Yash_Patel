package com.release.sportzinteractive.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.release.sportzinteractive.databinding.MatchDetailItemListBinding
import com.release.sportzinteractive.model.MatchDetailResponseModel
import com.release.sportzinteractive.model.Matchdetail
import com.release.sportzinteractive.model.SecondMatchDetailResponseModel
import com.release.sportzinteractive.model.Teams
import com.release.sportzinteractive.view.MatchDetailScreen

class MatchDetailAdapter(
    private val matchDetailList: ArrayList<MatchDetailResponseModel>,
    private val secondMatchDetail: ArrayList<SecondMatchDetailResponseModel>,
    private val buttonOnClickListener: ButtonClickListener
) : RecyclerView.Adapter<MatchDetailAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: MatchDetailItemListBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val binding =MatchDetailItemListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MatchDetailAdapter.ViewHolder, position: Int) {
        if(position == 0){
            with(holder){
                binding.teamOneName.text = matchDetailList.get(0).Teams?.four?.NameFull
                binding.teamTwoName.text = matchDetailList.get(0).Teams?.five?.NameFull
                binding.txtDate.text = matchDetailList.get(0).Matchdetail?.Match?.Date
                binding.txtTime.text = matchDetailList.get(0).Matchdetail?.Match?.Time
                binding.txtlocation.text = matchDetailList.get(0).Matchdetail?.Venue?.Name
                binding.btnViewDetail.setOnClickListener {
                    buttonOnClickListener.onButtonClick(0)
                }
            }
        }else{
            with(holder){
                binding.teamOneName.text = secondMatchDetail.get(0).teams?.teamPAK?.nameFull
                binding.teamTwoName.text = secondMatchDetail.get(0).teams?.teamSA?.nameFull
                binding.txtDate.text = secondMatchDetail.get(0).matchdetail?.Match?.Date
                binding.txtTime.text = secondMatchDetail.get(0).matchdetail?.Match?.Time
                binding.txtlocation.text = secondMatchDetail.get(0).matchdetail?.Venue?.Name
                binding.btnViewDetail.setOnClickListener {
                    buttonOnClickListener.onButtonClick(1)
                }
            }
        }

    }

    override fun getItemCount(): Int {
        return 2;
    }

    interface ButtonClickListener {
        fun onButtonClick(position: Int)
    }
}
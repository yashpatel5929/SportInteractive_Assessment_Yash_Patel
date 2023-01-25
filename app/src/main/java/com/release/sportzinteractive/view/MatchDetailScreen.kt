package com.release.sportzinteractive.view

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.release.sportzinteractive.adapter.MatchDetailAdapter
import com.release.sportzinteractive.databinding.ActivityMatchDetailScreenBinding
import com.release.sportzinteractive.model.MatchDetailResponseModel
import com.release.sportzinteractive.model.SecondMatchDetailResponseModel
import com.release.sportzinteractive.viewmodel.MatchDetailViewModel


class MatchDetailScreen : AppCompatActivity(),MatchDetailAdapter.ButtonClickListener {

    private lateinit var binding: ActivityMatchDetailScreenBinding
    private lateinit var viewModel: MatchDetailViewModel
    private lateinit var matchDetailAdapter: MatchDetailAdapter
    val matchDetailList = ArrayList<MatchDetailResponseModel>()
    val secondMatchDetail  = ArrayList<SecondMatchDetailResponseModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMatchDetailScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(MatchDetailViewModel::class.java)

        apiCall()

    }

    private fun setObserver() {
        viewModel.matchDetail.observe(this, Observer {
            matchDetailList.add(it)
        })

        viewModel.secondMatchDetail.observe(this, Observer {
            secondMatchDetail.add(it)
        })

        if(matchDetailList.size > 0 && secondMatchDetail.size >0){

        }

        viewModel.loading.observe(this, Observer {
            if(it){
                binding.progressBarCyclic.visibility = View.VISIBLE
            }else{
                binding.progressBarCyclic.visibility = View.GONE
                setUpMatchDetailAdapter(matchDetailList,secondMatchDetail)
            }
        })
    }

    private fun setUpMatchDetailAdapter(
        matchDetailList: ArrayList<MatchDetailResponseModel>,
        secondMatchDetail: ArrayList<SecondMatchDetailResponseModel>
    ) {
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        matchDetailAdapter = MatchDetailAdapter(matchDetailList,secondMatchDetail,this)
        binding.matchDetailRecyclerView.layoutManager = layoutManager
        binding.matchDetailRecyclerView.adapter = matchDetailAdapter
    }

    private fun apiCall() {
        viewModel.getMatchDetail()
        setObserver()
    }

    override fun onButtonClick(position: Int) {
       if(position == 0){
           val intent = Intent(this, PlayerDetailScreen::class.java)
           intent.putExtra("position" ,0 )
           intent.putParcelableArrayListExtra("Bundle",matchDetailList)
           startActivity(intent)
       }else{
           val intent = Intent(this, PlayerDetailScreen::class.java)
           intent.putExtra("position" ,1 )
           intent.putParcelableArrayListExtra("Bundle",secondMatchDetail)
           startActivity(intent)
       }
    }

}
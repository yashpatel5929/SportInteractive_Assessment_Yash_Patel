package com.release.sportzinteractive.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.release.sportzinteractive.adapter.PlayersAdapter
import com.release.sportzinteractive.adapter.SecondTeamAdapter
import com.release.sportzinteractive.databinding.ActivityPlayerDetailScreenBinding
import com.release.sportzinteractive.model.CustomPlayerDataClass
import com.release.sportzinteractive.model.MatchDetailResponseModel
import com.release.sportzinteractive.model.SecondMatchDetailResponseModel


class PlayerDetailScreen : AppCompatActivity(), BottomSheetDialog.BottomSheetItemSelected {

    private lateinit var binding: ActivityPlayerDetailScreenBinding
    //val playerDataList = ArrayList<Any>()
    private lateinit var playersAdapter: PlayersAdapter
    private lateinit var secondTeamAdapter: SecondTeamAdapter
    val playerDataList = ArrayList<CustomPlayerDataClass>()
    val secondPlayerList = ArrayList<CustomPlayerDataClass>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlayerDetailScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = "Team Detail"
        if(intent.getIntExtra("position",0) == 0){
            val data  = intent.getSerializableExtra("Bundle") as ArrayList<MatchDetailResponseModel>
            setData(data)
        }else{
            val secondMatchData  = intent.getSerializableExtra("Bundle") as ArrayList<SecondMatchDetailResponseModel>
            setSecondMatchData(secondMatchData)
        }

    }

    private fun setSecondMatchData(secondMatchData: java.util.ArrayList<SecondMatchDetailResponseModel>) {
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val teamOne = secondMatchData[0].teams?.teamPAK?.pakPlayers
        playerDataList.add(CustomPlayerDataClass(teamOne?.player1?.NameFull,false,teamOne?.player1?.Batting?.Style,teamOne?.player1?.Bowling?.Style,false))
        playerDataList.add(CustomPlayerDataClass(teamOne?.player2?.NameFull,false,teamOne?.player2?.Batting?.Style,teamOne?.player2?.Bowling?.Style,false))
        playerDataList.add(CustomPlayerDataClass(teamOne?.player3?.NameFull,false,teamOne?.player3?.Batting?.Style,teamOne?.player3?.Bowling?.Style,true))
        playerDataList.add(CustomPlayerDataClass(teamOne?.player4?.NameFull,false,teamOne?.player4?.Batting?.Style,teamOne?.player4?.Bowling?.Style,false))
        playerDataList.add(CustomPlayerDataClass(teamOne?.player5?.NameFull,false,teamOne?.player5?.Batting?.Style,teamOne?.player5?.Bowling?.Style,false))
        playerDataList.add(CustomPlayerDataClass(teamOne?.player6?.NameFull,false,teamOne?.player6?.Batting?.Style,teamOne?.player6?.Bowling?.Style,false))
        playerDataList.add(CustomPlayerDataClass(teamOne?.player7?.NameFull,false,teamOne?.player7?.Batting?.Style,teamOne?.player7?.Bowling?.Style,false))
        playerDataList.add(CustomPlayerDataClass(teamOne?.player8?.NameFull,false,teamOne?.player8?.Batting?.Style,teamOne?.player8?.Bowling?.Style,false))
        playerDataList.add(CustomPlayerDataClass(teamOne?.player9?.NameFull,false,teamOne?.player9?.Batting?.Style,teamOne?.player9?.Bowling?.Style,false))
        playerDataList.add(CustomPlayerDataClass(teamOne?.player10?.NameFull,false,teamOne?.player10?.Batting?.Style,teamOne?.player10?.Bowling?.Style,false))
        playerDataList.add(CustomPlayerDataClass(teamOne?.player11?.NameFull,false,teamOne?.player11?.Batting?.Style,teamOne?.player11?.Bowling?.Style,false))

        val teamTwo = secondMatchData[0].teams?.teamSA?.saPlayers
        secondPlayerList.add(CustomPlayerDataClass(teamTwo?.player1?.NameFull,false,teamTwo?.player1?.Batting?.Style,teamTwo?.player1?.Bowling?.Style,false))
        secondPlayerList.add(CustomPlayerDataClass(teamTwo?.player2?.NameFull,false,teamTwo?.player2?.Batting?.Style,teamTwo?.player2?.Bowling?.Style,false),)
        secondPlayerList.add(CustomPlayerDataClass(teamTwo?.player3?.NameFull,false,teamTwo?.player3?.Batting?.Style,teamTwo?.player3?.Bowling?.Style,false))
        secondPlayerList.add(CustomPlayerDataClass(teamTwo?.player4?.NameFull,false,teamTwo?.player4?.Batting?.Style,teamTwo?.player4?.Bowling?.Style,false))
        secondPlayerList.add(CustomPlayerDataClass(teamTwo?.player5?.NameFull,false,teamTwo?.player5?.Batting?.Style,teamTwo?.player5?.Bowling?.Style,false))
        secondPlayerList.add(CustomPlayerDataClass(teamTwo?.player6?.NameFull,false,teamTwo?.player6?.Batting?.Style,teamTwo?.player6?.Bowling?.Style,true))
        secondPlayerList.add(CustomPlayerDataClass(teamTwo?.player7?.NameFull,false,teamTwo?.player7?.Batting?.Style,teamTwo?.player7?.Bowling?.Style,false))
        secondPlayerList.add(CustomPlayerDataClass(teamTwo?.player8?.NameFull,false,teamTwo?.player8?.Batting?.Style,teamTwo?.player8?.Bowling?.Style,false))
        secondPlayerList.add(CustomPlayerDataClass(teamTwo?.player9?.NameFull,false,teamTwo?.player9?.Batting?.Style,teamTwo?.player9?.Bowling?.Style,false))
        secondPlayerList.add(CustomPlayerDataClass(teamTwo?.player10?.NameFull,false,teamTwo?.player10?.Batting?.Style,teamTwo?.player10?.Bowling?.Style,false))
        secondPlayerList.add(CustomPlayerDataClass(teamTwo?.player11?.NameFull,false,teamTwo?.player11?.Batting?.Style,teamTwo?.player11?.Bowling?.Style,false))


        playersAdapter = PlayersAdapter()
        //secondTeamAdapter = SecondTeamAdapter(secondPlayerList)
        binding.playerDetailRecyclerView.layoutManager = layoutManager
        binding.playerDetailRecyclerView.adapter = playersAdapter
        playersAdapter.addTeamData(playerDataList,secondPlayerList)
        binding.spinnerPlayerCategory.setOnClickListener {
            openFilterOption(secondMatchData[0].teams?.teamPAK?.nameShort,secondMatchData[0].teams?.teamSA?.nameShort)
        }
    }

    private fun setData(data: ArrayList<MatchDetailResponseModel>) {
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val teamOne = data[0].Teams?.four?.Players
        playerDataList.add(CustomPlayerDataClass(teamOne?.four_one?.NameFull,teamOne?.four_one?.Iskeeper,teamOne?.four_one?.Batting?.Style,teamOne?.four_one?.Bowling?.Style,false))
        playerDataList.add(CustomPlayerDataClass(teamOne?.four_two?.NameFull,false,teamOne?.four_two?.Batting?.Style,teamOne?.four_two?.Bowling?.Style,false))
        playerDataList.add(CustomPlayerDataClass(teamOne?.four_three?.NameFull,false,teamOne?.four_three?.Batting?.Style,teamOne?.four_three?.Bowling?.Style,true))
        playerDataList.add(CustomPlayerDataClass(teamOne?.four_four?.NameFull,false,teamOne?.four_four?.Batting?.Style,teamOne?.four_four?.Bowling?.Style,false))
        playerDataList.add(CustomPlayerDataClass(teamOne?.four_five?.NameFull,false,teamOne?.four_five?.Batting?.Style,teamOne?.four_five?.Bowling?.Style,false))
        playerDataList.add(CustomPlayerDataClass(teamOne?.four_six?.NameFull,false,teamOne?.four_six?.Batting?.Style,teamOne?.four_six?.Bowling?.Style,false))
        playerDataList.add(CustomPlayerDataClass(teamOne?.four_seven?.NameFull,false,teamOne?.four_seven?.Batting?.Style,teamOne?.four_seven?.Bowling?.Style,false))
        playerDataList.add(CustomPlayerDataClass(teamOne?.four_eight?.NameFull,false,teamOne?.four_eight?.Batting?.Style,teamOne?.four_eight?.Bowling?.Style,false))
        playerDataList.add(CustomPlayerDataClass(teamOne?.four_nine?.NameFull,false,teamOne?.four_nine?.Batting?.Style,teamOne?.four_nine?.Bowling?.Style,false))
        playerDataList.add(CustomPlayerDataClass(teamOne?.four_ten?.NameFull,false,teamOne?.four_ten?.Batting?.Style,teamOne?.four_ten?.Bowling?.Style,false))
        playerDataList.add(CustomPlayerDataClass(teamOne?.four_eleven?.NameFull,false,teamOne?.four_eleven?.Batting?.Style,teamOne?.four_eleven?.Bowling?.Style,false))

        val teamTwo = data[0].Teams?.five?.Players
        secondPlayerList.add(CustomPlayerDataClass(teamTwo?.five_one?.NameFull,false,teamTwo?.five_one?.Batting?.Style,teamTwo?.five_one?.Bowling?.Style,false))
        secondPlayerList.add(CustomPlayerDataClass(teamTwo?.five_two?.NameFull,false,teamTwo?.five_two?.Batting?.Style,teamTwo?.five_two?.Bowling?.Style,true),)
        secondPlayerList.add(CustomPlayerDataClass(teamTwo?.five_three?.NameFull,false,teamTwo?.five_three?.Batting?.Style,teamTwo?.five_three?.Bowling?.Style,false))
        secondPlayerList.add(CustomPlayerDataClass(teamTwo?.five_four?.NameFull,false,teamTwo?.five_four?.Batting?.Style,teamTwo?.five_four?.Bowling?.Style,false))
        secondPlayerList.add(CustomPlayerDataClass(teamTwo?.five_five?.NameFull,false,teamTwo?.five_five?.Batting?.Style,teamTwo?.five_five?.Bowling?.Style,false))
        secondPlayerList.add(CustomPlayerDataClass(teamTwo?.five_six?.NameFull,false,teamTwo?.five_six?.Batting?.Style,teamTwo?.five_six?.Bowling?.Style,false))
        secondPlayerList.add(CustomPlayerDataClass(teamTwo?.five_seven?.NameFull,false,teamTwo?.five_seven?.Batting?.Style,teamTwo?.five_seven?.Bowling?.Style,false))
        secondPlayerList.add(CustomPlayerDataClass(teamTwo?.five_eight?.NameFull,false,teamTwo?.five_eight?.Batting?.Style,teamTwo?.five_eight?.Bowling?.Style,false))
        secondPlayerList.add(CustomPlayerDataClass(teamTwo?.five_nine?.NameFull,false,teamTwo?.five_nine?.Batting?.Style,teamTwo?.five_nine?.Bowling?.Style,false))
        secondPlayerList.add(CustomPlayerDataClass(teamTwo?.five_ten?.NameFull,false,teamTwo?.five_ten?.Batting?.Style,teamTwo?.five_ten?.Bowling?.Style,false))
        secondPlayerList.add(CustomPlayerDataClass(teamTwo?.five_eleven?.NameFull,false,teamTwo?.five_eleven?.Batting?.Style,teamTwo?.five_eleven?.Bowling?.Style,false))


        playersAdapter = PlayersAdapter()
        //secondTeamAdapter = SecondTeamAdapter(secondPlayerList)
        binding.playerDetailRecyclerView.layoutManager = layoutManager
        binding.playerDetailRecyclerView.adapter = playersAdapter
        playersAdapter.addTeamData(playerDataList,secondPlayerList)
        binding.spinnerPlayerCategory.setOnClickListener {
            openFilterOption(
                data[0].Teams?.four?.NameShort,
                data[0].Teams?.five?.NameShort
            )
        }
    }

    private fun openFilterOption(teamNameA: String?, teamNameB: String?) {
        val bottomSheet = BottomSheetDialog(this,teamNameA,teamNameB)
        bottomSheet.show(
            supportFragmentManager,
            "ModalBottomSheet"
        )
    }

    override fun bottomSheetItemSelected(position: Int) {
        when(position){
            0 ->  playersAdapter.addTeamData(playerDataList,secondPlayerList)
            1 -> playersAdapter.addFirstTeamData(playerDataList)
            2 -> playersAdapter.addSecondTeamData(secondPlayerList)

        }
    }
}
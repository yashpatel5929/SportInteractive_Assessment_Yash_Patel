package com.release.sportzinteractive.model

import android.os.Parcel
import android.os.Parcelable
import com.example.example.*
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class SecondMatchDetailResponseModel(

    @SerializedName("Matchdetail") var matchdetail: Matchdetail? = Matchdetail(),
    @SerializedName("Teams") var teams: TeamsSAPAK? = TeamsSAPAK(),

    ):Parcelable

@Parcelize
data class TeamsSAPAK(
    @SerializedName("6") var teamPAK: TeamPAK? = TeamPAK(),
    @SerializedName("7") var teamSA: TeamSA? = TeamSA()
):Parcelable

@Parcelize
data class TeamPAK(

    @SerializedName("Name_Full") var nameFull: String? = null,
    @SerializedName("Name_Short") var nameShort: String? = null,
    @SerializedName("Players") var pakPlayers: PAKPlayers? = PAKPlayers()

):Parcelable


@Parcelize
data class TeamSA(

    @SerializedName("Name_Full") var nameFull: String? = null,
    @SerializedName("Name_Short") var nameShort: String? = null,
    @SerializedName("Players") var saPlayers: SAPlayers? = SAPlayers()

):Parcelable


@Parcelize
data class PAKPlayers(

    @SerializedName("2734")
    var player1: PakOne? = PakOne(),
    @SerializedName("3472")
    var player2: PakTwo? = PakTwo(),
    @SerializedName("4038")
    var player3: PakThree? = PakThree(),
    @SerializedName("57492")
    var player4: PakFour? = PakFour(),
    @SerializedName("59429")
    var player5: PakFive? = PakFive(),
    @SerializedName("63084")
    var player6: PakSix? = PakSix(),
    @SerializedName("64073")
    var player7: PakSeven? = PakSeven(),
    @SerializedName("64306")
    var player8: PakEight? = PakEight(),
    @SerializedName("64321")
    var player9: PakNine? = PakNine(),
    @SerializedName("65739")
    var player10: PakTen? = PakTen(),
    @SerializedName("66833")
    var player11: PakEleven? = PakEleven()

):Parcelable


@Parcelize
data class SAPlayers(

    @SerializedName("3667") var player1: SaOne? = SaOne(),
    @SerializedName("4356") var player2: SaTwo? = SaTwo(),
    @SerializedName("5313") var player3: SaThree? = SaThree(),
    @SerializedName("12518") var player4: SaFour? = SaFour(),
    @SerializedName("24669") var player5: SaFive? = SaFive(),
    @SerializedName("28891") var player6: SaSix? = SaSix(),
    @SerializedName("48191") var player7: SaSeven? = SaSeven(),
    @SerializedName("57458") var player8: SaEight? = SaEight(),
    @SerializedName("59736") var player9: SaNine? = SaNine(),
    @SerializedName("63611") var player10: SaTen? = SaTen(),
    @SerializedName("64221") var player11: SaEleven? = SaEleven()

):Parcelable





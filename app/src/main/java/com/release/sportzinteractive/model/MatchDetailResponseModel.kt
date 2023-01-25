package com.release.sportzinteractive.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class MatchDetailResponseModel(

  @SerializedName("Matchdetail" ) var Matchdetail : Matchdetail?       = Matchdetail(),
  @SerializedName("Nuggets"     ) var Nuggets     : ArrayList<String>  = arrayListOf(),
  @SerializedName("Innings"     ) var Innings     : ArrayList<Innings> = arrayListOf(),
  @SerializedName("Teams"       ) var Teams       : Teams?             = Teams(),
  @SerializedName("Notes"       ) var Notes       : Notes?             = Notes()

):Parcelable
package com.example.example

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.release.sportzinteractive.model.Batting
import com.release.sportzinteractive.model.Bowling
import kotlinx.parcelize.Parcelize

@Parcelize
data class PakNine (

  @SerializedName("Position"  ) var Position : String?  = null,
  @SerializedName("Name_Full" ) var NameFull : String?  = null,
  @SerializedName("Batting"   ) var Batting  : Batting? = Batting(),
  @SerializedName("Bowling"   ) var Bowling  : Bowling? = Bowling()

):Parcelable
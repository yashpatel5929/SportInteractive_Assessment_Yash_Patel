package com.release.sportzinteractive.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class PartnershipCurrent (

  @SerializedName("Runs"    ) var Runs    : String?            = null,
  @SerializedName("Balls"   ) var Balls   : String?            = null,
  @SerializedName("Batsmen" ) var Batsmen : ArrayList<Batsmen> = arrayListOf()

):Parcelable
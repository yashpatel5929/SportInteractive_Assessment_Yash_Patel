package com.release.sportzinteractive.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Officials (

  @SerializedName("Umpires" ) var Umpires : String? = null,
  @SerializedName("Referee" ) var Referee : String? = null

):Parcelable
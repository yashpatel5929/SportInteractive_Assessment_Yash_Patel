package com.release.sportzinteractive.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Teams (

  @SerializedName("4" ) var four : Four? = Four(),
  @SerializedName("5" ) var five : Five? = Five(),


):Parcelable
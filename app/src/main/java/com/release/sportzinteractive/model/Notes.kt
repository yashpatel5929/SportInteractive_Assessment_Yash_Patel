package com.release.sportzinteractive.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Notes (

  @SerializedName("1" ) var one : ArrayList<String> = arrayListOf(),
  @SerializedName("2" ) var two : ArrayList<String> = arrayListOf()

):Parcelable
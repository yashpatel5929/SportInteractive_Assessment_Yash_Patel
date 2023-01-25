package com.release.sportzinteractive.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Venue (

  @SerializedName("Id"   ) var Id   : String? = null,
  @SerializedName("Name" ) var Name : String? = null

):Parcelable
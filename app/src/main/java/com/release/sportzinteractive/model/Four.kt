package com.release.sportzinteractive.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class Four (

  @SerializedName("Name_Full"  ) var NameFull  : String?  = null,
  @SerializedName("Name_Short" ) var NameShort : String?  = null,
  @SerializedName("Players"    ) var Players   : PlayersFour? = PlayersFour()

):Parcelable
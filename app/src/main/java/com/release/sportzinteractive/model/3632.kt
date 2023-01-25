package com.release.sportzinteractive.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class FourOne (

  @SerializedName("Position"  ) var Position : String?  = null,
  @SerializedName("Name_Full" ) var NameFull : String?  = null,
  @SerializedName("Iskeeper"  ) var Iskeeper : Boolean? = null,
  @SerializedName("Batting"   ) var Batting  : Batting? = Batting(),
  @SerializedName("Bowling"   ) var Bowling  : Bowling? = Bowling()

):Parcelable
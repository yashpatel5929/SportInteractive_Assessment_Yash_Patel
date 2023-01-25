package com.release.sportzinteractive.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class PlayersFive (

  @SerializedName("3752"  ) var five_one  : FiveOne?  = FiveOne(),
  @SerializedName("4330"  ) var five_two  : FiveTwo?  = FiveTwo(),
  @SerializedName("4338"  ) var five_three  : FiveThree?  = FiveThree(),
  @SerializedName("4964"  ) var five_four  : FiveFour?  = FiveFour(),
  @SerializedName("10167" ) var five_five : FiveFifth? = FiveFifth(),
  @SerializedName("10172" ) var five_six : FiveSixth? = FiveSixth(),
  @SerializedName("11703" ) var five_seven: FiveSeven? = FiveSeven(),
  @SerializedName("11706" ) var five_eight : FiveEight? = FiveEight(),
  @SerializedName("57594" ) var five_nine : FiveNine? = FiveNine(),
  @SerializedName("57903" ) var five_ten : FiveTen? = FiveTen(),
  @SerializedName("60544" ) var five_eleven : FiveElven? = FiveElven()

):Parcelable

@Parcelize
data class PlayersFour (
  @SerializedName("3632"  ) var four_one  : FourOne?  = FourOne(),
  @SerializedName("3722"  ) var four_two  : FourTwo?  = FourTwo(),
  @SerializedName("3852"  ) var four_three  : FourThree?  = FourThree(),
  @SerializedName("4176"  ) var four_four  : FourFour?  = FourFour(),
  @SerializedName("4532"  ) var four_five  : FourFive?  = FourFive(),
  @SerializedName("5132"  ) var four_six  : FourSix?  = FourSix(),
  @SerializedName("9844"  ) var four_seven  : FourSeven?  = FourSeven(),
  @SerializedName("63187" ) var four_eight : FourEight? = FourEight(),
  @SerializedName("63751" ) var four_nine : FourNine? = FourNine(),
  @SerializedName("65867" ) var four_ten : FourTen? = FourTen(),
  @SerializedName("66818" ) var four_eleven : FourEleven? = FourEleven()
):Parcelable
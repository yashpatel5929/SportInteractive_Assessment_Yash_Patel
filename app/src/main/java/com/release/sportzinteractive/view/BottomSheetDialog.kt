package com.release.sportzinteractive.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.Nullable
import androidx.core.view.allViews
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.release.sportzinteractive.R
import com.release.sportzinteractive.databinding.ActivityPlayerDetailScreenBinding
import com.release.sportzinteractive.databinding.BottomSheetLayoutBinding


class BottomSheetDialog(
    private val playerDetailScreen: BottomSheetItemSelected,
    teamNameA: String?,
    teamNameB: String?
) : BottomSheetDialogFragment() {

    val teamNameA = teamNameA
    val teamNameB = teamNameB
    private lateinit var binding: BottomSheetLayoutBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        @Nullable container: ViewGroup?,
        @Nullable savedInstanceState: Bundle?
    ): View? {
        val v: View = inflater.inflate(
            R.layout.bottom_sheet_layout,
            container, false
        )
        binding = BottomSheetLayoutBinding.inflate(layoutInflater)

        binding.TeamA.text = teamNameA
        binding.TeamB.text = teamNameB
        binding.allPlayers.setOnClickListener {
            playerDetailScreen.bottomSheetItemSelected(0)
            dismiss()
        }

        binding.TeamA.setOnClickListener {
            playerDetailScreen.bottomSheetItemSelected(1)
            dismiss()
        }

        binding.TeamB.setOnClickListener {
            playerDetailScreen.bottomSheetItemSelected(2)
            dismiss()
        }


        return binding.root
    }

    interface BottomSheetItemSelected{
        fun bottomSheetItemSelected(position : Int)
    }
}
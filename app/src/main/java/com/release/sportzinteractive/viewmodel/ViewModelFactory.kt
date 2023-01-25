package com.release.sportzinteractive.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.release.sportzinteractive.repository.MainRepository

//class ViewModelFactory(private val repository: MainRepository) : ViewModelProvider.Factory {
//
//    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        if (modelClass.isAssignableFrom(MatchDetailViewModel::class.java)) {
//            return MatchDetailViewModel(repository) as T
//        }
//        throw IllegalArgumentException("Unknown ViewModel class")
//    }
//
//}
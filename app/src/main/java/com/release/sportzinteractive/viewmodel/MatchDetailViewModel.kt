package com.release.sportzinteractive.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.release.sportzinteractive.model.MatchDetailResponseModel
import com.release.sportzinteractive.model.Matchdetail
import com.release.sportzinteractive.model.SecondMatchDetailResponseModel
import com.release.sportzinteractive.repository.MainRepository
import kotlinx.coroutines.*

class MatchDetailViewModel : ViewModel() {

    val mainRepository = MainRepository()
    val errorMessage = MutableLiveData<String>()
    val matchDetail = MutableLiveData<MatchDetailResponseModel>()
    val secondMatchDetail = MutableLiveData<SecondMatchDetailResponseModel>()
    var job: Job? = null

    val loading = MutableLiveData<Boolean>()

    fun getMatchDetail(){
        job = CoroutineScope(Dispatchers.IO).launch {
            val response = mainRepository.getMatchDetail()
            val secondMatchResponse = mainRepository.getSecondMatchDetail()
            withContext(Dispatchers.Main) {
                if (response.isSuccessful && secondMatchResponse.isSuccessful) {
                    matchDetail.postValue(response.body())
                    secondMatchDetail.postValue(secondMatchResponse.body())
                    loading.value = false
                } else {
                    onError("Error : ${response.message()} ")
                }
            }
        }
    }


    private fun onError(message: String) {
        errorMessage.value = message
        loading.value = false
    }

    override fun onCleared() {
        super.onCleared()
        job?.cancel()
    }
}
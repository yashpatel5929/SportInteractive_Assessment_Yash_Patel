package com.release.sportzinteractive.repository

import com.release.sportzinteractive.network.ApiServices

class MainRepository () {
    suspend fun getMatchDetail() = ApiServices.getInstance().getAllMatchDetail()

    suspend fun getSecondMatchDetail() = ApiServices.getInstance().getSecondMatchDetail()
}
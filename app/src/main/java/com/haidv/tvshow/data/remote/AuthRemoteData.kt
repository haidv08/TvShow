package com.haidv.tvshow.data.remote

import com.haidv.tvshow.data.remote.retrofit.ApiService
import javax.inject.Inject

class AuthRemoteData
@Inject
constructor(private val apiService: ApiService){
    suspend fun getTvShows() = apiService.getTvShows()
}
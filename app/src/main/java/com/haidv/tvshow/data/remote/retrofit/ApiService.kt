package com.haidv.tvshow.data.remote.retrofit

import com.haidv.tvshow.models.TvShowResponse
import com.haidv.tvshow.utils.Constans
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET(Constans.END_POINT)
    suspend fun getTvShows() : Response<TvShowResponse>



}
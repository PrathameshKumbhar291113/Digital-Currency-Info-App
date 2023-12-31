package com.coinappcleanarchitecture.network

import com.coinappcleanarchitecture.network.dto.GetAllCoinListResponse
import com.coinappcleanarchitecture.network.dto.GetCoinDetailResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CoinGeckoApiService {

    @GET("/api/v3/coins/markets?vs_currency=usd&order=market_cap_desc&per_page=100&page=1&sparkline=false&locale=en")
    suspend fun getAllCoins(@Query("page") page : String) : GetAllCoinListResponse


    @GET("api/v3/coins/{id}")
    suspend fun getCoinDetail(@Path("id") id: String) : GetCoinDetailResponse
}
package com.coinappcleanarchitecture.domain.repository

import com.coinappcleanarchitecture.network.dto.GetAllCoinListResponse
import com.coinappcleanarchitecture.network.dto.GetCoinDetailResponse
import retrofit2.http.GET

interface CoinRepository {

    suspend fun getAllCoins(page: String) : GetAllCoinListResponse
    suspend fun getCoinById(id: String) : GetCoinDetailResponse
}
package com.coinappcleanarchitechture.domain.repository

import com.coinappcleanarchitechture.data.data_source.model.GetAllCoinListResponse
import com.coinappcleanarchitechture.data.data_source.model.GetCoinDetailResponse

interface CoinRepository {

    suspend fun getAllCoins(page: String) : GetAllCoinListResponse
    suspend fun getCoinById(id: String) : GetCoinDetailResponse
}
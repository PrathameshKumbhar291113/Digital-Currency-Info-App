package com.coinappcleanarchitecture.domain.repository

import com.coinappcleanarchitecture.data.data_source.model.GetAllCoinListResponse
import com.coinappcleanarchitecture.data.data_source.model.GetCoinDetailResponse

interface CoinRepository {

    suspend fun getAllCoins(page: String) : GetAllCoinListResponse
    suspend fun getCoinById(id: String) : GetCoinDetailResponse
}
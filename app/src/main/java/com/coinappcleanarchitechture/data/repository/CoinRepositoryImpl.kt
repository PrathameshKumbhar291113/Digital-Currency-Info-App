package com.coinappcleanarchitechture.data.repository

import com.coinappcleanarchitechture.data.data_source.CoinGeckoApiService
import com.coinappcleanarchitechture.data.data_source.model.GetAllCoinListResponse
import com.coinappcleanarchitechture.data.data_source.model.GetCoinDetailResponse
import com.coinappcleanarchitechture.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val coinApi : CoinGeckoApiService
): CoinRepository{
    override suspend fun getAllCoins(page: String): GetAllCoinListResponse {
        return coinApi.getAllCoins(page = page)
    }

    override suspend fun getCoinById(id: String): GetCoinDetailResponse {
        return coinApi.getCoinDetail(id = id)
    }
}
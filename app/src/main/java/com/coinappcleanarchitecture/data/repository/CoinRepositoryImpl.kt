package com.coinappcleanarchitecture.data.repository

import com.coinappcleanarchitecture.network.CoinGeckoApiService
import com.coinappcleanarchitecture.network.dto.GetAllCoinListResponse
import com.coinappcleanarchitecture.network.dto.GetCoinDetailResponse
import com.coinappcleanarchitecture.domain.repository.CoinRepository
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
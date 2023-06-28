package com.coinappcleanarchitechture.di

import com.coinappcleanarchitechture.data.data_source.CoinGeckoApiService
import com.coinappcleanarchitechture.data.repository.CoinRepositoryImpl
import com.coinappcleanarchitechture.domain.repository.CoinRepository
import com.coinappcleanarchitechture.util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CoinGeckoHiltModule {

    @Provides
    @Singleton
    fun provideCoinGeckoApi(): CoinGeckoApiService{
        return Retrofit.Builder()
            .baseUrl(Constants.API_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CoinGeckoApiService::class.java)
    }

    @Provides
    @Singleton
    fun provideCoinGeckoRepository(
        apiService: CoinGeckoApiService
    ): CoinRepository{
        return CoinRepositoryImpl(apiService)
    }
}
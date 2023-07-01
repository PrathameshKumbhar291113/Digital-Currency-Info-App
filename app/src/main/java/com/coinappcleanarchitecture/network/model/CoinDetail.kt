package com.coinappcleanarchitecture.network.model

data class CoinDetail(
    var coingeckoRank: Int?,
    var coingeckoScore: Double?,
    var countryOrigin: String?,
    var id: String?,
    var image: String?,
    var name: String?,
    var lastUpdated: String?,
    var description: String?
)

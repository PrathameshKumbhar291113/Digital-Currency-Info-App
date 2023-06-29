package com.coinappcleanarchitecture.domain.model

import com.coinappcleanarchitecture.data.data_source.model.GetAllCoinListResponse

data class Coins(

    var ath: Double?, // 4878.26

    var athChangePercentage: Double?, // -56.25647

    var athDate: String?, // 2021-11-10T14:24:11.849Z

    var atl: Double?, // 67.81

    var atlChangePercentage: Double?, // 44440.72256

    var atlDate: String?, // 2013-07-06T00:00:00

    var circulatingSupply: Double?, // 120186399.084691

    var currentPrice: Double?, // 1840.25

    var fullyDilutedValuation: Long?, // 634373645229

    var high24h: Double?, // 1898.19

    var id: String?, // bitcoin

    var image: String?, // https://assets.coingecko.com/coins/images/1/large/bitcoin.png?1547033579

    var lastUpdated: String?, // 2023-06-28T19:40:58.194Z

    var low24h: Double?, // 1838.96

    var marketCap: Long?, // 586476350643

    var marketCapChange24h: Double?, // -9232191299.930298

    var marketCapChangePercentage24h: Double?, // -1.54978

    var marketCapRank: Int?, // 1

    var maxSupply: Double?, // 7444045.22153512

    var name: String?, // Bitcoin

    var priceChange24h: Double?, // -478.4144634126169

    var priceChangePercentage24h: Double?, // -1.55906

    var roi: GetAllCoinListResponse.GetAllCoinsItem.Roi?,

    var symbol: String?, // btc

    var totalSupply: Double?, // 120186399.084691

    var totalVolume: Double? // 227.56
)

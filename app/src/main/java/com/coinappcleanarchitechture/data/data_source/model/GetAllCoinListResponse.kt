package com.coinappcleanarchitechture.data.data_source.model


import com.google.gson.annotations.SerializedName

class GetAllCoinListResponse : ArrayList<GetAllCoinListResponse.GetAllCoinsItem>(){
    data class GetAllCoinsItem(
        @SerializedName("ath")
        var ath: Double?, // 4878.26
        @SerializedName("ath_change_percentage")
        var athChangePercentage: Double?, // -56.25647
        @SerializedName("ath_date")
        var athDate: String?, // 2021-11-10T14:24:11.849Z
        @SerializedName("atl")
        var atl: Double?, // 67.81
        @SerializedName("atl_change_percentage")
        var atlChangePercentage: Double?, // 44440.72256
        @SerializedName("atl_date")
        var atlDate: String?, // 2013-07-06T00:00:00.000Z
        @SerializedName("circulating_supply")
        var circulatingSupply: Double?, // 120186399.084691
        @SerializedName("current_price")
        var currentPrice: Double?, // 1840.25
        @SerializedName("fully_diluted_valuation")
        var fullyDilutedValuation: Long?, // 634373645229
        @SerializedName("high_24h")
        var high24h: Double?, // 1898.19
        @SerializedName("id")
        var id: String?, // bitcoin
        @SerializedName("image")
        var image: String?, // https://assets.coingecko.com/coins/images/1/large/bitcoin.png?1547033579
        @SerializedName("last_updated")
        var lastUpdated: String?, // 2023-06-28T19:40:58.194Z
        @SerializedName("low_24h")
        var low24h: Double?, // 1838.96
        @SerializedName("market_cap")
        var marketCap: Long?, // 586476350643
        @SerializedName("market_cap_change_24h")
        var marketCapChange24h: Double?, // -9232191299.930298
        @SerializedName("market_cap_change_percentage_24h")
        var marketCapChangePercentage24h: Double?, // -1.54978
        @SerializedName("market_cap_rank")
        var marketCapRank: Int?, // 1
        @SerializedName("max_supply")
        var maxSupply: Double?, // 7444045.22153512
        @SerializedName("name")
        var name: String?, // Bitcoin
        @SerializedName("price_change_24h")
        var priceChange24h: Double?, // -478.4144634126169
        @SerializedName("price_change_percentage_24h")
        var priceChangePercentage24h: Double?, // -1.55906
        @SerializedName("roi")
        var roi: Roi?,
        @SerializedName("symbol")
        var symbol: String?, // btc
        @SerializedName("total_supply")
        var totalSupply: Double?, // 120186399.084691
        @SerializedName("total_volume")
        var totalVolume: Double? // 227.56
    ) {
        data class Roi(
            @SerializedName("currency")
            var currency: String?, // btc
            @SerializedName("percentage")
            var percentage: Double?, // 8047.535857721146
            @SerializedName("times")
            var times: Double? // 80.47535857721147
        )
    }
}
package com.coinappcleanarchitecture.network.dto


import com.coinappcleanarchitecture.network.model.CoinDetail
import com.google.gson.annotations.SerializedName

data class GetCoinDetailResponse(
    @SerializedName("additional_notices")
    var additionalNotices: List<Any?>?,
    @SerializedName("asset_platform_id")
    var assetPlatformId: Any?, // null
    @SerializedName("block_time_in_minutes")
    var blockTimeInMinutes: Int?, // 10
    @SerializedName("categories")
    var categories: List<String?>?,
    @SerializedName("coingecko_rank")
    var coingeckoRank: Int?, // 1
    @SerializedName("coingecko_score")
    var coingeckoScore: Double?, // 83.151
    @SerializedName("community_data")
    var communityData: CommunityData?,
    @SerializedName("community_score")
    var communityScore: Double?, // 83.341
    @SerializedName("country_origin")
    var countryOrigin: String?,
    @SerializedName("description")
    var description: Description?,
    @SerializedName("detail_platforms")
    var detailPlatforms: DetailPlatforms?,
    @SerializedName("developer_data")
    var developerData: DeveloperData?,
    @SerializedName("developer_score")
    var developerScore: Double?, // 99.241
    @SerializedName("genesis_date")
    var genesisDate: String?, // 2009-01-03
    @SerializedName("hashing_algorithm")
    var hashingAlgorithm: String?, // SHA-256
    @SerializedName("id")
    var id: String?, // bitcoin
    @SerializedName("image")
    var image: Image?,
    @SerializedName("last_updated")
    var lastUpdated: String?, // 2023-06-28T20:34:55.858Z
    @SerializedName("links")
    var links: Links?,
    @SerializedName("liquidity_score")
    var liquidityScore: Double?, // 100.011
    @SerializedName("localization")
    var localization: Localization?,
    @SerializedName("market_cap_rank")
    var marketCapRank: Int?, // 1
    @SerializedName("market_data")
    var marketData: MarketData?,
    @SerializedName("name")
    var name: String?, // Bitcoin
    @SerializedName("platforms")
    var platforms: Platforms?,
    @SerializedName("public_interest_score")
    var publicInterestScore: Double?, // 0.073
    @SerializedName("public_interest_stats")
    var publicInterestStats: PublicInterestStats?,
    @SerializedName("public_notice")
    var publicNotice: Any?, // null
    @SerializedName("sentiment_votes_down_percentage")
    var sentimentVotesDownPercentage: Double?, // 23.19
    @SerializedName("sentiment_votes_up_percentage")
    var sentimentVotesUpPercentage: Double?, // 76.81
    @SerializedName("status_updates")
    var statusUpdates: List<Any?>?,
    @SerializedName("symbol")
    var symbol: String?, // btc
    @SerializedName("tickers")
    var tickers: List<Ticker?>?,
    @SerializedName("watchlist_portfolio_users")
    var watchlistPortfolioUsers: Int? // 1308439
) {
    data class CommunityData(
        @SerializedName("facebook_likes")
        var facebookLikes: Any?, // null
        @SerializedName("reddit_accounts_active_48h")
        var redditAccountsActive48h: Int?, // 10342
        @SerializedName("reddit_average_comments_48h")
        var redditAverageComments48h: Double?, // 287.538
        @SerializedName("reddit_average_posts_48h")
        var redditAveragePosts48h: Double?, // 5.462
        @SerializedName("reddit_subscribers")
        var redditSubscribers: Int?, // 5616976
        @SerializedName("telegram_channel_user_count")
        var telegramChannelUserCount: Any?, // null
        @SerializedName("twitter_followers")
        var twitterFollowers: Int? // 5872564
    )

    data class Description(
        @SerializedName("ar")
        var ar: String?,
        @SerializedName("bg")
        var bg: String?, // Bitcoin is the first successful internet money based on peer-to-peer technology; whereby no central bank or authority is involved in the transaction and production of the Bitcoin currency. It was created by an anonymous individual/group under the name, Satoshi Nakamoto. The source code is available publicly as an open source project, anybody can look at it and be part of the developmental process.Bitcoin is changing the way we see money as we speak. The idea was to produce a means of exchange, independent of any central authority, that could be transferred electronically in a secure, verifiable and immutable way. It is a decentralized peer-to-peer internet currency making mobile payment easy, very low transaction fees, protects your identity, and it works anywhere all the time with no central authority and banks.Bitcoin is designed to have only 21 million BTC ever created, thus making it a deflationary currency. Bitcoin uses the <a href="https://www.coingecko.com/en?hashing_algorithm=SHA-256">SHA-256</a> hashing algorithm with an average transaction confirmation time of 10 minutes. Miners today are mining Bitcoin using ASIC chip dedicated to only mining Bitcoin, and the hash rate has shot up to peta hashes.Being the first successful online cryptography currency, Bitcoin has inspired other alternative currencies such as <a href="https://www.coingecko.com/en/coins/litecoin">Litecoin</a>, <a href="https://www.coingecko.com/en/coins/peercoin">Peercoin</a>, <a href="https://www.coingecko.com/en/coins/primecoin">Primecoin</a>, and so on.The cryptocurrency then took off with the innovation of the turing-complete smart contract by <a href="https://www.coingecko.com/en/coins/ethereum">Ethereum</a> which led to the development of other amazing projects such as <a href="https://www.coingecko.com/en/coins/eos">EOS</a>, <a href="https://www.coingecko.com/en/coins/tron">Tron</a>, and even crypto-collectibles such as <a href="https://www.coingecko.com/buzz/ethereum-still-king-dapps-cryptokitties-need-1-billion-on-eos">CryptoKitties</a>.
        @SerializedName("cs")
        var cs: String?, // Bitcoin is the first successful internet money based on peer-to-peer technology; whereby no central bank or authority is involved in the transaction and production of the Bitcoin currency. It was created by an anonymous individual/group under the name, Satoshi Nakamoto. The source code is available publicly as an open source project, anybody can look at it and be part of the developmental process.Bitcoin is changing the way we see money as we speak. The idea was to produce a means of exchange, independent of any central authority, that could be transferred electronically in a secure, verifiable and immutable way. It is a decentralized peer-to-peer internet currency making mobile payment easy, very low transaction fees, protects your identity, and it works anywhere all the time with no central authority and banks.Bitcoin is designed to have only 21 million BTC ever created, thus making it a deflationary currency. Bitcoin uses the <a href="https://www.coingecko.com/en?hashing_algorithm=SHA-256">SHA-256</a> hashing algorithm with an average transaction confirmation time of 10 minutes. Miners today are mining Bitcoin using ASIC chip dedicated to only mining Bitcoin, and the hash rate has shot up to peta hashes.Being the first successful online cryptography currency, Bitcoin has inspired other alternative currencies such as <a href="https://www.coingecko.com/en/coins/litecoin">Litecoin</a>, <a href="https://www.coingecko.com/en/coins/peercoin">Peercoin</a>, <a href="https://www.coingecko.com/en/coins/primecoin">Primecoin</a>, and so on.The cryptocurrency then took off with the innovation of the turing-complete smart contract by <a href="https://www.coingecko.com/en/coins/ethereum">Ethereum</a> which led to the development of other amazing projects such as <a href="https://www.coingecko.com/en/coins/eos">EOS</a>, <a href="https://www.coingecko.com/en/coins/tron">Tron</a>, and even crypto-collectibles such as <a href="https://www.coingecko.com/buzz/ethereum-still-king-dapps-cryptokitties-need-1-billion-on-eos">CryptoKitties</a>.
        @SerializedName("da")
        var da: String?, // Bitcoin is the first successful internet money based on peer-to-peer technology; whereby no central bank or authority is involved in the transaction and production of the Bitcoin currency. It was created by an anonymous individual/group under the name, Satoshi Nakamoto. The source code is available publicly as an open source project, anybody can look at it and be part of the developmental process.Bitcoin is changing the way we see money as we speak. The idea was to produce a means of exchange, independent of any central authority, that could be transferred electronically in a secure, verifiable and immutable way. It is a decentralized peer-to-peer internet currency making mobile payment easy, very low transaction fees, protects your identity, and it works anywhere all the time with no central authority and banks.Bitcoin is designed to have only 21 million BTC ever created, thus making it a deflationary currency. Bitcoin uses the <a href="https://www.coingecko.com/en?hashing_algorithm=SHA-256">SHA-256</a> hashing algorithm with an average transaction confirmation time of 10 minutes. Miners today are mining Bitcoin using ASIC chip dedicated to only mining Bitcoin, and the hash rate has shot up to peta hashes.Being the first successful online cryptography currency, Bitcoin has inspired other alternative currencies such as <a href="https://www.coingecko.com/en/coins/litecoin">Litecoin</a>, <a href="https://www.coingecko.com/en/coins/peercoin">Peercoin</a>, <a href="https://www.coingecko.com/en/coins/primecoin">Primecoin</a>, and so on.The cryptocurrency then took off with the innovation of the turing-complete smart contract by <a href="https://www.coingecko.com/en/coins/ethereum">Ethereum</a> which led to the development of other amazing projects such as <a href="https://www.coingecko.com/en/coins/eos">EOS</a>, <a href="https://www.coingecko.com/en/coins/tron">Tron</a>, and even crypto-collectibles such as <a href="https://www.coingecko.com/buzz/ethereum-still-king-dapps-cryptokitties-need-1-billion-on-eos">CryptoKitties</a>.
        @SerializedName("de")
        var de: String?,
        @SerializedName("el")
        var el: String?, // Bitcoin is the first successful internet money based on peer-to-peer technology; whereby no central bank or authority is involved in the transaction and production of the Bitcoin currency. It was created by an anonymous individual/group under the name, Satoshi Nakamoto. The source code is available publicly as an open source project, anybody can look at it and be part of the developmental process.Bitcoin is changing the way we see money as we speak. The idea was to produce a means of exchange, independent of any central authority, that could be transferred electronically in a secure, verifiable and immutable way. It is a decentralized peer-to-peer internet currency making mobile payment easy, very low transaction fees, protects your identity, and it works anywhere all the time with no central authority and banks.Bitcoin is designed to have only 21 million BTC ever created, thus making it a deflationary currency. Bitcoin uses the <a href="https://www.coingecko.com/en?hashing_algorithm=SHA-256">SHA-256</a> hashing algorithm with an average transaction confirmation time of 10 minutes. Miners today are mining Bitcoin using ASIC chip dedicated to only mining Bitcoin, and the hash rate has shot up to peta hashes.Being the first successful online cryptography currency, Bitcoin has inspired other alternative currencies such as <a href="https://www.coingecko.com/en/coins/litecoin">Litecoin</a>, <a href="https://www.coingecko.com/en/coins/peercoin">Peercoin</a>, <a href="https://www.coingecko.com/en/coins/primecoin">Primecoin</a>, and so on.The cryptocurrency then took off with the innovation of the turing-complete smart contract by <a href="https://www.coingecko.com/en/coins/ethereum">Ethereum</a> which led to the development of other amazing projects such as <a href="https://www.coingecko.com/en/coins/eos">EOS</a>, <a href="https://www.coingecko.com/en/coins/tron">Tron</a>, and even crypto-collectibles such as <a href="https://www.coingecko.com/buzz/ethereum-still-king-dapps-cryptokitties-need-1-billion-on-eos">CryptoKitties</a>.
        @SerializedName("en")
        var en: String?, // Bitcoin is the first successful internet money based on peer-to-peer technology; whereby no central bank or authority is involved in the transaction and production of the Bitcoin currency. It was created by an anonymous individual/group under the name, Satoshi Nakamoto. The source code is available publicly as an open source project, anybody can look at it and be part of the developmental process.Bitcoin is changing the way we see money as we speak. The idea was to produce a means of exchange, independent of any central authority, that could be transferred electronically in a secure, verifiable and immutable way. It is a decentralized peer-to-peer internet currency making mobile payment easy, very low transaction fees, protects your identity, and it works anywhere all the time with no central authority and banks.Bitcoin is designed to have only 21 million BTC ever created, thus making it a deflationary currency. Bitcoin uses the <a href="https://www.coingecko.com/en?hashing_algorithm=SHA-256">SHA-256</a> hashing algorithm with an average transaction confirmation time of 10 minutes. Miners today are mining Bitcoin using ASIC chip dedicated to only mining Bitcoin, and the hash rate has shot up to peta hashes.Being the first successful online cryptography currency, Bitcoin has inspired other alternative currencies such as <a href="https://www.coingecko.com/en/coins/litecoin">Litecoin</a>, <a href="https://www.coingecko.com/en/coins/peercoin">Peercoin</a>, <a href="https://www.coingecko.com/en/coins/primecoin">Primecoin</a>, and so on.The cryptocurrency then took off with the innovation of the turing-complete smart contract by <a href="https://www.coingecko.com/en/coins/ethereum">Ethereum</a> which led to the development of other amazing projects such as <a href="https://www.coingecko.com/en/coins/eos">EOS</a>, <a href="https://www.coingecko.com/en/coins/tron">Tron</a>, and even crypto-collectibles such as <a href="https://www.coingecko.com/buzz/ethereum-still-king-dapps-cryptokitties-need-1-billion-on-eos">CryptoKitties</a>.
        @SerializedName("es")
        var es: String?,
        @SerializedName("fi")
        var fi: String?, // Bitcoin is the first successful internet money based on peer-to-peer technology; whereby no central bank or authority is involved in the transaction and production of the Bitcoin currency. It was created by an anonymous individual/group under the name, Satoshi Nakamoto. The source code is available publicly as an open source project, anybody can look at it and be part of the developmental process.Bitcoin is changing the way we see money as we speak. The idea was to produce a means of exchange, independent of any central authority, that could be transferred electronically in a secure, verifiable and immutable way. It is a decentralized peer-to-peer internet currency making mobile payment easy, very low transaction fees, protects your identity, and it works anywhere all the time with no central authority and banks.Bitcoin is designed to have only 21 million BTC ever created, thus making it a deflationary currency. Bitcoin uses the <a href="https://www.coingecko.com/en?hashing_algorithm=SHA-256">SHA-256</a> hashing algorithm with an average transaction confirmation time of 10 minutes. Miners today are mining Bitcoin using ASIC chip dedicated to only mining Bitcoin, and the hash rate has shot up to peta hashes.Being the first successful online cryptography currency, Bitcoin has inspired other alternative currencies such as <a href="https://www.coingecko.com/en/coins/litecoin">Litecoin</a>, <a href="https://www.coingecko.com/en/coins/peercoin">Peercoin</a>, <a href="https://www.coingecko.com/en/coins/primecoin">Primecoin</a>, and so on.The cryptocurrency then took off with the innovation of the turing-complete smart contract by <a href="https://www.coingecko.com/en/coins/ethereum">Ethereum</a> which led to the development of other amazing projects such as <a href="https://www.coingecko.com/en/coins/eos">EOS</a>, <a href="https://www.coingecko.com/en/coins/tron">Tron</a>, and even crypto-collectibles such as <a href="https://www.coingecko.com/buzz/ethereum-still-king-dapps-cryptokitties-need-1-billion-on-eos">CryptoKitties</a>.
        @SerializedName("fr")
        var fr: String?,
        @SerializedName("he")
        var he: String?, // Bitcoin is the first successful internet money based on peer-to-peer technology; whereby no central bank or authority is involved in the transaction and production of the Bitcoin currency. It was created by an anonymous individual/group under the name, Satoshi Nakamoto. The source code is available publicly as an open source project, anybody can look at it and be part of the developmental process.Bitcoin is changing the way we see money as we speak. The idea was to produce a means of exchange, independent of any central authority, that could be transferred electronically in a secure, verifiable and immutable way. It is a decentralized peer-to-peer internet currency making mobile payment easy, very low transaction fees, protects your identity, and it works anywhere all the time with no central authority and banks.Bitcoin is designed to have only 21 million BTC ever created, thus making it a deflationary currency. Bitcoin uses the <a href="https://www.coingecko.com/en?hashing_algorithm=SHA-256">SHA-256</a> hashing algorithm with an average transaction confirmation time of 10 minutes. Miners today are mining Bitcoin using ASIC chip dedicated to only mining Bitcoin, and the hash rate has shot up to peta hashes.Being the first successful online cryptography currency, Bitcoin has inspired other alternative currencies such as <a href="https://www.coingecko.com/en/coins/litecoin">Litecoin</a>, <a href="https://www.coingecko.com/en/coins/peercoin">Peercoin</a>, <a href="https://www.coingecko.com/en/coins/primecoin">Primecoin</a>, and so on.The cryptocurrency then took off with the innovation of the turing-complete smart contract by <a href="https://www.coingecko.com/en/coins/ethereum">Ethereum</a> which led to the development of other amazing projects such as <a href="https://www.coingecko.com/en/coins/eos">EOS</a>, <a href="https://www.coingecko.com/en/coins/tron">Tron</a>, and even crypto-collectibles such as <a href="https://www.coingecko.com/buzz/ethereum-still-king-dapps-cryptokitties-need-1-billion-on-eos">CryptoKitties</a>.
        @SerializedName("hi")
        var hi: String?, // Bitcoin is the first successful internet money based on peer-to-peer technology; whereby no central bank or authority is involved in the transaction and production of the Bitcoin currency. It was created by an anonymous individual/group under the name, Satoshi Nakamoto. The source code is available publicly as an open source project, anybody can look at it and be part of the developmental process.Bitcoin is changing the way we see money as we speak. The idea was to produce a means of exchange, independent of any central authority, that could be transferred electronically in a secure, verifiable and immutable way. It is a decentralized peer-to-peer internet currency making mobile payment easy, very low transaction fees, protects your identity, and it works anywhere all the time with no central authority and banks.Bitcoin is designed to have only 21 million BTC ever created, thus making it a deflationary currency. Bitcoin uses the <a href="https://www.coingecko.com/en?hashing_algorithm=SHA-256">SHA-256</a> hashing algorithm with an average transaction confirmation time of 10 minutes. Miners today are mining Bitcoin using ASIC chip dedicated to only mining Bitcoin, and the hash rate has shot up to peta hashes.Being the first successful online cryptography currency, Bitcoin has inspired other alternative currencies such as <a href="https://www.coingecko.com/en/coins/litecoin">Litecoin</a>, <a href="https://www.coingecko.com/en/coins/peercoin">Peercoin</a>, <a href="https://www.coingecko.com/en/coins/primecoin">Primecoin</a>, and so on.The cryptocurrency then took off with the innovation of the turing-complete smart contract by <a href="https://www.coingecko.com/en/coins/ethereum">Ethereum</a> which led to the development of other amazing projects such as <a href="https://www.coingecko.com/en/coins/eos">EOS</a>, <a href="https://www.coingecko.com/en/coins/tron">Tron</a>, and even crypto-collectibles such as <a href="https://www.coingecko.com/buzz/ethereum-still-king-dapps-cryptokitties-need-1-billion-on-eos">CryptoKitties</a>.
        @SerializedName("hr")
        var hr: String?, // Bitcoin is the first successful internet money based on peer-to-peer technology; whereby no central bank or authority is involved in the transaction and production of the Bitcoin currency. It was created by an anonymous individual/group under the name, Satoshi Nakamoto. The source code is available publicly as an open source project, anybody can look at it and be part of the developmental process.Bitcoin is changing the way we see money as we speak. The idea was to produce a means of exchange, independent of any central authority, that could be transferred electronically in a secure, verifiable and immutable way. It is a decentralized peer-to-peer internet currency making mobile payment easy, very low transaction fees, protects your identity, and it works anywhere all the time with no central authority and banks.Bitcoin is designed to have only 21 million BTC ever created, thus making it a deflationary currency. Bitcoin uses the <a href="https://www.coingecko.com/en?hashing_algorithm=SHA-256">SHA-256</a> hashing algorithm with an average transaction confirmation time of 10 minutes. Miners today are mining Bitcoin using ASIC chip dedicated to only mining Bitcoin, and the hash rate has shot up to peta hashes.Being the first successful online cryptography currency, Bitcoin has inspired other alternative currencies such as <a href="https://www.coingecko.com/en/coins/litecoin">Litecoin</a>, <a href="https://www.coingecko.com/en/coins/peercoin">Peercoin</a>, <a href="https://www.coingecko.com/en/coins/primecoin">Primecoin</a>, and so on.The cryptocurrency then took off with the innovation of the turing-complete smart contract by <a href="https://www.coingecko.com/en/coins/ethereum">Ethereum</a> which led to the development of other amazing projects such as <a href="https://www.coingecko.com/en/coins/eos">EOS</a>, <a href="https://www.coingecko.com/en/coins/tron">Tron</a>, and even crypto-collectibles such as <a href="https://www.coingecko.com/buzz/ethereum-still-king-dapps-cryptokitties-need-1-billion-on-eos">CryptoKitties</a>.
        @SerializedName("hu")
        var hu: String?,
        @SerializedName("id")
        var id: String?,
        @SerializedName("it")
        var `it`: String?,
        @SerializedName("ja")
        var ja: String?,
        @SerializedName("ko")
        var ko: String?, // 비트코인은 2009년 나카모토 사토시가 만든 디지털 통화로, 통화를 발행하고 관리하는 중앙 장치가 존재하지 않는 구조를 가지고 있다. 대신, 비트코인의 거래는 P2P 기반 분산 데이터베이스에 의해 이루어지며, 공개 키 암호 방식 기반으로 거래를 수행한다. 비트코인은 공개성을 가지고 있다. 비트코인은 지갑 파일의 형태로 저장되며, 이 지갑에는 각각의 고유 주소가 부여되며, 그 주소를 기반으로 비트코인의 거래가 이루어진다. 비트코인은 1998년 웨이따이가 사이버펑크 메일링 리스트에 올린 암호통화란 구상을 최초로 구현한 것 중의 하나이다.비트코인은 최초로 구현된 가상화폐입니다. 발행 및 유통을 관리하는 중앙권력이나 중간상인 없이, P2P 네트워크 기술을 이용하여 네트워크에 참여하는 사용자들이 주체적으로 화폐를 발행하고 이체내용을 공동으로 관리합니다. 이를 가능하게 한 블록체인 기술을 처음으로 코인에 도입한 것이 바로 비트코인입니다.비트코인을 사용하는 개인과 사업자의 수는 꾸준히 증가하고 있으며, 여기에는 식당, 아파트, 법률사무소, 온라인 서비스를 비롯한 소매상들이 포함됩니다. 비트코인은 새로운 사회 현상이지만 아주 빠르게 성장하고 있습니다. 이를 바탕으로 가치 증대는 물론, 매일 수백만 달러의 비트코인이 교환되고 있습니다. 비트코인은 가상화폐 시장에서 현재 유통시가총액과 코인의 가치가 가장 크고, 거래량 또한 안정적입니다. 이더리움이 빠르게 추격하고 있지만 아직은 가장 견고한 가상화폐라고 볼 수 있습니다. 코인 특징1. 중앙주체 없이 사용자들에 의해 거래내용이 관리될 수 있는 비트코인의 운영 시스템은 블록체인 기술에서 기인합니다. 블록체인은 쉽게 말해 다 같이 장부를 공유하고, 항상 서로의 컴퓨터에 있는 장부 파일을 비교함으로써 같은 내용만 인정하는 방식으로 운영됩니다. 따라서 전통적인 금융기관에서 장부에 대한 접근을 튼튼하게 방어하던 것과는 정반대의 작업을 통해 보안을 달성합니다. 장부를 해킹하려면 51%의 장부를 동시에 조작해야 하는데, 이는 사실상 불가능합니다. 왜냐하면, 이를 실행하기 위해서는 컴퓨팅 파워가 어마어마하게 소요되고, 이것이 가능한 슈퍼컴퓨터는 세상에 존재하지 않기 때문입니다. 또한, 장부의 자료들은 줄글로 기록되는 것이 아니라 암호화 해시 함수형태로 블록에 저장되고, 이 블록들은 서로 연결되어 있어서 더 강력한 보안을 제공합니다. 2. 비트코인은 블록발행보상을 채굴자에게 지급하는 방식으로 신규 코인을 발행합니다. 블록발행보상은 매 21만 블록(약 4년)을 기준으로 발행량이 절반으로 줄어듭니다. 처음에는 50비트코인씩 발행이 되었고, 4년마다 계속 반으로 감소하고 있습니다. 코인의 총량이 2,100만 개에 도달하면 신규 발행은 종료되고, 이후에는 거래 수수료만을 통해 시스템이 지탱될 것입니다. 핵심 가치(키워드: 통화로 사용될 수 있는 보편성 및 편의성)1. 다양한 알트코인들의 등장에 앞서 비트코인은 가상화폐 시장에서 독보적이었기 때문에, 현재 가장 보편적인 결제수단으로 사용됩니다. 실생활에서 이를 활용할 수 있는 가맹점이 알트코인들보다 압도적으로 많을 뿐만 아니라, 이 또한 증가하고 있습니다. 일례로 일본 업체들이 비트코인 결제 시스템을 도입하면서 곧 비트코인을 오프라인 점포 26만 곳에서 이용할 수 있게 될 것입니다. 2. 여러 나라에서 비트코인을 정식 결제 수단으로 인정하면서, 실물화폐와 가상화폐를 거래할 때 더는 부가가치세가 부과되지 않게 된다고 합니다. 실제로 일본과 호주에서는 이미 비트코인을 합법적 결제 수단으로 인정하면서 제도권 안으로 들여오고 있고, 미국에서는 비트코인 ETF 승인 노력도 진행되고 있습니다. 각국에 비트코인을 기반으로 한 ATM 기계도 설치되었다고 합니다. 
        @SerializedName("lt")
        var lt: String?, // Bitcoin is the first successful internet money based on peer-to-peer technology; whereby no central bank or authority is involved in the transaction and production of the Bitcoin currency. It was created by an anonymous individual/group under the name, Satoshi Nakamoto. The source code is available publicly as an open source project, anybody can look at it and be part of the developmental process.Bitcoin is changing the way we see money as we speak. The idea was to produce a means of exchange, independent of any central authority, that could be transferred electronically in a secure, verifiable and immutable way. It is a decentralized peer-to-peer internet currency making mobile payment easy, very low transaction fees, protects your identity, and it works anywhere all the time with no central authority and banks.Bitcoin is designed to have only 21 million BTC ever created, thus making it a deflationary currency. Bitcoin uses the <a href="https://www.coingecko.com/en?hashing_algorithm=SHA-256">SHA-256</a> hashing algorithm with an average transaction confirmation time of 10 minutes. Miners today are mining Bitcoin using ASIC chip dedicated to only mining Bitcoin, and the hash rate has shot up to peta hashes.Being the first successful online cryptography currency, Bitcoin has inspired other alternative currencies such as <a href="https://www.coingecko.com/en/coins/litecoin">Litecoin</a>, <a href="https://www.coingecko.com/en/coins/peercoin">Peercoin</a>, <a href="https://www.coingecko.com/en/coins/primecoin">Primecoin</a>, and so on.The cryptocurrency then took off with the innovation of the turing-complete smart contract by <a href="https://www.coingecko.com/en/coins/ethereum">Ethereum</a> which led to the development of other amazing projects such as <a href="https://www.coingecko.com/en/coins/eos">EOS</a>, <a href="https://www.coingecko.com/en/coins/tron">Tron</a>, and even crypto-collectibles such as <a href="https://www.coingecko.com/buzz/ethereum-still-king-dapps-cryptokitties-need-1-billion-on-eos">CryptoKitties</a>.
        @SerializedName("nl")
        var nl: String?,
        @SerializedName("no")
        var no: String?, // Bitcoin is the first successful internet money based on peer-to-peer technology; whereby no central bank or authority is involved in the transaction and production of the Bitcoin currency. It was created by an anonymous individual/group under the name, Satoshi Nakamoto. The source code is available publicly as an open source project, anybody can look at it and be part of the developmental process.Bitcoin is changing the way we see money as we speak. The idea was to produce a means of exchange, independent of any central authority, that could be transferred electronically in a secure, verifiable and immutable way. It is a decentralized peer-to-peer internet currency making mobile payment easy, very low transaction fees, protects your identity, and it works anywhere all the time with no central authority and banks.Bitcoin is designed to have only 21 million BTC ever created, thus making it a deflationary currency. Bitcoin uses the <a href="https://www.coingecko.com/en?hashing_algorithm=SHA-256">SHA-256</a> hashing algorithm with an average transaction confirmation time of 10 minutes. Miners today are mining Bitcoin using ASIC chip dedicated to only mining Bitcoin, and the hash rate has shot up to peta hashes.Being the first successful online cryptography currency, Bitcoin has inspired other alternative currencies such as <a href="https://www.coingecko.com/en/coins/litecoin">Litecoin</a>, <a href="https://www.coingecko.com/en/coins/peercoin">Peercoin</a>, <a href="https://www.coingecko.com/en/coins/primecoin">Primecoin</a>, and so on.The cryptocurrency then took off with the innovation of the turing-complete smart contract by <a href="https://www.coingecko.com/en/coins/ethereum">Ethereum</a> which led to the development of other amazing projects such as <a href="https://www.coingecko.com/en/coins/eos">EOS</a>, <a href="https://www.coingecko.com/en/coins/tron">Tron</a>, and even crypto-collectibles such as <a href="https://www.coingecko.com/buzz/ethereum-still-king-dapps-cryptokitties-need-1-billion-on-eos">CryptoKitties</a>.
        @SerializedName("pl")
        var pl: String?,
        @SerializedName("pt")
        var pt: String?,
        @SerializedName("ro")
        var ro: String?,
        @SerializedName("ru")
        var ru: String?,
        @SerializedName("sk")
        var sk: String?, // Bitcoin is the first successful internet money based on peer-to-peer technology; whereby no central bank or authority is involved in the transaction and production of the Bitcoin currency. It was created by an anonymous individual/group under the name, Satoshi Nakamoto. The source code is available publicly as an open source project, anybody can look at it and be part of the developmental process.Bitcoin is changing the way we see money as we speak. The idea was to produce a means of exchange, independent of any central authority, that could be transferred electronically in a secure, verifiable and immutable way. It is a decentralized peer-to-peer internet currency making mobile payment easy, very low transaction fees, protects your identity, and it works anywhere all the time with no central authority and banks.Bitcoin is designed to have only 21 million BTC ever created, thus making it a deflationary currency. Bitcoin uses the <a href="https://www.coingecko.com/en?hashing_algorithm=SHA-256">SHA-256</a> hashing algorithm with an average transaction confirmation time of 10 minutes. Miners today are mining Bitcoin using ASIC chip dedicated to only mining Bitcoin, and the hash rate has shot up to peta hashes.Being the first successful online cryptography currency, Bitcoin has inspired other alternative currencies such as <a href="https://www.coingecko.com/en/coins/litecoin">Litecoin</a>, <a href="https://www.coingecko.com/en/coins/peercoin">Peercoin</a>, <a href="https://www.coingecko.com/en/coins/primecoin">Primecoin</a>, and so on.The cryptocurrency then took off with the innovation of the turing-complete smart contract by <a href="https://www.coingecko.com/en/coins/ethereum">Ethereum</a> which led to the development of other amazing projects such as <a href="https://www.coingecko.com/en/coins/eos">EOS</a>, <a href="https://www.coingecko.com/en/coins/tron">Tron</a>, and even crypto-collectibles such as <a href="https://www.coingecko.com/buzz/ethereum-still-king-dapps-cryptokitties-need-1-billion-on-eos">CryptoKitties</a>.
        @SerializedName("sl")
        var sl: String?, // Bitcoin is the first successful internet money based on peer-to-peer technology; whereby no central bank or authority is involved in the transaction and production of the Bitcoin currency. It was created by an anonymous individual/group under the name, Satoshi Nakamoto. The source code is available publicly as an open source project, anybody can look at it and be part of the developmental process.Bitcoin is changing the way we see money as we speak. The idea was to produce a means of exchange, independent of any central authority, that could be transferred electronically in a secure, verifiable and immutable way. It is a decentralized peer-to-peer internet currency making mobile payment easy, very low transaction fees, protects your identity, and it works anywhere all the time with no central authority and banks.Bitcoin is designed to have only 21 million BTC ever created, thus making it a deflationary currency. Bitcoin uses the <a href="https://www.coingecko.com/en?hashing_algorithm=SHA-256">SHA-256</a> hashing algorithm with an average transaction confirmation time of 10 minutes. Miners today are mining Bitcoin using ASIC chip dedicated to only mining Bitcoin, and the hash rate has shot up to peta hashes.Being the first successful online cryptography currency, Bitcoin has inspired other alternative currencies such as <a href="https://www.coingecko.com/en/coins/litecoin">Litecoin</a>, <a href="https://www.coingecko.com/en/coins/peercoin">Peercoin</a>, <a href="https://www.coingecko.com/en/coins/primecoin">Primecoin</a>, and so on.The cryptocurrency then took off with the innovation of the turing-complete smart contract by <a href="https://www.coingecko.com/en/coins/ethereum">Ethereum</a> which led to the development of other amazing projects such as <a href="https://www.coingecko.com/en/coins/eos">EOS</a>, <a href="https://www.coingecko.com/en/coins/tron">Tron</a>, and even crypto-collectibles such as <a href="https://www.coingecko.com/buzz/ethereum-still-king-dapps-cryptokitties-need-1-billion-on-eos">CryptoKitties</a>.
        @SerializedName("sv")
        var sv: String?, // Bitcoin is the first successful internet money based on peer-to-peer technology; whereby no central bank or authority is involved in the transaction and production of the Bitcoin currency. It was created by an anonymous individual/group under the name, Satoshi Nakamoto. The source code is available publicly as an open source project, anybody can look at it and be part of the developmental process.Bitcoin is changing the way we see money as we speak. The idea was to produce a means of exchange, independent of any central authority, that could be transferred electronically in a secure, verifiable and immutable way. It is a decentralized peer-to-peer internet currency making mobile payment easy, very low transaction fees, protects your identity, and it works anywhere all the time with no central authority and banks.Bitcoin is designed to have only 21 million BTC ever created, thus making it a deflationary currency. Bitcoin uses the <a href="https://www.coingecko.com/en?hashing_algorithm=SHA-256">SHA-256</a> hashing algorithm with an average transaction confirmation time of 10 minutes. Miners today are mining Bitcoin using ASIC chip dedicated to only mining Bitcoin, and the hash rate has shot up to peta hashes.Being the first successful online cryptography currency, Bitcoin has inspired other alternative currencies such as <a href="https://www.coingecko.com/en/coins/litecoin">Litecoin</a>, <a href="https://www.coingecko.com/en/coins/peercoin">Peercoin</a>, <a href="https://www.coingecko.com/en/coins/primecoin">Primecoin</a>, and so on.The cryptocurrency then took off with the innovation of the turing-complete smart contract by <a href="https://www.coingecko.com/en/coins/ethereum">Ethereum</a> which led to the development of other amazing projects such as <a href="https://www.coingecko.com/en/coins/eos">EOS</a>, <a href="https://www.coingecko.com/en/coins/tron">Tron</a>, and even crypto-collectibles such as <a href="https://www.coingecko.com/buzz/ethereum-still-king-dapps-cryptokitties-need-1-billion-on-eos">CryptoKitties</a>.
        @SerializedName("th")
        var th: String?,
        @SerializedName("tr")
        var tr: String?,
        @SerializedName("uk")
        var uk: String?,
        @SerializedName("vi")
        var vi: String?,
        @SerializedName("zh")
        var zh: String?,
        @SerializedName("zh-tw")
        var zhTw: String?
    )

    data class DetailPlatforms(
        @SerializedName("")
        var x: X?
    ) {
        data class X(
            @SerializedName("contract_address")
            var contractAddress: String?,
            @SerializedName("decimal_place")
            var decimalPlace: Any? // null
        )
    }

    data class DeveloperData(
        @SerializedName("closed_issues")
        var closedIssues: Int?, // 7151
        @SerializedName("code_additions_deletions_4_weeks")
        var codeAdditionsDeletions4Weeks: CodeAdditionsDeletions4Weeks?,
        @SerializedName("commit_count_4_weeks")
        var commitCount4Weeks: Int?, // 187
        @SerializedName("forks")
        var forks: Int?, // 35076
        @SerializedName("last_4_weeks_commit_activity_series")
        var last4WeeksCommitActivitySeries: List<Int?>?,
        @SerializedName("pull_request_contributors")
        var pullRequestContributors: Int?, // 833
        @SerializedName("pull_requests_merged")
        var pullRequestsMerged: Int?, // 10765
        @SerializedName("stars")
        var stars: Int?, // 70137
        @SerializedName("subscribers")
        var subscribers: Int?, // 3937
        @SerializedName("total_issues")
        var totalIssues: Int? // 7499
    ) {
        data class CodeAdditionsDeletions4Weeks(
            @SerializedName("additions")
            var additions: Int?, // 4530
            @SerializedName("deletions")
            var deletions: Int? // -1520
        )
    }

    data class Image(
        @SerializedName("large")
        var large: String?, // https://assets.coingecko.com/coins/images/1/large/bitcoin.png?1547033579
        @SerializedName("small")
        var small: String?, // https://assets.coingecko.com/coins/images/1/small/bitcoin.png?1547033579
        @SerializedName("thumb")
        var thumb: String? // https://assets.coingecko.com/coins/images/1/thumb/bitcoin.png?1547033579
    )

    data class Links(
        @SerializedName("announcement_url")
        var announcementUrl: List<String?>?,
        @SerializedName("bitcointalk_thread_identifier")
        var bitcointalkThreadIdentifier: Any?, // null
        @SerializedName("blockchain_site")
        var blockchainSite: List<String?>?,
        @SerializedName("chat_url")
        var chatUrl: List<String?>?,
        @SerializedName("facebook_username")
        var facebookUsername: String?, // bitcoins
        @SerializedName("homepage")
        var homepage: List<String?>?,
        @SerializedName("official_forum_url")
        var officialForumUrl: List<String?>?,
        @SerializedName("repos_url")
        var reposUrl: ReposUrl?,
        @SerializedName("subreddit_url")
        var subredditUrl: String?, // https://www.reddit.com/r/Bitcoin/
        @SerializedName("telegram_channel_identifier")
        var telegramChannelIdentifier: String?,
        @SerializedName("twitter_screen_name")
        var twitterScreenName: String? // bitcoin
    ) {
        data class ReposUrl(
            @SerializedName("bitbucket")
            var bitbucket: List<Any?>?,
            @SerializedName("github")
            var github: List<String?>?
        )
    }

    data class Localization(
        @SerializedName("ar")
        var ar: String?, // بيتكوين
        @SerializedName("bg")
        var bg: String?, // Bitcoin
        @SerializedName("cs")
        var cs: String?, // Bitcoin
        @SerializedName("da")
        var da: String?, // Bitcoin
        @SerializedName("de")
        var de: String?, // Bitcoin
        @SerializedName("el")
        var el: String?, // Bitcoin
        @SerializedName("en")
        var en: String?, // Bitcoin
        @SerializedName("es")
        var es: String?, // Bitcoin
        @SerializedName("fi")
        var fi: String?, // Bitcoin
        @SerializedName("fr")
        var fr: String?, // Bitcoin
        @SerializedName("he")
        var he: String?, // Bitcoin
        @SerializedName("hi")
        var hi: String?, // Bitcoin
        @SerializedName("hr")
        var hr: String?, // Bitcoin
        @SerializedName("hu")
        var hu: String?, // Bitcoin
        @SerializedName("id")
        var id: String?, // Bitcoin
        @SerializedName("it")
        var `it`: String?, // Bitcoin
        @SerializedName("ja")
        var ja: String?, // ビットコイン
        @SerializedName("ko")
        var ko: String?, // 비트코인
        @SerializedName("lt")
        var lt: String?, // Bitcoin
        @SerializedName("nl")
        var nl: String?, // Bitcoin
        @SerializedName("no")
        var no: String?, // Bitcoin
        @SerializedName("pl")
        var pl: String?, // Bitcoin
        @SerializedName("pt")
        var pt: String?, // Bitcoin
        @SerializedName("ro")
        var ro: String?, // Bitcoin
        @SerializedName("ru")
        var ru: String?, // Биткоин
        @SerializedName("sk")
        var sk: String?, // Bitcoin
        @SerializedName("sl")
        var sl: String?, // Bitcoin
        @SerializedName("sv")
        var sv: String?, // Bitcoin
        @SerializedName("th")
        var th: String?, // บิตคอยน์
        @SerializedName("tr")
        var tr: String?, // Bitcoin
        @SerializedName("uk")
        var uk: String?, // Bitcoin
        @SerializedName("vi")
        var vi: String?, // Bitcoin
        @SerializedName("zh")
        var zh: String?, // 比特币
        @SerializedName("zh-tw")
        var zhTw: String? // 比特幣
    )

    data class MarketData(
        @SerializedName("ath")
        var ath: Ath?,
        @SerializedName("ath_change_percentage")
        var athChangePercentage: AthChangePercentage?,
        @SerializedName("ath_date")
        var athDate: AthDate?,
        @SerializedName("atl")
        var atl: Atl?,
        @SerializedName("atl_change_percentage")
        var atlChangePercentage: AtlChangePercentage?,
        @SerializedName("atl_date")
        var atlDate: AtlDate?,
        @SerializedName("circulating_supply")
        var circulatingSupply: Int?, // 19414462
        @SerializedName("current_price")
        var currentPrice: CurrentPrice?,
        @SerializedName("fdv_to_tvl_ratio")
        var fdvToTvlRatio: Any?, // null
        @SerializedName("fully_diluted_valuation")
        var fullyDilutedValuation: FullyDilutedValuation?,
        @SerializedName("high_24h")
        var high24h: High24h?,
        @SerializedName("last_updated")
        var lastUpdated: String?, // 2023-06-28T20:34:55.858Z
        @SerializedName("low_24h")
        var low24h: Low24h?,
        @SerializedName("market_cap")
        var marketCap: MarketCap?,
        @SerializedName("market_cap_change_24h")
        var marketCapChange24h: Double?, // -10892145976.446
        @SerializedName("market_cap_change_24h_in_currency")
        var marketCapChange24hInCurrency: MarketCapChange24hInCurrency?,
        @SerializedName("market_cap_change_percentage_24h")
        var marketCapChangePercentage24h: Double?, // -1.83361
        @SerializedName("market_cap_change_percentage_24h_in_currency")
        var marketCapChangePercentage24hInCurrency: MarketCapChangePercentage24hInCurrency?,
        @SerializedName("market_cap_rank")
        var marketCapRank: Int?, // 1
        @SerializedName("max_supply")
        var maxSupply: Int?, // 21000000
        @SerializedName("mcap_to_tvl_ratio")
        var mcapToTvlRatio: Any?, // null
        @SerializedName("price_change_24h")
        var priceChange24h: Double?, // -514.636790398
        @SerializedName("price_change_24h_in_currency")
        var priceChange24hInCurrency: PriceChange24hInCurrency?,
        @SerializedName("price_change_percentage_14d")
        var priceChangePercentage14d: Double?, // 16.3712
        @SerializedName("price_change_percentage_14d_in_currency")
        var priceChangePercentage14dInCurrency: PriceChangePercentage14dInCurrency?,
        @SerializedName("price_change_percentage_1h_in_currency")
        var priceChangePercentage1hInCurrency: PriceChangePercentage1hInCurrency?,
        @SerializedName("price_change_percentage_1y")
        var priceChangePercentage1y: Double?, // 48.386
        @SerializedName("price_change_percentage_1y_in_currency")
        var priceChangePercentage1yInCurrency: PriceChangePercentage1yInCurrency?,
        @SerializedName("price_change_percentage_200d")
        var priceChangePercentage200d: Double?, // 75.06635
        @SerializedName("price_change_percentage_200d_in_currency")
        var priceChangePercentage200dInCurrency: PriceChangePercentage200dInCurrency?,
        @SerializedName("price_change_percentage_24h")
        var priceChangePercentage24h: Double?, // -1.68182
        @SerializedName("price_change_percentage_24h_in_currency")
        var priceChangePercentage24hInCurrency: PriceChangePercentage24hInCurrency?,
        @SerializedName("price_change_percentage_30d")
        var priceChangePercentage30d: Double?, // 8.63114
        @SerializedName("price_change_percentage_30d_in_currency")
        var priceChangePercentage30dInCurrency: PriceChangePercentage30dInCurrency?,
        @SerializedName("price_change_percentage_60d")
        var priceChangePercentage60d: Double?, // 2.76521
        @SerializedName("price_change_percentage_60d_in_currency")
        var priceChangePercentage60dInCurrency: PriceChangePercentage60dInCurrency?,
        @SerializedName("price_change_percentage_7d")
        var priceChangePercentage7d: Double?, // -0.14231
        @SerializedName("price_change_percentage_7d_in_currency")
        var priceChangePercentage7dInCurrency: PriceChangePercentage7dInCurrency?,
        @SerializedName("roi")
        var roi: Any?, // null
        @SerializedName("total_supply")
        var totalSupply: Int?, // 21000000
        @SerializedName("total_value_locked")
        var totalValueLocked: Any?, // null
        @SerializedName("total_volume")
        var totalVolume: TotalVolume?
    ) {
        data class Ath(
            @SerializedName("aed")
            var aed: Int?, // 253608
            @SerializedName("ars")
            var ars: Int?, // 7908719
            @SerializedName("aud")
            var aud: Int?, // 93482
            @SerializedName("bch")
            var bch: Double?, // 270.677
            @SerializedName("bdt")
            var bdt: Int?, // 5922005
            @SerializedName("bhd")
            var bhd: Int?, // 26031
            @SerializedName("bits")
            var bits: Int?, // 1058236
            @SerializedName("bmd")
            var bmd: Int?, // 69045
            @SerializedName("bnb")
            var bnb: Int?, // 143062
            @SerializedName("brl")
            var brl: Int?, // 380542
            @SerializedName("btc")
            var btc: Double?, // 1.003301
            @SerializedName("cad")
            var cad: Int?, // 85656
            @SerializedName("chf")
            var chf: Int?, // 62992
            @SerializedName("clp")
            var clp: Int?, // 55165171
            @SerializedName("cny")
            var cny: Int?, // 440948
            @SerializedName("czk")
            var czk: Int?, // 1505245
            @SerializedName("dkk")
            var dkk: Int?, // 444134
            @SerializedName("dot")
            var dot: Int?, // 6321
            @SerializedName("eos")
            var eos: Int?, // 45417
            @SerializedName("eth")
            var eth: Double?, // 624.203
            @SerializedName("eur")
            var eur: Int?, // 59717
            @SerializedName("gbp")
            var gbp: Int?, // 51032
            @SerializedName("hkd")
            var hkd: Int?, // 537865
            @SerializedName("huf")
            var huf: Int?, // 21673371
            @SerializedName("idr")
            var idr: Int?, // 984115318
            @SerializedName("ils")
            var ils: Int?, // 216131
            @SerializedName("inr")
            var inr: Int?, // 5128383
            @SerializedName("jpy")
            var jpy: Int?, // 7828814
            @SerializedName("krw")
            var krw: Int?, // 81339064
            @SerializedName("kwd")
            var kwd: Int?, // 20832
            @SerializedName("link")
            var link: Int?, // 74906
            @SerializedName("lkr")
            var lkr: Int?, // 14190616
            @SerializedName("ltc")
            var ltc: Double?, // 578.455
            @SerializedName("mmk")
            var mmk: Int?, // 126473151
            @SerializedName("mxn")
            var mxn: Int?, // 1409247
            @SerializedName("myr")
            var myr: Int?, // 286777
            @SerializedName("ngn")
            var ngn: Int?, // 28379648
            @SerializedName("nok")
            var nok: Int?, // 591777
            @SerializedName("nzd")
            var nzd: Int?, // 97030
            @SerializedName("php")
            var php: Int?, // 3454759
            @SerializedName("pkr")
            var pkr: Int?, // 11814869
            @SerializedName("pln")
            var pln: Int?, // 275506
            @SerializedName("rub")
            var rub: Int?, // 6075508
            @SerializedName("sar")
            var sar: Int?, // 258938
            @SerializedName("sats")
            var sats: Int?, // 105823579
            @SerializedName("sek")
            var sek: Int?, // 596346
            @SerializedName("sgd")
            var sgd: Int?, // 91123
            @SerializedName("thb")
            var thb: Int?, // 2258593
            @SerializedName("try")
            var tryX: Int?, // 850326
            @SerializedName("twd")
            var twd: Int?, // 1914232
            @SerializedName("uah")
            var uah: Int?, // 1815814
            @SerializedName("usd")
            var usd: Int?, // 69045
            @SerializedName("vef")
            var vef: Long?, // 8618768857
            @SerializedName("vnd")
            var vnd: Int?, // 1563347910
            @SerializedName("xag")
            var xag: Double?, // 2815.08
            @SerializedName("xau")
            var xau: Double?, // 37.72
            @SerializedName("xdr")
            var xdr: Int?, // 48913
            @SerializedName("xlm")
            var xlm: Int?, // 353354
            @SerializedName("xrp")
            var xrp: Int?, // 159288
            @SerializedName("yfi")
            var yfi: Double?, // 11.593182
            @SerializedName("zar")
            var zar: Int? // 1057029
        )

        data class AthChangePercentage(
            @SerializedName("aed")
            var aed: Double?, // -56.51073
            @SerializedName("ars")
            var ars: Double?, // -2.84961
            @SerializedName("aud")
            var aud: Double?, // -51.34513
            @SerializedName("bch")
            var bch: Double?, // -50.45844
            @SerializedName("bdt")
            var bdt: Double?, // -45.11453
            @SerializedName("bhd")
            var bhd: Double?, // -56.50658
            @SerializedName("bits")
            var bits: Double?, // -5.48332
            @SerializedName("bmd")
            var bmd: Double?, // -56.51073
            @SerializedName("bnb")
            var bnb: Double?, // -99.90811
            @SerializedName("brl")
            var brl: Double?, // -61.73136
            @SerializedName("btc")
            var btc: Double?, // -0.32896
            @SerializedName("cad")
            var cad: Double?, // -53.52745
            @SerializedName("chf")
            var chf: Double?, // -57.25041
            @SerializedName("clp")
            var clp: Double?, // -56.43327
            @SerializedName("cny")
            var cny: Double?, // -50.66735
            @SerializedName("czk")
            var czk: Double?, // -56.73454
            @SerializedName("dkk")
            var dkk: Double?, // -53.86831
            @SerializedName("dot")
            var dot: Double?, // -2.23854
            @SerializedName("eos")
            var eos: Double?, // -0.23237
            @SerializedName("eth")
            var eth: Double?, // -97.3696
            @SerializedName("eur")
            var eur: Double?, // -53.93627
            @SerializedName("gbp")
            var gbp: Double?, // -53.44507
            @SerializedName("hkd")
            var hkd: Double?, // -56.27034
            @SerializedName("huf")
            var huf: Double?, // -52.89518
            @SerializedName("idr")
            var idr: Double?, // -54.27971
            @SerializedName("ils")
            var ils: Double?, // -48.92993
            @SerializedName("inr")
            var inr: Double?, // -51.97811
            @SerializedName("jpy")
            var jpy: Double?, // -44.59838
            @SerializedName("krw")
            var krw: Double?, // -51.69711
            @SerializedName("kwd")
            var kwd: Double?, // -55.68408
            @SerializedName("link")
            var link: Double?, // -93.09368
            @SerializedName("lkr")
            var lkr: Double?, // -35.00025
            @SerializedName("ltc")
            var ltc: Double?, // -36.77427
            @SerializedName("mmk")
            var mmk: Double?, // -50.11858
            @SerializedName("mxn")
            var mxn: Double?, // -63.59841
            @SerializedName("myr")
            var myr: Double?, // -51.08701
            @SerializedName("ngn")
            var ngn: Double?, // -20.17547
            @SerializedName("nok")
            var nok: Double?, // -45.36823
            @SerializedName("nzd")
            var nzd: Double?, // -49.06131
            @SerializedName("php")
            var php: Double?, // -51.94726
            @SerializedName("pkr")
            var pkr: Double?, // -27.18705
            @SerializedName("pln")
            var pln: Double?, // -55.30041
            @SerializedName("rub")
            var rub: Double?, // -57.55048
            @SerializedName("sar")
            var sar: Double?, // -56.50622
            @SerializedName("sats")
            var sats: Double?, // -5.48332
            @SerializedName("sek")
            var sek: Double?, // -45.70869
            @SerializedName("sgd")
            var sgd: Double?, // -55.42784
            @SerializedName("thb")
            var thb: Double?, // -52.71779
            @SerializedName("try")
            var tryX: Double?, // -8.02423
            @SerializedName("twd")
            var twd: Double?, // -51.37302
            @SerializedName("uah")
            var uah: Double?, // -38.90551
            @SerializedName("usd")
            var usd: Double?, // -56.51073
            @SerializedName("vef")
            var vef: Double?, // -99.99997
            @SerializedName("vnd")
            var vnd: Double?, // -54.79176
            @SerializedName("xag")
            var xag: Double?, // -53.04516
            @SerializedName("xau")
            var xau: Double?, // -58.30725
            @SerializedName("xdr")
            var xdr: Double?, // -53.9355
            @SerializedName("xlm")
            var xlm: Double?, // -15.27421
            @SerializedName("xrp")
            var xrp: Double?, // -58.97542
            @SerializedName("yfi")
            var yfi: Double?, // -56.84771
            @SerializedName("zar")
            var zar: Double? // -46.99113
        )

        data class AthDate(
            @SerializedName("aed")
            var aed: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("ars")
            var ars: String?, // 2023-06-23T18:00:12.882Z
            @SerializedName("aud")
            var aud: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("bch")
            var bch: String?, // 2023-06-10T04:30:21.139Z
            @SerializedName("bdt")
            var bdt: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("bhd")
            var bhd: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("bits")
            var bits: String?, // 2021-05-19T16:00:11.072Z
            @SerializedName("bmd")
            var bmd: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("bnb")
            var bnb: String?, // 2017-10-19T00:00:00.000Z
            @SerializedName("brl")
            var brl: String?, // 2021-11-09T04:09:45.771Z
            @SerializedName("btc")
            var btc: String?, // 2019-10-15T16:00:56.136Z
            @SerializedName("cad")
            var cad: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("chf")
            var chf: String?, // 2021-11-10T17:30:22.767Z
            @SerializedName("clp")
            var clp: String?, // 2021-11-09T04:09:45.771Z
            @SerializedName("cny")
            var cny: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("czk")
            var czk: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("dkk")
            var dkk: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("dot")
            var dot: String?, // 2023-06-21T16:35:43.434Z
            @SerializedName("eos")
            var eos: String?, // 2023-06-28T19:50:21.990Z
            @SerializedName("eth")
            var eth: String?, // 2015-10-20T00:00:00.000Z
            @SerializedName("eur")
            var eur: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("gbp")
            var gbp: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("hkd")
            var hkd: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("huf")
            var huf: String?, // 2021-11-10T16:54:53.781Z
            @SerializedName("idr")
            var idr: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("ils")
            var ils: String?, // 2021-10-20T14:54:17.702Z
            @SerializedName("inr")
            var inr: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("jpy")
            var jpy: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("krw")
            var krw: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("kwd")
            var kwd: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("link")
            var link: String?, // 2017-12-12T00:00:00.000Z
            @SerializedName("lkr")
            var lkr: String?, // 2022-03-29T12:14:23.745Z
            @SerializedName("ltc")
            var ltc: String?, // 2022-06-13T07:48:18.897Z
            @SerializedName("mmk")
            var mmk: String?, // 2021-10-20T14:54:17.702Z
            @SerializedName("mxn")
            var mxn: String?, // 2021-11-10T17:30:22.767Z
            @SerializedName("myr")
            var myr: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("ngn")
            var ngn: String?, // 2021-11-09T04:09:45.771Z
            @SerializedName("nok")
            var nok: String?, // 2021-11-10T17:30:22.767Z
            @SerializedName("nzd")
            var nzd: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("php")
            var php: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("pkr")
            var pkr: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("pln")
            var pln: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("rub")
            var rub: String?, // 2022-03-07T16:43:46.826Z
            @SerializedName("sar")
            var sar: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("sats")
            var sats: String?, // 2021-05-19T16:00:11.072Z
            @SerializedName("sek")
            var sek: String?, // 2021-11-10T17:30:22.767Z
            @SerializedName("sgd")
            var sgd: String?, // 2021-11-09T00:00:00.000Z
            @SerializedName("thb")
            var thb: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("try")
            var tryX: String?, // 2021-12-20T16:44:25.022Z
            @SerializedName("twd")
            var twd: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("uah")
            var uah: String?, // 2021-04-14T06:52:46.198Z
            @SerializedName("usd")
            var usd: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("vef")
            var vef: String?, // 2021-01-03T12:04:17.372Z
            @SerializedName("vnd")
            var vnd: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("xag")
            var xag: String?, // 2021-11-09T04:09:45.771Z
            @SerializedName("xau")
            var xau: String?, // 2021-10-20T14:54:17.702Z
            @SerializedName("xdr")
            var xdr: String?, // 2021-11-10T14:24:11.849Z
            @SerializedName("xlm")
            var xlm: String?, // 2023-06-21T16:45:18.063Z
            @SerializedName("xrp")
            var xrp: String?, // 2021-01-03T07:54:40.240Z
            @SerializedName("yfi")
            var yfi: String?, // 2020-07-18T00:00:00.000Z
            @SerializedName("zar")
            var zar: String? // 2021-11-10T17:49:04.400Z
        )

        data class Atl(
            @SerializedName("aed")
            var aed: Double?, // 632.31
            @SerializedName("ars")
            var ars: Double?, // 1478.98
            @SerializedName("aud")
            var aud: Double?, // 72.61
            @SerializedName("bch")
            var bch: Double?, // 3.513889
            @SerializedName("bdt")
            var bdt: Double?, // 9390.25
            @SerializedName("bhd")
            var bhd: Double?, // 45.91
            @SerializedName("bits")
            var bits: Int?, // 950993
            @SerializedName("bmd")
            var bmd: Double?, // 121.77
            @SerializedName("bnb")
            var bnb: Double?, // 52.17
            @SerializedName("brl")
            var brl: Double?, // 149.66
            @SerializedName("btc")
            var btc: Double?, // 0.99895134
            @SerializedName("cad")
            var cad: Double?, // 69.81
            @SerializedName("chf")
            var chf: Double?, // 63.26
            @SerializedName("clp")
            var clp: Int?, // 107408
            @SerializedName("cny")
            var cny: Double?, // 407.23
            @SerializedName("czk")
            var czk: Double?, // 4101.56
            @SerializedName("dkk")
            var dkk: Double?, // 382.47
            @SerializedName("dot")
            var dot: Double?, // 991.882
            @SerializedName("eos")
            var eos: Double?, // 908.141
            @SerializedName("eth")
            var eth: Double?, // 6.779735
            @SerializedName("eur")
            var eur: Double?, // 51.3
            @SerializedName("gbp")
            var gbp: Double?, // 43.9
            @SerializedName("hkd")
            var hkd: Double?, // 514.37
            @SerializedName("huf")
            var huf: Int?, // 46598
            @SerializedName("idr")
            var idr: Int?, // 658780
            @SerializedName("ils")
            var ils: Double?, // 672.18
            @SerializedName("inr")
            var inr: Double?, // 3993.42
            @SerializedName("jpy")
            var jpy: Double?, // 6641.83
            @SerializedName("krw")
            var krw: Int?, // 75594
            @SerializedName("kwd")
            var kwd: Double?, // 50.61
            @SerializedName("link")
            var link: Double?, // 598.477
            @SerializedName("lkr")
            var lkr: Int?, // 22646
            @SerializedName("ltc")
            var ltc: Double?, // 20.707835
            @SerializedName("mmk")
            var mmk: Int?, // 117588
            @SerializedName("mxn")
            var mxn: Double?, // 859.32
            @SerializedName("myr")
            var myr: Double?, // 211.18
            @SerializedName("ngn")
            var ngn: Double?, // 10932.64
            @SerializedName("nok")
            var nok: Double?, // 1316.03
            @SerializedName("nzd")
            var nzd: Double?, // 84.85
            @SerializedName("php")
            var php: Double?, // 2880.5
            @SerializedName("pkr")
            var pkr: Double?, // 17315.84
            @SerializedName("pln")
            var pln: Double?, // 220.11
            @SerializedName("rub")
            var rub: Double?, // 2206.43
            @SerializedName("sar")
            var sar: Double?, // 646.04
            @SerializedName("sats")
            var sats: Int?, // 95099268
            @SerializedName("sek")
            var sek: Double?, // 443.81
            @SerializedName("sgd")
            var sgd: Double?, // 84.47
            @SerializedName("thb")
            var thb: Double?, // 5644.35
            @SerializedName("try")
            var tryX: Double?, // 392.91
            @SerializedName("twd")
            var twd: Double?, // 1998.66
            @SerializedName("uah")
            var uah: Double?, // 553.37
            @SerializedName("usd")
            var usd: Double?, // 67.81
            @SerializedName("vef")
            var vef: Double?, // 766.19
            @SerializedName("vnd")
            var vnd: Int?, // 3672339
            @SerializedName("xag")
            var xag: Double?, // 3.37
            @SerializedName("xau")
            var xau: Double?, // 0.0531
            @SerializedName("xdr")
            var xdr: Double?, // 44.39
            @SerializedName("xlm")
            var xlm: Int?, // 21608
            @SerializedName("xrp")
            var xrp: Int?, // 9908
            @SerializedName("yfi")
            var yfi: Double?, // 0.23958075
            @SerializedName("zar")
            var zar: Double? // 666.26
        )

        data class AtlChangePercentage(
            @SerializedName("aed")
            var aed: Double?, // 17342.66412
            @SerializedName("ars")
            var ars: Double?, // 519404.3538
            @SerializedName("aud")
            var aud: Double?, // 62541.6245
            @SerializedName("bch")
            var bch: Double?, // 3716.21684
            @SerializedName("bdt")
            var bdt: Double?, // 34513.7648
            @SerializedName("bhd")
            var bhd: Double?, // 24558.83677
            @SerializedName("bits")
            var bits: Double?, // 5.17529
            @SerializedName("bmd")
            var bmd: Double?, // 24558.83677
            @SerializedName("bnb")
            var bnb: Double?, // 151.97729
            @SerializedName("brl")
            var brl: Double?, // 97207.04579
            @SerializedName("btc")
            var btc: Double?, // 0.10498
            @SerializedName("cad")
            var cad: Double?, // 56924.13167
            @SerializedName("chf")
            var chf: Double?, // 42467.84256
            @SerializedName("clp")
            var clp: Double?, // 22276.00333
            @SerializedName("cny")
            var cny: Double?, // 53317.86874
            @SerializedName("czk")
            var czk: Double?, // 15778.13826
            @SerializedName("dkk")
            var dkk: Double?, // 53469.64769
            @SerializedName("dot")
            var dot: Double?, // 522.95876
            @SerializedName("eos")
            var eos: Double?, // 4889.50648
            @SerializedName("eth")
            var eth: Double?, // 142.17773
            @SerializedName("eur")
            var eur: Double?, // 53523.10468
            @SerializedName("gbp")
            var gbp: Double?, // 54015.56757
            @SerializedName("hkd")
            var hkd: Double?, // 45626.66908
            @SerializedName("huf")
            var huf: Double?, // 21809.07901
            @SerializedName("idr")
            var idr: Double?, // 68199.03703
            @SerializedName("ils")
            var ils: Double?, // 16320.84458
            @SerializedName("inr")
            var inr: Double?, // 61570.10858
            @SerializedName("jpy")
            var jpy: Double?, // 65202.60887
            @SerializedName("krw")
            var krw: Double?, // 51874.0009
            @SerializedName("kwd")
            var kwd: Double?, // 18140.57495
            @SerializedName("link")
            var link: Double?, // 764.40451
            @SerializedName("lkr")
            var lkr: Double?, // 40630.12375
            @SerializedName("ltc")
            var ltc: Double?, // 1666.15569
            @SerializedName("mmk")
            var mmk: Double?, // 53550.5668
            @SerializedName("mxn")
            var mxn: Double?, // 59597.11963
            @SerializedName("myr")
            var myr: Double?, // 66323.94809
            @SerializedName("ngn")
            var ngn: Double?, // 207113.57786
            @SerializedName("nok")
            var nok: Double?, // 24466.2548
            @SerializedName("nzd")
            var nzd: Double?, // 58147.6443
            @SerializedName("php")
            var php: Double?, // 57532.53077
            @SerializedName("pkr")
            var pkr: Double?, // 49581.40245
            @SerializedName("pln")
            var pln: Double?, // 55848.92042
            @SerializedName("rub")
            var rub: Double?, // 116786.58079
            @SerializedName("sar")
            var sar: Double?, // 17332.66977
            @SerializedName("sats")
            var sats: Double?, // 5.17529
            @SerializedName("sek")
            var sek: Double?, // 72851.75574
            @SerializedName("sgd")
            var sgd: Double?, // 47985.03276
            @SerializedName("thb")
            var thb: Double?, // 18820.03621
            @SerializedName("try")
            var tryX: Double?, // 198952.01763
            @SerializedName("twd")
            var twd: Double?, // 46472.9623
            @SerializedName("uah")
            var uah: Double?, // 200374.63882
            @SerializedName("usd")
            var usd: Double?, // 44181.82915
            @SerializedName("vef")
            var vef: Double?, // 292.41076
            @SerializedName("vnd")
            var vnd: Double?, // 19145.55412
            @SerializedName("xag")
            var xag: Double?, // 39126.56463
            @SerializedName("xau")
            var xau: Double?, // 29513.1331
            @SerializedName("xdr")
            var xdr: Double?, // 50656.99225
            @SerializedName("xlm")
            var xlm: Double?, // 1285.49472
            @SerializedName("xrp")
            var xrp: Double?, // 559.54165
            @SerializedName("yfi")
            var yfi: Double?, // 1988.1156
            @SerializedName("zar")
            var zar: Double? // 83998.62835
        )

        data class AtlDate(
            @SerializedName("aed")
            var aed: String?, // 2015-01-14T00:00:00.000Z
            @SerializedName("ars")
            var ars: String?, // 2015-01-14T00:00:00.000Z
            @SerializedName("aud")
            var aud: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("bch")
            var bch: String?, // 2017-08-02T00:00:00.000Z
            @SerializedName("bdt")
            var bdt: String?, // 2013-09-08T00:00:00.000Z
            @SerializedName("bhd")
            var bhd: String?, // 2013-09-08T00:00:00.000Z
            @SerializedName("bits")
            var bits: String?, // 2021-05-19T13:14:13.071Z
            @SerializedName("bmd")
            var bmd: String?, // 2013-09-08T00:00:00.000Z
            @SerializedName("bnb")
            var bnb: String?, // 2022-11-27T02:35:06.345Z
            @SerializedName("brl")
            var brl: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("btc")
            var btc: String?, // 2019-10-21T00:00:00.000Z
            @SerializedName("cad")
            var cad: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("chf")
            var chf: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("clp")
            var clp: String?, // 2015-01-14T00:00:00.000Z
            @SerializedName("cny")
            var cny: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("czk")
            var czk: String?, // 2015-01-14T00:00:00.000Z
            @SerializedName("dkk")
            var dkk: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("dot")
            var dot: String?, // 2021-05-19T11:04:48.978Z
            @SerializedName("eos")
            var eos: String?, // 2019-04-11T00:00:00.000Z
            @SerializedName("eth")
            var eth: String?, // 2017-06-12T00:00:00.000Z
            @SerializedName("eur")
            var eur: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("gbp")
            var gbp: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("hkd")
            var hkd: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("huf")
            var huf: String?, // 2015-01-14T00:00:00.000Z
            @SerializedName("idr")
            var idr: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("ils")
            var ils: String?, // 2015-01-14T00:00:00.000Z
            @SerializedName("inr")
            var inr: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("jpy")
            var jpy: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("krw")
            var krw: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("kwd")
            var kwd: String?, // 2015-01-14T00:00:00.000Z
            @SerializedName("link")
            var link: String?, // 2020-08-16T08:13:13.338Z
            @SerializedName("lkr")
            var lkr: String?, // 2015-01-14T00:00:00.000Z
            @SerializedName("ltc")
            var ltc: String?, // 2013-11-28T00:00:00.000Z
            @SerializedName("mmk")
            var mmk: String?, // 2013-09-08T00:00:00.000Z
            @SerializedName("mxn")
            var mxn: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("myr")
            var myr: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("ngn")
            var ngn: String?, // 2013-07-06T00:00:00.000Z
            @SerializedName("nok")
            var nok: String?, // 2015-01-14T00:00:00.000Z
            @SerializedName("nzd")
            var nzd: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("php")
            var php: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("pkr")
            var pkr: String?, // 2015-01-14T00:00:00.000Z
            @SerializedName("pln")
            var pln: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("rub")
            var rub: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("sar")
            var sar: String?, // 2015-01-14T00:00:00.000Z
            @SerializedName("sats")
            var sats: String?, // 2021-05-19T13:14:13.071Z
            @SerializedName("sek")
            var sek: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("sgd")
            var sgd: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("thb")
            var thb: String?, // 2015-01-14T00:00:00.000Z
            @SerializedName("try")
            var tryX: String?, // 2015-01-14T00:00:00.000Z
            @SerializedName("twd")
            var twd: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("uah")
            var uah: String?, // 2013-07-06T00:00:00.000Z
            @SerializedName("usd")
            var usd: String?, // 2013-07-06T00:00:00.000Z
            @SerializedName("vef")
            var vef: String?, // 2013-09-08T00:00:00.000Z
            @SerializedName("vnd")
            var vnd: String?, // 2015-01-14T00:00:00.000Z
            @SerializedName("xag")
            var xag: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("xau")
            var xau: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("xdr")
            var xdr: String?, // 2013-07-05T00:00:00.000Z
            @SerializedName("xlm")
            var xlm: String?, // 2018-11-20T00:00:00.000Z
            @SerializedName("xrp")
            var xrp: String?, // 2018-12-25T00:00:00.000Z
            @SerializedName("yfi")
            var yfi: String?, // 2020-09-12T20:09:36.122Z
            @SerializedName("zar")
            var zar: String? // 2013-07-05T00:00:00.000Z
        )

        data class CurrentPrice(
            @SerializedName("aed")
            var aed: Int?, // 110507
            @SerializedName("ars")
            var ars: Int?, // 7698058
            @SerializedName("aud")
            var aud: Int?, // 45591
            @SerializedName("bch")
            var bch: Double?, // 134.428
            @SerializedName("bdt")
            var bdt: Int?, // 3256631
            @SerializedName("bhd")
            var bhd: Double?, // 11343.65
            @SerializedName("bits")
            var bits: Int?, // 1000708
            @SerializedName("bmd")
            var bmd: Int?, // 30085
            @SerializedName("bnb")
            var bnb: Double?, // 131.386
            @SerializedName("brl")
            var brl: Int?, // 145935
            @SerializedName("btc")
            var btc: Int?, // 1
            @SerializedName("cad")
            var cad: Int?, // 39889
            @SerializedName("chf")
            var chf: Int?, // 26987
            @SerializedName("clp")
            var clp: Int?, // 24081524
            @SerializedName("cny")
            var cny: Int?, // 217953
            @SerializedName("czk")
            var czk: Int?, // 652735
            @SerializedName("dkk")
            var dkk: Int?, // 205356
            @SerializedName("dot")
            var dot: Int?, // 6169
            @SerializedName("eos")
            var eos: Int?, // 45266
            @SerializedName("eth")
            var eth: Double?, // 16.424439
            @SerializedName("eur")
            var eur: Int?, // 27571
            @SerializedName("gbp")
            var gbp: Int?, // 23810
            @SerializedName("hkd")
            var hkd: Int?, // 235661
            @SerializedName("huf")
            var huf: Int?, // 10233457
            @SerializedName("idr")
            var idr: Int?, // 450813858
            @SerializedName("ils")
            var ils: Int?, // 110593
            @SerializedName("inr")
            var inr: Int?, // 2467682
            @SerializedName("jpy")
            var jpy: Int?, // 4346578
            @SerializedName("krw")
            var krw: Int?, // 39374448
            @SerializedName("kwd")
            var kwd: Double?, // 9249.65
            @SerializedName("link")
            var link: Int?, // 5176
            @SerializedName("lkr")
            var lkr: Int?, // 9241771
            @SerializedName("ltc")
            var ltc: Double?, // 364.913
            @SerializedName("mmk")
            var mmk: Int?, // 63209077
            @SerializedName("mxn")
            var mxn: Int?, // 514073
            @SerializedName("myr")
            var myr: Int?, // 140544
            @SerializedName("ngn")
            var ngn: Int?, // 22697898
            @SerializedName("nok")
            var nok: Int?, // 324060
            @SerializedName("nzd")
            var nzd: Int?, // 49541
            @SerializedName("php")
            var php: Int?, // 1662787
            @SerializedName("pkr")
            var pkr: Int?, // 8619455
            @SerializedName("pln")
            var pln: Int?, // 123440
            @SerializedName("rub")
            var rub: Int?, // 2584031
            @SerializedName("sar")
            var sar: Int?, // 112840
            @SerializedName("sats")
            var sats: Int?, // 100070822
            @SerializedName("sek")
            var sek: Int?, // 324505
            @SerializedName("sgd")
            var sgd: Int?, // 40696
            @SerializedName("thb")
            var thb: Int?, // 1070671
            @SerializedName("try")
            var tryX: Int?, // 783618
            @SerializedName("twd")
            var twd: Int?, // 932571
            @SerializedName("uah")
            var uah: Int?, // 1111516
            @SerializedName("usd")
            var usd: Int?, // 30085
            @SerializedName("vef")
            var vef: Double?, // 3012.45
            @SerializedName("vnd")
            var vnd: Int?, // 708134106
            @SerializedName("xag")
            var xag: Double?, // 1324.52
            @SerializedName("xau")
            var xau: Double?, // 15.76
            @SerializedName("xdr")
            var xdr: Int?, // 22575
            @SerializedName("xlm")
            var xlm: Int?, // 298032
            @SerializedName("xrp")
            var xrp: Int?, // 65331
            @SerializedName("yfi")
            var yfi: Double?, // 4.995653
            @SerializedName("zar")
            var zar: Int? // 561383
        )

        data class FullyDilutedValuation(
            @SerializedName("aed")
            var aed: Long?, // 2316838372131
            @SerializedName("ars")
            var ars: Long?, // 161394590386001
            @SerializedName("aud")
            var aud: Long?, // 955839168331
            @SerializedName("bch")
            var bch: Long?, // 2818907221
            @SerializedName("bdt")
            var bdt: Long?, // 68277293687083
            @SerializedName("bhd")
            var bhd: Long?, // 237826792457
            @SerializedName("bits")
            var bits: Long?, // 20994479000394
            @SerializedName("bmd")
            var bmd: Long?, // 630758316444
            @SerializedName("bnb")
            var bnb: Long?, // 2758730358
            @SerializedName("brl")
            var brl: Long?, // 3059619365576
            @SerializedName("btc")
            var btc: Int?, // 21000000
            @SerializedName("cad")
            var cad: Long?, // 836294067649
            @SerializedName("chf")
            var chf: Long?, // 565799671225
            @SerializedName("clp")
            var clp: Long?, // 504884186814563
            @SerializedName("cny")
            var cny: Long?, // 4569528623480
            @SerializedName("czk")
            var czk: Long?, // 13684996140162
            @SerializedName("dkk")
            var dkk: Long?, // 4305414978185
            @SerializedName("dot")
            var dot: Long?, // 129586698014
            @SerializedName("eos")
            var eos: Long?, // 950662091358
            @SerializedName("eth")
            var eth: Int?, // 344754979
            @SerializedName("eur")
            var eur: Long?, // 578043320906
            @SerializedName("gbp")
            var gbp: Long?, // 499182762392
            @SerializedName("hkd")
            var hkd: Long?, // 4940770891998
            @SerializedName("huf")
            var huf: Long?, // 214550817766574
            @SerializedName("idr")
            var idr: Long?, // 9451594135670384
            @SerializedName("ils")
            var ils: Long?, // 2318642340916
            @SerializedName("inr")
            var inr: Long?, // 51736504577512
            @SerializedName("jpy")
            var jpy: Long?, // 91128717658137
            @SerializedName("krw")
            var krw: Long?, // 825509893053010
            @SerializedName("kwd")
            var kwd: Long?, // 193924752116
            @SerializedName("link")
            var link: Long?, // 108639403920
            @SerializedName("lkr")
            var lkr: Long?, // 193759511098132
            @SerializedName("ltc")
            var ltc: Long?, // 7664878933
            @SerializedName("mmk")
            var mmk: Long?, // 1325217786974006
            @SerializedName("mxn")
            var mxn: Long?, // 10777867643654
            @SerializedName("myr")
            var myr: Long?, // 2946587475269
            @SerializedName("ngn")
            var ngn: Long?, // 475875611841296
            @SerializedName("nok")
            var nok: Long?, // 6794119222589
            @SerializedName("nzd")
            var nzd: Long?, // 1038652689214
            @SerializedName("php")
            var php: Long?, // 34861378237761
            @SerializedName("pkr")
            var pkr: Long?, // 180712257661251
            @SerializedName("pln")
            var pln: Long?, // 2588001372370
            @SerializedName("rub")
            var rub: Long?, // 54175822338014
            @SerializedName("sar")
            var sar: Long?, // 2365770079288
            @SerializedName("sats")
            var sats: Long?, // 2099447900039407
            @SerializedName("sek")
            var sek: Long?, // 6803458860981
            @SerializedName("sgd")
            var sgd: Long?, // 853220467071
            @SerializedName("thb")
            var thb: Long?, // 22447295137126
            @SerializedName("try")
            var tryX: Long?, // 16429045858504
            @SerializedName("twd")
            var twd: Long?, // 19551931544736
            @SerializedName("uah")
            var uah: Long?, // 23303625242698
            @SerializedName("usd")
            var usd: Long?, // 630758316444
            @SerializedName("vef")
            var vef: Long?, // 63157830226
            @SerializedName("vnd")
            var vnd: Long?, // 14846473873304380
            @SerializedName("xag")
            var xag: Long?, // 27769343032
            @SerializedName("xau")
            var xau: Int?, // 330347053
            @SerializedName("xdr")
            var xdr: Long?, // 473309056252
            @SerializedName("xlm")
            var xlm: Long?, // 6249450159856
            @SerializedName("xrp")
            var xrp: Long?, // 1370968901215
            @SerializedName("yfi")
            var yfi: Int?, // 104927640
            @SerializedName("zar")
            var zar: Long? // 11769744557637
        )

        data class High24h(
            @SerializedName("aed")
            var aed: Int?, // 112987
            @SerializedName("ars")
            var ars: Int?, // 7850984
            @SerializedName("aud")
            var aud: Int?, // 46103
            @SerializedName("bch")
            var bch: Double?, // 135.091
            @SerializedName("bdt")
            var bdt: Int?, // 3329845
            @SerializedName("bhd")
            var bhd: Double?, // 11597.84
            @SerializedName("bits")
            var bits: Int?, // 1001549
            @SerializedName("bmd")
            var bmd: Int?, // 30762
            @SerializedName("bnb")
            var bnb: Double?, // 132.507
            @SerializedName("brl")
            var brl: Int?, // 148032
            @SerializedName("btc")
            var btc: Int?, // 1
            @SerializedName("cad")
            var cad: Int?, // 40589
            @SerializedName("chf")
            var chf: Int?, // 27488
            @SerializedName("clp")
            var clp: Int?, // 24609942
            @SerializedName("cny")
            var cny: Int?, // 222111
            @SerializedName("czk")
            var czk: Int?, // 663084
            @SerializedName("dkk")
            var dkk: Int?, // 209009
            @SerializedName("dot")
            var dot: Int?, // 6232
            @SerializedName("eos")
            var eos: Int?, // 45417
            @SerializedName("eth")
            var eth: Double?, // 16.427846
            @SerializedName("eur")
            var eur: Int?, // 28066
            @SerializedName("gbp")
            var gbp: Int?, // 24131
            @SerializedName("hkd")
            var hkd: Int?, // 240961
            @SerializedName("huf")
            var huf: Int?, // 10392778
            @SerializedName("idr")
            var idr: Int?, // 461067261
            @SerializedName("ils")
            var ils: Int?, // 112975
            @SerializedName("inr")
            var inr: Int?, // 2522507
            @SerializedName("jpy")
            var jpy: Int?, // 4431112
            @SerializedName("krw")
            var krw: Int?, // 39961191
            @SerializedName("kwd")
            var kwd: Double?, // 9449.73
            @SerializedName("link")
            var link: Int?, // 5194
            @SerializedName("lkr")
            var lkr: Int?, // 9509089
            @SerializedName("ltc")
            var ltc: Double?, // 366.286
            @SerializedName("mmk")
            var mmk: Int?, // 64618789
            @SerializedName("mxn")
            var mxn: Int?, // 525698
            @SerializedName("myr")
            var myr: Int?, // 143537
            @SerializedName("ngn")
            var ngn: Int?, // 23525409
            @SerializedName("nok")
            var nok: Int?, // 331528
            @SerializedName("nzd")
            var nzd: Int?, // 50064
            @SerializedName("php")
            var php: Int?, // 1696886
            @SerializedName("pkr")
            var pkr: Int?, // 8783239
            @SerializedName("pln")
            var pln: Int?, // 125232
            @SerializedName("rub")
            var rub: Int?, // 2634826
            @SerializedName("sar")
            var sar: Int?, // 115377
            @SerializedName("sats")
            var sats: Int?, // 100154910
            @SerializedName("sek")
            var sek: Int?, // 330284
            @SerializedName("sgd")
            var sgd: Int?, // 41505
            @SerializedName("thb")
            var thb: Int?, // 1085388
            @SerializedName("try")
            var tryX: Int?, // 802232
            @SerializedName("twd")
            var twd: Int?, // 953574
            @SerializedName("uah")
            var uah: Int?, // 1136477
            @SerializedName("usd")
            var usd: Int?, // 30762
            @SerializedName("vef")
            var vef: Double?, // 3080.24
            @SerializedName("vnd")
            var vnd: Int?, // 723830948
            @SerializedName("xag")
            var xag: Double?, // 1345.78
            @SerializedName("xau")
            var xau: Double?, // 16.07
            @SerializedName("xdr")
            var xdr: Int?, // 23077
            @SerializedName("xlm")
            var xlm: Int?, // 304448
            @SerializedName("xrp")
            var xrp: Int?, // 65805
            @SerializedName("yfi")
            var yfi: Double?, // 5.005258
            @SerializedName("zar")
            var zar: Int? // 570478
        )

        data class Low24h(
            @SerializedName("aed")
            var aed: Int?, // 110254
            @SerializedName("ars")
            var ars: Int?, // 7672213
            @SerializedName("aud")
            var aud: Int?, // 45438
            @SerializedName("bch")
            var bch: Double?, // 128.745
            @SerializedName("bdt")
            var bdt: Int?, // 3249182
            @SerializedName("bhd")
            var bhd: Double?, // 11316.51
            @SerializedName("bits")
            var bits: Int?, // 998974
            @SerializedName("bmd")
            var bmd: Int?, // 30017
            @SerializedName("bnb")
            var bnb: Double?, // 128.242
            @SerializedName("brl")
            var brl: Int?, // 145231
            @SerializedName("btc")
            var btc: Int?, // 1
            @SerializedName("cad")
            var cad: Int?, // 39771
            @SerializedName("chf")
            var chf: Int?, // 26905
            @SerializedName("clp")
            var clp: Int?, // 24022242
            @SerializedName("cny")
            var cny: Int?, // 217455
            @SerializedName("czk")
            var czk: Int?, // 650864
            @SerializedName("dkk")
            var dkk: Int?, // 204770
            @SerializedName("dot")
            var dot: Int?, // 5978
            @SerializedName("eos")
            var eos: Int?, // 42472
            @SerializedName("eth")
            var eth: Double?, // 16.198813
            @SerializedName("eur")
            var eur: Int?, // 27492
            @SerializedName("gbp")
            var gbp: Int?, // 23705
            @SerializedName("hkd")
            var hkd: Int?, // 235088
            @SerializedName("huf")
            var huf: Int?, // 10192550
            @SerializedName("idr")
            var idr: Int?, // 449880726
            @SerializedName("ils")
            var ils: Int?, // 110340
            @SerializedName("inr")
            var inr: Int?, // 2461589
            @SerializedName("jpy")
            var jpy: Int?, // 4332813
            @SerializedName("krw")
            var krw: Int?, // 39280427
            @SerializedName("kwd")
            var kwd: Double?, // 9227.93
            @SerializedName("link")
            var link: Int?, // 4918
            @SerializedName("lkr")
            var lkr: Int?, // 9220634
            @SerializedName("ltc")
            var ltc: Double?, // 347.414
            @SerializedName("mmk")
            var mmk: Int?, // 63064505
            @SerializedName("mxn")
            var mxn: Int?, // 512497
            @SerializedName("myr")
            var myr: Int?, // 140222
            @SerializedName("ngn")
            var ngn: Int?, // 22645983
            @SerializedName("nok")
            var nok: Int?, // 323050
            @SerializedName("nzd")
            var nzd: Int?, // 49377
            @SerializedName("php")
            var php: Int?, // 1658804
            @SerializedName("pkr")
            var pkr: Int?, // 8590632
            @SerializedName("pln")
            var pln: Int?, // 122577
            @SerializedName("rub")
            var rub: Int?, // 2578121
            @SerializedName("sar")
            var sar: Int?, // 112582
            @SerializedName("sats")
            var sats: Int?, // 99897434
            @SerializedName("sek")
            var sek: Int?, // 323372
            @SerializedName("sgd")
            var sgd: Int?, // 40585
            @SerializedName("thb")
            var thb: Int?, // 1067449
            @SerializedName("try")
            var tryX: Int?, // 781847
            @SerializedName("twd")
            var twd: Int?, // 930595
            @SerializedName("uah")
            var uah: Int?, // 1108974
            @SerializedName("usd")
            var usd: Int?, // 30017
            @SerializedName("vef")
            var vef: Double?, // 3005.56
            @SerializedName("vnd")
            var vnd: Int?, // 706514461
            @SerializedName("xag")
            var xag: Double?, // 1318.17
            @SerializedName("xau")
            var xau: Double?, // 15.71
            @SerializedName("xdr")
            var xdr: Int?, // 22524
            @SerializedName("xlm")
            var xlm: Int?, // 288456
            @SerializedName("xrp")
            var xrp: Int?, // 62960
            @SerializedName("yfi")
            var yfi: Double?, // 4.754716
            @SerializedName("zar")
            var zar: Int? // 559874
        )

        data class MarketCap(
            @SerializedName("aed")
            var aed: Long?, // 2141912882661
            @SerializedName("ars")
            var ars: Long?, // 149209006764504
            @SerializedName("aud")
            var aud: Long?, // 883671581509
            @SerializedName("bch")
            var bch: Long?, // 2606074625
            @SerializedName("bdt")
            var bdt: Long?, // 63122234464320
            @SerializedName("bhd")
            var bhd: Long?, // 219870439273
            @SerializedName("bits")
            var bits: Long?, // 19409357845855
            @SerializedName("bmd")
            var bmd: Long?, // 583134922180
            @SerializedName("bnb")
            var bnb: Long?, // 2550441224
            @SerializedName("brl")
            var brl: Long?, // 2828612567021
            @SerializedName("btc")
            var btc: Int?, // 19414462
            @SerializedName("cad")
            var cad: Long?, // 773152352248
            @SerializedName("chf")
            var chf: Long?, // 523080772220
            @SerializedName("clp")
            var clp: Long?, // 466764517110107
            @SerializedName("cny")
            var cny: Long?, // 4224520943736
            @SerializedName("czk")
            var czk: Long?, // 12651754168254
            @SerializedName("dkk")
            var dkk: Long?, // 3980348356581
            @SerializedName("dot")
            var dot: Long?, // 119802667824
            @SerializedName("eos")
            var eos: Long?, // 878885383214
            @SerializedName("eth")
            var eth: Int?, // 318725354
            @SerializedName("eur")
            var eur: Long?, // 534400004194
            @SerializedName("gbp")
            var gbp: Long?, // 461493560549
            @SerializedName("hkd")
            var hkd: Long?, // 4567733749209
            @SerializedName("huf")
            var huf: Long?, // 198351842790385
            @SerializedName("idr")
            var idr: Long?, // 8737981675542643
            @SerializedName("ils")
            var ils: Long?, // 2143580648538
            @SerializedName("inr")
            var inr: Long?, // 47830304863473
            @SerializedName("jpy")
            var jpy: Long?, // 84248334575363
            @SerializedName("krw")
            var krw: Long?, // 763182402347702
            @SerializedName("kwd")
            var kwd: Long?, // 179283082420
            @SerializedName("link")
            var link: Long?, // 100436932339
            @SerializedName("lkr")
            var lkr: Long?, // 179130317397774
            @SerializedName("ltc")
            var ltc: Long?, // 7086166704
            @SerializedName("mmk")
            var mmk: Long?, // 1225161446044330
            @SerializedName("mxn")
            var mxn: Long?, // 9964119133750
            @SerializedName("myr")
            var myr: Long?, // 2724114788966
            @SerializedName("ngn")
            var ngn: Long?, // 439946142039028
            @SerializedName("nok")
            var nok: Long?, // 6281150927163
            @SerializedName("nzd")
            var nzd: Long?, // 960232531712
            @SerializedName("php")
            var php: Long?, // 32229281098316
            @SerializedName("pkr")
            var pkr: Long?, // 167068155204694
            @SerializedName("pln")
            var pln: Long?, // 2392602585706
            @SerializedName("rub")
            var rub: Long?, // 50085449719053
            @SerializedName("sar")
            var sar: Long?, // 2187150157384
            @SerializedName("sats")
            var sats: Long?, // 1940935784585470
            @SerializedName("sek")
            var sek: Long?, // 6289785405956
            @SerializedName("sgd")
            var sgd: Long?, // 788800777884
            @SerializedName("thb")
            var thb: Long?, // 20752483735358
            @SerializedName("try")
            var tryX: Long?, // 15188623167438
            @SerializedName("twd")
            var twd: Long?, // 18075725333423
            @SerializedName("uah")
            var uah: Long?, // 21544159368409
            @SerializedName("usd")
            var usd: Long?, // 583134922180
            @SerializedName("vef")
            var vef: Long?, // 58389299758
            @SerializedName("vnd")
            var vnd: Long?, // 13725538230821938
            @SerializedName("xag")
            var xag: Long?, // 25672707384
            @SerializedName("xau")
            var xau: Int?, // 305405253
            @SerializedName("xdr")
            var xdr: Long?, // 437573366041
            @SerializedName("xlm")
            var xlm: Long?, // 5777605364258
            @SerializedName("xrp")
            var xrp: Long?, // 1267458268372
            @SerializedName("yfi")
            var yfi: Int?, // 97005413
            @SerializedName("zar")
            var zar: Long? // 10881107545902
        )

        data class MarketCapChange24hInCurrency(
            @SerializedName("aed")
            var aed: Double?, // -39948538679.28589
            @SerializedName("ars")
            var ars: Double?, // -2394660991845.0938
            @SerializedName("aud")
            var aud: Double?, // -4547986179.935669
            @SerializedName("bch")
            var bch: Int?, // 44289015
            @SerializedName("bdt")
            var bdt: Double?, // -1177562000086.414
            @SerializedName("bhd")
            var bhd: Double?, // -4052222258.0017395
            @SerializedName("bits")
            var bits: Long?, // 2760606066
            @SerializedName("bmd")
            var bmd: Double?, // -10892145976.446411
            @SerializedName("bnb")
            var bnb: Int?, // 58159298
            @SerializedName("brl")
            var brl: Double?, // -26222119834.512695
            @SerializedName("btc")
            var btc: Int?, // 731
            @SerializedName("cad")
            var cad: Double?, // -10122235391.032104
            @SerializedName("chf")
            var chf: Double?, // -7742409912.37384
            @SerializedName("clp")
            var clp: Double?, // -6823562977965.375
            @SerializedName("cny")
            var cny: Double?, // -64473293770.16162
            @SerializedName("czk")
            var czk: Double?, // -153805551390.5879
            @SerializedName("dkk")
            var dkk: Double?, // -54833559405.58008
            @SerializedName("dot")
            var dot: Long?, // 3199527415
            @SerializedName("eos")
            var eos: Long?, // 54689994098
            @SerializedName("eth")
            var eth: Int?, // 4143320
            @SerializedName("eur")
            var eur: Double?, // -7579600304.983643
            @SerializedName("gbp")
            var gbp: Double?, // -4444044928.76239
            @SerializedName("hkd")
            var hkd: Double?, // -85299284529.75293
            @SerializedName("huf")
            var huf: Double?, // -2026009389527.9062
            @SerializedName("idr")
            var idr: Int?, // -165299770897496
            @SerializedName("ils")
            var ils: Double?, // -37980789132.41724
            @SerializedName("inr")
            var inr: Double?, // -863696598375.8438
            @SerializedName("jpy")
            var jpy: Double?, // -1314339490417.6562
            @SerializedName("krw")
            var krw: Double?, // -8556935229692.5
            @SerializedName("kwd")
            var kwd: Double?, // -3231734271.5935974
            @SerializedName("link")
            var link: Long?, // 4869131102
            @SerializedName("lkr")
            var lkr: Double?, // -4491621399894.156
            @SerializedName("ltc")
            var ltc: Int?, // 332237521
            @SerializedName("mmk")
            var mmk: Double?, // -22637017893824.5
            @SerializedName("mxn")
            var mxn: Double?, // -187936523114.6621
            @SerializedName("myr")
            var myr: Double?, // -47615511054.11328
            @SerializedName("ngn")
            var ngn: Double?, // -14217252920314.125
            @SerializedName("nok")
            var nok: Double?, // -121685662244.08105
            @SerializedName("nzd")
            var nzd: Double?, // -3220564159.0911865
            @SerializedName("php")
            var php: Double?, // -534281845877.02734
            @SerializedName("pkr")
            var pkr: Double?, // -3150301175659.6875
            @SerializedName("pln")
            var pln: Double?, // -17928367466.760742
            @SerializedName("rub")
            var rub: Double?, // -686094288615.7422
            @SerializedName("sar")
            var sar: Double?, // -40732917034.58545
            @SerializedName("sats")
            var sats: Long?, // 276060606620
            @SerializedName("sek")
            var sek: Double?, // -76228039523.39258
            @SerializedName("sgd")
            var sgd: Double?, // -12693213961.761108
            @SerializedName("thb")
            var thb: Double?, // -211028513431.8711
            @SerializedName("try")
            var tryX: Double?, // -267236432981.125
            @SerializedName("twd")
            var twd: Double?, // -351987534061.45703
            @SerializedName("uah")
            var uah: Double?, // -401377044483.66406
            @SerializedName("usd")
            var usd: Double?, // -10892145976.446411
            @SerializedName("vef")
            var vef: Double?, // -1090630576.6216354
            @SerializedName("vnd")
            var vnd: Int?, // -251572350278016
            @SerializedName("xag")
            var xag: Double?, // -300799456.7541733
            @SerializedName("xau")
            var xau: Double?, // -4979830.5890933275
            @SerializedName("xdr")
            var xdr: Double?, // -8039009272.548462
            @SerializedName("xlm")
            var xlm: Double?, // -69941590034.29004
            @SerializedName("xrp")
            var xrp: Long?, // 33325526544
            @SerializedName("yfi")
            var yfi: Int?, // 4406557
            @SerializedName("zar")
            var zar: Double? // -129013676616.9414
        )

        data class MarketCapChangePercentage24hInCurrency(
            @SerializedName("aed")
            var aed: Double?, // -1.83094
            @SerializedName("ars")
            var ars: Double?, // -1.57955
            @SerializedName("aud")
            var aud: Double?, // -0.51203
            @SerializedName("bch")
            var bch: Double?, // 1.72883
            @SerializedName("bdt")
            var bdt: Double?, // -1.83136
            @SerializedName("bhd")
            var bhd: Double?, // -1.80965
            @SerializedName("bits")
            var bits: Double?, // 0.01423
            @SerializedName("bmd")
            var bmd: Double?, // -1.83361
            @SerializedName("bnb")
            var bnb: Double?, // 2.33358
            @SerializedName("brl")
            var brl: Double?, // -0.91852
            @SerializedName("btc")
            var btc: Double?, // 0.00377
            @SerializedName("cad")
            var cad: Double?, // -1.2923
            @SerializedName("chf")
            var chf: Double?, // -1.45857
            @SerializedName("clp")
            var clp: Double?, // -1.44082
            @SerializedName("cny")
            var cny: Double?, // -1.50323
            @SerializedName("czk")
            var czk: Double?, // -1.20108
            @SerializedName("dkk")
            var dkk: Double?, // -1.35889
            @SerializedName("dot")
            var dot: Double?, // 2.74395
            @SerializedName("eos")
            var eos: Double?, // 6.63556
            @SerializedName("eth")
            var eth: Double?, // 1.31709
            @SerializedName("eur")
            var eur: Double?, // -1.3985
            @SerializedName("gbp")
            var gbp: Double?, // -0.95379
            @SerializedName("hkd")
            var hkd: Double?, // -1.8332
            @SerializedName("huf")
            var huf: Double?, // -1.01109
            @SerializedName("idr")
            var idr: Double?, // -1.85662
            @SerializedName("ils")
            var ils: Double?, // -1.74099
            @SerializedName("inr")
            var inr: Double?, // -1.77372
            @SerializedName("jpy")
            var jpy: Double?, // -1.53611
            @SerializedName("krw")
            var krw: Double?, // -1.10879
            @SerializedName("kwd")
            var kwd: Double?, // -1.77067
            @SerializedName("link")
            var link: Double?, // 5.09495
            @SerializedName("lkr")
            var lkr: Double?, // -2.44612
            @SerializedName("ltc")
            var ltc: Double?, // 4.91917
            @SerializedName("mmk")
            var mmk: Double?, // -1.81416
            @SerializedName("mxn")
            var mxn: Double?, // -1.85122
            @SerializedName("myr")
            var myr: Double?, // -1.7179
            @SerializedName("ngn")
            var ngn: Double?, // -3.13043
            @SerializedName("nok")
            var nok: Double?, // -1.9005
            @SerializedName("nzd")
            var nzd: Double?, // -0.33427
            @SerializedName("php")
            var php: Double?, // -1.63072
            @SerializedName("pkr")
            var pkr: Double?, // -1.85074
            @SerializedName("pln")
            var pln: Double?, // -0.74375
            @SerializedName("rub")
            var rub: Double?, // -1.35134
            @SerializedName("sar")
            var sar: Double?, // -1.82832
            @SerializedName("sats")
            var sats: Double?, // 0.01423
            @SerializedName("sek")
            var sek: Double?, // -1.19742
            @SerializedName("sgd")
            var sgd: Double?, // -1.58369
            @SerializedName("thb")
            var thb: Double?, // -1.00665
            @SerializedName("try")
            var tryX: Double?, // -1.72903
            @SerializedName("twd")
            var twd: Double?, // -1.9101
            @SerializedName("uah")
            var uah: Double?, // -1.82897
            @SerializedName("usd")
            var usd: Double?, // -1.83361
            @SerializedName("vef")
            var vef: Double?, // -1.83361
            @SerializedName("vnd")
            var vnd: Double?, // -1.79989
            @SerializedName("xag")
            var xag: Double?, // -1.1581
            @SerializedName("xau")
            var xau: Double?, // -1.6044
            @SerializedName("xdr")
            var xdr: Double?, // -1.80404
            @SerializedName("xlm")
            var xlm: Double?, // -1.19608
            @SerializedName("xrp")
            var xrp: Double?, // 2.70032
            @SerializedName("yfi")
            var yfi: Double?, // 4.75876
            @SerializedName("zar")
            var zar: Double? // -1.17177
        )

        data class PriceChange24hInCurrency(
            @SerializedName("aed")
            var aed: Double?, // -1887.2523953650089
            @SerializedName("ars")
            var ars: Double?, // -111470.82630577311
            @SerializedName("aud")
            var aud: Double?, // -163.89292571167607
            @SerializedName("bch")
            var bch: Double?, // 2.454047
            @SerializedName("bdt")
            var bdt: Double?, // -55631.672840333544
            @SerializedName("bhd")
            var bhd: Double?, // -191.22808769298717
            @SerializedName("bits")
            var bits: Double?, // 485.6
            @SerializedName("bmd")
            var bmd: Double?, // -514.6367903980354
            @SerializedName("bnb")
            var bnb: Double?, // 3.06944
            @SerializedName("brl")
            var brl: Double?, // -1125.4689276450954
            @SerializedName("btc")
            var btc: Int?, // 0
            @SerializedName("cad")
            var cad: Double?, // -459.8412020583055
            @SerializedName("chf")
            var chf: Double?, // -357.1685394729793
            @SerializedName("clp")
            var clp: Double?, // -314321.89019805193
            @SerializedName("cny")
            var cny: Double?, // -2984.70636280725
            @SerializedName("czk")
            var czk: Double?, // -6915.211353145423
            @SerializedName("dkk")
            var dkk: Double?, // -2507.5856348019443
            @SerializedName("dot")
            var dot: Double?, // 165.896
            @SerializedName("eos")
            var eos: Int?, // 2789
            @SerializedName("eth")
            var eth: Double?, // 0.22325261
            @SerializedName("eur")
            var eur: Double?, // -347.8801577054801
            @SerializedName("gbp")
            var gbp: Double?, // -192.16610954635325
            @SerializedName("hkd")
            var hkd: Double?, // -4030.1736307612737
            @SerializedName("huf")
            var huf: Double?, // -88566.20765377395
            @SerializedName("idr")
            var idr: Double?, // -7819052.05483371
            @SerializedName("ils")
            var ils: Double?, // -1785.755275248157
            @SerializedName("inr")
            var inr: Double?, // -40681.627547588665
            @SerializedName("jpy")
            var jpy: Double?, // -60994.71927466709
            @SerializedName("krw")
            var krw: Double?, // -380002.3464158103
            @SerializedName("kwd")
            var kwd: Double?, // -152.19533839005453
            @SerializedName("link")
            var link: Double?, // 253.22
            @SerializedName("lkr")
            var lkr: Double?, // -217107.81357144564
            @SerializedName("ltc")
            var ltc: Double?, // 17.189389
            @SerializedName("mmk")
            var mmk: Double?, // -1068509.020394981
            @SerializedName("mxn")
            var mxn: Double?, // -8887.469647780992
            @SerializedName("myr")
            var myr: Double?, // -2235.8257968465914
            @SerializedName("ngn")
            var ngn: Double?, // -697327.6705008186
            @SerializedName("nok")
            var nok: Double?, // -5768.0598661599215
            @SerializedName("nzd")
            var nzd: Double?, // -89.4154449413254
            @SerializedName("php")
            var php: Double?, // -24955.211827542167
            @SerializedName("pkr")
            var pkr: Double?, // -148973.44017171673
            @SerializedName("pln")
            var pln: Double?, // -732.963800863261
            @SerializedName("rub")
            var rub: Double?, // -31353.20853650663
            @SerializedName("sar")
            var sar: Double?, // -1924.0546595830965
            @SerializedName("sats")
            var sats: Int?, // 48560
            @SerializedName("sek")
            var sek: Double?, // -3425.7229190286016
            @SerializedName("sgd")
            var sgd: Double?, // -591.0330590540834
            @SerializedName("thb")
            var thb: Double?, // -9217.683586376486
            @SerializedName("try")
            var tryX: Double?, // -12556.285400194116
            @SerializedName("twd")
            var twd: Double?, // -16692.086890945095
            @SerializedName("uah")
            var uah: Double?, // -18960.009546660585
            @SerializedName("usd")
            var usd: Double?, // -514.6367903980354
            @SerializedName("vef")
            var vef: Double?, // -51.53058182254881
            @SerializedName("vnd")
            var vnd: Double?, // -11865922.933820367
            @SerializedName("xag")
            var xag: Double?, // -13.450128196100422
            @SerializedName("xau")
            var xau: Double?, // -0.23219873300131866
            @SerializedName("xdr")
            var xdr: Double?, // -379.2580706690751
            @SerializedName("xlm")
            var xlm: Double?, // -1565.515047988505
            @SerializedName("xrp")
            var xrp: Int?, // 1782
            @SerializedName("yfi")
            var yfi: Double?, // 0.22840641
            @SerializedName("zar")
            var zar: Double? // -5779.148830270162
        )

        data class PriceChangePercentage14dInCurrency(
            @SerializedName("aed")
            var aed: Double?, // 16.37437
            @SerializedName("ars")
            var ars: Double?, // 20.09398
            @SerializedName("aud")
            var aud: Double?, // 19.8023
            @SerializedName("bch")
            var bch: Double?, // -45.55909
            @SerializedName("bdt")
            var bdt: Double?, // 16.16904
            @SerializedName("bhd")
            var bhd: Double?, // 16.40084
            @SerializedName("bits")
            var bits: Double?, // 0.10454
            @SerializedName("bmd")
            var bmd: Double?, // 16.3712
            @SerializedName("bnb")
            var bnb: Double?, // 24.31387
            @SerializedName("brl")
            var brl: Double?, // 17.29979
            @SerializedName("btc")
            var btc: Int?, // 0
            @SerializedName("cad")
            var cad: Double?, // 15.72426
            @SerializedName("chf")
            var chf: Double?, // 15.81923
            @SerializedName("clp")
            var clp: Double?, // 16.35521
            @SerializedName("cny")
            var cny: Double?, // 17.68376
            @SerializedName("czk")
            var czk: Double?, // 14.83051
            @SerializedName("dkk")
            var dkk: Double?, // 15.40841
            @SerializedName("dot")
            var dot: Double?, // 12.96715
            @SerializedName("eos")
            var eos: Double?, // 17.50209
            @SerializedName("eth")
            var eth: Double?, // 9.78511
            @SerializedName("eur")
            var eur: Double?, // 15.46667
            @SerializedName("gbp")
            var gbp: Double?, // 16.60252
            @SerializedName("hkd")
            var hkd: Double?, // 16.39371
            @SerializedName("huf")
            var huf: Double?, // 15.38194
            @SerializedName("idr")
            var idr: Double?, // 17.11146
            @SerializedName("ils")
            var ils: Double?, // 19.1067
            @SerializedName("inr")
            var inr: Double?, // 16.37944
            @SerializedName("jpy")
            var jpy: Double?, // 20.20099
            @SerializedName("krw")
            var krw: Double?, // 19.56441
            @SerializedName("kwd")
            var kwd: Double?, // 16.49473
            @SerializedName("link")
            var link: Double?, // 9.50094
            @SerializedName("lkr")
            var lkr: Double?, // 16.15376
            @SerializedName("ltc")
            var ltc: Double?, // 8.27178
            @SerializedName("mmk")
            var mmk: Double?, // 16.41115
            @SerializedName("mxn")
            var mxn: Double?, // 16.10886
            @SerializedName("myr")
            var myr: Double?, // 17.63022
            @SerializedName("ngn")
            var ngn: Double?, // 88.60634
            @SerializedName("nok")
            var nok: Double?, // 17.68279
            @SerializedName("nzd")
            var nzd: Double?, // 19.03598
            @SerializedName("php")
            var php: Double?, // 15.08229
            @SerializedName("pkr")
            var pkr: Double?, // 16.07746
            @SerializedName("pln")
            var pln: Double?, // 16.00399
            @SerializedName("rub")
            var rub: Double?, // 18.98951
            @SerializedName("sar")
            var sar: Double?, // 16.38696
            @SerializedName("sats")
            var sats: Double?, // 0.10454
            @SerializedName("sek")
            var sek: Double?, // 16.99991
            @SerializedName("sgd")
            var sgd: Double?, // 17.36657
            @SerializedName("thb")
            var thb: Double?, // 19.38293
            @SerializedName("try")
            var tryX: Double?, // 28.69693
            @SerializedName("twd")
            var twd: Double?, // 17.38054
            @SerializedName("uah")
            var uah: Double?, // 16.39271
            @SerializedName("usd")
            var usd: Double?, // 16.3712
            @SerializedName("vef")
            var vef: Double?, // 16.3712
            @SerializedName("vnd")
            var vnd: Double?, // 16.5693
            @SerializedName("xag")
            var xag: Double?, // 22.77686
            @SerializedName("xau")
            var xau: Double?, // 18.65259
            @SerializedName("xdr")
            var xdr: Double?, // 16.41728
            @SerializedName("xlm")
            var xlm: Double?, // -6.37621
            @SerializedName("xrp")
            var xrp: Double?, // 27.28207
            @SerializedName("yfi")
            var yfi: Double?, // 7.73987
            @SerializedName("zar")
            var zar: Double? // 18.29999
        )

        data class PriceChangePercentage1hInCurrency(
            @SerializedName("aed")
            var aed: Double?, // -0.3533
            @SerializedName("ars")
            var ars: Double?, // -0.35463
            @SerializedName("aud")
            var aud: Double?, // -0.235
            @SerializedName("bch")
            var bch: Double?, // 0.38904
            @SerializedName("bdt")
            var bdt: Double?, // -0.3533
            @SerializedName("bhd")
            var bhd: Double?, // -0.34696
            @SerializedName("bits")
            var bits: Double?, // 0.02384
            @SerializedName("bmd")
            var bmd: Double?, // -0.3533
            @SerializedName("bnb")
            var bnb: Double?, // 0.10139
            @SerializedName("brl")
            var brl: Double?, // -0.20312
            @SerializedName("btc")
            var btc: Int?, // 0
            @SerializedName("cad")
            var cad: Double?, // -0.28599
            @SerializedName("chf")
            var chf: Double?, // -0.30507
            @SerializedName("clp")
            var clp: Double?, // -0.33712
            @SerializedName("cny")
            var cny: Double?, // -0.3533
            @SerializedName("czk")
            var czk: Double?, // -0.30759
            @SerializedName("dkk")
            var dkk: Double?, // -0.30253
            @SerializedName("dot")
            var dot: Double?, // -1.0089
            @SerializedName("eos")
            var eos: Double?, // 0.24398
            @SerializedName("eth")
            var eth: Double?, // -0.00606
            @SerializedName("eur")
            var eur: Double?, // -0.30087
            @SerializedName("gbp")
            var gbp: Double?, // -0.29623
            @SerializedName("hkd")
            var hkd: Double?, // -0.35057
            @SerializedName("huf")
            var huf: Double?, // -0.34706
            @SerializedName("idr")
            var idr: Double?, // -0.38404
            @SerializedName("ils")
            var ils: Double?, // -0.3533
            @SerializedName("inr")
            var inr: Double?, // -0.3508
            @SerializedName("jpy")
            var jpy: Double?, // -0.26113
            @SerializedName("krw")
            var krw: Double?, // -0.34306
            @SerializedName("kwd")
            var kwd: Double?, // -0.34585
            @SerializedName("link")
            var link: Double?, // 0.10816
            @SerializedName("lkr")
            var lkr: Double?, // -0.3533
            @SerializedName("ltc")
            var ltc: Double?, // 0.67222
            @SerializedName("mmk")
            var mmk: Double?, // -0.3533
            @SerializedName("mxn")
            var mxn: Double?, // -0.25989
            @SerializedName("myr")
            var myr: Double?, // -0.3533
            @SerializedName("ngn")
            var ngn: Double?, // -0.3533
            @SerializedName("nok")
            var nok: Double?, // -0.31497
            @SerializedName("nzd")
            var nzd: Double?, // -0.23134
            @SerializedName("php")
            var php: Double?, // -0.33708
            @SerializedName("pkr")
            var pkr: Double?, // -0.3533
            @SerializedName("pln")
            var pln: Double?, // -0.30269
            @SerializedName("rub")
            var rub: Double?, // -0.3533
            @SerializedName("sar")
            var sar: Double?, // -0.35147
            @SerializedName("sats")
            var sats: Double?, // 0.02384
            @SerializedName("sek")
            var sek: Double?, // -0.27065
            @SerializedName("sgd")
            var sgd: Double?, // -0.3138
            @SerializedName("thb")
            var thb: Double?, // -0.21369
            @SerializedName("try")
            var tryX: Double?, // -0.35905
            @SerializedName("twd")
            var twd: Double?, // -0.39187
            @SerializedName("uah")
            var uah: Double?, // -0.3533
            @SerializedName("usd")
            var usd: Double?, // -0.3533
            @SerializedName("vef")
            var vef: Double?, // -0.3533
            @SerializedName("vnd")
            var vnd: Double?, // -0.3533
            @SerializedName("xag")
            var xag: Double?, // -0.25545
            @SerializedName("xau")
            var xau: Double?, // -0.32856
            @SerializedName("xdr")
            var xdr: Double?, // -0.3533
            @SerializedName("xlm")
            var xlm: Double?, // 0.1426
            @SerializedName("xrp")
            var xrp: Double?, // 0.24507
            @SerializedName("yfi")
            var yfi: Double?, // 0.63883
            @SerializedName("zar")
            var zar: Double? // -0.27515
        )

        data class PriceChangePercentage1yInCurrency(
            @SerializedName("aed")
            var aed: Double?, // 48.386
            @SerializedName("ars")
            var ars: Double?, // 204.04313
            @SerializedName("aud")
            var aud: Double?, // 55.34279
            @SerializedName("bch")
            var bch: Double?, // -29.81708
            @SerializedName("bdt")
            var bdt: Double?, // 72.6673
            @SerializedName("bhd")
            var bhd: Double?, // 48.40687
            @SerializedName("bits")
            var bits: Double?, // 0.04313
            @SerializedName("bmd")
            var bmd: Double?, // 48.386
            @SerializedName("bnb")
            var bnb: Double?, // 50.73728
            @SerializedName("brl")
            var brl: Double?, // 36.67844
            @SerializedName("btc")
            var btc: Int?, // 0
            @SerializedName("cad")
            var cad: Double?, // 52.78665
            @SerializedName("chf")
            var chf: Double?, // 39.04721
            @SerializedName("clp")
            var clp: Double?, // 30.27332
            @SerializedName("cny")
            var cny: Double?, // 60.25379
            @SerializedName("czk")
            var czk: Double?, // 37.01313
            @SerializedName("dkk")
            var dkk: Double?, // 43.3098
            @SerializedName("dot")
            var dot: Double?, // 127.20851
            @SerializedName("eos")
            var eos: Double?, // 113.82392
            @SerializedName("eth")
            var eth: Double?, // -6.34764
            @SerializedName("eur")
            var eur: Double?, // 43.13752
            @SerializedName("gbp")
            var gbp: Double?, // 43.13432
            @SerializedName("hkd")
            var hkd: Double?, // 48.11989
            @SerializedName("huf")
            var huf: Double?, // 33.75042
            @SerializedName("idr")
            var idr: Double?, // 49.69199
            @SerializedName("ils")
            var ils: Double?, // 58.81216
            @SerializedName("inr")
            var inr: Double?, // 54.01822
            @SerializedName("jpy")
            var jpy: Double?, // 57.41529
            @SerializedName("krw")
            var krw: Double?, // 50.41094
            @SerializedName("kwd")
            var kwd: Double?, // 48.64515
            @SerializedName("link")
            var link: Double?, // 63.97353
            @SerializedName("lkr")
            var lkr: Double?, // 26.59496
            @SerializedName("ltc")
            var ltc: Double?, // -4.19007
            @SerializedName("mmk")
            var mmk: Double?, // 68.35267
            @SerializedName("mxn")
            var mxn: Double?, // 25.96786
            @SerializedName("myr")
            var myr: Double?, // 57.64958
            @SerializedName("ngn")
            var ngn: Double?, // 169.66763
            @SerializedName("nok")
            var nok: Double?, // 62.49649
            @SerializedName("nzd")
            var nzd: Double?, // 52.57148
            @SerializedName("php")
            var php: Double?, // 49.57952
            @SerializedName("pkr")
            var pkr: Double?, // 104.76378
            @SerializedName("pln")
            var pln: Double?, // 36.41213
            @SerializedName("rub")
            var rub: Double?, // 137.66663
            @SerializedName("sar")
            var sar: Double?, // 48.28827
            @SerializedName("sats")
            var sats: Double?, // 0.04313
            @SerializedName("sek")
            var sek: Double?, // 57.66246
            @SerializedName("sgd")
            var sgd: Double?, // 44.65043
            @SerializedName("thb")
            var thb: Double?, // 50.10961
            @SerializedName("try")
            var tryX: Double?, // 131.89354
            @SerializedName("twd")
            var twd: Double?, // 54.70966
            @SerializedName("uah")
            var uah: Double?, // 85.53029
            @SerializedName("usd")
            var usd: Double?, // 48.386
            @SerializedName("vef")
            var vef: Double?, // 48.386
            @SerializedName("vnd")
            var vnd: Double?, // 50.1563
            @SerializedName("xag")
            var xag: Double?, // 35.93331
            @SerializedName("xau")
            var xau: Double?, // 41.42455
            @SerializedName("xdr")
            var xdr: Double?, // 52.43381
            @SerializedName("xlm")
            var xlm: Double?, // 70.2056
            @SerializedName("xrp")
            var xrp: Double?, // 10.55072
            @SerializedName("yfi")
            var yfi: Double?, // 42.55895
            @SerializedName("zar")
            var zar: Double? // 72.07275
        )

        data class PriceChangePercentage200dInCurrency(
            @SerializedName("aed")
            var aed: Double?, // 75.07111
            @SerializedName("ars")
            var ars: Double?, // 163.61062
            @SerializedName("aud")
            var aud: Double?, // 80.31916
            @SerializedName("bch")
            var bch: Double?, // -14.31008
            @SerializedName("bdt")
            var bdt: Double?, // 83.23259
            @SerializedName("bhd")
            var bhd: Double?, // 75.35516
            @SerializedName("bits")
            var bits: Double?, // 0.06447
            @SerializedName("bmd")
            var bmd: Double?, // 75.06635
            @SerializedName("bnb")
            var bnb: Double?, // 120.27292
            @SerializedName("brl")
            var brl: Double?, // 62.12186
            @SerializedName("btc")
            var btc: Int?, // 0
            @SerializedName("cad")
            var cad: Double?, // 69.08584
            @SerializedName("chf")
            var chf: Double?, // 67.93602
            @SerializedName("clp")
            var clp: Double?, // 62.58656
            @SerializedName("cny")
            var cny: Double?, // 82.28267
            @SerializedName("czk")
            var czk: Double?, // 64.83989
            @SerializedName("dkk")
            var dkk: Double?, // 69.21037
            @SerializedName("dot")
            var dot: Double?, // 90.55549
            @SerializedName("eos")
            var eos: Double?, // 171.85688
            @SerializedName("eth")
            var eth: Double?, // 21.65155
            @SerializedName("eur")
            var eur: Double?, // 69.12285
            @SerializedName("gbp")
            var gbp: Double?, // 69.82483
            @SerializedName("hkd")
            var hkd: Double?, // 76.12346
            @SerializedName("huf")
            var huf: Double?, // 49.83737
            @SerializedName("idr")
            var idr: Double?, // 68.12668
            @SerializedName("ils")
            var ils: Double?, // 88.22096
            @SerializedName("inr")
            var inr: Double?, // 74.17777
            @SerializedName("jpy")
            var jpy: Double?, // 85.19266
            @SerializedName("krw")
            var krw: Double?, // 75.66873
            @SerializedName("kwd")
            var kwd: Double?, // 75.4464
            @SerializedName("link")
            var link: Double?, // 107.44168
            @SerializedName("lkr")
            var lkr: Double?, // 46.23198
            @SerializedName("ltc")
            var ltc: Double?, // 63.01569
            @SerializedName("mmk")
            var mmk: Double?, // 75.02687
            @SerializedName("mxn")
            var mxn: Double?, // 51.25583
            @SerializedName("myr")
            var myr: Double?, // 85.721
            @SerializedName("ngn")
            var ngn: Double?, // 197.60488
            @SerializedName("nok")
            var nok: Double?, // 88.46833
            @SerializedName("nzd")
            var nzd: Double?, // 84.87201
            @SerializedName("php")
            var php: Double?, // 74.73122
            @SerializedName("pkr")
            var pkr: Double?, // 123.05995
            @SerializedName("pln")
            var pln: Double?, // 61.32266
            @SerializedName("rub")
            var rub: Double?, // 140.5254
            @SerializedName("sar")
            var sar: Double?, // 74.62744
            @SerializedName("sats")
            var sats: Double?, // 0.06447
            @SerializedName("sek")
            var sek: Double?, // 82.44115
            @SerializedName("sgd")
            var sgd: Double?, // 74.63901
            @SerializedName("thb")
            var thb: Double?, // 79.93555
            @SerializedName("try")
            var tryX: Double?, // 144.48239
            @SerializedName("twd")
            var twd: Double?, // 76.71276
            @SerializedName("uah")
            var uah: Double?, // 75.89868
            @SerializedName("usd")
            var usd: Double?, // 75.06635
            @SerializedName("vef")
            var vef: Double?, // 75.06635
            @SerializedName("vnd")
            var vnd: Double?, // 73.13547
            @SerializedName("xag")
            var xag: Double?, // 80.96861
            @SerializedName("xau")
            var xau: Double?, // 64.79294
            @SerializedName("xdr")
            var xdr: Double?, // 73.98678
            @SerializedName("xlm")
            var xlm: Double?, // 48.44456
            @SerializedName("xrp")
            var xrp: Double?, // 47.82822
            @SerializedName("yfi")
            var yfi: Double?, // 100.85268
            @SerializedName("zar")
            var zar: Double? // 88.23369
        )

        data class PriceChangePercentage24hInCurrency(
            @SerializedName("aed")
            var aed: Double?, // -1.67914
            @SerializedName("ars")
            var ars: Double?, // -1.42737
            @SerializedName("aud")
            var aud: Double?, // -0.3582
            @SerializedName("bch")
            var bch: Double?, // 1.85949
            @SerializedName("bdt")
            var bdt: Double?, // -1.67957
            @SerializedName("bhd")
            var bhd: Double?, // -1.65782
            @SerializedName("bits")
            var bits: Double?, // 0.04855
            @SerializedName("bmd")
            var bmd: Double?, // -1.68182
            @SerializedName("bnb")
            var bnb: Double?, // 2.39208
            @SerializedName("brl")
            var brl: Double?, // -0.76531
            @SerializedName("btc")
            var btc: Int?, // 0
            @SerializedName("cad")
            var cad: Double?, // -1.13967
            @SerializedName("chf")
            var chf: Double?, // -1.3062
            @SerializedName("clp")
            var clp: Double?, // -1.28842
            @SerializedName("cny")
            var cny: Double?, // -1.35092
            @SerializedName("czk")
            var czk: Double?, // -1.04831
            @SerializedName("dkk")
            var dkk: Double?, // -1.20636
            @SerializedName("dot")
            var dot: Double?, // 2.76346
            @SerializedName("eos")
            var eos: Double?, // 6.565
            @SerializedName("eth")
            var eth: Double?, // 1.378
            @SerializedName("eur")
            var eur: Double?, // -1.24604
            @SerializedName("gbp")
            var gbp: Double?, // -0.80063
            @SerializedName("hkd")
            var hkd: Double?, // -1.68141
            @SerializedName("huf")
            var huf: Double?, // -0.85803
            @SerializedName("idr")
            var idr: Double?, // -1.70486
            @SerializedName("ils")
            var ils: Double?, // -1.58906
            @SerializedName("inr")
            var inr: Double?, // -1.62184
            @SerializedName("jpy")
            var jpy: Double?, // -1.38386
            @SerializedName("krw")
            var krw: Double?, // -0.95587
            @SerializedName("kwd")
            var kwd: Double?, // -1.61878
            @SerializedName("link")
            var link: Double?, // 5.14358
            @SerializedName("lkr")
            var lkr: Double?, // -2.29528
            @SerializedName("ltc")
            var ltc: Double?, // 4.94341
            @SerializedName("mmk")
            var mmk: Double?, // -1.66234
            @SerializedName("mxn")
            var mxn: Double?, // -1.69945
            @SerializedName("myr")
            var myr: Double?, // -1.56593
            @SerializedName("ngn")
            var ngn: Double?, // -2.98064
            @SerializedName("nok")
            var nok: Double?, // -1.74881
            @SerializedName("nzd")
            var nzd: Double?, // -0.18016
            @SerializedName("php")
            var php: Double?, // -1.47861
            @SerializedName("pkr")
            var pkr: Double?, // -1.69898
            @SerializedName("pln")
            var pln: Double?, // -0.59028
            @SerializedName("rub")
            var rub: Double?, // -1.1988
            @SerializedName("sar")
            var sar: Double?, // -1.67652
            @SerializedName("sats")
            var sats: Double?, // 0.04855
            @SerializedName("sek")
            var sek: Double?, // -1.04465
            @SerializedName("sgd")
            var sgd: Double?, // -1.43152
            @SerializedName("thb")
            var thb: Double?, // -0.85358
            @SerializedName("try")
            var tryX: Double?, // -1.57708
            @SerializedName("twd")
            var twd: Double?, // -1.75843
            @SerializedName("uah")
            var uah: Double?, // -1.67717
            @SerializedName("usd")
            var usd: Double?, // -1.68182
            @SerializedName("vef")
            var vef: Double?, // -1.68182
            @SerializedName("vnd")
            var vnd: Double?, // -1.64804
            @SerializedName("xag")
            var xag: Double?, // -1.00527
            @SerializedName("xau")
            var xau: Double?, // -1.45226
            @SerializedName("xdr")
            var xdr: Double?, // -1.6522
            @SerializedName("xlm")
            var xlm: Double?, // -0.52254
            @SerializedName("xrp")
            var xrp: Double?, // 2.80385
            @SerializedName("yfi")
            var yfi: Double?, // 4.79116
            @SerializedName("zar")
            var zar: Double? // -1.01896
        )

        data class PriceChangePercentage30dInCurrency(
            @SerializedName("aed")
            var aed: Double?, // 8.65495
            @SerializedName("ars")
            var ars: Double?, // 16.67774
            @SerializedName("aud")
            var aud: Double?, // 7.64426
            @SerializedName("bch")
            var bch: Double?, // -43.92396
            @SerializedName("bdt")
            var bdt: Double?, // 9.68139
            @SerializedName("bhd")
            var bhd: Double?, // 8.65679
            @SerializedName("bits")
            var bits: Double?, // 0.06526
            @SerializedName("bmd")
            var bmd: Double?, // 8.63114
            @SerializedName("bnb")
            var bnb: Double?, // 48.27069
            @SerializedName("brl")
            var brl: Double?, // 5.12668
            @SerializedName("btc")
            var btc: Int?, // 0
            @SerializedName("cad")
            var cad: Double?, // 5.96221
            @SerializedName("chf")
            var chf: Double?, // 7.75923
            @SerializedName("clp")
            var clp: Double?, // 8.25438
            @SerializedName("cny")
            var cny: Double?, // 11.26356
            @SerializedName("czk")
            var czk: Double?, // 6.59709
            @SerializedName("dkk")
            var dkk: Double?, // 6.61737
            @SerializedName("dot")
            var dot: Double?, // 21.87105
            @SerializedName("eos")
            var eos: Double?, // 47.86137
            @SerializedName("eth")
            var eth: Double?, // 12.30778
            @SerializedName("eur")
            var eur: Double?, // 6.63556
            @SerializedName("gbp")
            var gbp: Double?, // 6.22202
            @SerializedName("hkd")
            var hkd: Double?, // 8.69941
            @SerializedName("huf")
            var huf: Double?, // 6.51351
            @SerializedName("idr")
            var idr: Double?, // 8.77373
            @SerializedName("ils")
            var ils: Double?, // 7.0761
            @SerializedName("inr")
            var inr: Double?, // 7.88427
            @SerializedName("jpy")
            var jpy: Double?, // 11.77481
            @SerializedName("krw")
            var krw: Double?, // 7.3887
            @SerializedName("kwd")
            var kwd: Double?, // 8.57463
            @SerializedName("link")
            var link: Double?, // 23.2433
            @SerializedName("lkr")
            var lkr: Double?, // 12.03245
            @SerializedName("ltc")
            var ltc: Double?, // 19.86981
            @SerializedName("mmk")
            var mmk: Double?, // 8.70469
            @SerializedName("mxn")
            var mxn: Double?, // 5.54073
            @SerializedName("myr")
            var myr: Double?, // 10.16398
            @SerializedName("ngn")
            var ngn: Double?, // 77.9159
            @SerializedName("nok")
            var nok: Double?, // 5.25539
            @SerializedName("nzd")
            var nzd: Double?, // 8.33705
            @SerializedName("php")
            var php: Double?, // 7.10314
            @SerializedName("pkr")
            var pkr: Double?, // 9.10193
            @SerializedName("pln")
            var pln: Double?, // 5.68113
            @SerializedName("rub")
            var rub: Double?, // 15.78936
            @SerializedName("sar")
            var sar: Double?, // 8.648
            @SerializedName("sats")
            var sats: Double?, // 0.06526
            @SerializedName("sek")
            var sek: Double?, // 8.27811
            @SerializedName("sgd")
            var sgd: Double?, // 8.56613
            @SerializedName("thb")
            var thb: Double?, // 11.34626
            @SerializedName("try")
            var tryX: Double?, // 40.79232
            @SerializedName("twd")
            var twd: Double?, // 9.95425
            @SerializedName("uah")
            var uah: Double?, // 8.53497
            @SerializedName("usd")
            var usd: Double?, // 8.63114
            @SerializedName("vef")
            var vef: Double?, // 8.63114
            @SerializedName("vnd")
            var vnd: Double?, // 8.93196
            @SerializedName("xag")
            var xag: Double?, // 10.77753
            @SerializedName("xau")
            var xau: Double?, // 10.55846
            @SerializedName("xdr")
            var xdr: Double?, // 8.97911
            @SerializedName("xlm")
            var xlm: Double?, // -3.90409
            @SerializedName("xrp")
            var xrp: Double?, // 15.95198
            @SerializedName("yfi")
            var yfi: Double?, // 21.35436
            @SerializedName("zar")
            var zar: Double? // 3.06705
        )

        data class PriceChangePercentage60dInCurrency(
            @SerializedName("aed")
            var aed: Double?, // 2.7932
            @SerializedName("ars")
            var ars: Double?, // 19.26514
            @SerializedName("aud")
            var aud: Double?, // 3.02996
            @SerializedName("bch")
            var bch: Double?, // -45.10002
            @SerializedName("bdt")
            var bdt: Double?, // 4.79705
            @SerializedName("bhd")
            var bhd: Double?, // 2.78429
            @SerializedName("bits")
            var bits: Double?, // 0.07692
            @SerializedName("bmd")
            var bmd: Double?, // 2.76521
            @SerializedName("bnb")
            var bnb: Double?, // 45.02497
            @SerializedName("brl")
            var brl: Double?, // -0.03946
            @SerializedName("btc")
            var btc: Int?, // 0
            @SerializedName("cad")
            var cad: Double?, // -0.22206
            @SerializedName("chf")
            var chf: Double?, // 3.06233
            @SerializedName("clp")
            var clp: Double?, // 1.92985
            @SerializedName("cny")
            var cny: Double?, // 7.70559
            @SerializedName("czk")
            var czk: Double?, // 4.40227
            @SerializedName("dkk")
            var dkk: Double?, // 3.67925
            @SerializedName("dot")
            var dot: Double?, // 27.58846
            @SerializedName("eos")
            var eos: Double?, // 61.08252
            @SerializedName("eth")
            var eth: Double?, // 6.91323
            @SerializedName("eur")
            var eur: Double?, // 4.79519
            @SerializedName("gbp")
            var gbp: Double?, // 2.26654
            @SerializedName("hkd")
            var hkd: Double?, // 2.54417
            @SerializedName("huf")
            var huf: Double?, // 3.21047
            @SerializedName("idr")
            var idr: Double?, // 4.94289
            @SerializedName("ils")
            var ils: Double?, // 3.88661
            @SerializedName("inr")
            var inr: Double?, // 3.11445
            @SerializedName("jpy")
            var jpy: Double?, // 8.91117
            @SerializedName("krw")
            var krw: Double?, // 0.50725
            @SerializedName("kwd")
            var kwd: Double?, // 3.08273
            @SerializedName("link")
            var link: Double?, // 27.29241
            @SerializedName("lkr")
            var lkr: Double?, // -1.47343
            @SerializedName("ltc")
            var ltc: Double?, // 13.22121
            @SerializedName("mmk")
            var mmk: Double?, // 2.8228
            @SerializedName("mxn")
            var mxn: Double?, // -2.44907
            @SerializedName("myr")
            var myr: Double?, // 7.62643
            @SerializedName("ngn")
            var ngn: Double?, // 67.9983
            @SerializedName("nok")
            var nok: Double?, // 4.11311
            @SerializedName("nzd")
            var nzd: Double?, // 4.52762
            @SerializedName("php")
            var php: Double?, // 2.37436
            @SerializedName("pkr")
            var pkr: Double?, // 3.77946
            @SerializedName("pln")
            var pln: Double?, // 1.29562
            @SerializedName("rub")
            var rub: Double?, // 9.71343
            @SerializedName("sar")
            var sar: Double?, // 2.76351
            @SerializedName("sats")
            var sats: Double?, // 0.07692
            @SerializedName("sek")
            var sek: Double?, // 8.00579
            @SerializedName("sgd")
            var sgd: Double?, // 4.09576
            @SerializedName("thb")
            var thb: Double?, // 7.10753
            @SerializedName("try")
            var tryX: Double?, // 37.61678
            @SerializedName("twd")
            var twd: Double?, // 3.55631
            @SerializedName("uah")
            var uah: Double?, // 2.84528
            @SerializedName("usd")
            var usd: Double?, // 2.76521
            @SerializedName("vef")
            var vef: Double?, // 2.76521
            @SerializedName("vnd")
            var vnd: Double?, // 3.07867
            @SerializedName("xag")
            var xag: Double?, // 13.33299
            @SerializedName("xau")
            var xau: Double?, // 7.092
            @SerializedName("xdr")
            var xdr: Double?, // 4.18994
            @SerializedName("xlm")
            var xlm: Double?, // -2.91067
            @SerializedName("xrp")
            var xrp: Double?, // 6.91815
            @SerializedName("yfi")
            var yfi: Double?, // 41.97947
            @SerializedName("zar")
            var zar: Double? // 4.50172
        )

        data class PriceChangePercentage7dInCurrency(
            @SerializedName("aed")
            var aed: Double?, // -0.14163
            @SerializedName("ars")
            var ars: Double?, // 1.4477
            @SerializedName("aud")
            var aud: Double?, // 2.86473
            @SerializedName("bch")
            var bch: Double?, // -39.67386
            @SerializedName("bdt")
            var bdt: Double?, // -0.08347
            @SerializedName("bhd")
            var bhd: Double?, // -0.1341
            @SerializedName("bits")
            var bits: Double?, // 0.02527
            @SerializedName("bmd")
            var bmd: Double?, // -0.14231
            @SerializedName("bnb")
            var bnb: Double?, // 8.5343
            @SerializedName("brl")
            var brl: Double?, // 1.61101
            @SerializedName("btc")
            var btc: Int?, // 0
            @SerializedName("cad")
            var cad: Double?, // 0.56926
            @SerializedName("chf")
            var chf: Double?, // 0.29453
            @SerializedName("clp")
            var clp: Double?, // -0.40485
            @SerializedName("cny")
            var cny: Double?, // 0.76176
            @SerializedName("czk")
            var czk: Double?, // 0.28342
            @SerializedName("dkk")
            var dkk: Double?, // 0.51776
            @SerializedName("dot")
            var dot: Double?, // -1.62288
            @SerializedName("eos")
            var eos: Double?, // 1.39455
            @SerializedName("eth")
            var eth: Double?, // 2.55102
            @SerializedName("eur")
            var eur: Double?, // 0.52131
            @SerializedName("gbp")
            var gbp: Double?, // 0.94533
            @SerializedName("hkd")
            var hkd: Double?, // -0.07706
            @SerializedName("huf")
            var huf: Double?, // 0.97971
            @SerializedName("idr")
            var idr: Double?, // 0.18803
            @SerializedName("ils")
            var ils: Double?, // 1.33668
            @SerializedName("inr")
            var inr: Double?, // -0.03176
            @SerializedName("jpy")
            var jpy: Double?, // 1.72391
            @SerializedName("krw")
            var krw: Double?, // 1.35759
            @SerializedName("kwd")
            var kwd: Double?, // -0.0669
            @SerializedName("link")
            var link: Double?, // -5.25618
            @SerializedName("lkr")
            var lkr: Double?, // -0.40343
            @SerializedName("ltc")
            var ltc: Double?, // 3.25236
            @SerializedName("mmk")
            var mmk: Double?, // -0.08664
            @SerializedName("mxn")
            var mxn: Double?, // -0.39106
            @SerializedName("myr")
            var myr: Double?, // 0.40577
            @SerializedName("ngn")
            var ngn: Double?, // -0.28109
            @SerializedName("nok")
            var nok: Double?, // 1.00252
            @SerializedName("nzd")
            var nzd: Double?, // 2.08079
            @SerializedName("php")
            var php: Double?, // -0.64923
            @SerializedName("pkr")
            var pkr: Double?, // -0.47233
            @SerializedName("pln")
            var pln: Double?, // 1.52671
            @SerializedName("rub")
            var rub: Double?, // 2.1065
            @SerializedName("sar")
            var sar: Double?, // -0.16765
            @SerializedName("sats")
            var sats: Double?, // 0.02527
            @SerializedName("sek")
            var sek: Double?, // 1.11315
            @SerializedName("sgd")
            var sgd: Double?, // 0.77305
            @SerializedName("thb")
            var thb: Double?, // 2.20635
            @SerializedName("try")
            var tryX: Double?, // 10.41953
            @SerializedName("twd")
            var twd: Double?, // 0.09989
            @SerializedName("uah")
            var uah: Double?, // -0.09564
            @SerializedName("usd")
            var usd: Double?, // -0.14231
            @SerializedName("vef")
            var vef: Double?, // -0.14231
            @SerializedName("vnd")
            var vnd: Double?, // -0.02572
            @SerializedName("xag")
            var xag: Double?, // -0.28165
            @SerializedName("xau")
            var xau: Double?, // 1.13802
            @SerializedName("xdr")
            var xdr: Double?, // 0.48049
            @SerializedName("xlm")
            var xlm: Double?, // -14.9304
            @SerializedName("xrp")
            var xrp: Double?, // 7.94325
            @SerializedName("yfi")
            var yfi: Double?, // 5.33842
            @SerializedName("zar")
            var zar: Double? // 1.69281
        )

        data class TotalVolume(
            @SerializedName("aed")
            var aed: Long?, // 52499496718
            @SerializedName("ars")
            var ars: Long?, // 3657197183114
            @SerializedName("aud")
            var aud: Long?, // 21659290473
            @SerializedName("bch")
            var bch: Int?, // 63864280
            @SerializedName("bdt")
            var bdt: Long?, // 1547161683337
            @SerializedName("bhd")
            var bhd: Long?, // 5389148876
            @SerializedName("bits")
            var bits: Long?, // 475416966467
            @SerializedName("bmd")
            var bmd: Long?, // 14292966899
            @SerializedName("bnb")
            var bnb: Int?, // 62418967
            @SerializedName("brl")
            var brl: Long?, // 69330894539
            @SerializedName("btc")
            var btc: Int?, // 475417
            @SerializedName("cad")
            var cad: Long?, // 18950401628
            @SerializedName("chf")
            var chf: Long?, // 12821005703
            @SerializedName("clp")
            var clp: Long?, // 11440662424935
            @SerializedName("cny")
            var cny: Long?, // 103545398703
            @SerializedName("czk")
            var czk: Long?, // 310101653438
            @SerializedName("dkk")
            var dkk: Long?, // 97560590431
            @SerializedName("dot")
            var dot: Long?, // 2930826359
            @SerializedName("eos")
            var eos: Long?, // 21504774084
            @SerializedName("eth")
            var eth: Int?, // 7802931
            @SerializedName("eur")
            var eur: Long?, // 13098446484
            @SerializedName("gbp")
            var gbp: Long?, // 11311468297
            @SerializedName("hkd")
            var hkd: Long?, // 111957738766
            @SerializedName("huf")
            var huf: Long?, // 4861715900726
            @SerializedName("idr")
            var idr: Long?, // 214172875102188
            @SerializedName("ils")
            var ils: Long?, // 52540374603
            @SerializedName("inr")
            var inr: Long?, // 1172347836148
            @SerializedName("jpy")
            var jpy: Long?, // 2064974350894
            @SerializedName("krw")
            var krw: Long?, // 18706032515003
            @SerializedName("kwd")
            var kwd: Long?, // 4394329794
            @SerializedName("link")
            var link: Long?, // 2459134613
            @SerializedName("lkr")
            var lkr: Long?, // 4390585437187
            @SerializedName("ltc")
            var ltc: Int?, // 173363042
            @SerializedName("mmk")
            var mmk: Long?, // 30029400278798
            @SerializedName("mxn")
            var mxn: Long?, // 244226197991
            @SerializedName("myr")
            var myr: Long?, // 66769594870
            @SerializedName("ngn")
            var ngn: Long?, // 10783328877233
            @SerializedName("nok")
            var nok: Long?, // 153954563305
            @SerializedName("nzd")
            var nzd: Long?, // 23535842683
            @SerializedName("php")
            var php: Long?, // 789957916097
            @SerializedName("pkr")
            var pkr: Long?, // 4094935016671
            @SerializedName("pln")
            var pln: Long?, // 58644043188
            @SerializedName("rub")
            var rub: Long?, // 1227622712593
            @SerializedName("sar")
            var sar: Long?, // 53608287918
            @SerializedName("sats")
            var sats: Long?, // 47541696646657
            @SerializedName("sek")
            var sek: Long?, // 154166199265
            @SerializedName("sgd")
            var sgd: Long?, // 19333953395
            @SerializedName("thb")
            var thb: Long?, // 508655118785
            @SerializedName("try")
            var tryX: Long?, // 372281748052
            @SerializedName("twd")
            var twd: Long?, // 443046255756
            @SerializedName("uah")
            var uah: Long?, // 528059536507
            @SerializedName("usd")
            var usd: Long?, // 14292966899
            @SerializedName("vef")
            var vef: Int?, // 1431154776
            @SerializedName("vnd")
            var vnd: Long?, // 336420708394032
            @SerializedName("xag")
            var xag: Int?, // 629252584
            @SerializedName("xau")
            var xau: Int?, // 7485656
            @SerializedName("xdr")
            var xdr: Long?, // 10725170795
            @SerializedName("xlm")
            var xlm: Long?, // 141589196321
            @SerializedName("xrp")
            var xrp: Long?, // 31037696848
            @SerializedName("yfi")
            var yfi: Int?, // 2373338
            @SerializedName("zar")
            var zar: Long? // 266702102835
        )
    }

    data class Platforms(
        @SerializedName("")
        var x: String?
    )

    data class PublicInterestStats(
        @SerializedName("alexa_rank")
        var alexaRank: Int?, // 9440
        @SerializedName("bing_matches")
        var bingMatches: Any? // null
    )

    data class Ticker(
        @SerializedName("base")
        var base: String?, // BTC
        @SerializedName("bid_ask_spread_percentage")
        var bidAskSpreadPercentage: Double?, // 0.033278
        @SerializedName("coin_id")
        var coinId: String?, // bitcoin
        @SerializedName("converted_last")
        var convertedLast: ConvertedLast?,
        @SerializedName("converted_volume")
        var convertedVolume: ConvertedVolume?,
        @SerializedName("is_anomaly")
        var isAnomaly: Boolean?, // false
        @SerializedName("is_stale")
        var isStale: Boolean?, // false
        @SerializedName("last")
        var last: Double?, // 30059.43
        @SerializedName("last_fetch_at")
        var lastFetchAt: String?, // 2023-06-28T20:33:00+00:00
        @SerializedName("last_traded_at")
        var lastTradedAt: String?, // 2023-06-28T20:33:00+00:00
        @SerializedName("market")
        var market: Market?,
        @SerializedName("target")
        var target: String?, // USD
        @SerializedName("target_coin_id")
        var targetCoinId: String?, // tether
        @SerializedName("timestamp")
        var timestamp: String?, // 2023-06-28T20:33:00+00:00
        @SerializedName("token_info_url")
        var tokenInfoUrl: Any?, // null
        @SerializedName("trade_url")
        var tradeUrl: String?, // https://trading.bitfinex.com/t/BTC:USD?type=exchange
        @SerializedName("trust_score")
        var trustScore: String?, // green
        @SerializedName("volume")
        var volume: Double? // 1293.57855868
    ) {
        data class ConvertedLast(
            @SerializedName("btc")
            var btc: Double?, // 1.000935
            @SerializedName("eth")
            var eth: Double?, // 16.437148
            @SerializedName("usd")
            var usd: Int? // 30072
        )

        data class ConvertedVolume(
            @SerializedName("btc")
            var btc: Double?, // 970.638
            @SerializedName("eth")
            var eth: Double?, // 251.109
            @SerializedName("usd")
            var usd: Int? // 38900494
        )

        data class Market(
            @SerializedName("has_trading_incentive")
            var hasTradingIncentive: Boolean?, // false
            @SerializedName("identifier")
            var identifier: String?, // bitfinex
            @SerializedName("name")
            var name: String? // Bitfinex
        )
    }

    fun toCoinDetail(): CoinDetail {
        return CoinDetail(
            coingeckoRank = coingeckoRank,
            coingeckoScore = coingeckoScore,
            countryOrigin = countryOrigin,
            id = id,
            image = image?.large,
            name = name,
            lastUpdated = lastUpdated,
            description = description?.en
        )
    }
}
package com.coinappcleanarchitecture.presentation.coinlist.manager

import com.coinappcleanarchitecture.network.model.Coins

data class CoinListState(
    val isLoading: Boolean = false,
    val coinList: List<Coins> = emptyList(),
    val error: String = ""
)

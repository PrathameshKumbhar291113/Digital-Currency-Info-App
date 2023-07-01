package com.coinappcleanarchitecture.presentation.coinlist.vm

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.coinappcleanarchitecture.common.util.NetworkResponseState
import com.coinappcleanarchitecture.domain.usecases.CoinListUseCase
import com.coinappcleanarchitecture.network.model.Coins
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class CoinListViewModel @Inject constructor(
    private val coinListUseCase: CoinListUseCase,

    ) : ViewModel() {

    var coinListResponse = MutableLiveData<NetworkResponseState<List<Coins>>>()

    fun getCoinList(page: String) {
        coinListUseCase(page = page).onEach {
            when (it) {
                is NetworkResponseState.Loading -> {
                    coinListResponse.value = NetworkResponseState.Loading()
                }

                is NetworkResponseState.Success -> {
                    it.data.let { coinsList ->
                        coinListResponse.value = NetworkResponseState.Success(coinsList)
                        Log.e("API", "getCoinList: $coinsList")
                    }
                }

                is NetworkResponseState.Error -> {
                    coinListResponse.value = NetworkResponseState.Error(it.message)
                }
            }
        }.launchIn(viewModelScope)
    }
}
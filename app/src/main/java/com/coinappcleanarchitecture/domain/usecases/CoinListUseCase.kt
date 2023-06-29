package com.coinappcleanarchitecture.domain.usecases

import com.coinappcleanarchitecture.domain.model.Coins
import com.coinappcleanarchitecture.domain.repository.CoinRepository
import com.coinappcleanarchitecture.util.NetworkResponseState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class CoinListUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(page:String) : Flow<NetworkResponseState<List<Coins>>> = flow {
        try {
            emit((NetworkResponseState.Loading<List<Coins>>()))
            val coins = repository.getAllCoins(page).map {
                it.toCoin()
            }
            emit(NetworkResponseState.Success<List<Coins>>(coins))
        }
        catch (e : HttpException){
            emit(NetworkResponseState.Error<List<Coins>>(e.message))
        }
        catch (e : IOException){
            emit(NetworkResponseState.Error<List<Coins>>(e.localizedMessage))
        }
    }
}
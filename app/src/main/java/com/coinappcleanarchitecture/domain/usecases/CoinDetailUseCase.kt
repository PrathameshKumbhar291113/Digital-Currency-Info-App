package com.coinappcleanarchitecture.domain.usecases

import com.coinappcleanarchitecture.network.model.CoinDetail
import com.coinappcleanarchitecture.domain.repository.CoinRepository
import com.coinappcleanarchitecture.common.util.NetworkResponseState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class CoinDetailUseCase @Inject constructor(
    private val repository: CoinRepository
){
    operator fun invoke(id: String) : Flow<NetworkResponseState<CoinDetail>> = flow {
        try {
            emit(NetworkResponseState.Loading<CoinDetail>())
            val coinDetail = repository.getCoinById(id).toCoinDetail()
            emit(NetworkResponseState.Success<CoinDetail>(coinDetail))
        }
        catch (e: HttpException){
            emit(NetworkResponseState.Error<CoinDetail>(e.message))
        }
        catch (e: IOException){
            emit(NetworkResponseState.Error<CoinDetail>(e.localizedMessage))
        }

    }
}
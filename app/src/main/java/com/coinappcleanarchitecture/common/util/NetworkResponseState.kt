package com.coinappcleanarchitecture.common.util

sealed class NetworkResponseState<T>(
    var data: T? = null, val message: String? = null
){
    class Loading<T>(): NetworkResponseState<T>()
    class Success<T>(data: T? = null): NetworkResponseState<T>(data)
    class Error<T>(message: String?, data: T? = null): NetworkResponseState<T>(data,message)
}

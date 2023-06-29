package com.coinappcleanarchitecture.util

sealed class NetworkResponseState<T>(val data: T? = null , val message: String? = null){
    class Loading<T>(data: T? = null): NetworkResponseState<T>(data)
    class Success<T>(data: T? = null): NetworkResponseState<T>(data)
    class Error<T>(message: String?, data: T? = null): NetworkResponseState<T>(data,message)
}

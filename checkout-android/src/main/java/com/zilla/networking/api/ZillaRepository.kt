package com.zilla.networking.api

import com.zilla.networking.model.request.CreateWithPublicKeyRequest
import com.zilla.networking.model.response.CreateWithPublicKeyInfo
import com.zilla.networking.model.response.ValidateOrderIdInfo
import kotlinx.coroutines.flow.Flow

interface ZillaRepository {
    suspend fun validateOrderId(orderId: String): Flow<Result<ValidateOrderIdInfo>>

    suspend fun createWithPublicKey(request: CreateWithPublicKeyRequest): Flow<Result<CreateWithPublicKeyInfo>>
}
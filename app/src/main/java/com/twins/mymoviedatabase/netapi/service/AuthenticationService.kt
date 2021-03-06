package com.twins.mymoviedatabase.netapi.service

import com.twins.mymoviedatabase.netapi.response.RequestToken
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

/**
 * Created by bukalapak on 10/27/17.
 */
interface AuthenticationService {

    @POST("/4/auth/request_token")
    fun createRequestToken(@Body param: RequestToken): Call<RequestToken>

}
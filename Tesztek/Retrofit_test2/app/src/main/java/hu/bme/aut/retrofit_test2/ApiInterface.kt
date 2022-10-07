package hu.bme.aut.retrofit_test2

import retrofit2.Call
import retrofit2.http.*

interface ApiInterface {

    @GET("btn")
    fun getData(): Call<List<MyDataItem>>

    @FormUrlEncoded
    @POST("posts")
    fun SendAndGetPost(
        @Field("name") userName: String?,
        @Field("password") userPass: String?
    ):Call<MyDataItem?>?


}
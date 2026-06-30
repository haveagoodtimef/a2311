package com.fenghongzhang.anew

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.http.GET
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class NetMoudle {

    @Binds
    fun bindFengApi(fengApiImpl: FengApiImpl):FengApi{
        return FengApiImpl()
    }

    @Provides
    @Singleton
    @OkHttpClientOne
    fun providesOkHttpClientOne() : OkHttpClient {
        return OkHttpClient().newBuilder().build()
    }

    @Provides
    @Singleton
    @OkHttpClientTwo
    @GET
    fun providesOkHttpClientTwo() : OkHttpClient {
        return OkHttpClient().newBuilder().build()
    }
}
package com.paul.wang.androidstarter

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Provides
    fun provideRetrofit() : Retrofit {
        return Retrofit.Builder().baseUrl("https://www.github.com").build()
    }
}

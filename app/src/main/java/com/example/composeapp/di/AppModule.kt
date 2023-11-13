package com.example.composeapp.di

import android.app.Application
import com.example.composeapp.data.manager.LocalUserMangerImpl
import com.example.composeapp.domain.manager.LocalUserManger
import com.example.composeapp.domain.manager.usecases.AppEntryUseCases
import com.example.composeapp.domain.manager.usecases.ReadAppEntry
import com.example.composeapp.domain.manager.usecases.SaveAppEntry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideLocalUserManger(
        application: Application
    ): LocalUserManger = LocalUserMangerImpl(context = application)

    @Provides
    @Singleton
    fun provideAppEntryUseCases(
        localUserManger: LocalUserManger
    ): AppEntryUseCases = AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManger),
        saveAppEntry = SaveAppEntry(localUserManger)
    )

}
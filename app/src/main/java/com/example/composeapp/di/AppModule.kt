package com.example.composeapp.di

import android.app.Application
import com.example.composeapp.data.manager.LocalUserManagerImpl
import com.example.composeapp.domain.manager.LocalUserManager
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
    ): LocalUserManager = LocalUserManagerImpl(context = application)

    @Provides
    @Singleton
    fun provideAppEntryUseCases(
        localUserManger: LocalUserManager
    ): AppEntryUseCases = AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManger),
        saveAppEntry = SaveAppEntry(localUserManger)
    )

}
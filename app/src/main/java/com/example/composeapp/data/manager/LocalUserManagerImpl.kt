package com.example.composeapp.data.manager

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.example.composeapp.domain.manager.LocalUserManager
import com.google.android.datatransport.BuildConfig
import kotlinx.coroutines.flow.Flow

const val App_Entry = "appEntry"

class LocalUserManagerImpl(context: Context) : LocalUserManager {


    private val Context.dataStore: DataStore<Preferences> by preferencesDataStore("Storage")

    private object preferencesKey{
        val APP_ENTRY = booleanPreferencesKey(name = App_Entry)
    }
    override suspend fun saveAppEntry() {


    }

    override fun readAppEntry(): Flow<Boolean> {
        TODO("Not yet implemented")
    }


}



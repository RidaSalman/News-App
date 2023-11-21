package com.example.composeapp.data.manager

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.preferencesDataStore
import com.example.composeapp.domain.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow
import java.util.prefs.Preferences


class LocalUserManagerImpl(context: Context) : LocalUserManager {

    private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = )
    override suspend fun saveAppEntry() {
        TODO("Not yet implemented")
    }

    override fun readAppEntry(): Flow<Boolean> {
        TODO("Not yet implemented")
    }


}



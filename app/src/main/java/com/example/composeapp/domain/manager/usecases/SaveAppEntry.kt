package com.example.composeapp.domain.manager.usecases

import com.example.composeapp.domain.manager.LocalUserManager

class SaveAppEntry(
    private val localUserManger: LocalUserManager
) {

    suspend operator fun invoke(){
        localUserManger.saveAppEntry()
    }

}
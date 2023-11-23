package com.example.composeapp.domain.manager.usecases.app_entry

class AppEntryUseCases {

    data class AppEntryUseCases(
        val readAppEntry: ReadAppEntry,
        val saveAppEntry: SaveAppEntry
    )
}
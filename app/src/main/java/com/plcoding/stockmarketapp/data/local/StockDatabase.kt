package com.plcoding.stockmarketapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [CompanyListingEntity::class],
    version = 2   // La versión cambia cuando cambia la estructura de la BD
)

abstract class StockDatabase: RoomDatabase() {
    abstract val dao: StockDao
}
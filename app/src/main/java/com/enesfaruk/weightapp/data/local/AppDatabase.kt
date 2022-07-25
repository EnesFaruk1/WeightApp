package com.enesfaruk.weightapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
/**
 * Created by Enes Faruk Işık on 25.07.2022.
 */
@Database(
    entities = [Weight::class],
    version = 1
)

@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun weightDao(): WeightDao
}
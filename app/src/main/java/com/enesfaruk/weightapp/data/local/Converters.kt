package com.enesfaruk.weightapp.data.local

import androidx.room.TypeConverter
import java.util.*

/**
 * Created by Enes Faruk Işık on 25.07.2022.
 */
class Converters {
    class Converters {
        @TypeConverter
        fun fromTimestamp(value: Long?): Date? {
            return value?.let { Date(it) }
        }

        @TypeConverter
        fun dateToTimestamp(date: Date?): Long? {
            return date?.time
        }
    }
}
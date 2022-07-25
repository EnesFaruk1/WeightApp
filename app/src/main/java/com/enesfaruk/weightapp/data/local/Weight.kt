package com.enesfaruk.weightapp.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

/**
 * Created by Enes Faruk Işık on 25.07.2022.
 */

@Entity(tableName = "weight")
data class Weight(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "timeStamp") val timeStamp: Date?,
    @ColumnInfo(name = "value") val value: Float?,
    @ColumnInfo(name = "emoji") val emoji: String?,
    @ColumnInfo(name = "note") val note: String?,
)
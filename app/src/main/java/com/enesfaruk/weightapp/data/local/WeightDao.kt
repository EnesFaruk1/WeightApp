package com.enesfaruk.weightapp.data.local

import androidx.room.*
import java.util.*

/**
 * Created by Enes Faruk Işık on 25.07.2022.
 */

@Dao
interface WeightDao {
    @Query("SELECT * FROM weight")
    fun getAll(): List<Weight>

    @Query("SELECT * FROM weight WHERE uid IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<Weight>

    @Query("SELECT * FROM weight WHERE timeStamp = :targetDate")
    fun findWeightByOnDate(targetDate: Date): List<Weight>

    @Insert
    suspend fun save(weight: Weight)

    @Update
    suspend fun update(weight: Weight)

    @Delete
    suspend fun delete(user: Weight)
}
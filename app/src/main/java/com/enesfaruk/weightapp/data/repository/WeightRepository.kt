package com.enesfaruk.weightapp.data.repository

import com.enesfaruk.weightapp.data.local.AppDatabase
import com.enesfaruk.weightapp.domain.mapper.WeightEntityMapper
import javax.inject.Inject

/**
 * Created by Enes Faruk Işık on 1.08.2022.
 */
class WeightRepository @Inject constructor(
    private val appDatabase: AppDatabase
){
    operator fun invoke() = appDatabase.weightDao().getAll().map {
        WeightEntityMapper.map(it)
    }
}
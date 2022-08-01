package com.enesfaruk.weightapp.di

import com.enesfaruk.weightapp.data.local.AppDatabase
import com.enesfaruk.weightapp.data.repository.WeightRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

/**
 * Created by Enes Faruk Işık on 1.08.2022.
 */
@Module
@InstallIn(ViewModelComponent::class)
object RepositoryModule {

    @Provides
    fun bindHomeRepository(
        appDatabase: AppDatabase
    ): WeightRepository {

        return WeightRepository(appDatabase)
    }
}
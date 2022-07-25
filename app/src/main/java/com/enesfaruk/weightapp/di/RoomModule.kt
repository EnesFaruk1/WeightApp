package com.enesfaruk.weightapp.di
import android.content.Context
import androidx.room.Room
import com.enesfaruk.weightapp.data.local.AppDatabase
import com.enesfaruk.weightapp.data.local.WeightDao
import com.enesfaruk.weightapp.utils.Constants.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
/**
 * Created by Enes Faruk Işık on 25.07.2022.
 */


@[Module InstallIn(SingletonComponent::class)]
object RoomModule {

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME)
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun provideDao(
        db: AppDatabase
    ): WeightDao = db.weightDao()
}
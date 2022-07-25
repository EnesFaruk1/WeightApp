package com.enesfaruk.weightapp.ui

import android.app.Application
import androidx.viewbinding.BuildConfig
import com.orhanobut.hawk.Hawk
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

/**
 * Created by Enes Faruk Işık on 25.07.2022.
 */

@HiltAndroidApp
class WeightApp: Application() {

    override fun onCreate() {
        super.onCreate()
        setupTimber()
        setupHawk()
    }

    private fun setupHawk() {
        Hawk.init(this).build()
    }

    private fun setupTimber() {
        if (BuildConfig.DEBUG){
            Timber.plant(Timber.DebugTree())
        }
    }
}
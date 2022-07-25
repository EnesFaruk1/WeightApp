package com.enesfaruk.weightapp.ui.notifications

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.enesfaruk.weightapp.R
import com.enesfaruk.weightapp.databinding.FragmentNotificationsBinding
import com.enesfaruk.weightapp.utils.viewBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NotificationsFragment : Fragment(R.layout.fragment_notifications) {

    private val binding by viewBinding(FragmentNotificationsBinding::bind)

    private val notificationsViewModel: NotificationsViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}
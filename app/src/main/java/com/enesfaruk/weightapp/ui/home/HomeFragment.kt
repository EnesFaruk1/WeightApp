package com.enesfaruk.weightapp.ui.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.enesfaruk.weightapp.R
import com.enesfaruk.weightapp.adapters.WeightHistoryAdapter
import com.enesfaruk.weightapp.databinding.FragmentHomeBinding
import com.enesfaruk.weightapp.domain.uimodel.WeightUIModel
import com.enesfaruk.weightapp.utils.viewBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding by viewBinding(FragmentHomeBinding::bind)

    private val homeViewModel: HomeViewModel by viewModels()

    private val adapterWeightHistory: WeightHistoryAdapter by lazy {
        WeightHistoryAdapter(::onClickWeight)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    private fun onClickWeight(weight: WeightUIModel){

    }

    private fun observe() {

    }

    private fun initViews() {
        binding.rvWeightHistory.adapter = adapterWeightHistory.apply {
            //submitList(listOf(Weigh))
        }
    }

}
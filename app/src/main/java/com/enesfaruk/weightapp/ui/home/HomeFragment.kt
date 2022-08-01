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
        initViews()
        observeData()
    }

    private fun setUIState(uiState: HomeViewModel.UiState) {
        adapterWeightHistory.submitList(uiState.histories)
    }

    private fun observeData() {

    }

    private fun initViews() = with(binding) {
        rvWeightHistory.adapter = adapterWeightHistory.apply {
        }
    }

    private fun onClickWeight(weight: WeightUIModel) {

    }

}
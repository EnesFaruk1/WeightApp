package com.enesfaruk.weightapp.adapters

import android.view.View

import androidx.recyclerview.widget.RecyclerView
import com.enesfaruk.weightapp.domain.uimodel.WeightUIModel
import com.enesfaruk.weightapp.databinding.ItemWeightHistoryBinding

/**
 * Created by Enes Faruk Işık on 25.07.2022.
 */
const val DATE_FORMAT = "dd MMM yyyy"

class WeightHistoryViewHolder(
    view: View,
    private val onClickWeight: ((weight: WeightUIModel) -> Unit)?
) :
    RecyclerView.ViewHolder(view) {
    private val binding = ItemWeightHistoryBinding.bind(view)

    fun bind(uiModel: WeightUIModel) = with(binding) {
        itemView.setOnClickListener {
            onClickWeight?.invoke(uiModel)
        }
    }
}
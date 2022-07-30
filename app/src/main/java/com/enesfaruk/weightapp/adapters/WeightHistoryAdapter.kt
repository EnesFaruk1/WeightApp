package com.enesfaruk.weightapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.enesfaruk.weightapp.R
import com.enesfaruk.weightapp.base.BaseListAdapter
import com.enesfaruk.weightapp.domain.uimodel.WeightUIModel

/**
 * Created by Enes Faruk Işık on 25.07.2022.
 */
class WeightHistoryAdapter(private val onClickWeight: ((weight: WeightUIModel) -> Unit)?) :
    BaseListAdapter<WeightUIModel>(
        itemsSame = { old, new -> old.uid == new.uid },
        contentsSame = { old, new -> old == new }
    ) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        inflater: LayoutInflater,
        viewType: Int
    ): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_weight_history, parent, false)
        return WeightHistoryViewHolder(view, onClickWeight)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is WeightHistoryViewHolder -> {
                getItem(position)?.let { item -> holder.bind(item) }
            }
        }
    }
}
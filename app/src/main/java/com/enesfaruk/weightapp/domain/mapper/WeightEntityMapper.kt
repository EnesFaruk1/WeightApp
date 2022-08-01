package com.enesfaruk.weightapp.domain.mapper

import com.enesfaruk.weightapp.data.local.Weight
import com.enesfaruk.weightapp.domain.uimodel.WeightUIModel
import com.enesfaruk.weightapp.utils.extensions.orZero

/**
 * Created by Enes Faruk Işık on 25.07.2022.
 */
object WeightEntityMapper {

    fun map(entity: Weight): WeightUIModel {
        return WeightUIModel(
            uid = entity.uid,
            value = entity.value.orZero(),
            emoji = entity.emoji.orEmpty(),
            note = entity.note.orEmpty()
        )
    }
}
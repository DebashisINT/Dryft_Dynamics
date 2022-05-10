package com.dryftdynamics.features.viewAllOrder.interf

import com.dryftdynamics.app.domain.NewOrderProductEntity
import com.dryftdynamics.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}
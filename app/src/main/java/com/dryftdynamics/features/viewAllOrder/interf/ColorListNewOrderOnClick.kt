package com.dryftdynamics.features.viewAllOrder.interf

import com.dryftdynamics.app.domain.NewOrderColorEntity
import com.dryftdynamics.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}
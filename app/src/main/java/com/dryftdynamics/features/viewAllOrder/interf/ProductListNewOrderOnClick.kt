package com.dryftdynamics.features.viewAllOrder.interf

import com.dryftdynamics.app.domain.NewOrderGenderEntity
import com.dryftdynamics.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}
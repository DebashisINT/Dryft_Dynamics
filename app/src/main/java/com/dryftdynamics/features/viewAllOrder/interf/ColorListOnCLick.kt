package com.dryftdynamics.features.viewAllOrder.interf

import com.dryftdynamics.app.domain.NewOrderGenderEntity
import com.dryftdynamics.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}
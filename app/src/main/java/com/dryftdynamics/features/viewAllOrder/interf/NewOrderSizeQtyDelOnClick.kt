package com.dryftdynamics.features.viewAllOrder.interf

import com.dryftdynamics.app.domain.NewOrderGenderEntity
import com.dryftdynamics.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}
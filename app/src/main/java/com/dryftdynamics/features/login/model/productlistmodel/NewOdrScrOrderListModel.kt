package com.dryftdynamics.features.login.model.productlistmodel

import com.dryftdynamics.app.domain.NewOrderScrOrderEntity
import com.dryftdynamics.app.domain.ProductListEntity

class NewOdrScrOrderListModel {
    var status:String? = null
    var message:String? = null
    var user_id:String? = null
    var order_list: ArrayList<NewOrderScrOrderEntity>? = null
}
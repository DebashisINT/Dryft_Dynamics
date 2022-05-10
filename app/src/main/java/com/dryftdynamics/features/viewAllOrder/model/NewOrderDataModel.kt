package com.dryftdynamics.features.viewAllOrder.model

import com.dryftdynamics.app.domain.NewOrderColorEntity
import com.dryftdynamics.app.domain.NewOrderGenderEntity
import com.dryftdynamics.app.domain.NewOrderProductEntity
import com.dryftdynamics.app.domain.NewOrderSizeEntity
import com.dryftdynamics.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}


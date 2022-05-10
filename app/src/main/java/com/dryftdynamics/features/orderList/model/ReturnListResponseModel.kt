package com.dryftdynamics.features.orderList.model

import com.dryftdynamics.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}
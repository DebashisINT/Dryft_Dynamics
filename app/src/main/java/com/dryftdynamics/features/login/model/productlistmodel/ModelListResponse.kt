package com.dryftdynamics.features.login.model.productlistmodel

import com.dryftdynamics.app.domain.ModelEntity
import com.dryftdynamics.app.domain.ProductListEntity
import com.dryftdynamics.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}
package com.dryftdynamics.features.stockAddCurrentStock.api

import com.dryftdynamics.base.BaseResponse
import com.dryftdynamics.features.location.model.ShopRevisitStatusRequest
import com.dryftdynamics.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.dryftdynamics.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.dryftdynamics.features.stockAddCurrentStock.model.CurrentStockGetData
import com.dryftdynamics.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}
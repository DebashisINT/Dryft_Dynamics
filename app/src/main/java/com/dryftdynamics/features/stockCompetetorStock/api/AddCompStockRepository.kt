package com.dryftdynamics.features.stockCompetetorStock.api

import com.dryftdynamics.base.BaseResponse
import com.dryftdynamics.features.orderList.model.NewOrderListResponseModel
import com.dryftdynamics.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.dryftdynamics.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}
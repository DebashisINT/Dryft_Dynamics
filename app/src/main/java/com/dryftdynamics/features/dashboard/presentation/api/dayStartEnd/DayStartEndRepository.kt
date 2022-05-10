package com.dryftdynamics.features.dashboard.presentation.api.dayStartEnd

import com.dryftdynamics.app.Pref
import com.dryftdynamics.base.BaseResponse
import com.dryftdynamics.features.dashboard.presentation.model.DaystartDayendRequest
import com.dryftdynamics.features.dashboard.presentation.model.StatusDayStartEnd
import com.dryftdynamics.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.dryftdynamics.features.stockCompetetorStock.api.AddCompStockApi
import io.reactivex.Observable

class DayStartEndRepository (val apiService: DayStartEndApi){
    fun dayStart(daystartDayendRequest: DaystartDayendRequest): Observable<BaseResponse> {
        return apiService.submitDayStartEnd(daystartDayendRequest)
    }

    fun dayStartEndStatus(date:String): Observable<StatusDayStartEnd> {
        return apiService.statusDayStartEnd(Pref.session_token!!, Pref.user_id!!,date)
    }


}
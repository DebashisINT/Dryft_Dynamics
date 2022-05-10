package com.dryftdynamics.features.location.api

import com.dryftdynamics.app.Pref
import com.dryftdynamics.base.BaseResponse
import com.dryftdynamics.features.location.model.AppInfoInputModel
import com.dryftdynamics.features.location.model.AppInfoResponseModel
import com.dryftdynamics.features.location.model.ShopDurationRequest
import com.dryftdynamics.features.location.shopdurationapi.ShopDurationApi
import io.reactivex.Observable

/**
 * Created by Saikat on 17-Aug-20.
 */
class LocationRepo(val apiService: LocationApi) {
    fun appInfo(appInfo: AppInfoInputModel?): Observable<BaseResponse> {
        return apiService.submitAppInfo(appInfo)
    }

    fun getAppInfo(): Observable<AppInfoResponseModel> {
        return apiService.getAppInfo(Pref.session_token!!, Pref.user_id!!)
    }
}
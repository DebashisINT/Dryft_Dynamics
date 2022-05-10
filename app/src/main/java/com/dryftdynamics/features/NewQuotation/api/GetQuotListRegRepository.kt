package com.dryftdynamics.features.NewQuotation.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.dryftdynamics.app.FileUtils
import com.dryftdynamics.base.BaseResponse
import com.dryftdynamics.features.NewQuotation.model.*
import com.dryftdynamics.features.addshop.model.AddShopRequestData
import com.dryftdynamics.features.addshop.model.AddShopResponse
import com.dryftdynamics.features.login.model.userconfig.UserConfigResponseModel
import com.dryftdynamics.features.myjobs.model.WIPImageSubmit
import com.dryftdynamics.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetQuotListRegRepository(val apiService : GetQutoListApi) {

    fun addQuot(shop: AddQuotRequestData): Observable<BaseResponse> {
        return apiService.getAddQuot(shop)
    }

    fun viewQuot(shopId: String): Observable<ViewQuotResponse> {
        return apiService.getQuotList(shopId)
    }

    fun viewDetailsQuot(quotId: String): Observable<ViewDetailsQuotResponse> {
        return apiService.getQuotDetailsList(quotId)
    }

    fun delQuot(quotId: String): Observable<BaseResponse>{
        return apiService.QuotDel(quotId)
    }

    fun editQuot(shop: EditQuotRequestData): Observable<BaseResponse> {
        return apiService.editQuot(shop)
    }


}
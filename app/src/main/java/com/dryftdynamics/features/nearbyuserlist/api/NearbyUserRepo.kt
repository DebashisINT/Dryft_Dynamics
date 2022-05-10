package com.dryftdynamics.features.nearbyuserlist.api

import com.dryftdynamics.app.Pref
import com.dryftdynamics.features.nearbyuserlist.model.NearbyUserResponseModel
import com.dryftdynamics.features.newcollection.model.NewCollectionListResponseModel
import com.dryftdynamics.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}
package com.dryftdynamics.features.location.api

import com.dryftdynamics.features.location.shopdurationapi.ShopDurationApi
import com.dryftdynamics.features.location.shopdurationapi.ShopDurationRepository

/**
 * Created by Saikat on 17-Aug-20.
 */
object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}
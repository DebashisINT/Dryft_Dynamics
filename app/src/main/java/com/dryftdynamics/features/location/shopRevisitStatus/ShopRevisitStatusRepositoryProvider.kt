package com.dryftdynamics.features.location.shopRevisitStatus

import com.dryftdynamics.features.location.shopdurationapi.ShopDurationApi
import com.dryftdynamics.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}
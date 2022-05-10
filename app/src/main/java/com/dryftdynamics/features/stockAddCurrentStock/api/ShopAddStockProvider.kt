package com.dryftdynamics.features.stockAddCurrentStock.api

import com.dryftdynamics.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.dryftdynamics.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}
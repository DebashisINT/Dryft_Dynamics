package com.dryftdynamics.features.dashboard.presentation.api.dayStartEnd

import com.dryftdynamics.features.stockCompetetorStock.api.AddCompStockApi
import com.dryftdynamics.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}
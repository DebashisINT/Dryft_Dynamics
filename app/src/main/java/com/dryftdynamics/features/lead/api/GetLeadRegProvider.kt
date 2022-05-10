package com.dryftdynamics.features.lead.api

import com.dryftdynamics.features.NewQuotation.api.GetQuotListRegRepository
import com.dryftdynamics.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}
package com.dryftdynamics.features.addAttendence.api.leavetytpeapi

import com.dryftdynamics.app.Pref
import com.dryftdynamics.base.BaseResponse
import com.dryftdynamics.features.addAttendence.model.ApprovalLeaveResponseModel
import com.dryftdynamics.features.addAttendence.model.LeaveTypeResponseModel
import com.dryftdynamics.features.leaveapplynew.model.ApprovalRejectReqModel
import io.reactivex.Observable

/**
 * Created by Saikat on 22-11-2018.
 */
class LeaveTypeRepo(val apiService: LeaveTypeApi) {
    fun getLeaveTypeList(): Observable<LeaveTypeResponseModel> {
        return apiService.getLeaveTypeList(Pref.session_token!!, Pref.user_id!!)
    }


    fun getApprovalLeaveList(userId:String): Observable<ApprovalLeaveResponseModel> {
        return apiService.getApprovalLeaveList(Pref.session_token!!,userId)
    }

    fun postApprovalRejectclick(ApprovalRejectReqModel: ApprovalRejectReqModel): Observable<BaseResponse> {
        return apiService.postApprovalRejectclick(ApprovalRejectReqModel)
    }
}
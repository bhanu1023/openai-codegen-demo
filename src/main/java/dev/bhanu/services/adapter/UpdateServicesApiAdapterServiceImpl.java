package dev.bhanu.services.adapter;

import dev.bhanu.model.*;
import dev.bhanu.services.*;
import dt.tworld.bff.rest.service.utils.BaseResponseBuilder;
import dt.tworld.bff.rest.service.utils.BaseResponse;
import org.springframework.http.ResponseEntity;
import dt.tworld.sales.adapter.util.ResponseWrapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import dt.tworld.sales.adapter.networkpass.constants.APIConstants;


@Service
@AllArgsConstructor
public class UpdateServicesApiAdapterServiceImpl implements UpdateServicesApiAdapterService {
        private final UpdateServicesApiService service;
        @Override
        public ResponseEntity<BaseResponse<ChangePlanResponse>> apiToUpdatePlanServicesDatapass(ChangePlanRequest data) {

        ResponseWrapper<ChangePlanResponse> serviceResponse =
            service.apiToUpdatePlanServicesDatapass(data);

            return new ResponseEntity<>(BaseResponseBuilder.buildResponse(
            serviceResponse.getCode().toString(), serviceResponse.getCode(),
            APIConstants.REQUEST_SUCCESS,
            serviceResponse.getData()),
            HttpStatus.valueOf(serviceResponse.getCode()));
    }

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
public class ReviewServicesApiAdapterServiceImpl implements ReviewServicesApiAdapterService {
        private final ReviewServicesApiService service;
        @Override
        public ResponseEntity<BaseResponse<ReviewServicesResponse>> apiToReviewPlanServicesDatapass(ReviewServicesRequest data) {

        ResponseWrapper<ReviewServicesResponse> serviceResponse =
            service.apiToReviewPlanServicesDatapass(data);

            return new ResponseEntity<>(BaseResponseBuilder.buildResponse(
            serviceResponse.getCode().toString(), serviceResponse.getCode(),
            APIConstants.REQUEST_SUCCESS,
            serviceResponse.getData()),
            HttpStatus.valueOf(serviceResponse.getCode()));
    }

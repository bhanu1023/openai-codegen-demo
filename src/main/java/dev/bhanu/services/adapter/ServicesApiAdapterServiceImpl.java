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
public class ServicesApiAdapterServiceImpl implements ServicesApiAdapterService {
        private final ServicesApiService service;
        @Override
        public ResponseEntity<BaseResponse<ServicesResponse>> services(ServicesRequest data) {

        ResponseWrapper<ServicesResponse> serviceResponse =
            service.services(data);

            return new ResponseEntity<>(BaseResponseBuilder.buildResponse(
            serviceResponse.getCode().toString(), serviceResponse.getCode(),
            APIConstants.REQUEST_SUCCESS,
            serviceResponse.getData()),
            HttpStatus.valueOf(serviceResponse.getCode()));
    }

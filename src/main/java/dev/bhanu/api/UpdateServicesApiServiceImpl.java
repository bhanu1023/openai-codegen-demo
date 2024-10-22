package dev.bhanu.api;

import dev.bhanu.model.*;
import dt.tworld.bff.genericexception.constants.PodType;
import dt.tworld.sales.adapter.models.RequestHeadersAndUrl;
import dt.tworld.sales.adapter.util.ResponseWrapper;
import dt.tworld.sales.adapter.util.SalesRequestUtil;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import dt.tworld.bff.rest.service.RestService;
import dt.tworld.bff.rest.service.utils.JsonHelper;
import dt.tworld.sales.adapter.config.SalesConfigLoader;
import static dt.tworld.sales.adapter.constants.APIConstants.AAL;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import jakarta.servlet.http.HttpServletRequest;

@Service
@AllArgsConstructor
public class UpdateServicesApiServiceImpl implements UpdateServicesApiService {
        private final RestService restService;
        private final HttpServletRequest request;
        private final SalesRequestUtil requestUtil;
        private final SalesConfigLoader salesConfigLoader;
        private final JsonHelper jsonHelper;
        @Override
        @CircuitBreaker(name = "sales")
        public ResponseWrapper<ChangePlanResponse> apiToUpdatePlanServicesDatapass(ChangePlanRequest data) {

        RequestHeadersAndUrl requestHeadersAndUrl = requestUtil.getRequestHeadersAndUrl(
            requestUtil.buildRequestContext(SalesRequestUtil.getHeaders(request),"url",
            request.getMethod(),
            data));

        ResponseEntity<String> response = restService.callBackendService(
            requestHeadersAndUrl.getUrl(), HttpMethod.POST, data,
            requestHeadersAndUrl.getHttpHeaders(),
            null, PodType.SALES.name(), AAL);
            return ResponseWrapper.toResponseWrapper(jsonHelper.parseResponse(
            response.getBody(), ChangePlanResponse.class), response);
        }
}

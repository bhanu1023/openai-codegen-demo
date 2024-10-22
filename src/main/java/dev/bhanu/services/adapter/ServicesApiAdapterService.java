package dev.bhanu.services.adapter;

import dev.bhanu.model.*;
import dt.tworld.bff.rest.service.utils.BaseResponse;
import org.springframework.http.ResponseEntity;

public interface ServicesApiAdapterService {
        public ResponseEntity<BaseResponse<ServicesResponse>> services(ServicesRequest data);
}
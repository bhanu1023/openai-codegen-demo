package dev.bhanu.services.adapter;

import dev.bhanu.model.*;
import dt.tworld.bff.rest.service.utils.BaseResponse;
import org.springframework.http.ResponseEntity;

public interface UpdateServicesApiAdapterService {
        public ResponseEntity<BaseResponse<ChangePlanResponse>> apiToUpdatePlanServicesDatapass(ChangePlanRequest data);
}
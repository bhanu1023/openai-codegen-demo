package dev.bhanu.services.adapter;

import dev.bhanu.model.*;
import dt.tworld.sales.adapter.util.ResponseWrapper;

public interface UpdateServicesApiService {
        public ResponseWrapper<ChangePlanResponse> apiToUpdatePlanServicesDatapass(ChangePlanRequest data);
}
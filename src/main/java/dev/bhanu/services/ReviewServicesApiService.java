package dev.bhanu.services.adapter;

import dev.bhanu.model.*;
import dt.tworld.sales.adapter.util.ResponseWrapper;

public interface ReviewServicesApiService {
        public ResponseWrapper<ReviewServicesResponse> apiToReviewPlanServicesDatapass(ReviewServicesRequest data);
}
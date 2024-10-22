package dev.bhanu.services.adapter;

import dev.bhanu.model.*;
import dt.tworld.bff.rest.service.utils.BaseResponse;
import org.springframework.http.ResponseEntity;

public interface PartnerSubscriptionsApiAdapterService {
        public ResponseEntity<BaseResponse<PartnerSubscriptionResponse>> apiToGetPartnerSubscriptionsDetails(PartnerSubscriptionRequest data);
}
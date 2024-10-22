package dev.bhanu.api;

import dev.bhanu.model.*;
import dt.tworld.sales.adapter.util.ResponseWrapper;

public interface PartnerSubscriptionsApiService {
        public ResponseWrapper<PartnerSubscriptionResponse> apiToGetPartnerSubscriptionsDetails(PartnerSubscriptionRequest data);
}
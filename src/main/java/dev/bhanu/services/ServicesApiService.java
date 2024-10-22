package dev.bhanu.services.adapter;

import dev.bhanu.model.*;
import dt.tworld.sales.adapter.util.ResponseWrapper;

public interface ServicesApiService {
        public ResponseWrapper<ServicesResponse> services(ServicesRequest data);
}
package dev.bhanu.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Request to get services
 */

@Schema(name = "ServicesRequest", description = "Request to get services")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T01:19:46.548500+05:30[Asia/Kolkata]", comments = "Generator version: 7.9.0")
public class ServicesRequest {

  private String msisdn;

  private Boolean fetchSubscriptions;

  private Boolean fetchDataPasses;

  private Boolean fetchPlanDataServices;

  private String serviceSubTypeFilter;

  @Valid
  private List<String> subCategoriesFilter = new ArrayList<>();

  public ServicesRequest msisdn(String msisdn) {
    this.msisdn = msisdn;
    return this;
  }

  /**
   * Get msisdn
   * @return msisdn
   */
  
  @Schema(name = "msisdn", example = "1234567890", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("msisdn")
  public String getMsisdn() {
    return msisdn;
  }

  public void setMsisdn(String msisdn) {
    this.msisdn = msisdn;
  }

  public ServicesRequest fetchSubscriptions(Boolean fetchSubscriptions) {
    this.fetchSubscriptions = fetchSubscriptions;
    return this;
  }

  /**
   * Get fetchSubscriptions
   * @return fetchSubscriptions
   */
  
  @Schema(name = "fetchSubscriptions", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fetchSubscriptions")
  public Boolean getFetchSubscriptions() {
    return fetchSubscriptions;
  }

  public void setFetchSubscriptions(Boolean fetchSubscriptions) {
    this.fetchSubscriptions = fetchSubscriptions;
  }

  public ServicesRequest fetchDataPasses(Boolean fetchDataPasses) {
    this.fetchDataPasses = fetchDataPasses;
    return this;
  }

  /**
   * Get fetchDataPasses
   * @return fetchDataPasses
   */
  
  @Schema(name = "fetchDataPasses", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fetchDataPasses")
  public Boolean getFetchDataPasses() {
    return fetchDataPasses;
  }

  public void setFetchDataPasses(Boolean fetchDataPasses) {
    this.fetchDataPasses = fetchDataPasses;
  }

  public ServicesRequest fetchPlanDataServices(Boolean fetchPlanDataServices) {
    this.fetchPlanDataServices = fetchPlanDataServices;
    return this;
  }

  /**
   * Get fetchPlanDataServices
   * @return fetchPlanDataServices
   */
  
  @Schema(name = "fetchPlanDataServices", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fetchPlanDataServices")
  public Boolean getFetchPlanDataServices() {
    return fetchPlanDataServices;
  }

  public void setFetchPlanDataServices(Boolean fetchPlanDataServices) {
    this.fetchPlanDataServices = fetchPlanDataServices;
  }

  public ServicesRequest serviceSubTypeFilter(String serviceSubTypeFilter) {
    this.serviceSubTypeFilter = serviceSubTypeFilter;
    return this;
  }

  /**
   * Get serviceSubTypeFilter
   * @return serviceSubTypeFilter
   */
  
  @Schema(name = "serviceSubTypeFilter", example = "Handset Protection and Upgrade/Video Streaming - only for services and not subscriptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceSubTypeFilter")
  public String getServiceSubTypeFilter() {
    return serviceSubTypeFilter;
  }

  public void setServiceSubTypeFilter(String serviceSubTypeFilter) {
    this.serviceSubTypeFilter = serviceSubTypeFilter;
  }

  public ServicesRequest subCategoriesFilter(List<String> subCategoriesFilter) {
    this.subCategoriesFilter = subCategoriesFilter;
    return this;
  }

  public ServicesRequest addSubCategoriesFilterItem(String subCategoriesFilterItem) {
    if (this.subCategoriesFilter == null) {
      this.subCategoriesFilter = new ArrayList<>();
    }
    this.subCategoriesFilter.add(subCategoriesFilterItem);
    return this;
  }

  /**
   * Get subCategoriesFilter
   * @return subCategoriesFilter
   */
  
  @Schema(name = "subCategoriesFilter", example = "[Insurance, Extended Warranty, Mobile Security, Upgrade Program]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subCategoriesFilter")
  public List<String> getSubCategoriesFilter() {
    return subCategoriesFilter;
  }

  public void setSubCategoriesFilter(List<String> subCategoriesFilter) {
    this.subCategoriesFilter = subCategoriesFilter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServicesRequest servicesRequest = (ServicesRequest) o;
    return Objects.equals(this.msisdn, servicesRequest.msisdn) &&
        Objects.equals(this.fetchSubscriptions, servicesRequest.fetchSubscriptions) &&
        Objects.equals(this.fetchDataPasses, servicesRequest.fetchDataPasses) &&
        Objects.equals(this.fetchPlanDataServices, servicesRequest.fetchPlanDataServices) &&
        Objects.equals(this.serviceSubTypeFilter, servicesRequest.serviceSubTypeFilter) &&
        Objects.equals(this.subCategoriesFilter, servicesRequest.subCategoriesFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msisdn, fetchSubscriptions, fetchDataPasses, fetchPlanDataServices, serviceSubTypeFilter, subCategoriesFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicesRequest {\n");
    sb.append("    msisdn: ").append(toIndentedString(msisdn)).append("\n");
    sb.append("    fetchSubscriptions: ").append(toIndentedString(fetchSubscriptions)).append("\n");
    sb.append("    fetchDataPasses: ").append(toIndentedString(fetchDataPasses)).append("\n");
    sb.append("    fetchPlanDataServices: ").append(toIndentedString(fetchPlanDataServices)).append("\n");
    sb.append("    serviceSubTypeFilter: ").append(toIndentedString(serviceSubTypeFilter)).append("\n");
    sb.append("    subCategoriesFilter: ").append(toIndentedString(subCategoriesFilter)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


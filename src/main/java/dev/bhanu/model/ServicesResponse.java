package dev.bhanu.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import dev.bhanu.model.ActiveSubscription;
import dev.bhanu.model.BanSuspensionDetails;
import dev.bhanu.model.CurrentDataPass;
import dev.bhanu.model.CurrentService;
import dev.bhanu.model.DataPass;
import dev.bhanu.model.PlanDataService;
import dev.bhanu.model.Service;
import dev.bhanu.model.Subscription;
import java.math.BigDecimal;
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
 * Services response
 */

@Schema(name = "ServicesResponse", description = "Services response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T01:19:46.548500+05:30[Asia/Kolkata]", comments = "Generator version: 7.9.0")
public class ServicesResponse {

  private Boolean isLineLevelSuspended;

  private Boolean isLineInvoluntarySuspended;

  private Boolean isAccountLevelSuspended;

  private Boolean isBanInvoluntarySuspended;

  private BanSuspensionDetails banSuspensionDetails;

  private Boolean isBanVoluntarySuspended;

  private Boolean hasPendingPlansServices;

  private Boolean hasPendingDatasService;

  private Float currentMonthlyTotal;

  private Boolean isTaxInclusive;

  private BigDecimal maxFuturePurchaseDays;

  @Valid
  private List<String> passLimitExceededCatList = new ArrayList<>();

  private BigDecimal internationalDataPassLimit;

  private String currentDate;

  private String productType;

  @Valid
  private List<@Valid CurrentService> currentServices = new ArrayList<>();

  @Valid
  private List<@Valid CurrentDataPass> currentDataPasses = new ArrayList<>();

  @Valid
  private List<@Valid ActiveSubscription> activeSubscriptions = new ArrayList<>();

  @Valid
  private List<@Valid Subscription> eligibleSubscriptions = new ArrayList<>();

  @Valid
  private List<@Valid PlanDataService> planDataServices = new ArrayList<>();

  @Valid
  private List<@Valid Service> eligibleServices = new ArrayList<>();

  @Valid
  private List<@Valid DataPass> eligibleDataPasses = new ArrayList<>();

  public ServicesResponse isLineLevelSuspended(Boolean isLineLevelSuspended) {
    this.isLineLevelSuspended = isLineLevelSuspended;
    return this;
  }

  /**
   * Get isLineLevelSuspended
   * @return isLineLevelSuspended
   */
  
  @Schema(name = "isLineLevelSuspended", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isLineLevelSuspended")
  public Boolean getIsLineLevelSuspended() {
    return isLineLevelSuspended;
  }

  public void setIsLineLevelSuspended(Boolean isLineLevelSuspended) {
    this.isLineLevelSuspended = isLineLevelSuspended;
  }

  public ServicesResponse isLineInvoluntarySuspended(Boolean isLineInvoluntarySuspended) {
    this.isLineInvoluntarySuspended = isLineInvoluntarySuspended;
    return this;
  }

  /**
   * Get isLineInvoluntarySuspended
   * @return isLineInvoluntarySuspended
   */
  
  @Schema(name = "isLineInvoluntarySuspended", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isLineInvoluntarySuspended")
  public Boolean getIsLineInvoluntarySuspended() {
    return isLineInvoluntarySuspended;
  }

  public void setIsLineInvoluntarySuspended(Boolean isLineInvoluntarySuspended) {
    this.isLineInvoluntarySuspended = isLineInvoluntarySuspended;
  }

  public ServicesResponse isAccountLevelSuspended(Boolean isAccountLevelSuspended) {
    this.isAccountLevelSuspended = isAccountLevelSuspended;
    return this;
  }

  /**
   * Get isAccountLevelSuspended
   * @return isAccountLevelSuspended
   */
  
  @Schema(name = "isAccountLevelSuspended", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isAccountLevelSuspended")
  public Boolean getIsAccountLevelSuspended() {
    return isAccountLevelSuspended;
  }

  public void setIsAccountLevelSuspended(Boolean isAccountLevelSuspended) {
    this.isAccountLevelSuspended = isAccountLevelSuspended;
  }

  public ServicesResponse isBanInvoluntarySuspended(Boolean isBanInvoluntarySuspended) {
    this.isBanInvoluntarySuspended = isBanInvoluntarySuspended;
    return this;
  }

  /**
   * Get isBanInvoluntarySuspended
   * @return isBanInvoluntarySuspended
   */
  
  @Schema(name = "isBanInvoluntarySuspended", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isBanInvoluntarySuspended")
  public Boolean getIsBanInvoluntarySuspended() {
    return isBanInvoluntarySuspended;
  }

  public void setIsBanInvoluntarySuspended(Boolean isBanInvoluntarySuspended) {
    this.isBanInvoluntarySuspended = isBanInvoluntarySuspended;
  }

  public ServicesResponse banSuspensionDetails(BanSuspensionDetails banSuspensionDetails) {
    this.banSuspensionDetails = banSuspensionDetails;
    return this;
  }

  /**
   * Get banSuspensionDetails
   * @return banSuspensionDetails
   */
  @Valid 
  @Schema(name = "banSuspensionDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("banSuspensionDetails")
  public BanSuspensionDetails getBanSuspensionDetails() {
    return banSuspensionDetails;
  }

  public void setBanSuspensionDetails(BanSuspensionDetails banSuspensionDetails) {
    this.banSuspensionDetails = banSuspensionDetails;
  }

  public ServicesResponse isBanVoluntarySuspended(Boolean isBanVoluntarySuspended) {
    this.isBanVoluntarySuspended = isBanVoluntarySuspended;
    return this;
  }

  /**
   * Get isBanVoluntarySuspended
   * @return isBanVoluntarySuspended
   */
  
  @Schema(name = "isBanVoluntarySuspended", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isBanVoluntarySuspended")
  public Boolean getIsBanVoluntarySuspended() {
    return isBanVoluntarySuspended;
  }

  public void setIsBanVoluntarySuspended(Boolean isBanVoluntarySuspended) {
    this.isBanVoluntarySuspended = isBanVoluntarySuspended;
  }

  public ServicesResponse hasPendingPlansServices(Boolean hasPendingPlansServices) {
    this.hasPendingPlansServices = hasPendingPlansServices;
    return this;
  }

  /**
   * Get hasPendingPlansServices
   * @return hasPendingPlansServices
   */
  
  @Schema(name = "hasPendingPlansServices", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasPendingPlansServices")
  public Boolean getHasPendingPlansServices() {
    return hasPendingPlansServices;
  }

  public void setHasPendingPlansServices(Boolean hasPendingPlansServices) {
    this.hasPendingPlansServices = hasPendingPlansServices;
  }

  public ServicesResponse hasPendingDatasService(Boolean hasPendingDatasService) {
    this.hasPendingDatasService = hasPendingDatasService;
    return this;
  }

  /**
   * Get hasPendingDatasService
   * @return hasPendingDatasService
   */
  
  @Schema(name = "hasPendingDatasService", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasPendingDatasService")
  public Boolean getHasPendingDatasService() {
    return hasPendingDatasService;
  }

  public void setHasPendingDatasService(Boolean hasPendingDatasService) {
    this.hasPendingDatasService = hasPendingDatasService;
  }

  public ServicesResponse currentMonthlyTotal(Float currentMonthlyTotal) {
    this.currentMonthlyTotal = currentMonthlyTotal;
    return this;
  }

  /**
   * Get currentMonthlyTotal
   * @return currentMonthlyTotal
   */
  
  @Schema(name = "currentMonthlyTotal", example = "22.12", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentMonthlyTotal")
  public Float getCurrentMonthlyTotal() {
    return currentMonthlyTotal;
  }

  public void setCurrentMonthlyTotal(Float currentMonthlyTotal) {
    this.currentMonthlyTotal = currentMonthlyTotal;
  }

  public ServicesResponse isTaxInclusive(Boolean isTaxInclusive) {
    this.isTaxInclusive = isTaxInclusive;
    return this;
  }

  /**
   * Get isTaxInclusive
   * @return isTaxInclusive
   */
  
  @Schema(name = "isTaxInclusive", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isTaxInclusive")
  public Boolean getIsTaxInclusive() {
    return isTaxInclusive;
  }

  public void setIsTaxInclusive(Boolean isTaxInclusive) {
    this.isTaxInclusive = isTaxInclusive;
  }

  public ServicesResponse maxFuturePurchaseDays(BigDecimal maxFuturePurchaseDays) {
    this.maxFuturePurchaseDays = maxFuturePurchaseDays;
    return this;
  }

  /**
   * max future purchase days for data passes
   * @return maxFuturePurchaseDays
   */
  @Valid 
  @Schema(name = "maxFuturePurchaseDays", example = "30.0", description = "max future purchase days for data passes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxFuturePurchaseDays")
  public BigDecimal getMaxFuturePurchaseDays() {
    return maxFuturePurchaseDays;
  }

  public void setMaxFuturePurchaseDays(BigDecimal maxFuturePurchaseDays) {
    this.maxFuturePurchaseDays = maxFuturePurchaseDays;
  }

  public ServicesResponse passLimitExceededCatList(List<String> passLimitExceededCatList) {
    this.passLimitExceededCatList = passLimitExceededCatList;
    return this;
  }

  public ServicesResponse addPassLimitExceededCatListItem(String passLimitExceededCatListItem) {
    if (this.passLimitExceededCatList == null) {
      this.passLimitExceededCatList = new ArrayList<>();
    }
    this.passLimitExceededCatList.add(passLimitExceededCatListItem);
    return this;
  }

  /**
   * Get passLimitExceededCatList
   * @return passLimitExceededCatList
   */
  
  @Schema(name = "passLimitExceededCatList", example = "[ON_NETWORK_TETHERING_ONLY]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("passLimitExceededCatList")
  public List<String> getPassLimitExceededCatList() {
    return passLimitExceededCatList;
  }

  public void setPassLimitExceededCatList(List<String> passLimitExceededCatList) {
    this.passLimitExceededCatList = passLimitExceededCatList;
  }

  public ServicesResponse internationalDataPassLimit(BigDecimal internationalDataPassLimit) {
    this.internationalDataPassLimit = internationalDataPassLimit;
    return this;
  }

  /**
   * max active international data passes allowed for a PAH at a time
   * @return internationalDataPassLimit
   */
  @Valid 
  @Schema(name = "internationalDataPassLimit", example = "10.0", description = "max active international data passes allowed for a PAH at a time", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("internationalDataPassLimit")
  public BigDecimal getInternationalDataPassLimit() {
    return internationalDataPassLimit;
  }

  public void setInternationalDataPassLimit(BigDecimal internationalDataPassLimit) {
    this.internationalDataPassLimit = internationalDataPassLimit;
  }

  public ServicesResponse currentDate(String currentDate) {
    this.currentDate = currentDate;
    return this;
  }

  /**
   * Get currentDate
   * @return currentDate
   */
  
  @Schema(name = "currentDate", example = "2024-08-22", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentDate")
  public String getCurrentDate() {
    return currentDate;
  }

  public void setCurrentDate(String currentDate) {
    this.currentDate = currentDate;
  }

  public ServicesResponse productType(String productType) {
    this.productType = productType;
    return this;
  }

  /**
   * Get productType
   * @return productType
   */
  
  @Schema(name = "productType", example = "GSM/MBB", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("productType")
  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public ServicesResponse currentServices(List<@Valid CurrentService> currentServices) {
    this.currentServices = currentServices;
    return this;
  }

  public ServicesResponse addCurrentServicesItem(CurrentService currentServicesItem) {
    if (this.currentServices == null) {
      this.currentServices = new ArrayList<>();
    }
    this.currentServices.add(currentServicesItem);
    return this;
  }

  /**
   * list of services on the account/subscriber
   * @return currentServices
   */
  @Valid 
  @Schema(name = "currentServices", description = "list of services on the account/subscriber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentServices")
  public List<@Valid CurrentService> getCurrentServices() {
    return currentServices;
  }

  public void setCurrentServices(List<@Valid CurrentService> currentServices) {
    this.currentServices = currentServices;
  }

  public ServicesResponse currentDataPasses(List<@Valid CurrentDataPass> currentDataPasses) {
    this.currentDataPasses = currentDataPasses;
    return this;
  }

  public ServicesResponse addCurrentDataPassesItem(CurrentDataPass currentDataPassesItem) {
    if (this.currentDataPasses == null) {
      this.currentDataPasses = new ArrayList<>();
    }
    this.currentDataPasses.add(currentDataPassesItem);
    return this;
  }

  /**
   * list of data passes on the subscriber
   * @return currentDataPasses
   */
  @Valid 
  @Schema(name = "currentDataPasses", description = "list of data passes on the subscriber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentDataPasses")
  public List<@Valid CurrentDataPass> getCurrentDataPasses() {
    return currentDataPasses;
  }

  public void setCurrentDataPasses(List<@Valid CurrentDataPass> currentDataPasses) {
    this.currentDataPasses = currentDataPasses;
  }

  public ServicesResponse activeSubscriptions(List<@Valid ActiveSubscription> activeSubscriptions) {
    this.activeSubscriptions = activeSubscriptions;
    return this;
  }

  public ServicesResponse addActiveSubscriptionsItem(ActiveSubscription activeSubscriptionsItem) {
    if (this.activeSubscriptions == null) {
      this.activeSubscriptions = new ArrayList<>();
    }
    this.activeSubscriptions.add(activeSubscriptionsItem);
    return this;
  }

  /**
   * list of active subscriptions on the account/subscriber
   * @return activeSubscriptions
   */
  @Valid 
  @Schema(name = "activeSubscriptions", description = "list of active subscriptions on the account/subscriber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activeSubscriptions")
  public List<@Valid ActiveSubscription> getActiveSubscriptions() {
    return activeSubscriptions;
  }

  public void setActiveSubscriptions(List<@Valid ActiveSubscription> activeSubscriptions) {
    this.activeSubscriptions = activeSubscriptions;
  }

  public ServicesResponse eligibleSubscriptions(List<@Valid Subscription> eligibleSubscriptions) {
    this.eligibleSubscriptions = eligibleSubscriptions;
    return this;
  }

  public ServicesResponse addEligibleSubscriptionsItem(Subscription eligibleSubscriptionsItem) {
    if (this.eligibleSubscriptions == null) {
      this.eligibleSubscriptions = new ArrayList<>();
    }
    this.eligibleSubscriptions.add(eligibleSubscriptionsItem);
    return this;
  }

  /**
   * list of eligible subscriptions for the account/subscriber including currently active subscriptions
   * @return eligibleSubscriptions
   */
  @Valid 
  @Schema(name = "eligibleSubscriptions", description = "list of eligible subscriptions for the account/subscriber including currently active subscriptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eligibleSubscriptions")
  public List<@Valid Subscription> getEligibleSubscriptions() {
    return eligibleSubscriptions;
  }

  public void setEligibleSubscriptions(List<@Valid Subscription> eligibleSubscriptions) {
    this.eligibleSubscriptions = eligibleSubscriptions;
  }

  public ServicesResponse planDataServices(List<@Valid PlanDataService> planDataServices) {
    this.planDataServices = planDataServices;
    return this;
  }

  public ServicesResponse addPlanDataServicesItem(PlanDataService planDataServicesItem) {
    if (this.planDataServices == null) {
      this.planDataServices = new ArrayList<>();
    }
    this.planDataServices.add(planDataServicesItem);
    return this;
  }

  /**
   * list of eligible plan data services
   * @return planDataServices
   */
  @Valid 
  @Schema(name = "planDataServices", description = "list of eligible plan data services", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("planDataServices")
  public List<@Valid PlanDataService> getPlanDataServices() {
    return planDataServices;
  }

  public void setPlanDataServices(List<@Valid PlanDataService> planDataServices) {
    this.planDataServices = planDataServices;
  }

  public ServicesResponse eligibleServices(List<@Valid Service> eligibleServices) {
    this.eligibleServices = eligibleServices;
    return this;
  }

  public ServicesResponse addEligibleServicesItem(Service eligibleServicesItem) {
    if (this.eligibleServices == null) {
      this.eligibleServices = new ArrayList<>();
    }
    this.eligibleServices.add(eligibleServicesItem);
    return this;
  }

  /**
   * list of eligible services for the account/subscriber including currently active subscriptions
   * @return eligibleServices
   */
  @Valid 
  @Schema(name = "eligibleServices", description = "list of eligible services for the account/subscriber including currently active subscriptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eligibleServices")
  public List<@Valid Service> getEligibleServices() {
    return eligibleServices;
  }

  public void setEligibleServices(List<@Valid Service> eligibleServices) {
    this.eligibleServices = eligibleServices;
  }

  public ServicesResponse eligibleDataPasses(List<@Valid DataPass> eligibleDataPasses) {
    this.eligibleDataPasses = eligibleDataPasses;
    return this;
  }

  public ServicesResponse addEligibleDataPassesItem(DataPass eligibleDataPassesItem) {
    if (this.eligibleDataPasses == null) {
      this.eligibleDataPasses = new ArrayList<>();
    }
    this.eligibleDataPasses.add(eligibleDataPassesItem);
    return this;
  }

  /**
   * list of eligible data passes for the subscriber
   * @return eligibleDataPasses
   */
  @Valid 
  @Schema(name = "eligibleDataPasses", description = "list of eligible data passes for the subscriber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eligibleDataPasses")
  public List<@Valid DataPass> getEligibleDataPasses() {
    return eligibleDataPasses;
  }

  public void setEligibleDataPasses(List<@Valid DataPass> eligibleDataPasses) {
    this.eligibleDataPasses = eligibleDataPasses;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServicesResponse servicesResponse = (ServicesResponse) o;
    return Objects.equals(this.isLineLevelSuspended, servicesResponse.isLineLevelSuspended) &&
        Objects.equals(this.isLineInvoluntarySuspended, servicesResponse.isLineInvoluntarySuspended) &&
        Objects.equals(this.isAccountLevelSuspended, servicesResponse.isAccountLevelSuspended) &&
        Objects.equals(this.isBanInvoluntarySuspended, servicesResponse.isBanInvoluntarySuspended) &&
        Objects.equals(this.banSuspensionDetails, servicesResponse.banSuspensionDetails) &&
        Objects.equals(this.isBanVoluntarySuspended, servicesResponse.isBanVoluntarySuspended) &&
        Objects.equals(this.hasPendingPlansServices, servicesResponse.hasPendingPlansServices) &&
        Objects.equals(this.hasPendingDatasService, servicesResponse.hasPendingDatasService) &&
        Objects.equals(this.currentMonthlyTotal, servicesResponse.currentMonthlyTotal) &&
        Objects.equals(this.isTaxInclusive, servicesResponse.isTaxInclusive) &&
        Objects.equals(this.maxFuturePurchaseDays, servicesResponse.maxFuturePurchaseDays) &&
        Objects.equals(this.passLimitExceededCatList, servicesResponse.passLimitExceededCatList) &&
        Objects.equals(this.internationalDataPassLimit, servicesResponse.internationalDataPassLimit) &&
        Objects.equals(this.currentDate, servicesResponse.currentDate) &&
        Objects.equals(this.productType, servicesResponse.productType) &&
        Objects.equals(this.currentServices, servicesResponse.currentServices) &&
        Objects.equals(this.currentDataPasses, servicesResponse.currentDataPasses) &&
        Objects.equals(this.activeSubscriptions, servicesResponse.activeSubscriptions) &&
        Objects.equals(this.eligibleSubscriptions, servicesResponse.eligibleSubscriptions) &&
        Objects.equals(this.planDataServices, servicesResponse.planDataServices) &&
        Objects.equals(this.eligibleServices, servicesResponse.eligibleServices) &&
        Objects.equals(this.eligibleDataPasses, servicesResponse.eligibleDataPasses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isLineLevelSuspended, isLineInvoluntarySuspended, isAccountLevelSuspended, isBanInvoluntarySuspended, banSuspensionDetails, isBanVoluntarySuspended, hasPendingPlansServices, hasPendingDatasService, currentMonthlyTotal, isTaxInclusive, maxFuturePurchaseDays, passLimitExceededCatList, internationalDataPassLimit, currentDate, productType, currentServices, currentDataPasses, activeSubscriptions, eligibleSubscriptions, planDataServices, eligibleServices, eligibleDataPasses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicesResponse {\n");
    sb.append("    isLineLevelSuspended: ").append(toIndentedString(isLineLevelSuspended)).append("\n");
    sb.append("    isLineInvoluntarySuspended: ").append(toIndentedString(isLineInvoluntarySuspended)).append("\n");
    sb.append("    isAccountLevelSuspended: ").append(toIndentedString(isAccountLevelSuspended)).append("\n");
    sb.append("    isBanInvoluntarySuspended: ").append(toIndentedString(isBanInvoluntarySuspended)).append("\n");
    sb.append("    banSuspensionDetails: ").append(toIndentedString(banSuspensionDetails)).append("\n");
    sb.append("    isBanVoluntarySuspended: ").append(toIndentedString(isBanVoluntarySuspended)).append("\n");
    sb.append("    hasPendingPlansServices: ").append(toIndentedString(hasPendingPlansServices)).append("\n");
    sb.append("    hasPendingDatasService: ").append(toIndentedString(hasPendingDatasService)).append("\n");
    sb.append("    currentMonthlyTotal: ").append(toIndentedString(currentMonthlyTotal)).append("\n");
    sb.append("    isTaxInclusive: ").append(toIndentedString(isTaxInclusive)).append("\n");
    sb.append("    maxFuturePurchaseDays: ").append(toIndentedString(maxFuturePurchaseDays)).append("\n");
    sb.append("    passLimitExceededCatList: ").append(toIndentedString(passLimitExceededCatList)).append("\n");
    sb.append("    internationalDataPassLimit: ").append(toIndentedString(internationalDataPassLimit)).append("\n");
    sb.append("    currentDate: ").append(toIndentedString(currentDate)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    currentServices: ").append(toIndentedString(currentServices)).append("\n");
    sb.append("    currentDataPasses: ").append(toIndentedString(currentDataPasses)).append("\n");
    sb.append("    activeSubscriptions: ").append(toIndentedString(activeSubscriptions)).append("\n");
    sb.append("    eligibleSubscriptions: ").append(toIndentedString(eligibleSubscriptions)).append("\n");
    sb.append("    planDataServices: ").append(toIndentedString(planDataServices)).append("\n");
    sb.append("    eligibleServices: ").append(toIndentedString(eligibleServices)).append("\n");
    sb.append("    eligibleDataPasses: ").append(toIndentedString(eligibleDataPasses)).append("\n");
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


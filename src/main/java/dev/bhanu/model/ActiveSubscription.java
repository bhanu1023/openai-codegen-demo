package dev.bhanu.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import dev.bhanu.model.PlanServiceDetails;
import dev.bhanu.model.SubscriptionPlan;
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
 * active subscription (selected by the user)
 */

@Schema(name = "ActiveSubscription", description = "active subscription (selected by the user)")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T01:19:46.548500+05:30[Asia/Kolkata]", comments = "Generator version: 7.9.0")
public class ActiveSubscription {

  private String name;

  private String soc;

  private Float price;

  private Float displayPrice;

  private String effectiveDate;

  private Boolean isPendingAddition;

  /**
   * Gets or Sets taxTreatment
   */
  public enum TaxTreatmentEnum {
    TI("TI"),
    
    TE("TE");

    private String value;

    TaxTreatmentEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TaxTreatmentEnum fromValue(String value) {
      for (TaxTreatmentEnum b : TaxTreatmentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TaxTreatmentEnum taxTreatment;

  private String shortDescription;

  private PlanServiceDetails planServiceDetails;

  private Boolean isActive;

  private Boolean isPartnerStatusApiFailure;

  private String partnerActivationUrl;

  private String subscriptionGroup;

  private String imageUrl;

  private String largeImageUrl;

  private String imageText;

  private String serviceSequenceNumber;

  @Valid
  private List<@Valid SubscriptionPlan> subscriptionPlans = new ArrayList<>();

  public ActiveSubscription name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", example = "Google One 500GB", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ActiveSubscription soc(String soc) {
    this.soc = soc;
    return this;
  }

  /**
   * Get soc
   * @return soc
   */
  
  @Schema(name = "soc", example = "500GBG1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("soc")
  public String getSoc() {
    return soc;
  }

  public void setSoc(String soc) {
    this.soc = soc;
  }

  public ActiveSubscription price(Float price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   */
  
  @Schema(name = "price", example = "5.99", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public ActiveSubscription displayPrice(Float displayPrice) {
    this.displayPrice = displayPrice;
    return this;
  }

  /**
   * Get displayPrice
   * @return displayPrice
   */
  
  @Schema(name = "displayPrice", example = "5.99", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayPrice")
  public Float getDisplayPrice() {
    return displayPrice;
  }

  public void setDisplayPrice(Float displayPrice) {
    this.displayPrice = displayPrice;
  }

  public ActiveSubscription effectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

  /**
   * Get effectiveDate
   * @return effectiveDate
   */
  
  @Schema(name = "effectiveDate", example = "2023-06-13", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("effectiveDate")
  public String getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public ActiveSubscription isPendingAddition(Boolean isPendingAddition) {
    this.isPendingAddition = isPendingAddition;
    return this;
  }

  /**
   * Get isPendingAddition
   * @return isPendingAddition
   */
  
  @Schema(name = "isPendingAddition", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isPendingAddition")
  public Boolean getIsPendingAddition() {
    return isPendingAddition;
  }

  public void setIsPendingAddition(Boolean isPendingAddition) {
    this.isPendingAddition = isPendingAddition;
  }

  public ActiveSubscription taxTreatment(TaxTreatmentEnum taxTreatment) {
    this.taxTreatment = taxTreatment;
    return this;
  }

  /**
   * Get taxTreatment
   * @return taxTreatment
   */
  
  @Schema(name = "taxTreatment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxTreatment")
  public TaxTreatmentEnum getTaxTreatment() {
    return taxTreatment;
  }

  public void setTaxTreatment(TaxTreatmentEnum taxTreatment) {
    this.taxTreatment = taxTreatment;
  }

  public ActiveSubscription shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

  /**
   * Get shortDescription
   * @return shortDescription
   */
  
  @Schema(name = "shortDescription", example = "Have you backed up your phone lately? Don’t wait till it’s too late. Hold onto each puppy pic and vacation moment with the Google One 500GB storage plan. Get the first 30 days free just for being a T-Mobile customer. After trial, pay $5/mo. Cancel anytime.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shortDescription")
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public ActiveSubscription planServiceDetails(PlanServiceDetails planServiceDetails) {
    this.planServiceDetails = planServiceDetails;
    return this;
  }

  /**
   * Get planServiceDetails
   * @return planServiceDetails
   */
  @Valid 
  @Schema(name = "planServiceDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("planServiceDetails")
  public PlanServiceDetails getPlanServiceDetails() {
    return planServiceDetails;
  }

  public void setPlanServiceDetails(PlanServiceDetails planServiceDetails) {
    this.planServiceDetails = planServiceDetails;
  }

  public ActiveSubscription isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Get isActive
   * @return isActive
   */
  
  @Schema(name = "isActive", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isActive")
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public ActiveSubscription isPartnerStatusApiFailure(Boolean isPartnerStatusApiFailure) {
    this.isPartnerStatusApiFailure = isPartnerStatusApiFailure;
    return this;
  }

  /**
   * Get isPartnerStatusApiFailure
   * @return isPartnerStatusApiFailure
   */
  
  @Schema(name = "isPartnerStatusApiFailure", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isPartnerStatusApiFailure")
  public Boolean getIsPartnerStatusApiFailure() {
    return isPartnerStatusApiFailure;
  }

  public void setIsPartnerStatusApiFailure(Boolean isPartnerStatusApiFailure) {
    this.isPartnerStatusApiFailure = isPartnerStatusApiFailure;
  }

  public ActiveSubscription partnerActivationUrl(String partnerActivationUrl) {
    this.partnerActivationUrl = partnerActivationUrl;
    return this;
  }

  /**
   * Get partnerActivationUrl
   * @return partnerActivationUrl
   */
  
  @Schema(name = "partnerActivationUrl", example = "https://www.netflix.com/partner/home?ptoken=abc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partnerActivationUrl")
  public String getPartnerActivationUrl() {
    return partnerActivationUrl;
  }

  public void setPartnerActivationUrl(String partnerActivationUrl) {
    this.partnerActivationUrl = partnerActivationUrl;
  }

  public ActiveSubscription subscriptionGroup(String subscriptionGroup) {
    this.subscriptionGroup = subscriptionGroup;
    return this;
  }

  /**
   * Get subscriptionGroup
   * @return subscriptionGroup
   */
  
  @Schema(name = "subscriptionGroup", example = "Netflix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subscriptionGroup")
  public String getSubscriptionGroup() {
    return subscriptionGroup;
  }

  public void setSubscriptionGroup(String subscriptionGroup) {
    this.subscriptionGroup = subscriptionGroup;
  }

  public ActiveSubscription imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Get imageUrl
   * @return imageUrl
   */
  
  @Schema(name = "imageUrl", example = "https://...", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("imageUrl")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public ActiveSubscription largeImageUrl(String largeImageUrl) {
    this.largeImageUrl = largeImageUrl;
    return this;
  }

  /**
   * Get largeImageUrl
   * @return largeImageUrl
   */
  
  @Schema(name = "largeImageUrl", example = "https://...", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("largeImageUrl")
  public String getLargeImageUrl() {
    return largeImageUrl;
  }

  public void setLargeImageUrl(String largeImageUrl) {
    this.largeImageUrl = largeImageUrl;
  }

  public ActiveSubscription imageText(String imageText) {
    this.imageText = imageText;
    return this;
  }

  /**
   * Get imageText
   * @return imageText
   */
  
  @Schema(name = "imageText", example = "Netflix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("imageText")
  public String getImageText() {
    return imageText;
  }

  public void setImageText(String imageText) {
    this.imageText = imageText;
  }

  public ActiveSubscription serviceSequenceNumber(String serviceSequenceNumber) {
    this.serviceSequenceNumber = serviceSequenceNumber;
    return this;
  }

  /**
   * Get serviceSequenceNumber
   * @return serviceSequenceNumber
   */
  
  @Schema(name = "serviceSequenceNumber", example = "404549875", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceSequenceNumber")
  public String getServiceSequenceNumber() {
    return serviceSequenceNumber;
  }

  public void setServiceSequenceNumber(String serviceSequenceNumber) {
    this.serviceSequenceNumber = serviceSequenceNumber;
  }

  public ActiveSubscription subscriptionPlans(List<@Valid SubscriptionPlan> subscriptionPlans) {
    this.subscriptionPlans = subscriptionPlans;
    return this;
  }

  public ActiveSubscription addSubscriptionPlansItem(SubscriptionPlan subscriptionPlansItem) {
    if (this.subscriptionPlans == null) {
      this.subscriptionPlans = new ArrayList<>();
    }
    this.subscriptionPlans.add(subscriptionPlansItem);
    return this;
  }

  /**
   * list of subscription plans in the group
   * @return subscriptionPlans
   */
  @Valid 
  @Schema(name = "subscriptionPlans", description = "list of subscription plans in the group", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subscriptionPlans")
  public List<@Valid SubscriptionPlan> getSubscriptionPlans() {
    return subscriptionPlans;
  }

  public void setSubscriptionPlans(List<@Valid SubscriptionPlan> subscriptionPlans) {
    this.subscriptionPlans = subscriptionPlans;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActiveSubscription activeSubscription = (ActiveSubscription) o;
    return Objects.equals(this.name, activeSubscription.name) &&
        Objects.equals(this.soc, activeSubscription.soc) &&
        Objects.equals(this.price, activeSubscription.price) &&
        Objects.equals(this.displayPrice, activeSubscription.displayPrice) &&
        Objects.equals(this.effectiveDate, activeSubscription.effectiveDate) &&
        Objects.equals(this.isPendingAddition, activeSubscription.isPendingAddition) &&
        Objects.equals(this.taxTreatment, activeSubscription.taxTreatment) &&
        Objects.equals(this.shortDescription, activeSubscription.shortDescription) &&
        Objects.equals(this.planServiceDetails, activeSubscription.planServiceDetails) &&
        Objects.equals(this.isActive, activeSubscription.isActive) &&
        Objects.equals(this.isPartnerStatusApiFailure, activeSubscription.isPartnerStatusApiFailure) &&
        Objects.equals(this.partnerActivationUrl, activeSubscription.partnerActivationUrl) &&
        Objects.equals(this.subscriptionGroup, activeSubscription.subscriptionGroup) &&
        Objects.equals(this.imageUrl, activeSubscription.imageUrl) &&
        Objects.equals(this.largeImageUrl, activeSubscription.largeImageUrl) &&
        Objects.equals(this.imageText, activeSubscription.imageText) &&
        Objects.equals(this.serviceSequenceNumber, activeSubscription.serviceSequenceNumber) &&
        Objects.equals(this.subscriptionPlans, activeSubscription.subscriptionPlans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, soc, price, displayPrice, effectiveDate, isPendingAddition, taxTreatment, shortDescription, planServiceDetails, isActive, isPartnerStatusApiFailure, partnerActivationUrl, subscriptionGroup, imageUrl, largeImageUrl, imageText, serviceSequenceNumber, subscriptionPlans);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActiveSubscription {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    soc: ").append(toIndentedString(soc)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    displayPrice: ").append(toIndentedString(displayPrice)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    isPendingAddition: ").append(toIndentedString(isPendingAddition)).append("\n");
    sb.append("    taxTreatment: ").append(toIndentedString(taxTreatment)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    planServiceDetails: ").append(toIndentedString(planServiceDetails)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isPartnerStatusApiFailure: ").append(toIndentedString(isPartnerStatusApiFailure)).append("\n");
    sb.append("    partnerActivationUrl: ").append(toIndentedString(partnerActivationUrl)).append("\n");
    sb.append("    subscriptionGroup: ").append(toIndentedString(subscriptionGroup)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    largeImageUrl: ").append(toIndentedString(largeImageUrl)).append("\n");
    sb.append("    imageText: ").append(toIndentedString(imageText)).append("\n");
    sb.append("    serviceSequenceNumber: ").append(toIndentedString(serviceSequenceNumber)).append("\n");
    sb.append("    subscriptionPlans: ").append(toIndentedString(subscriptionPlans)).append("\n");
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


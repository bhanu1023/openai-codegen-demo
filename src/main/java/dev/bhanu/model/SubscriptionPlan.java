package dev.bhanu.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import dev.bhanu.model.PlanServiceDetails;
import dev.bhanu.model.RelatedService;
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
 * subscription plan - selected by the user or available for selection
 */

@Schema(name = "SubscriptionPlan", description = "subscription plan - selected by the user or available for selection")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T01:48:13.122437+05:30[Asia/Kolkata]", comments = "Generator version: 7.9.0")
public class SubscriptionPlan {

  private String soc;

  private String name;

  private Float price;

  private Float displayPrice;

  private String serviceSubType;

  @Valid
  private List<String> subCategories = new ArrayList<>();

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

  private Boolean isActive;

  private String shortDescription;

  private PlanServiceDetails planServiceDetails;

  private Boolean isSelected;

  private String subscriptionGroup;

  /**
   * Gets or Sets level
   */
  public enum LevelEnum {
    PRODUCT("PRODUCT"),
    
    SUBSCRIBER("SUBSCRIBER");

    private String value;

    LevelEnum(String value) {
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
    public static LevelEnum fromValue(String value) {
      for (LevelEnum b : LevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private LevelEnum level;

  private String availabilityStatus;

  private String effectiveDate;

  private Boolean isPendingAddition;

  private Boolean isPendingRemoval;

  private Boolean isMandatory;

  @Valid
  private List<String> conflictingServiceList = new ArrayList<>();

  private String displayName;

  @Valid
  private List<String> prerequisiteServiceSocs = new ArrayList<>();

  private String freeTrialDescription;

  private String serviceTrialRemovalMessage;

  private String serviceRemovalInfo;

  private String partnerTermsAndConditionText;

  private String autoRenewalTermsAndConditionText;

  private String serviceDisclaimerMessage;

  private Boolean isRemovablePhp;

  @Valid
  private List<@Valid RelatedService> relatedServices = new ArrayList<>();

  private String serviceSequenceNumber;

  public SubscriptionPlan soc(String soc) {
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

  public SubscriptionPlan name(String name) {
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

  public SubscriptionPlan price(Float price) {
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

  public SubscriptionPlan displayPrice(Float displayPrice) {
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

  public SubscriptionPlan serviceSubType(String serviceSubType) {
    this.serviceSubType = serviceSubType;
    return this;
  }

  /**
   * Get serviceSubType
   * @return serviceSubType
   */
  
  @Schema(name = "serviceSubType", example = "Data Service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceSubType")
  public String getServiceSubType() {
    return serviceSubType;
  }

  public void setServiceSubType(String serviceSubType) {
    this.serviceSubType = serviceSubType;
  }

  public SubscriptionPlan subCategories(List<String> subCategories) {
    this.subCategories = subCategories;
    return this;
  }

  public SubscriptionPlan addSubCategoriesItem(String subCategoriesItem) {
    if (this.subCategories == null) {
      this.subCategories = new ArrayList<>();
    }
    this.subCategories.add(subCategoriesItem);
    return this;
  }

  /**
   * Get subCategories
   * @return subCategories
   */
  
  @Schema(name = "subCategories", example = "[Data Service]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subCategories")
  public List<String> getSubCategories() {
    return subCategories;
  }

  public void setSubCategories(List<String> subCategories) {
    this.subCategories = subCategories;
  }

  public SubscriptionPlan taxTreatment(TaxTreatmentEnum taxTreatment) {
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

  public SubscriptionPlan isActive(Boolean isActive) {
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

  public SubscriptionPlan shortDescription(String shortDescription) {
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

  public SubscriptionPlan planServiceDetails(PlanServiceDetails planServiceDetails) {
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

  public SubscriptionPlan isSelected(Boolean isSelected) {
    this.isSelected = isSelected;
    return this;
  }

  /**
   * Get isSelected
   * @return isSelected
   */
  
  @Schema(name = "isSelected", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isSelected")
  public Boolean getIsSelected() {
    return isSelected;
  }

  public void setIsSelected(Boolean isSelected) {
    this.isSelected = isSelected;
  }

  public SubscriptionPlan subscriptionGroup(String subscriptionGroup) {
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

  public SubscriptionPlan level(LevelEnum level) {
    this.level = level;
    return this;
  }

  /**
   * Get level
   * @return level
   */
  
  @Schema(name = "level", example = "PRODUCT (Plan level - applicable to all subscribers on the same plan)/SUBSCRIBER (Subscriber level)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("level")
  public LevelEnum getLevel() {
    return level;
  }

  public void setLevel(LevelEnum level) {
    this.level = level;
  }

  public SubscriptionPlan availabilityStatus(String availabilityStatus) {
    this.availabilityStatus = availabilityStatus;
    return this;
  }

  /**
   * Get availabilityStatus
   * @return availabilityStatus
   */
  
  @Schema(name = "availabilityStatus", example = "ForSale", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("availabilityStatus")
  public String getAvailabilityStatus() {
    return availabilityStatus;
  }

  public void setAvailabilityStatus(String availabilityStatus) {
    this.availabilityStatus = availabilityStatus;
  }

  public SubscriptionPlan effectiveDate(String effectiveDate) {
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

  public SubscriptionPlan isPendingAddition(Boolean isPendingAddition) {
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

  public SubscriptionPlan isPendingRemoval(Boolean isPendingRemoval) {
    this.isPendingRemoval = isPendingRemoval;
    return this;
  }

  /**
   * Get isPendingRemoval
   * @return isPendingRemoval
   */
  
  @Schema(name = "isPendingRemoval", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isPendingRemoval")
  public Boolean getIsPendingRemoval() {
    return isPendingRemoval;
  }

  public void setIsPendingRemoval(Boolean isPendingRemoval) {
    this.isPendingRemoval = isPendingRemoval;
  }

  public SubscriptionPlan isMandatory(Boolean isMandatory) {
    this.isMandatory = isMandatory;
    return this;
  }

  /**
   * Get isMandatory
   * @return isMandatory
   */
  
  @Schema(name = "isMandatory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isMandatory")
  public Boolean getIsMandatory() {
    return isMandatory;
  }

  public void setIsMandatory(Boolean isMandatory) {
    this.isMandatory = isMandatory;
  }

  public SubscriptionPlan conflictingServiceList(List<String> conflictingServiceList) {
    this.conflictingServiceList = conflictingServiceList;
    return this;
  }

  public SubscriptionPlan addConflictingServiceListItem(String conflictingServiceListItem) {
    if (this.conflictingServiceList == null) {
      this.conflictingServiceList = new ArrayList<>();
    }
    this.conflictingServiceList.add(conflictingServiceListItem);
    return this;
  }

  /**
   * Get conflictingServiceList
   * @return conflictingServiceList
   */
  
  @Schema(name = "conflictingServiceList", example = "[SOC1, SOC2]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conflictingServiceList")
  public List<String> getConflictingServiceList() {
    return conflictingServiceList;
  }

  public void setConflictingServiceList(List<String> conflictingServiceList) {
    this.conflictingServiceList = conflictingServiceList;
  }

  public SubscriptionPlan displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
   */
  
  @Schema(name = "displayName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public SubscriptionPlan prerequisiteServiceSocs(List<String> prerequisiteServiceSocs) {
    this.prerequisiteServiceSocs = prerequisiteServiceSocs;
    return this;
  }

  public SubscriptionPlan addPrerequisiteServiceSocsItem(String prerequisiteServiceSocsItem) {
    if (this.prerequisiteServiceSocs == null) {
      this.prerequisiteServiceSocs = new ArrayList<>();
    }
    this.prerequisiteServiceSocs.add(prerequisiteServiceSocsItem);
    return this;
  }

  /**
   * Get prerequisiteServiceSocs
   * @return prerequisiteServiceSocs
   */
  
  @Schema(name = "prerequisiteServiceSocs", example = "[HDPASS]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prerequisiteServiceSocs")
  public List<String> getPrerequisiteServiceSocs() {
    return prerequisiteServiceSocs;
  }

  public void setPrerequisiteServiceSocs(List<String> prerequisiteServiceSocs) {
    this.prerequisiteServiceSocs = prerequisiteServiceSocs;
  }

  public SubscriptionPlan freeTrialDescription(String freeTrialDescription) {
    this.freeTrialDescription = freeTrialDescription;
    return this;
  }

  /**
   * Get freeTrialDescription
   * @return freeTrialDescription
   */
  
  @Schema(name = "freeTrialDescription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("freeTrialDescription")
  public String getFreeTrialDescription() {
    return freeTrialDescription;
  }

  public void setFreeTrialDescription(String freeTrialDescription) {
    this.freeTrialDescription = freeTrialDescription;
  }

  public SubscriptionPlan serviceTrialRemovalMessage(String serviceTrialRemovalMessage) {
    this.serviceTrialRemovalMessage = serviceTrialRemovalMessage;
    return this;
  }

  /**
   * Get serviceTrialRemovalMessage
   * @return serviceTrialRemovalMessage
   */
  
  @Schema(name = "serviceTrialRemovalMessage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceTrialRemovalMessage")
  public String getServiceTrialRemovalMessage() {
    return serviceTrialRemovalMessage;
  }

  public void setServiceTrialRemovalMessage(String serviceTrialRemovalMessage) {
    this.serviceTrialRemovalMessage = serviceTrialRemovalMessage;
  }

  public SubscriptionPlan serviceRemovalInfo(String serviceRemovalInfo) {
    this.serviceRemovalInfo = serviceRemovalInfo;
    return this;
  }

  /**
   * Get serviceRemovalInfo
   * @return serviceRemovalInfo
   */
  
  @Schema(name = "serviceRemovalInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceRemovalInfo")
  public String getServiceRemovalInfo() {
    return serviceRemovalInfo;
  }

  public void setServiceRemovalInfo(String serviceRemovalInfo) {
    this.serviceRemovalInfo = serviceRemovalInfo;
  }

  public SubscriptionPlan partnerTermsAndConditionText(String partnerTermsAndConditionText) {
    this.partnerTermsAndConditionText = partnerTermsAndConditionText;
    return this;
  }

  /**
   * Get partnerTermsAndConditionText
   * @return partnerTermsAndConditionText
   */
  
  @Schema(name = "partnerTermsAndConditionText", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partnerTermsAndConditionText")
  public String getPartnerTermsAndConditionText() {
    return partnerTermsAndConditionText;
  }

  public void setPartnerTermsAndConditionText(String partnerTermsAndConditionText) {
    this.partnerTermsAndConditionText = partnerTermsAndConditionText;
  }

  public SubscriptionPlan autoRenewalTermsAndConditionText(String autoRenewalTermsAndConditionText) {
    this.autoRenewalTermsAndConditionText = autoRenewalTermsAndConditionText;
    return this;
  }

  /**
   * Get autoRenewalTermsAndConditionText
   * @return autoRenewalTermsAndConditionText
   */
  
  @Schema(name = "autoRenewalTermsAndConditionText", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("autoRenewalTermsAndConditionText")
  public String getAutoRenewalTermsAndConditionText() {
    return autoRenewalTermsAndConditionText;
  }

  public void setAutoRenewalTermsAndConditionText(String autoRenewalTermsAndConditionText) {
    this.autoRenewalTermsAndConditionText = autoRenewalTermsAndConditionText;
  }

  public SubscriptionPlan serviceDisclaimerMessage(String serviceDisclaimerMessage) {
    this.serviceDisclaimerMessage = serviceDisclaimerMessage;
    return this;
  }

  /**
   * Get serviceDisclaimerMessage
   * @return serviceDisclaimerMessage
   */
  
  @Schema(name = "serviceDisclaimerMessage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceDisclaimerMessage")
  public String getServiceDisclaimerMessage() {
    return serviceDisclaimerMessage;
  }

  public void setServiceDisclaimerMessage(String serviceDisclaimerMessage) {
    this.serviceDisclaimerMessage = serviceDisclaimerMessage;
  }

  public SubscriptionPlan isRemovablePhp(Boolean isRemovablePhp) {
    this.isRemovablePhp = isRemovablePhp;
    return this;
  }

  /**
   * Get isRemovablePhp
   * @return isRemovablePhp
   */
  
  @Schema(name = "isRemovablePhp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isRemovablePhp")
  public Boolean getIsRemovablePhp() {
    return isRemovablePhp;
  }

  public void setIsRemovablePhp(Boolean isRemovablePhp) {
    this.isRemovablePhp = isRemovablePhp;
  }

  public SubscriptionPlan relatedServices(List<@Valid RelatedService> relatedServices) {
    this.relatedServices = relatedServices;
    return this;
  }

  public SubscriptionPlan addRelatedServicesItem(RelatedService relatedServicesItem) {
    if (this.relatedServices == null) {
      this.relatedServices = new ArrayList<>();
    }
    this.relatedServices.add(relatedServicesItem);
    return this;
  }

  /**
   * Get relatedServices
   * @return relatedServices
   */
  @Valid 
  @Schema(name = "relatedServices", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relatedServices")
  public List<@Valid RelatedService> getRelatedServices() {
    return relatedServices;
  }

  public void setRelatedServices(List<@Valid RelatedService> relatedServices) {
    this.relatedServices = relatedServices;
  }

  public SubscriptionPlan serviceSequenceNumber(String serviceSequenceNumber) {
    this.serviceSequenceNumber = serviceSequenceNumber;
    return this;
  }

  /**
   * Get serviceSequenceNumber
   * @return serviceSequenceNumber
   */
  
  @Schema(name = "serviceSequenceNumber", example = "404549861", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceSequenceNumber")
  public String getServiceSequenceNumber() {
    return serviceSequenceNumber;
  }

  public void setServiceSequenceNumber(String serviceSequenceNumber) {
    this.serviceSequenceNumber = serviceSequenceNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionPlan subscriptionPlan = (SubscriptionPlan) o;
    return Objects.equals(this.soc, subscriptionPlan.soc) &&
        Objects.equals(this.name, subscriptionPlan.name) &&
        Objects.equals(this.price, subscriptionPlan.price) &&
        Objects.equals(this.displayPrice, subscriptionPlan.displayPrice) &&
        Objects.equals(this.serviceSubType, subscriptionPlan.serviceSubType) &&
        Objects.equals(this.subCategories, subscriptionPlan.subCategories) &&
        Objects.equals(this.taxTreatment, subscriptionPlan.taxTreatment) &&
        Objects.equals(this.isActive, subscriptionPlan.isActive) &&
        Objects.equals(this.shortDescription, subscriptionPlan.shortDescription) &&
        Objects.equals(this.planServiceDetails, subscriptionPlan.planServiceDetails) &&
        Objects.equals(this.isSelected, subscriptionPlan.isSelected) &&
        Objects.equals(this.subscriptionGroup, subscriptionPlan.subscriptionGroup) &&
        Objects.equals(this.level, subscriptionPlan.level) &&
        Objects.equals(this.availabilityStatus, subscriptionPlan.availabilityStatus) &&
        Objects.equals(this.effectiveDate, subscriptionPlan.effectiveDate) &&
        Objects.equals(this.isPendingAddition, subscriptionPlan.isPendingAddition) &&
        Objects.equals(this.isPendingRemoval, subscriptionPlan.isPendingRemoval) &&
        Objects.equals(this.isMandatory, subscriptionPlan.isMandatory) &&
        Objects.equals(this.conflictingServiceList, subscriptionPlan.conflictingServiceList) &&
        Objects.equals(this.displayName, subscriptionPlan.displayName) &&
        Objects.equals(this.prerequisiteServiceSocs, subscriptionPlan.prerequisiteServiceSocs) &&
        Objects.equals(this.freeTrialDescription, subscriptionPlan.freeTrialDescription) &&
        Objects.equals(this.serviceTrialRemovalMessage, subscriptionPlan.serviceTrialRemovalMessage) &&
        Objects.equals(this.serviceRemovalInfo, subscriptionPlan.serviceRemovalInfo) &&
        Objects.equals(this.partnerTermsAndConditionText, subscriptionPlan.partnerTermsAndConditionText) &&
        Objects.equals(this.autoRenewalTermsAndConditionText, subscriptionPlan.autoRenewalTermsAndConditionText) &&
        Objects.equals(this.serviceDisclaimerMessage, subscriptionPlan.serviceDisclaimerMessage) &&
        Objects.equals(this.isRemovablePhp, subscriptionPlan.isRemovablePhp) &&
        Objects.equals(this.relatedServices, subscriptionPlan.relatedServices) &&
        Objects.equals(this.serviceSequenceNumber, subscriptionPlan.serviceSequenceNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(soc, name, price, displayPrice, serviceSubType, subCategories, taxTreatment, isActive, shortDescription, planServiceDetails, isSelected, subscriptionGroup, level, availabilityStatus, effectiveDate, isPendingAddition, isPendingRemoval, isMandatory, conflictingServiceList, displayName, prerequisiteServiceSocs, freeTrialDescription, serviceTrialRemovalMessage, serviceRemovalInfo, partnerTermsAndConditionText, autoRenewalTermsAndConditionText, serviceDisclaimerMessage, isRemovablePhp, relatedServices, serviceSequenceNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionPlan {\n");
    sb.append("    soc: ").append(toIndentedString(soc)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    displayPrice: ").append(toIndentedString(displayPrice)).append("\n");
    sb.append("    serviceSubType: ").append(toIndentedString(serviceSubType)).append("\n");
    sb.append("    subCategories: ").append(toIndentedString(subCategories)).append("\n");
    sb.append("    taxTreatment: ").append(toIndentedString(taxTreatment)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    planServiceDetails: ").append(toIndentedString(planServiceDetails)).append("\n");
    sb.append("    isSelected: ").append(toIndentedString(isSelected)).append("\n");
    sb.append("    subscriptionGroup: ").append(toIndentedString(subscriptionGroup)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    availabilityStatus: ").append(toIndentedString(availabilityStatus)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    isPendingAddition: ").append(toIndentedString(isPendingAddition)).append("\n");
    sb.append("    isPendingRemoval: ").append(toIndentedString(isPendingRemoval)).append("\n");
    sb.append("    isMandatory: ").append(toIndentedString(isMandatory)).append("\n");
    sb.append("    conflictingServiceList: ").append(toIndentedString(conflictingServiceList)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    prerequisiteServiceSocs: ").append(toIndentedString(prerequisiteServiceSocs)).append("\n");
    sb.append("    freeTrialDescription: ").append(toIndentedString(freeTrialDescription)).append("\n");
    sb.append("    serviceTrialRemovalMessage: ").append(toIndentedString(serviceTrialRemovalMessage)).append("\n");
    sb.append("    serviceRemovalInfo: ").append(toIndentedString(serviceRemovalInfo)).append("\n");
    sb.append("    partnerTermsAndConditionText: ").append(toIndentedString(partnerTermsAndConditionText)).append("\n");
    sb.append("    autoRenewalTermsAndConditionText: ").append(toIndentedString(autoRenewalTermsAndConditionText)).append("\n");
    sb.append("    serviceDisclaimerMessage: ").append(toIndentedString(serviceDisclaimerMessage)).append("\n");
    sb.append("    isRemovablePhp: ").append(toIndentedString(isRemovablePhp)).append("\n");
    sb.append("    relatedServices: ").append(toIndentedString(relatedServices)).append("\n");
    sb.append("    serviceSequenceNumber: ").append(toIndentedString(serviceSequenceNumber)).append("\n");
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


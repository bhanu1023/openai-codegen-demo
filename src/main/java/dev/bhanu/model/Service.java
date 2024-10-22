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
 * services a customer has or can buy
 */

@Schema(name = "Service", description = "services a customer has or can buy")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T01:19:46.548500+05:30[Asia/Kolkata]", comments = "Generator version: 7.9.0")
public class Service {

  private String soc;

  private String name;

  private Float price;

  private Float displayPrice;

  private String serviceSubType;

  @Valid
  private List<String> subCategories = new ArrayList<>();

  private Boolean isShared;

  private Boolean isSelected;

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

  private Boolean isMandatory;

  @Valid
  private List<String> conflictingServiceList = new ArrayList<>();

  private String displayName;

  private PlanServiceDetails planServiceDetails;

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

  private String effectiveDate;

  private Boolean isPendingAddition;

  private Boolean isPendingRemoval;

  private String pendingChangeEffectiveDate;

  @Valid
  private List<String> platforms = new ArrayList<>();

  @Valid
  private List<String> prerequisiteServiceSocs = new ArrayList<>();

  private String shortDescription;

  private String availabilityStatus;

  private String socConfig;

  private String freeTrialDescription;

  private String serviceTrialRemovalMessage;

  private String serviceRemovalInfo;

  private String partnerTermsAndConditionText;

  private String autoRenewalTermsAndConditionText;

  private String serviceDisclaimerMessage;

  private Boolean isRemovablePhp;

  @Valid
  private List<@Valid RelatedService> relatedServices = new ArrayList<>();

  public Service soc(String soc) {
    this.soc = soc;
    return this;
  }

  /**
   * Get soc
   * @return soc
   */
  
  @Schema(name = "soc", example = "BMMSS", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("soc")
  public String getSoc() {
    return soc;
  }

  public void setSoc(String soc) {
    this.soc = soc;
  }

  public Service name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", example = "Block Chargeable Text and Picture Messages", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Service price(Float price) {
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

  public Service displayPrice(Float displayPrice) {
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

  public Service serviceSubType(String serviceSubType) {
    this.serviceSubType = serviceSubType;
    return this;
  }

  /**
   * Get serviceSubType
   * @return serviceSubType
   */
  
  @Schema(name = "serviceSubType", example = "BLOCKING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceSubType")
  public String getServiceSubType() {
    return serviceSubType;
  }

  public void setServiceSubType(String serviceSubType) {
    this.serviceSubType = serviceSubType;
  }

  public Service subCategories(List<String> subCategories) {
    this.subCategories = subCategories;
    return this;
  }

  public Service addSubCategoriesItem(String subCategoriesItem) {
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
  
  @Schema(name = "subCategories", example = "[Block Messages]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subCategories")
  public List<String> getSubCategories() {
    return subCategories;
  }

  public void setSubCategories(List<String> subCategories) {
    this.subCategories = subCategories;
  }

  public Service isShared(Boolean isShared) {
    this.isShared = isShared;
    return this;
  }

  /**
   * Get isShared
   * @return isShared
   */
  
  @Schema(name = "isShared", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isShared")
  public Boolean getIsShared() {
    return isShared;
  }

  public void setIsShared(Boolean isShared) {
    this.isShared = isShared;
  }

  public Service isSelected(Boolean isSelected) {
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

  public Service level(LevelEnum level) {
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

  public Service isMandatory(Boolean isMandatory) {
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

  public Service conflictingServiceList(List<String> conflictingServiceList) {
    this.conflictingServiceList = conflictingServiceList;
    return this;
  }

  public Service addConflictingServiceListItem(String conflictingServiceListItem) {
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

  public Service displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
   */
  
  @Schema(name = "displayName", example = "Unlimited Promo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Service planServiceDetails(PlanServiceDetails planServiceDetails) {
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

  public Service taxTreatment(TaxTreatmentEnum taxTreatment) {
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

  public Service effectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

  /**
   * Get effectiveDate
   * @return effectiveDate
   */
  
  @Schema(name = "effectiveDate", example = "2024-09-14", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("effectiveDate")
  public String getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public Service isPendingAddition(Boolean isPendingAddition) {
    this.isPendingAddition = isPendingAddition;
    return this;
  }

  /**
   * Get isPendingAddition
   * @return isPendingAddition
   */
  
  @Schema(name = "isPendingAddition", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isPendingAddition")
  public Boolean getIsPendingAddition() {
    return isPendingAddition;
  }

  public void setIsPendingAddition(Boolean isPendingAddition) {
    this.isPendingAddition = isPendingAddition;
  }

  public Service isPendingRemoval(Boolean isPendingRemoval) {
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

  public Service pendingChangeEffectiveDate(String pendingChangeEffectiveDate) {
    this.pendingChangeEffectiveDate = pendingChangeEffectiveDate;
    return this;
  }

  /**
   * Get pendingChangeEffectiveDate
   * @return pendingChangeEffectiveDate
   */
  
  @Schema(name = "pendingChangeEffectiveDate", example = "2024-09-14", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pendingChangeEffectiveDate")
  public String getPendingChangeEffectiveDate() {
    return pendingChangeEffectiveDate;
  }

  public void setPendingChangeEffectiveDate(String pendingChangeEffectiveDate) {
    this.pendingChangeEffectiveDate = pendingChangeEffectiveDate;
  }

  public Service platforms(List<String> platforms) {
    this.platforms = platforms;
    return this;
  }

  public Service addPlatformsItem(String platformsItem) {
    if (this.platforms == null) {
      this.platforms = new ArrayList<>();
    }
    this.platforms.add(platformsItem);
    return this;
  }

  /**
   * Get platforms
   * @return platforms
   */
  
  @Schema(name = "platforms", example = "[iOS, Windows, Android]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("platforms")
  public List<String> getPlatforms() {
    return platforms;
  }

  public void setPlatforms(List<String> platforms) {
    this.platforms = platforms;
  }

  public Service prerequisiteServiceSocs(List<String> prerequisiteServiceSocs) {
    this.prerequisiteServiceSocs = prerequisiteServiceSocs;
    return this;
  }

  public Service addPrerequisiteServiceSocsItem(String prerequisiteServiceSocsItem) {
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

  public Service shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

  /**
   * Get shortDescription
   * @return shortDescription
   */
  
  @Schema(name = "shortDescription", example = "MAXUp Data with 40GB of Hotspot Data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shortDescription")
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public Service availabilityStatus(String availabilityStatus) {
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

  public Service socConfig(String socConfig) {
    this.socConfig = socConfig;
    return this;
  }

  /**
   * Get socConfig
   * @return socConfig
   */
  
  @Schema(name = "socConfig", example = "For Sale/Non-removable SOC. Non-removable SOC implies this service is not removable if it was added previously.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("socConfig")
  public String getSocConfig() {
    return socConfig;
  }

  public void setSocConfig(String socConfig) {
    this.socConfig = socConfig;
  }

  public Service freeTrialDescription(String freeTrialDescription) {
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

  public Service serviceTrialRemovalMessage(String serviceTrialRemovalMessage) {
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

  public Service serviceRemovalInfo(String serviceRemovalInfo) {
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

  public Service partnerTermsAndConditionText(String partnerTermsAndConditionText) {
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

  public Service autoRenewalTermsAndConditionText(String autoRenewalTermsAndConditionText) {
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

  public Service serviceDisclaimerMessage(String serviceDisclaimerMessage) {
    this.serviceDisclaimerMessage = serviceDisclaimerMessage;
    return this;
  }

  /**
   * Get serviceDisclaimerMessage
   * @return serviceDisclaimerMessage
   */
  
  @Schema(name = "serviceDisclaimerMessage", example = "404549855", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceDisclaimerMessage")
  public String getServiceDisclaimerMessage() {
    return serviceDisclaimerMessage;
  }

  public void setServiceDisclaimerMessage(String serviceDisclaimerMessage) {
    this.serviceDisclaimerMessage = serviceDisclaimerMessage;
  }

  public Service isRemovablePhp(Boolean isRemovablePhp) {
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

  public Service relatedServices(List<@Valid RelatedService> relatedServices) {
    this.relatedServices = relatedServices;
    return this;
  }

  public Service addRelatedServicesItem(RelatedService relatedServicesItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Service service = (Service) o;
    return Objects.equals(this.soc, service.soc) &&
        Objects.equals(this.name, service.name) &&
        Objects.equals(this.price, service.price) &&
        Objects.equals(this.displayPrice, service.displayPrice) &&
        Objects.equals(this.serviceSubType, service.serviceSubType) &&
        Objects.equals(this.subCategories, service.subCategories) &&
        Objects.equals(this.isShared, service.isShared) &&
        Objects.equals(this.isSelected, service.isSelected) &&
        Objects.equals(this.level, service.level) &&
        Objects.equals(this.isMandatory, service.isMandatory) &&
        Objects.equals(this.conflictingServiceList, service.conflictingServiceList) &&
        Objects.equals(this.displayName, service.displayName) &&
        Objects.equals(this.planServiceDetails, service.planServiceDetails) &&
        Objects.equals(this.taxTreatment, service.taxTreatment) &&
        Objects.equals(this.effectiveDate, service.effectiveDate) &&
        Objects.equals(this.isPendingAddition, service.isPendingAddition) &&
        Objects.equals(this.isPendingRemoval, service.isPendingRemoval) &&
        Objects.equals(this.pendingChangeEffectiveDate, service.pendingChangeEffectiveDate) &&
        Objects.equals(this.platforms, service.platforms) &&
        Objects.equals(this.prerequisiteServiceSocs, service.prerequisiteServiceSocs) &&
        Objects.equals(this.shortDescription, service.shortDescription) &&
        Objects.equals(this.availabilityStatus, service.availabilityStatus) &&
        Objects.equals(this.socConfig, service.socConfig) &&
        Objects.equals(this.freeTrialDescription, service.freeTrialDescription) &&
        Objects.equals(this.serviceTrialRemovalMessage, service.serviceTrialRemovalMessage) &&
        Objects.equals(this.serviceRemovalInfo, service.serviceRemovalInfo) &&
        Objects.equals(this.partnerTermsAndConditionText, service.partnerTermsAndConditionText) &&
        Objects.equals(this.autoRenewalTermsAndConditionText, service.autoRenewalTermsAndConditionText) &&
        Objects.equals(this.serviceDisclaimerMessage, service.serviceDisclaimerMessage) &&
        Objects.equals(this.isRemovablePhp, service.isRemovablePhp) &&
        Objects.equals(this.relatedServices, service.relatedServices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(soc, name, price, displayPrice, serviceSubType, subCategories, isShared, isSelected, level, isMandatory, conflictingServiceList, displayName, planServiceDetails, taxTreatment, effectiveDate, isPendingAddition, isPendingRemoval, pendingChangeEffectiveDate, platforms, prerequisiteServiceSocs, shortDescription, availabilityStatus, socConfig, freeTrialDescription, serviceTrialRemovalMessage, serviceRemovalInfo, partnerTermsAndConditionText, autoRenewalTermsAndConditionText, serviceDisclaimerMessage, isRemovablePhp, relatedServices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    sb.append("    soc: ").append(toIndentedString(soc)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    displayPrice: ").append(toIndentedString(displayPrice)).append("\n");
    sb.append("    serviceSubType: ").append(toIndentedString(serviceSubType)).append("\n");
    sb.append("    subCategories: ").append(toIndentedString(subCategories)).append("\n");
    sb.append("    isShared: ").append(toIndentedString(isShared)).append("\n");
    sb.append("    isSelected: ").append(toIndentedString(isSelected)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    isMandatory: ").append(toIndentedString(isMandatory)).append("\n");
    sb.append("    conflictingServiceList: ").append(toIndentedString(conflictingServiceList)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    planServiceDetails: ").append(toIndentedString(planServiceDetails)).append("\n");
    sb.append("    taxTreatment: ").append(toIndentedString(taxTreatment)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    isPendingAddition: ").append(toIndentedString(isPendingAddition)).append("\n");
    sb.append("    isPendingRemoval: ").append(toIndentedString(isPendingRemoval)).append("\n");
    sb.append("    pendingChangeEffectiveDate: ").append(toIndentedString(pendingChangeEffectiveDate)).append("\n");
    sb.append("    platforms: ").append(toIndentedString(platforms)).append("\n");
    sb.append("    prerequisiteServiceSocs: ").append(toIndentedString(prerequisiteServiceSocs)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    availabilityStatus: ").append(toIndentedString(availabilityStatus)).append("\n");
    sb.append("    socConfig: ").append(toIndentedString(socConfig)).append("\n");
    sb.append("    freeTrialDescription: ").append(toIndentedString(freeTrialDescription)).append("\n");
    sb.append("    serviceTrialRemovalMessage: ").append(toIndentedString(serviceTrialRemovalMessage)).append("\n");
    sb.append("    serviceRemovalInfo: ").append(toIndentedString(serviceRemovalInfo)).append("\n");
    sb.append("    partnerTermsAndConditionText: ").append(toIndentedString(partnerTermsAndConditionText)).append("\n");
    sb.append("    autoRenewalTermsAndConditionText: ").append(toIndentedString(autoRenewalTermsAndConditionText)).append("\n");
    sb.append("    serviceDisclaimerMessage: ").append(toIndentedString(serviceDisclaimerMessage)).append("\n");
    sb.append("    isRemovablePhp: ").append(toIndentedString(isRemovablePhp)).append("\n");
    sb.append("    relatedServices: ").append(toIndentedString(relatedServices)).append("\n");
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


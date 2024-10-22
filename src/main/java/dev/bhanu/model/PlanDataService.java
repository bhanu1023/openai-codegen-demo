package dev.bhanu.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import dev.bhanu.model.PlanServiceDetails;
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
 * data services available with a plan
 */

@Schema(name = "PlanDataService", description = "data services available with a plan")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T01:19:46.548500+05:30[Asia/Kolkata]", comments = "Generator version: 7.9.0")
public class PlanDataService {

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

  private String socConfig;

  private String serviceSequenceNumber;

  public PlanDataService soc(String soc) {
    this.soc = soc;
    return this;
  }

  /**
   * Get soc
   * @return soc
   */
  
  @Schema(name = "soc", example = "MPUDAT40", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("soc")
  public String getSoc() {
    return soc;
  }

  public void setSoc(String soc) {
    this.soc = soc;
  }

  public PlanDataService name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", example = "MAXUp Data with 40GB of Hotspot Data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PlanDataService price(Float price) {
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

  public PlanDataService displayPrice(Float displayPrice) {
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

  public PlanDataService serviceSubType(String serviceSubType) {
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

  public PlanDataService subCategories(List<String> subCategories) {
    this.subCategories = subCategories;
    return this;
  }

  public PlanDataService addSubCategoriesItem(String subCategoriesItem) {
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

  public PlanDataService isShared(Boolean isShared) {
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

  public PlanDataService isSelected(Boolean isSelected) {
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

  public PlanDataService level(LevelEnum level) {
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

  public PlanDataService isMandatory(Boolean isMandatory) {
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

  public PlanDataService conflictingServiceList(List<String> conflictingServiceList) {
    this.conflictingServiceList = conflictingServiceList;
    return this;
  }

  public PlanDataService addConflictingServiceListItem(String conflictingServiceListItem) {
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

  public PlanDataService displayName(String displayName) {
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

  public PlanDataService planServiceDetails(PlanServiceDetails planServiceDetails) {
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

  public PlanDataService taxTreatment(TaxTreatmentEnum taxTreatment) {
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

  public PlanDataService effectiveDate(String effectiveDate) {
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

  public PlanDataService isPendingAddition(Boolean isPendingAddition) {
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

  public PlanDataService isPendingRemoval(Boolean isPendingRemoval) {
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

  public PlanDataService pendingChangeEffectiveDate(String pendingChangeEffectiveDate) {
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

  public PlanDataService platforms(List<String> platforms) {
    this.platforms = platforms;
    return this;
  }

  public PlanDataService addPlatformsItem(String platformsItem) {
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

  public PlanDataService prerequisiteServiceSocs(List<String> prerequisiteServiceSocs) {
    this.prerequisiteServiceSocs = prerequisiteServiceSocs;
    return this;
  }

  public PlanDataService addPrerequisiteServiceSocsItem(String prerequisiteServiceSocsItem) {
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

  public PlanDataService shortDescription(String shortDescription) {
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

  public PlanDataService socConfig(String socConfig) {
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

  public PlanDataService serviceSequenceNumber(String serviceSequenceNumber) {
    this.serviceSequenceNumber = serviceSequenceNumber;
    return this;
  }

  /**
   * Get serviceSequenceNumber
   * @return serviceSequenceNumber
   */
  
  @Schema(name = "serviceSequenceNumber", example = "404549855", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    PlanDataService planDataService = (PlanDataService) o;
    return Objects.equals(this.soc, planDataService.soc) &&
        Objects.equals(this.name, planDataService.name) &&
        Objects.equals(this.price, planDataService.price) &&
        Objects.equals(this.displayPrice, planDataService.displayPrice) &&
        Objects.equals(this.serviceSubType, planDataService.serviceSubType) &&
        Objects.equals(this.subCategories, planDataService.subCategories) &&
        Objects.equals(this.isShared, planDataService.isShared) &&
        Objects.equals(this.isSelected, planDataService.isSelected) &&
        Objects.equals(this.level, planDataService.level) &&
        Objects.equals(this.isMandatory, planDataService.isMandatory) &&
        Objects.equals(this.conflictingServiceList, planDataService.conflictingServiceList) &&
        Objects.equals(this.displayName, planDataService.displayName) &&
        Objects.equals(this.planServiceDetails, planDataService.planServiceDetails) &&
        Objects.equals(this.taxTreatment, planDataService.taxTreatment) &&
        Objects.equals(this.effectiveDate, planDataService.effectiveDate) &&
        Objects.equals(this.isPendingAddition, planDataService.isPendingAddition) &&
        Objects.equals(this.isPendingRemoval, planDataService.isPendingRemoval) &&
        Objects.equals(this.pendingChangeEffectiveDate, planDataService.pendingChangeEffectiveDate) &&
        Objects.equals(this.platforms, planDataService.platforms) &&
        Objects.equals(this.prerequisiteServiceSocs, planDataService.prerequisiteServiceSocs) &&
        Objects.equals(this.shortDescription, planDataService.shortDescription) &&
        Objects.equals(this.socConfig, planDataService.socConfig) &&
        Objects.equals(this.serviceSequenceNumber, planDataService.serviceSequenceNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(soc, name, price, displayPrice, serviceSubType, subCategories, isShared, isSelected, level, isMandatory, conflictingServiceList, displayName, planServiceDetails, taxTreatment, effectiveDate, isPendingAddition, isPendingRemoval, pendingChangeEffectiveDate, platforms, prerequisiteServiceSocs, shortDescription, socConfig, serviceSequenceNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanDataService {\n");
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
    sb.append("    socConfig: ").append(toIndentedString(socConfig)).append("\n");
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


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
 * Service details
 */

@Schema(name = "RemovedSocsData", description = "Service details")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T01:48:13.122437+05:30[Asia/Kolkata]", comments = "Generator version: 7.9.0")
public class RemovedSocsData {

  private String soc;

  private String socName;

  private String serviceSubType;

  @Valid
  private List<String> subCategory = new ArrayList<>();

  private Float price;

  private Float displayPrice;

  private String taxTreatment;

  @Valid
  private List<String> conflictingService = new ArrayList<>();

  private String pendingChangeEffectiveDate;

  @Valid
  private List<String> effectiveDateTypes = new ArrayList<>();

  public RemovedSocsData soc(String soc) {
    this.soc = soc;
    return this;
  }

  /**
   * Get soc
   * @return soc
   */
  
  @Schema(name = "soc", example = "CMVTTBV", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("soc")
  public String getSoc() {
    return soc;
  }

  public void setSoc(String soc) {
    this.soc = soc;
  }

  public RemovedSocsData socName(String socName) {
    this.socName = socName;
    return this;
  }

  /**
   * Get socName
   * @return socName
   */
  
  @Schema(name = "socName", example = "Scam Shield™ Premium", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("socName")
  public String getSocName() {
    return socName;
  }

  public void setSocName(String socName) {
    this.socName = socName;
  }

  public RemovedSocsData serviceSubType(String serviceSubType) {
    this.serviceSubType = serviceSubType;
    return this;
  }

  /**
   * Get serviceSubType
   * @return serviceSubType
   */
  
  @Schema(name = "serviceSubType", example = "Value Added Service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceSubType")
  public String getServiceSubType() {
    return serviceSubType;
  }

  public void setServiceSubType(String serviceSubType) {
    this.serviceSubType = serviceSubType;
  }

  public RemovedSocsData subCategory(List<String> subCategory) {
    this.subCategory = subCategory;
    return this;
  }

  public RemovedSocsData addSubCategoryItem(String subCategoryItem) {
    if (this.subCategory == null) {
      this.subCategory = new ArrayList<>();
    }
    this.subCategory.add(subCategoryItem);
    return this;
  }

  /**
   * Get subCategory
   * @return subCategory
   */
  
  @Schema(name = "subCategory", example = "[Caller ID & VMTT]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subCategory")
  public List<String> getSubCategory() {
    return subCategory;
  }

  public void setSubCategory(List<String> subCategory) {
    this.subCategory = subCategory;
  }

  public RemovedSocsData price(Float price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   */
  
  @Schema(name = "price", example = "4.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public RemovedSocsData displayPrice(Float displayPrice) {
    this.displayPrice = displayPrice;
    return this;
  }

  /**
   * Get displayPrice
   * @return displayPrice
   */
  
  @Schema(name = "displayPrice", example = "4.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayPrice")
  public Float getDisplayPrice() {
    return displayPrice;
  }

  public void setDisplayPrice(Float displayPrice) {
    this.displayPrice = displayPrice;
  }

  public RemovedSocsData taxTreatment(String taxTreatment) {
    this.taxTreatment = taxTreatment;
    return this;
  }

  /**
   * Get taxTreatment
   * @return taxTreatment
   */
  
  @Schema(name = "taxTreatment", example = "TE", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxTreatment")
  public String getTaxTreatment() {
    return taxTreatment;
  }

  public void setTaxTreatment(String taxTreatment) {
    this.taxTreatment = taxTreatment;
  }

  public RemovedSocsData conflictingService(List<String> conflictingService) {
    this.conflictingService = conflictingService;
    return this;
  }

  public RemovedSocsData addConflictingServiceItem(String conflictingServiceItem) {
    if (this.conflictingService == null) {
      this.conflictingService = new ArrayList<>();
    }
    this.conflictingService.add(conflictingServiceItem);
    return this;
  }

  /**
   * If a conflicting SOC is present, the user must select the same date as the one chosen for the added SOC by default.
   * @return conflictingService
   */
  
  @Schema(name = "conflictingService", example = "[BTMXP50GB]", description = "If a conflicting SOC is present, the user must select the same date as the one chosen for the added SOC by default.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conflictingService")
  public List<String> getConflictingService() {
    return conflictingService;
  }

  public void setConflictingService(List<String> conflictingService) {
    this.conflictingService = conflictingService;
  }

  public RemovedSocsData pendingChangeEffectiveDate(String pendingChangeEffectiveDate) {
    this.pendingChangeEffectiveDate = pendingChangeEffectiveDate;
    return this;
  }

  /**
   * If it is a future Dated soc removal for trail subscriptions, if this feild comes in response than you have to use the date in this feild for effectiveDate removal for that particular soc.
   * @return pendingChangeEffectiveDate
   */
  
  @Schema(name = "pendingChangeEffectiveDate", example = "2020-03-20", description = "If it is a future Dated soc removal for trail subscriptions, if this feild comes in response than you have to use the date in this feild for effectiveDate removal for that particular soc.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pendingChangeEffectiveDate")
  public String getPendingChangeEffectiveDate() {
    return pendingChangeEffectiveDate;
  }

  public void setPendingChangeEffectiveDate(String pendingChangeEffectiveDate) {
    this.pendingChangeEffectiveDate = pendingChangeEffectiveDate;
  }

  public RemovedSocsData effectiveDateTypes(List<String> effectiveDateTypes) {
    this.effectiveDateTypes = effectiveDateTypes;
    return this;
  }

  public RemovedSocsData addEffectiveDateTypesItem(String effectiveDateTypesItem) {
    if (this.effectiveDateTypes == null) {
      this.effectiveDateTypes = new ArrayList<>();
    }
    this.effectiveDateTypes.add(effectiveDateTypesItem);
    return this;
  }

  /**
   * If there are no conflicting soc and not a trail soc, use this feild
   * @return effectiveDateTypes
   */
  
  @Schema(name = "effectiveDateTypes", example = "[CURRENT_BILLING_CYCLE, NEXT_BILLING_CYCLE, IMMEDIATELY]", description = "If there are no conflicting soc and not a trail soc, use this feild", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("effectiveDateTypes")
  public List<String> getEffectiveDateTypes() {
    return effectiveDateTypes;
  }

  public void setEffectiveDateTypes(List<String> effectiveDateTypes) {
    this.effectiveDateTypes = effectiveDateTypes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemovedSocsData removedSocsData = (RemovedSocsData) o;
    return Objects.equals(this.soc, removedSocsData.soc) &&
        Objects.equals(this.socName, removedSocsData.socName) &&
        Objects.equals(this.serviceSubType, removedSocsData.serviceSubType) &&
        Objects.equals(this.subCategory, removedSocsData.subCategory) &&
        Objects.equals(this.price, removedSocsData.price) &&
        Objects.equals(this.displayPrice, removedSocsData.displayPrice) &&
        Objects.equals(this.taxTreatment, removedSocsData.taxTreatment) &&
        Objects.equals(this.conflictingService, removedSocsData.conflictingService) &&
        Objects.equals(this.pendingChangeEffectiveDate, removedSocsData.pendingChangeEffectiveDate) &&
        Objects.equals(this.effectiveDateTypes, removedSocsData.effectiveDateTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(soc, socName, serviceSubType, subCategory, price, displayPrice, taxTreatment, conflictingService, pendingChangeEffectiveDate, effectiveDateTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemovedSocsData {\n");
    sb.append("    soc: ").append(toIndentedString(soc)).append("\n");
    sb.append("    socName: ").append(toIndentedString(socName)).append("\n");
    sb.append("    serviceSubType: ").append(toIndentedString(serviceSubType)).append("\n");
    sb.append("    subCategory: ").append(toIndentedString(subCategory)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    displayPrice: ").append(toIndentedString(displayPrice)).append("\n");
    sb.append("    taxTreatment: ").append(toIndentedString(taxTreatment)).append("\n");
    sb.append("    conflictingService: ").append(toIndentedString(conflictingService)).append("\n");
    sb.append("    pendingChangeEffectiveDate: ").append(toIndentedString(pendingChangeEffectiveDate)).append("\n");
    sb.append("    effectiveDateTypes: ").append(toIndentedString(effectiveDateTypes)).append("\n");
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


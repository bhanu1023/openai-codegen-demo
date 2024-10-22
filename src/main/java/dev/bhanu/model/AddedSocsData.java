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

@Schema(name = "AddedSocsData", description = "Service details")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T01:19:46.548500+05:30[Asia/Kolkata]", comments = "Generator version: 7.9.0")
public class AddedSocsData {

  private String soc;

  private String socName;

  private String serviceSubType;

  @Valid
  private List<String> subCategory = new ArrayList<>();

  private String dataPassGroup;

  private Float price;

  private Float displayPrice;

  private String taxTreatment;

  private String socChangeLevel;

  private String partnerName;

  private Integer maxDateRangeLimit;

  @Valid
  private List<String> effectiveDateTypes = new ArrayList<>();

  public AddedSocsData soc(String soc) {
    this.soc = soc;
    return this;
  }

  /**
   * Get soc
   * @return soc
   */
  
  @Schema(name = "soc", example = "BTMXP50GB", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("soc")
  public String getSoc() {
    return soc;
  }

  public void setSoc(String soc) {
    this.soc = soc;
  }

  public AddedSocsData socName(String socName) {
    this.socName = socName;
    return this;
  }

  /**
   * Get socName
   * @return socName
   */
  
  @Schema(name = "socName", example = "Go5G PlusUp w/50GB Hotspot", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("socName")
  public String getSocName() {
    return socName;
  }

  public void setSocName(String socName) {
    this.socName = socName;
  }

  public AddedSocsData serviceSubType(String serviceSubType) {
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

  public AddedSocsData subCategory(List<String> subCategory) {
    this.subCategory = subCategory;
    return this;
  }

  public AddedSocsData addSubCategoryItem(String subCategoryItem) {
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
  
  @Schema(name = "subCategory", example = "[Data Service]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subCategory")
  public List<String> getSubCategory() {
    return subCategory;
  }

  public void setSubCategory(List<String> subCategory) {
    this.subCategory = subCategory;
  }

  public AddedSocsData dataPassGroup(String dataPassGroup) {
    this.dataPassGroup = dataPassGroup;
    return this;
  }

  /**
   * Get dataPassGroup
   * @return dataPassGroup
   */
  
  @Schema(name = "dataPassGroup", example = "INTERNATIONAL_ROAMING_DATA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataPassGroup")
  public String getDataPassGroup() {
    return dataPassGroup;
  }

  public void setDataPassGroup(String dataPassGroup) {
    this.dataPassGroup = dataPassGroup;
  }

  public AddedSocsData price(Float price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   */
  
  @Schema(name = "price", example = "9.99", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public AddedSocsData displayPrice(Float displayPrice) {
    this.displayPrice = displayPrice;
    return this;
  }

  /**
   * Get displayPrice
   * @return displayPrice
   */
  
  @Schema(name = "displayPrice", example = "14.99", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayPrice")
  public Float getDisplayPrice() {
    return displayPrice;
  }

  public void setDisplayPrice(Float displayPrice) {
    this.displayPrice = displayPrice;
  }

  public AddedSocsData taxTreatment(String taxTreatment) {
    this.taxTreatment = taxTreatment;
    return this;
  }

  /**
   * Get taxTreatment
   * @return taxTreatment
   */
  
  @Schema(name = "taxTreatment", example = "TI", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxTreatment")
  public String getTaxTreatment() {
    return taxTreatment;
  }

  public void setTaxTreatment(String taxTreatment) {
    this.taxTreatment = taxTreatment;
  }

  public AddedSocsData socChangeLevel(String socChangeLevel) {
    this.socChangeLevel = socChangeLevel;
    return this;
  }

  /**
   * If Monthly data plan changed this feild will determine soc change level
   * @return socChangeLevel
   */
  
  @Schema(name = "socChangeLevel", example = "UPGRADE", description = "If Monthly data plan changed this feild will determine soc change level", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("socChangeLevel")
  public String getSocChangeLevel() {
    return socChangeLevel;
  }

  public void setSocChangeLevel(String socChangeLevel) {
    this.socChangeLevel = socChangeLevel;
  }

  public AddedSocsData partnerName(String partnerName) {
    this.partnerName = partnerName;
    return this;
  }

  /**
   * This feild will come when there are partner benefits like netflix, hulu, apple, paramount
   * @return partnerName
   */
  
  @Schema(name = "partnerName", example = "APPLE", description = "This feild will come when there are partner benefits like netflix, hulu, apple, paramount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partnerName")
  public String getPartnerName() {
    return partnerName;
  }

  public void setPartnerName(String partnerName) {
    this.partnerName = partnerName;
  }

  public AddedSocsData maxDateRangeLimit(Integer maxDateRangeLimit) {
    this.maxDateRangeLimit = maxDateRangeLimit;
    return this;
  }

  /**
   * When this field is present, it applies to one-time data passes, prompting the user to either select immediately or choose a date using the date picker.
   * @return maxDateRangeLimit
   */
  
  @Schema(name = "maxDateRangeLimit", example = "30", description = "When this field is present, it applies to one-time data passes, prompting the user to either select immediately or choose a date using the date picker.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxDateRangeLimit")
  public Integer getMaxDateRangeLimit() {
    return maxDateRangeLimit;
  }

  public void setMaxDateRangeLimit(Integer maxDateRangeLimit) {
    this.maxDateRangeLimit = maxDateRangeLimit;
  }

  public AddedSocsData effectiveDateTypes(List<String> effectiveDateTypes) {
    this.effectiveDateTypes = effectiveDateTypes;
    return this;
  }

  public AddedSocsData addEffectiveDateTypesItem(String effectiveDateTypesItem) {
    if (this.effectiveDateTypes == null) {
      this.effectiveDateTypes = new ArrayList<>();
    }
    this.effectiveDateTypes.add(effectiveDateTypesItem);
    return this;
  }

  /**
   * Get effectiveDateTypes
   * @return effectiveDateTypes
   */
  
  @Schema(name = "effectiveDateTypes", example = "[CURRENT_BILLING_CYCLE, NEXT_BILLING_CYCLE, IMMEDIATELY, DATE_PICKER]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    AddedSocsData addedSocsData = (AddedSocsData) o;
    return Objects.equals(this.soc, addedSocsData.soc) &&
        Objects.equals(this.socName, addedSocsData.socName) &&
        Objects.equals(this.serviceSubType, addedSocsData.serviceSubType) &&
        Objects.equals(this.subCategory, addedSocsData.subCategory) &&
        Objects.equals(this.dataPassGroup, addedSocsData.dataPassGroup) &&
        Objects.equals(this.price, addedSocsData.price) &&
        Objects.equals(this.displayPrice, addedSocsData.displayPrice) &&
        Objects.equals(this.taxTreatment, addedSocsData.taxTreatment) &&
        Objects.equals(this.socChangeLevel, addedSocsData.socChangeLevel) &&
        Objects.equals(this.partnerName, addedSocsData.partnerName) &&
        Objects.equals(this.maxDateRangeLimit, addedSocsData.maxDateRangeLimit) &&
        Objects.equals(this.effectiveDateTypes, addedSocsData.effectiveDateTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(soc, socName, serviceSubType, subCategory, dataPassGroup, price, displayPrice, taxTreatment, socChangeLevel, partnerName, maxDateRangeLimit, effectiveDateTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddedSocsData {\n");
    sb.append("    soc: ").append(toIndentedString(soc)).append("\n");
    sb.append("    socName: ").append(toIndentedString(socName)).append("\n");
    sb.append("    serviceSubType: ").append(toIndentedString(serviceSubType)).append("\n");
    sb.append("    subCategory: ").append(toIndentedString(subCategory)).append("\n");
    sb.append("    dataPassGroup: ").append(toIndentedString(dataPassGroup)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    displayPrice: ").append(toIndentedString(displayPrice)).append("\n");
    sb.append("    taxTreatment: ").append(toIndentedString(taxTreatment)).append("\n");
    sb.append("    socChangeLevel: ").append(toIndentedString(socChangeLevel)).append("\n");
    sb.append("    partnerName: ").append(toIndentedString(partnerName)).append("\n");
    sb.append("    maxDateRangeLimit: ").append(toIndentedString(maxDateRangeLimit)).append("\n");
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


package dev.bhanu.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import dev.bhanu.model.PlanServiceDetails;
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

@Schema(name = "CurrentService", description = "Service details")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T01:19:46.548500+05:30[Asia/Kolkata]", comments = "Generator version: 7.9.0")
public class CurrentService {

  private String name;

  private String soc;

  private String shortDescription;

  private PlanServiceDetails planServiceDetails;

  private Float price;

  private Float displayPrice;

  /**
   * Gets or Sets planServiceStatus
   */
  public enum PlanServiceStatusEnum {
    REMOVED("REMOVED"),
    
    CURRENT("CURRENT"),
    
    FUTURE_DATED("FUTURE_DATED");

    private String value;

    PlanServiceStatusEnum(String value) {
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
    public static PlanServiceStatusEnum fromValue(String value) {
      for (PlanServiceStatusEnum b : PlanServiceStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private PlanServiceStatusEnum planServiceStatus;

  private String productType;

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

  private String effectiveDate;

  private String expirationDate;

  private String serviceSequenceNumber;

  public CurrentService name(String name) {
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

  public CurrentService soc(String soc) {
    this.soc = soc;
    return this;
  }

  /**
   * Get soc
   * @return soc
   */
  
  @Schema(name = "soc", example = "MGDATA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("soc")
  public String getSoc() {
    return soc;
  }

  public void setSoc(String soc) {
    this.soc = soc;
  }

  public CurrentService shortDescription(String shortDescription) {
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

  public CurrentService planServiceDetails(PlanServiceDetails planServiceDetails) {
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

  public CurrentService price(Float price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   */
  
  @Schema(name = "price", example = "10.15", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public CurrentService displayPrice(Float displayPrice) {
    this.displayPrice = displayPrice;
    return this;
  }

  /**
   * Get displayPrice
   * @return displayPrice
   */
  
  @Schema(name = "displayPrice", example = "10.15", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayPrice")
  public Float getDisplayPrice() {
    return displayPrice;
  }

  public void setDisplayPrice(Float displayPrice) {
    this.displayPrice = displayPrice;
  }

  public CurrentService planServiceStatus(PlanServiceStatusEnum planServiceStatus) {
    this.planServiceStatus = planServiceStatus;
    return this;
  }

  /**
   * Get planServiceStatus
   * @return planServiceStatus
   */
  
  @Schema(name = "planServiceStatus", example = "REMOVED/CURRENT/FUTURE_DATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("planServiceStatus")
  public PlanServiceStatusEnum getPlanServiceStatus() {
    return planServiceStatus;
  }

  public void setPlanServiceStatus(PlanServiceStatusEnum planServiceStatus) {
    this.planServiceStatus = planServiceStatus;
  }

  public CurrentService productType(String productType) {
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

  public CurrentService level(LevelEnum level) {
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

  public CurrentService effectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

  /**
   * Get effectiveDate
   * @return effectiveDate
   */
  
  @Schema(name = "effectiveDate", example = "2021-07-30", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("effectiveDate")
  public String getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public CurrentService expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Get expirationDate
   * @return expirationDate
   */
  
  @Schema(name = "expirationDate", example = "2024-09-14", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expirationDate")
  public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }

  public CurrentService serviceSequenceNumber(String serviceSequenceNumber) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentService currentService = (CurrentService) o;
    return Objects.equals(this.name, currentService.name) &&
        Objects.equals(this.soc, currentService.soc) &&
        Objects.equals(this.shortDescription, currentService.shortDescription) &&
        Objects.equals(this.planServiceDetails, currentService.planServiceDetails) &&
        Objects.equals(this.price, currentService.price) &&
        Objects.equals(this.displayPrice, currentService.displayPrice) &&
        Objects.equals(this.planServiceStatus, currentService.planServiceStatus) &&
        Objects.equals(this.productType, currentService.productType) &&
        Objects.equals(this.level, currentService.level) &&
        Objects.equals(this.effectiveDate, currentService.effectiveDate) &&
        Objects.equals(this.expirationDate, currentService.expirationDate) &&
        Objects.equals(this.serviceSequenceNumber, currentService.serviceSequenceNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, soc, shortDescription, planServiceDetails, price, displayPrice, planServiceStatus, productType, level, effectiveDate, expirationDate, serviceSequenceNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentService {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    soc: ").append(toIndentedString(soc)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    planServiceDetails: ").append(toIndentedString(planServiceDetails)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    displayPrice: ").append(toIndentedString(displayPrice)).append("\n");
    sb.append("    planServiceStatus: ").append(toIndentedString(planServiceStatus)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
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


package dev.bhanu.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details for a data pass currently on the subscription
 */

@Schema(name = "CurrentDataPass", description = "Details for a data pass currently on the subscription")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T01:19:46.548500+05:30[Asia/Kolkata]", comments = "Generator version: 7.9.0")
public class CurrentDataPass {

  private String name;

  private String soc;

  private String dataPassGroup;

  private Float price;

  private Float limit;

  private String unit;

  private Float usage;

  private String beginDate;

  private String beginTime;

  /**
   * Gets or Sets expirationStatus
   */
  public enum ExpirationStatusEnum {
    UPCOMING("UPCOMING"),
    
    ACTIVE("ACTIVE"),
    
    EXPIRES_SOON("EXPIRES_SOON");

    private String value;

    ExpirationStatusEnum(String value) {
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
    public static ExpirationStatusEnum fromValue(String value) {
      for (ExpirationStatusEnum b : ExpirationStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ExpirationStatusEnum expirationStatus;

  private String expiryDate;

  private String expiryTime;

  private String serviceSequenceNumber;

  public CurrentDataPass name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", example = "1 Day (512MB) International Data Pass", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CurrentDataPass soc(String soc) {
    this.soc = soc;
    return this;
  }

  /**
   * Get soc
   * @return soc
   */
  
  @Schema(name = "soc", example = "INTL24NA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("soc")
  public String getSoc() {
    return soc;
  }

  public void setSoc(String soc) {
    this.soc = soc;
  }

  public CurrentDataPass dataPassGroup(String dataPassGroup) {
    this.dataPassGroup = dataPassGroup;
    return this;
  }

  /**
   * Get dataPassGroup
   * @return dataPassGroup
   */
  
  @Schema(name = "dataPassGroup", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataPassGroup")
  public String getDataPassGroup() {
    return dataPassGroup;
  }

  public void setDataPassGroup(String dataPassGroup) {
    this.dataPassGroup = dataPassGroup;
  }

  public CurrentDataPass price(Float price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   */
  
  @Schema(name = "price", example = "5.15", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public CurrentDataPass limit(Float limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Get limit
   * @return limit
   */
  
  @Schema(name = "limit", example = "15360.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("limit")
  public Float getLimit() {
    return limit;
  }

  public void setLimit(Float limit) {
    this.limit = limit;
  }

  public CurrentDataPass unit(String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Get unit
   * @return unit
   */
  
  @Schema(name = "unit", example = "MB/GB", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unit")
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public CurrentDataPass usage(Float usage) {
    this.usage = usage;
    return this;
  }

  /**
   * Get usage
   * @return usage
   */
  
  @Schema(name = "usage", example = "15.3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usage")
  public Float getUsage() {
    return usage;
  }

  public void setUsage(Float usage) {
    this.usage = usage;
  }

  public CurrentDataPass beginDate(String beginDate) {
    this.beginDate = beginDate;
    return this;
  }

  /**
   * Get beginDate
   * @return beginDate
   */
  
  @Schema(name = "beginDate", example = "2024-08-30", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("beginDate")
  public String getBeginDate() {
    return beginDate;
  }

  public void setBeginDate(String beginDate) {
    this.beginDate = beginDate;
  }

  public CurrentDataPass beginTime(String beginTime) {
    this.beginTime = beginTime;
    return this;
  }

  /**
   * Get beginTime
   * @return beginTime
   */
  
  @Schema(name = "beginTime", example = "10:08 AM PT", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("beginTime")
  public String getBeginTime() {
    return beginTime;
  }

  public void setBeginTime(String beginTime) {
    this.beginTime = beginTime;
  }

  public CurrentDataPass expirationStatus(ExpirationStatusEnum expirationStatus) {
    this.expirationStatus = expirationStatus;
    return this;
  }

  /**
   * Get expirationStatus
   * @return expirationStatus
   */
  
  @Schema(name = "expirationStatus", example = "UPCOMING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expirationStatus")
  public ExpirationStatusEnum getExpirationStatus() {
    return expirationStatus;
  }

  public void setExpirationStatus(ExpirationStatusEnum expirationStatus) {
    this.expirationStatus = expirationStatus;
  }

  public CurrentDataPass expiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

  /**
   * Get expiryDate
   * @return expiryDate
   */
  
  @Schema(name = "expiryDate", example = "2024-08-31", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expiryDate")
  public String getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }

  public CurrentDataPass expiryTime(String expiryTime) {
    this.expiryTime = expiryTime;
    return this;
  }

  /**
   * Get expiryTime
   * @return expiryTime
   */
  
  @Schema(name = "expiryTime", example = "10:08 AM PT", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expiryTime")
  public String getExpiryTime() {
    return expiryTime;
  }

  public void setExpiryTime(String expiryTime) {
    this.expiryTime = expiryTime;
  }

  public CurrentDataPass serviceSequenceNumber(String serviceSequenceNumber) {
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
    CurrentDataPass currentDataPass = (CurrentDataPass) o;
    return Objects.equals(this.name, currentDataPass.name) &&
        Objects.equals(this.soc, currentDataPass.soc) &&
        Objects.equals(this.dataPassGroup, currentDataPass.dataPassGroup) &&
        Objects.equals(this.price, currentDataPass.price) &&
        Objects.equals(this.limit, currentDataPass.limit) &&
        Objects.equals(this.unit, currentDataPass.unit) &&
        Objects.equals(this.usage, currentDataPass.usage) &&
        Objects.equals(this.beginDate, currentDataPass.beginDate) &&
        Objects.equals(this.beginTime, currentDataPass.beginTime) &&
        Objects.equals(this.expirationStatus, currentDataPass.expirationStatus) &&
        Objects.equals(this.expiryDate, currentDataPass.expiryDate) &&
        Objects.equals(this.expiryTime, currentDataPass.expiryTime) &&
        Objects.equals(this.serviceSequenceNumber, currentDataPass.serviceSequenceNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, soc, dataPassGroup, price, limit, unit, usage, beginDate, beginTime, expirationStatus, expiryDate, expiryTime, serviceSequenceNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentDataPass {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    soc: ").append(toIndentedString(soc)).append("\n");
    sb.append("    dataPassGroup: ").append(toIndentedString(dataPassGroup)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
    sb.append("    expirationStatus: ").append(toIndentedString(expirationStatus)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    expiryTime: ").append(toIndentedString(expiryTime)).append("\n");
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


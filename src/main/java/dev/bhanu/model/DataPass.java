package dev.bhanu.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * data pass info
 */

@Schema(name = "DataPass", description = "data pass info")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T01:19:46.548500+05:30[Asia/Kolkata]", comments = "Generator version: 7.9.0")
public class DataPass {

  private String name;

  private String soc;

  private String dataPassGroup;

  @Valid
  private List<String> conflictingServiceList = new ArrayList<>();

  private Float price;

  private Float limit;

  /**
   * Gets or Sets unit
   */
  public enum UnitEnum {
    MB("MB"),
    
    GB("GB"),
    
    TB("TB");

    private String value;

    UnitEnum(String value) {
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
    public static UnitEnum fromValue(String value) {
      for (UnitEnum b : UnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private UnitEnum unit;

  /**
   * Gets or Sets durationUnit
   */
  public enum DurationUnitEnum {
    HOURS("HOURS"),
    
    DAYS("DAYS"),
    
    MONTHS("MONTHS"),
    
    YEARS("YEARS");

    private String value;

    DurationUnitEnum(String value) {
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
    public static DurationUnitEnum fromValue(String value) {
      for (DurationUnitEnum b : DurationUnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private DurationUnitEnum durationUnit;

  private Float duration;

  private String description;

  private String selectedDataPassEffectiveDate;

  private Boolean isImmediateFlag;

  public DataPass name(String name) {
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

  public DataPass soc(String soc) {
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

  public DataPass dataPassGroup(String dataPassGroup) {
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

  public DataPass conflictingServiceList(List<String> conflictingServiceList) {
    this.conflictingServiceList = conflictingServiceList;
    return this;
  }

  public DataPass addConflictingServiceListItem(String conflictingServiceListItem) {
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

  public DataPass price(Float price) {
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

  public DataPass limit(Float limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Get limit
   * @return limit
   */
  
  @Schema(name = "limit", example = "512.99", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("limit")
  public Float getLimit() {
    return limit;
  }

  public void setLimit(Float limit) {
    this.limit = limit;
  }

  public DataPass unit(UnitEnum unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Get unit
   * @return unit
   */
  
  @Schema(name = "unit", example = "GB", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unit")
  public UnitEnum getUnit() {
    return unit;
  }

  public void setUnit(UnitEnum unit) {
    this.unit = unit;
  }

  public DataPass durationUnit(DurationUnitEnum durationUnit) {
    this.durationUnit = durationUnit;
    return this;
  }

  /**
   * Get durationUnit
   * @return durationUnit
   */
  
  @Schema(name = "durationUnit", example = "HOURS", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("durationUnit")
  public DurationUnitEnum getDurationUnit() {
    return durationUnit;
  }

  public void setDurationUnit(DurationUnitEnum durationUnit) {
    this.durationUnit = durationUnit;
  }

  public DataPass duration(Float duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
   */
  
  @Schema(name = "duration", example = "24.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("duration")
  public Float getDuration() {
    return duration;
  }

  public void setDuration(Float duration) {
    this.duration = duration;
  }

  public DataPass description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  
  @Schema(name = "description", example = "For up to 24 hours in 215+ destinations, you get: <ul><li>Up to 512MB of high-speed international data, this data can also be used as a Mobile Hotspot.</li><li>Unlimited calling. </li></ul>Note: Once you use all your high-speed data, you will continue to have unlimited calling and data for the full 24 hours but may experience slower data speeds. If you use all your high-speed data and purchase a NEW pass before the expiration of the first one, your second pass will begin immediately. Your original pass and any remaining benefits will expire when you activate the new pass. Speeds & coverage vary based on device and country. Qualifying plan required.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DataPass selectedDataPassEffectiveDate(String selectedDataPassEffectiveDate) {
    this.selectedDataPassEffectiveDate = selectedDataPassEffectiveDate;
    return this;
  }

  /**
   * Get selectedDataPassEffectiveDate
   * @return selectedDataPassEffectiveDate
   */
  
  @Schema(name = "selectedDataPassEffectiveDate", example = "2024-08-22T15:57:48.000-07:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("selectedDataPassEffectiveDate")
  public String getSelectedDataPassEffectiveDate() {
    return selectedDataPassEffectiveDate;
  }

  public void setSelectedDataPassEffectiveDate(String selectedDataPassEffectiveDate) {
    this.selectedDataPassEffectiveDate = selectedDataPassEffectiveDate;
  }

  public DataPass isImmediateFlag(Boolean isImmediateFlag) {
    this.isImmediateFlag = isImmediateFlag;
    return this;
  }

  /**
   * Get isImmediateFlag
   * @return isImmediateFlag
   */
  
  @Schema(name = "isImmediateFlag", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isImmediateFlag")
  public Boolean getIsImmediateFlag() {
    return isImmediateFlag;
  }

  public void setIsImmediateFlag(Boolean isImmediateFlag) {
    this.isImmediateFlag = isImmediateFlag;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataPass dataPass = (DataPass) o;
    return Objects.equals(this.name, dataPass.name) &&
        Objects.equals(this.soc, dataPass.soc) &&
        Objects.equals(this.dataPassGroup, dataPass.dataPassGroup) &&
        Objects.equals(this.conflictingServiceList, dataPass.conflictingServiceList) &&
        Objects.equals(this.price, dataPass.price) &&
        Objects.equals(this.limit, dataPass.limit) &&
        Objects.equals(this.unit, dataPass.unit) &&
        Objects.equals(this.durationUnit, dataPass.durationUnit) &&
        Objects.equals(this.duration, dataPass.duration) &&
        Objects.equals(this.description, dataPass.description) &&
        Objects.equals(this.selectedDataPassEffectiveDate, dataPass.selectedDataPassEffectiveDate) &&
        Objects.equals(this.isImmediateFlag, dataPass.isImmediateFlag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, soc, dataPassGroup, conflictingServiceList, price, limit, unit, durationUnit, duration, description, selectedDataPassEffectiveDate, isImmediateFlag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataPass {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    soc: ").append(toIndentedString(soc)).append("\n");
    sb.append("    dataPassGroup: ").append(toIndentedString(dataPassGroup)).append("\n");
    sb.append("    conflictingServiceList: ").append(toIndentedString(conflictingServiceList)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    durationUnit: ").append(toIndentedString(durationUnit)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    selectedDataPassEffectiveDate: ").append(toIndentedString(selectedDataPassEffectiveDate)).append("\n");
    sb.append("    isImmediateFlag: ").append(toIndentedString(isImmediateFlag)).append("\n");
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


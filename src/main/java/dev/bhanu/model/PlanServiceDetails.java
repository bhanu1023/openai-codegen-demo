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
 * PlanServiceDetails
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T01:19:46.548500+05:30[Asia/Kolkata]", comments = "Generator version: 7.9.0")
public class PlanServiceDetails {

  private String description;

  @Valid
  private List<String> features = new ArrayList<>();

  @Valid
  private List<String> includedServices = new ArrayList<>();

  public PlanServiceDetails description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  
  @Schema(name = "description", example = "With MAXUp Data you get 40GB total of high-speed mobile hotspot data. After that, you get unlimited mobile hotspot on our network at max 3G speeds. On-device usage is prioritized over tethering usage, which may result in higher speeds for data used on device.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PlanServiceDetails features(List<String> features) {
    this.features = features;
    return this;
  }

  public PlanServiceDetails addFeaturesItem(String featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<>();
    }
    this.features.add(featuresItem);
    return this;
  }

  /**
   * Get features
   * @return features
   */
  
  @Schema(name = "features", example = "[feature1, feature 2]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("features")
  public List<String> getFeatures() {
    return features;
  }

  public void setFeatures(List<String> features) {
    this.features = features;
  }

  public PlanServiceDetails includedServices(List<String> includedServices) {
    this.includedServices = includedServices;
    return this;
  }

  public PlanServiceDetails addIncludedServicesItem(String includedServicesItem) {
    if (this.includedServices == null) {
      this.includedServices = new ArrayList<>();
    }
    this.includedServices.add(includedServicesItem);
    return this;
  }

  /**
   * Get includedServices
   * @return includedServices
   */
  
  @Schema(name = "includedServices", example = "[included service 1, included service 2]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("includedServices")
  public List<String> getIncludedServices() {
    return includedServices;
  }

  public void setIncludedServices(List<String> includedServices) {
    this.includedServices = includedServices;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanServiceDetails planServiceDetails = (PlanServiceDetails) o;
    return Objects.equals(this.description, planServiceDetails.description) &&
        Objects.equals(this.features, planServiceDetails.features) &&
        Objects.equals(this.includedServices, planServiceDetails.includedServices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, features, includedServices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanServiceDetails {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    includedServices: ").append(toIndentedString(includedServices)).append("\n");
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


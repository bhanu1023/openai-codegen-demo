package dev.bhanu.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import dev.bhanu.model.ChangeDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ServiceChange
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T01:19:46.548500+05:30[Asia/Kolkata]", comments = "Generator version: 7.9.0")
public class ServiceChange {

  private Boolean accountLevel;

  private Boolean productLevel;

  private String productType;

  private ChangeDetails changeDetails;

  public ServiceChange() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ServiceChange(ChangeDetails changeDetails) {
    this.changeDetails = changeDetails;
  }

  public ServiceChange accountLevel(Boolean accountLevel) {
    this.accountLevel = accountLevel;
    return this;
  }

  /**
   * Is change an account level or line level
   * @return accountLevel
   */
  
  @Schema(name = "accountLevel", example = "true", description = "Is change an account level or line level", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountLevel")
  public Boolean getAccountLevel() {
    return accountLevel;
  }

  public void setAccountLevel(Boolean accountLevel) {
    this.accountLevel = accountLevel;
  }

  public ServiceChange productLevel(Boolean productLevel) {
    this.productLevel = productLevel;
    return this;
  }

  /**
   * Is change an product level or not
   * @return productLevel
   */
  
  @Schema(name = "productLevel", example = "true", description = "Is change an product level or not", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("productLevel")
  public Boolean getProductLevel() {
    return productLevel;
  }

  public void setProductLevel(Boolean productLevel) {
    this.productLevel = productLevel;
  }

  public ServiceChange productType(String productType) {
    this.productType = productType;
    return this;
  }

  /**
   * type of product
   * @return productType
   */
  
  @Schema(name = "productType", example = "GSM", description = "type of product", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("productType")
  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public ServiceChange changeDetails(ChangeDetails changeDetails) {
    this.changeDetails = changeDetails;
    return this;
  }

  /**
   * Get changeDetails
   * @return changeDetails
   */
  @NotNull @Valid 
  @Schema(name = "changeDetails", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("changeDetails")
  public ChangeDetails getChangeDetails() {
    return changeDetails;
  }

  public void setChangeDetails(ChangeDetails changeDetails) {
    this.changeDetails = changeDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceChange serviceChange = (ServiceChange) o;
    return Objects.equals(this.accountLevel, serviceChange.accountLevel) &&
        Objects.equals(this.productLevel, serviceChange.productLevel) &&
        Objects.equals(this.productType, serviceChange.productType) &&
        Objects.equals(this.changeDetails, serviceChange.changeDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountLevel, productLevel, productType, changeDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceChange {\n");
    sb.append("    accountLevel: ").append(toIndentedString(accountLevel)).append("\n");
    sb.append("    productLevel: ").append(toIndentedString(productLevel)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    changeDetails: ").append(toIndentedString(changeDetails)).append("\n");
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


package dev.bhanu.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ban suspension details
 */

@Schema(name = "BanSuspensionDetails", description = "ban suspension details")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T01:48:13.122437+05:30[Asia/Kolkata]", comments = "Generator version: 7.9.0")
public class BanSuspensionDetails {

  private Float pastDueAmount;

  private Boolean isNonPayment;

  private Boolean isOther;

  public BanSuspensionDetails pastDueAmount(Float pastDueAmount) {
    this.pastDueAmount = pastDueAmount;
    return this;
  }

  /**
   * Get pastDueAmount
   * @return pastDueAmount
   */
  
  @Schema(name = "pastDueAmount", example = "100.12", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pastDueAmount")
  public Float getPastDueAmount() {
    return pastDueAmount;
  }

  public void setPastDueAmount(Float pastDueAmount) {
    this.pastDueAmount = pastDueAmount;
  }

  public BanSuspensionDetails isNonPayment(Boolean isNonPayment) {
    this.isNonPayment = isNonPayment;
    return this;
  }

  /**
   * Get isNonPayment
   * @return isNonPayment
   */
  
  @Schema(name = "isNonPayment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isNonPayment")
  public Boolean getIsNonPayment() {
    return isNonPayment;
  }

  public void setIsNonPayment(Boolean isNonPayment) {
    this.isNonPayment = isNonPayment;
  }

  public BanSuspensionDetails isOther(Boolean isOther) {
    this.isOther = isOther;
    return this;
  }

  /**
   * Get isOther
   * @return isOther
   */
  
  @Schema(name = "isOther", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isOther")
  public Boolean getIsOther() {
    return isOther;
  }

  public void setIsOther(Boolean isOther) {
    this.isOther = isOther;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BanSuspensionDetails banSuspensionDetails = (BanSuspensionDetails) o;
    return Objects.equals(this.pastDueAmount, banSuspensionDetails.pastDueAmount) &&
        Objects.equals(this.isNonPayment, banSuspensionDetails.isNonPayment) &&
        Objects.equals(this.isOther, banSuspensionDetails.isOther);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pastDueAmount, isNonPayment, isOther);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BanSuspensionDetails {\n");
    sb.append("    pastDueAmount: ").append(toIndentedString(pastDueAmount)).append("\n");
    sb.append("    isNonPayment: ").append(toIndentedString(isNonPayment)).append("\n");
    sb.append("    isOther: ").append(toIndentedString(isOther)).append("\n");
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


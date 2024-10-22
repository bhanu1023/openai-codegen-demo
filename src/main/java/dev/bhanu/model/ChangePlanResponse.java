package dev.bhanu.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import dev.bhanu.model.StatusDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ChangePlanResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T01:48:13.122437+05:30[Asia/Kolkata]", comments = "Generator version: 7.9.0")
public class ChangePlanResponse {

  private StatusDetails statusDetails;

  public ChangePlanResponse statusDetails(StatusDetails statusDetails) {
    this.statusDetails = statusDetails;
    return this;
  }

  /**
   * Get statusDetails
   * @return statusDetails
   */
  @Valid 
  @Schema(name = "statusDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statusDetails")
  public StatusDetails getStatusDetails() {
    return statusDetails;
  }

  public void setStatusDetails(StatusDetails statusDetails) {
    this.statusDetails = statusDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangePlanResponse changePlanResponse = (ChangePlanResponse) o;
    return Objects.equals(this.statusDetails, changePlanResponse.statusDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangePlanResponse {\n");
    sb.append("    statusDetails: ").append(toIndentedString(statusDetails)).append("\n");
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


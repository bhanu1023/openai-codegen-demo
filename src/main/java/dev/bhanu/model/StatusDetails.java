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
 * StatusDetails
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T01:48:13.122437+05:30[Asia/Kolkata]", comments = "Generator version: 7.9.0")
public class StatusDetails {

  private String status;

  private String statusCode;

  public StatusDetails status(String status) {
    this.status = status;
    return this;
  }

  /**
   * This field represent status of the service(SUCCESS or ERROR).
   * @return status
   */
  
  @Schema(name = "status", example = "SUCCESS", description = "This field represent status of the service(SUCCESS or ERROR).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public StatusDetails statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * This field represent status code(200 , 404 , 500)
   * @return statusCode
   */
  
  @Schema(name = "statusCode", example = "100", description = "This field represent status code(200 , 404 , 500)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statusCode")
  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusDetails statusDetails = (StatusDetails) o;
    return Objects.equals(this.status, statusDetails.status) &&
        Objects.equals(this.statusCode, statusDetails.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, statusCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusDetails {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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


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
 * PartnerFailure
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T01:19:46.548500+05:30[Asia/Kolkata]", comments = "Generator version: 7.9.0")
public class PartnerFailure {

  private String partnerName;

  private String code;

  private String userMessage;

  public PartnerFailure partnerName(String partnerName) {
    this.partnerName = partnerName;
    return this;
  }

  /**
   * Get partnerName
   * @return partnerName
   */
  
  @Schema(name = "partnerName", example = "APPLE", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partnerName")
  public String getPartnerName() {
    return partnerName;
  }

  public void setPartnerName(String partnerName) {
    this.partnerName = partnerName;
  }

  public PartnerFailure code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
   */
  
  @Schema(name = "code", example = "003", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public PartnerFailure userMessage(String userMessage) {
    this.userMessage = userMessage;
    return this;
  }

  /**
   * Get userMessage
   * @return userMessage
   */
  
  @Schema(name = "userMessage", example = "Unable to retrieve information from backend System, Please re-try later.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userMessage")
  public String getUserMessage() {
    return userMessage;
  }

  public void setUserMessage(String userMessage) {
    this.userMessage = userMessage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerFailure partnerFailure = (PartnerFailure) o;
    return Objects.equals(this.partnerName, partnerFailure.partnerName) &&
        Objects.equals(this.code, partnerFailure.code) &&
        Objects.equals(this.userMessage, partnerFailure.userMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partnerName, code, userMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerFailure {\n");
    sb.append("    partnerName: ").append(toIndentedString(partnerName)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    userMessage: ").append(toIndentedString(userMessage)).append("\n");
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


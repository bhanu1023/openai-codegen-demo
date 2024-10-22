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
 * Error object
 */

@Schema(name = "Error", description = "Error object")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T01:19:46.548500+05:30[Asia/Kolkata]", comments = "Generator version: 7.9.0")
public class Error {

  private String code;

  private String systemMessage;

  private String userMessage;

  public Error code(String code) {
    this.code = code;
    return this;
  }

  /**
   * code for error
   * @return code
   */
  
  @Schema(name = "code", description = "code for error", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Error systemMessage(String systemMessage) {
    this.systemMessage = systemMessage;
    return this;
  }

  /**
   * system message for error
   * @return systemMessage
   */
  
  @Schema(name = "systemMessage", description = "system message for error", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("systemMessage")
  public String getSystemMessage() {
    return systemMessage;
  }

  public void setSystemMessage(String systemMessage) {
    this.systemMessage = systemMessage;
  }

  public Error userMessage(String userMessage) {
    this.userMessage = userMessage;
    return this;
  }

  /**
   * user message
   * @return userMessage
   */
  
  @Schema(name = "userMessage", description = "user message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    Error error = (Error) o;
    return Objects.equals(this.code, error.code) &&
        Objects.equals(this.systemMessage, error.systemMessage) &&
        Objects.equals(this.userMessage, error.userMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, systemMessage, userMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    systemMessage: ").append(toIndentedString(systemMessage)).append("\n");
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


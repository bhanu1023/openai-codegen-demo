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
 * RelatedService
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T01:19:46.548500+05:30[Asia/Kolkata]", comments = "Generator version: 7.9.0")
public class RelatedService {

  private String soc;

  private String socName;

  public RelatedService soc(String soc) {
    this.soc = soc;
    return this;
  }

  /**
   * Get soc
   * @return soc
   */
  
  @Schema(name = "soc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("soc")
  public String getSoc() {
    return soc;
  }

  public void setSoc(String soc) {
    this.soc = soc;
  }

  public RelatedService socName(String socName) {
    this.socName = socName;
    return this;
  }

  /**
   * Get socName
   * @return socName
   */
  
  @Schema(name = "socName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("socName")
  public String getSocName() {
    return socName;
  }

  public void setSocName(String socName) {
    this.socName = socName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedService relatedService = (RelatedService) o;
    return Objects.equals(this.soc, relatedService.soc) &&
        Objects.equals(this.socName, relatedService.socName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(soc, socName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedService {\n");
    sb.append("    soc: ").append(toIndentedString(soc)).append("\n");
    sb.append("    socName: ").append(toIndentedString(socName)).append("\n");
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


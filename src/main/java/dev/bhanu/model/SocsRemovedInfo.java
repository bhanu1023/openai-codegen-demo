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
 * SocsRemovedInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T01:48:13.122437+05:30[Asia/Kolkata]", comments = "Generator version: 7.9.0")
public class SocsRemovedInfo {

  private String soc;

  public SocsRemovedInfo() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SocsRemovedInfo(String soc) {
    this.soc = soc;
  }

  public SocsRemovedInfo soc(String soc) {
    this.soc = soc;
    return this;
  }

  /**
   * Get soc
   * @return soc
   */
  @NotNull 
  @Schema(name = "soc", example = "APPLTVOUS", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("soc")
  public String getSoc() {
    return soc;
  }

  public void setSoc(String soc) {
    this.soc = soc;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SocsRemovedInfo socsRemovedInfo = (SocsRemovedInfo) o;
    return Objects.equals(this.soc, socsRemovedInfo.soc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(soc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocsRemovedInfo {\n");
    sb.append("    soc: ").append(toIndentedString(soc)).append("\n");
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


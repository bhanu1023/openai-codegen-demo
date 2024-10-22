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
 * PartnerSocData
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T01:48:13.122437+05:30[Asia/Kolkata]", comments = "Generator version: 7.9.0")
public class PartnerSocData {

  private String partnerName;

  @Valid
  private List<String> soc = new ArrayList<>();

  public PartnerSocData() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PartnerSocData(String partnerName, List<String> soc) {
    this.partnerName = partnerName;
    this.soc = soc;
  }

  public PartnerSocData partnerName(String partnerName) {
    this.partnerName = partnerName;
    return this;
  }

  /**
   * Get partnerName
   * @return partnerName
   */
  @NotNull 
  @Schema(name = "partnerName", example = "NETFLIX", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("partnerName")
  public String getPartnerName() {
    return partnerName;
  }

  public void setPartnerName(String partnerName) {
    this.partnerName = partnerName;
  }

  public PartnerSocData soc(List<String> soc) {
    this.soc = soc;
    return this;
  }

  public PartnerSocData addSocItem(String socItem) {
    if (this.soc == null) {
      this.soc = new ArrayList<>();
    }
    this.soc.add(socItem);
    return this;
  }

  /**
   * Get soc
   * @return soc
   */
  @NotNull 
  @Schema(name = "soc", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("soc")
  public List<String> getSoc() {
    return soc;
  }

  public void setSoc(List<String> soc) {
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
    PartnerSocData partnerSocData = (PartnerSocData) o;
    return Objects.equals(this.partnerName, partnerSocData.partnerName) &&
        Objects.equals(this.soc, partnerSocData.soc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partnerName, soc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerSocData {\n");
    sb.append("    partnerName: ").append(toIndentedString(partnerName)).append("\n");
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


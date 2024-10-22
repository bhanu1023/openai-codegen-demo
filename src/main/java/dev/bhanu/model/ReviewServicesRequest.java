package dev.bhanu.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import dev.bhanu.model.SocsAddedInfo;
import dev.bhanu.model.SocsRemovedInfo;
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
 * request for review plan/service/datapass
 */

@Schema(name = "ReviewServicesRequest", description = "request for review plan/service/datapass")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T01:48:13.122437+05:30[Asia/Kolkata]", comments = "Generator version: 7.9.0")
public class ReviewServicesRequest {

  private JsonNullable<@Pattern(regexp = "^\\d{10}$") String> msisdn = JsonNullable.<String>undefined();

  @Valid
  private List<@Valid SocsAddedInfo> addedSocs = new ArrayList<>();

  @Valid
  private List<@Valid SocsRemovedInfo> removedSocs = new ArrayList<>();

  public ReviewServicesRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ReviewServicesRequest(String msisdn) {
    this.msisdn = JsonNullable.of(msisdn);
  }

  public ReviewServicesRequest msisdn(String msisdn) {
    this.msisdn = JsonNullable.of(msisdn);
    return this;
  }

  /**
   * MSISDN in action
   * @return msisdn
   */
  @NotNull @Pattern(regexp = "^\\d{10}$") 
  @Schema(name = "msisdn", example = "1234567890", description = "MSISDN in action", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("msisdn")
  public JsonNullable<@Pattern(regexp = "^\\d{10}$") String> getMsisdn() {
    return msisdn;
  }

  public void setMsisdn(JsonNullable<String> msisdn) {
    this.msisdn = msisdn;
  }

  public ReviewServicesRequest addedSocs(List<@Valid SocsAddedInfo> addedSocs) {
    this.addedSocs = addedSocs;
    return this;
  }

  public ReviewServicesRequest addAddedSocsItem(SocsAddedInfo addedSocsItem) {
    if (this.addedSocs == null) {
      this.addedSocs = new ArrayList<>();
    }
    this.addedSocs.add(addedSocsItem);
    return this;
  }

  /**
   * Get addedSocs
   * @return addedSocs
   */
  @Valid 
  @Schema(name = "addedSocs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("addedSocs")
  public List<@Valid SocsAddedInfo> getAddedSocs() {
    return addedSocs;
  }

  public void setAddedSocs(List<@Valid SocsAddedInfo> addedSocs) {
    this.addedSocs = addedSocs;
  }

  public ReviewServicesRequest removedSocs(List<@Valid SocsRemovedInfo> removedSocs) {
    this.removedSocs = removedSocs;
    return this;
  }

  public ReviewServicesRequest addRemovedSocsItem(SocsRemovedInfo removedSocsItem) {
    if (this.removedSocs == null) {
      this.removedSocs = new ArrayList<>();
    }
    this.removedSocs.add(removedSocsItem);
    return this;
  }

  /**
   * Get removedSocs
   * @return removedSocs
   */
  @Valid 
  @Schema(name = "removedSocs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("removedSocs")
  public List<@Valid SocsRemovedInfo> getRemovedSocs() {
    return removedSocs;
  }

  public void setRemovedSocs(List<@Valid SocsRemovedInfo> removedSocs) {
    this.removedSocs = removedSocs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewServicesRequest reviewServicesRequest = (ReviewServicesRequest) o;
    return Objects.equals(this.msisdn, reviewServicesRequest.msisdn) &&
        Objects.equals(this.addedSocs, reviewServicesRequest.addedSocs) &&
        Objects.equals(this.removedSocs, reviewServicesRequest.removedSocs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msisdn, addedSocs, removedSocs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewServicesRequest {\n");
    sb.append("    msisdn: ").append(toIndentedString(msisdn)).append("\n");
    sb.append("    addedSocs: ").append(toIndentedString(addedSocs)).append("\n");
    sb.append("    removedSocs: ").append(toIndentedString(removedSocs)).append("\n");
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


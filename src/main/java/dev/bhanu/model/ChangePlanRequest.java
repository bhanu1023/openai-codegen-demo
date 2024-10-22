package dev.bhanu.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import dev.bhanu.model.ServiceChange;
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
 * request for change plan/service/datapass
 */

@Schema(name = "ChangePlanRequest", description = "request for change plan/service/datapass")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T01:48:13.122437+05:30[Asia/Kolkata]", comments = "Generator version: 7.9.0")
public class ChangePlanRequest {

  private JsonNullable<@Pattern(regexp = "^\\d{10}$") String> msisdn = JsonNullable.<String>undefined();

  @Valid
  private List<@Valid ServiceChange> serviceChanges = new ArrayList<>();

  public ChangePlanRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ChangePlanRequest(String msisdn, List<@Valid ServiceChange> serviceChanges) {
    this.msisdn = JsonNullable.of(msisdn);
    this.serviceChanges = serviceChanges;
  }

  public ChangePlanRequest msisdn(String msisdn) {
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

  public ChangePlanRequest serviceChanges(List<@Valid ServiceChange> serviceChanges) {
    this.serviceChanges = serviceChanges;
    return this;
  }

  public ChangePlanRequest addServiceChangesItem(ServiceChange serviceChangesItem) {
    if (this.serviceChanges == null) {
      this.serviceChanges = new ArrayList<>();
    }
    this.serviceChanges.add(serviceChangesItem);
    return this;
  }

  /**
   * list of services to be changed
   * @return serviceChanges
   */
  @NotNull @Valid 
  @Schema(name = "serviceChanges", description = "list of services to be changed", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("serviceChanges")
  public List<@Valid ServiceChange> getServiceChanges() {
    return serviceChanges;
  }

  public void setServiceChanges(List<@Valid ServiceChange> serviceChanges) {
    this.serviceChanges = serviceChanges;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangePlanRequest changePlanRequest = (ChangePlanRequest) o;
    return Objects.equals(this.msisdn, changePlanRequest.msisdn) &&
        Objects.equals(this.serviceChanges, changePlanRequest.serviceChanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msisdn, serviceChanges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangePlanRequest {\n");
    sb.append("    msisdn: ").append(toIndentedString(msisdn)).append("\n");
    sb.append("    serviceChanges: ").append(toIndentedString(serviceChanges)).append("\n");
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


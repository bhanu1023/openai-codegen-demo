package dev.bhanu.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import dev.bhanu.model.PartnerSocData;
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
 * PartnerSubscriptionRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T01:19:46.548500+05:30[Asia/Kolkata]", comments = "Generator version: 7.9.0")
public class PartnerSubscriptionRequest {

  private String msisdn;

  @Valid
  private List<@Valid PartnerSocData> partnerSocDetails = new ArrayList<>();

  public PartnerSubscriptionRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PartnerSubscriptionRequest(String msisdn, List<@Valid PartnerSocData> partnerSocDetails) {
    this.msisdn = msisdn;
    this.partnerSocDetails = partnerSocDetails;
  }

  public PartnerSubscriptionRequest msisdn(String msisdn) {
    this.msisdn = msisdn;
    return this;
  }

  /**
   * Get msisdn
   * @return msisdn
   */
  @NotNull 
  @Schema(name = "msisdn", example = "1234567890", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("msisdn")
  public String getMsisdn() {
    return msisdn;
  }

  public void setMsisdn(String msisdn) {
    this.msisdn = msisdn;
  }

  public PartnerSubscriptionRequest partnerSocDetails(List<@Valid PartnerSocData> partnerSocDetails) {
    this.partnerSocDetails = partnerSocDetails;
    return this;
  }

  public PartnerSubscriptionRequest addPartnerSocDetailsItem(PartnerSocData partnerSocDetailsItem) {
    if (this.partnerSocDetails == null) {
      this.partnerSocDetails = new ArrayList<>();
    }
    this.partnerSocDetails.add(partnerSocDetailsItem);
    return this;
  }

  /**
   * Get partnerSocDetails
   * @return partnerSocDetails
   */
  @NotNull @Valid 
  @Schema(name = "partnerSocDetails", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("partnerSocDetails")
  public List<@Valid PartnerSocData> getPartnerSocDetails() {
    return partnerSocDetails;
  }

  public void setPartnerSocDetails(List<@Valid PartnerSocData> partnerSocDetails) {
    this.partnerSocDetails = partnerSocDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerSubscriptionRequest partnerSubscriptionRequest = (PartnerSubscriptionRequest) o;
    return Objects.equals(this.msisdn, partnerSubscriptionRequest.msisdn) &&
        Objects.equals(this.partnerSocDetails, partnerSubscriptionRequest.partnerSocDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msisdn, partnerSocDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerSubscriptionRequest {\n");
    sb.append("    msisdn: ").append(toIndentedString(msisdn)).append("\n");
    sb.append("    partnerSocDetails: ").append(toIndentedString(partnerSocDetails)).append("\n");
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


package dev.bhanu.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import dev.bhanu.model.PartnerFailure;
import dev.bhanu.model.PartnerSubscriptionDetails;
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
 * PartnerSubscriptionResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T01:48:13.122437+05:30[Asia/Kolkata]", comments = "Generator version: 7.9.0")
public class PartnerSubscriptionResponse {

  @Valid
  private List<@Valid PartnerSubscriptionDetails> subscriptionDetails = new ArrayList<>();

  @Valid
  private List<@Valid PartnerFailure> partnerFailures = new ArrayList<>();

  public PartnerSubscriptionResponse subscriptionDetails(List<@Valid PartnerSubscriptionDetails> subscriptionDetails) {
    this.subscriptionDetails = subscriptionDetails;
    return this;
  }

  public PartnerSubscriptionResponse addSubscriptionDetailsItem(PartnerSubscriptionDetails subscriptionDetailsItem) {
    if (this.subscriptionDetails == null) {
      this.subscriptionDetails = new ArrayList<>();
    }
    this.subscriptionDetails.add(subscriptionDetailsItem);
    return this;
  }

  /**
   * Get subscriptionDetails
   * @return subscriptionDetails
   */
  @Valid 
  @Schema(name = "subscriptionDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subscriptionDetails")
  public List<@Valid PartnerSubscriptionDetails> getSubscriptionDetails() {
    return subscriptionDetails;
  }

  public void setSubscriptionDetails(List<@Valid PartnerSubscriptionDetails> subscriptionDetails) {
    this.subscriptionDetails = subscriptionDetails;
  }

  public PartnerSubscriptionResponse partnerFailures(List<@Valid PartnerFailure> partnerFailures) {
    this.partnerFailures = partnerFailures;
    return this;
  }

  public PartnerSubscriptionResponse addPartnerFailuresItem(PartnerFailure partnerFailuresItem) {
    if (this.partnerFailures == null) {
      this.partnerFailures = new ArrayList<>();
    }
    this.partnerFailures.add(partnerFailuresItem);
    return this;
  }

  /**
   * Get partnerFailures
   * @return partnerFailures
   */
  @Valid 
  @Schema(name = "partnerFailures", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partnerFailures")
  public List<@Valid PartnerFailure> getPartnerFailures() {
    return partnerFailures;
  }

  public void setPartnerFailures(List<@Valid PartnerFailure> partnerFailures) {
    this.partnerFailures = partnerFailures;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerSubscriptionResponse partnerSubscriptionResponse = (PartnerSubscriptionResponse) o;
    return Objects.equals(this.subscriptionDetails, partnerSubscriptionResponse.subscriptionDetails) &&
        Objects.equals(this.partnerFailures, partnerSubscriptionResponse.partnerFailures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionDetails, partnerFailures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerSubscriptionResponse {\n");
    sb.append("    subscriptionDetails: ").append(toIndentedString(subscriptionDetails)).append("\n");
    sb.append("    partnerFailures: ").append(toIndentedString(partnerFailures)).append("\n");
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


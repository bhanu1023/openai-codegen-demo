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
 * PartnerSubscriptionDetails
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T01:19:46.548500+05:30[Asia/Kolkata]", comments = "Generator version: 7.9.0")
public class PartnerSubscriptionDetails {

  private String soc;

  private String socName;

  private String partnerActivationUrl;

  private String provisioningStatus;

  private String partnerRecoveryUrl;

  private Float price;

  private Float displayPrice;

  public PartnerSubscriptionDetails soc(String soc) {
    this.soc = soc;
    return this;
  }

  /**
   * Get soc
   * @return soc
   */
  
  @Schema(name = "soc", example = "NOADNFLX2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("soc")
  public String getSoc() {
    return soc;
  }

  public void setSoc(String soc) {
    this.soc = soc;
  }

  public PartnerSubscriptionDetails socName(String socName) {
    this.socName = socName;
    return this;
  }

  /**
   * Get socName
   * @return socName
   */
  
  @Schema(name = "socName", example = "Netflix Standard", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("socName")
  public String getSocName() {
    return socName;
  }

  public void setSocName(String socName) {
    this.socName = socName;
  }

  public PartnerSubscriptionDetails partnerActivationUrl(String partnerActivationUrl) {
    this.partnerActivationUrl = partnerActivationUrl;
    return this;
  }

  /**
   * Get partnerActivationUrl
   * @return partnerActivationUrl
   */
  
  @Schema(name = "partnerActivationUrl", example = "https://", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partnerActivationUrl")
  public String getPartnerActivationUrl() {
    return partnerActivationUrl;
  }

  public void setPartnerActivationUrl(String partnerActivationUrl) {
    this.partnerActivationUrl = partnerActivationUrl;
  }

  public PartnerSubscriptionDetails provisioningStatus(String provisioningStatus) {
    this.provisioningStatus = provisioningStatus;
    return this;
  }

  /**
   * Get provisioningStatus
   * @return provisioningStatus
   */
  
  @Schema(name = "provisioningStatus", example = "ACTIVE", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("provisioningStatus")
  public String getProvisioningStatus() {
    return provisioningStatus;
  }

  public void setProvisioningStatus(String provisioningStatus) {
    this.provisioningStatus = provisioningStatus;
  }

  public PartnerSubscriptionDetails partnerRecoveryUrl(String partnerRecoveryUrl) {
    this.partnerRecoveryUrl = partnerRecoveryUrl;
    return this;
  }

  /**
   * Get partnerRecoveryUrl
   * @return partnerRecoveryUrl
   */
  
  @Schema(name = "partnerRecoveryUrl", example = "https://", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partnerRecoveryUrl")
  public String getPartnerRecoveryUrl() {
    return partnerRecoveryUrl;
  }

  public void setPartnerRecoveryUrl(String partnerRecoveryUrl) {
    this.partnerRecoveryUrl = partnerRecoveryUrl;
  }

  public PartnerSubscriptionDetails price(Float price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   */
  
  @Schema(name = "price", example = "11.99", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public PartnerSubscriptionDetails displayPrice(Float displayPrice) {
    this.displayPrice = displayPrice;
    return this;
  }

  /**
   * Get displayPrice
   * @return displayPrice
   */
  
  @Schema(name = "displayPrice", example = "15.99", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayPrice")
  public Float getDisplayPrice() {
    return displayPrice;
  }

  public void setDisplayPrice(Float displayPrice) {
    this.displayPrice = displayPrice;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerSubscriptionDetails partnerSubscriptionDetails = (PartnerSubscriptionDetails) o;
    return Objects.equals(this.soc, partnerSubscriptionDetails.soc) &&
        Objects.equals(this.socName, partnerSubscriptionDetails.socName) &&
        Objects.equals(this.partnerActivationUrl, partnerSubscriptionDetails.partnerActivationUrl) &&
        Objects.equals(this.provisioningStatus, partnerSubscriptionDetails.provisioningStatus) &&
        Objects.equals(this.partnerRecoveryUrl, partnerSubscriptionDetails.partnerRecoveryUrl) &&
        Objects.equals(this.price, partnerSubscriptionDetails.price) &&
        Objects.equals(this.displayPrice, partnerSubscriptionDetails.displayPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(soc, socName, partnerActivationUrl, provisioningStatus, partnerRecoveryUrl, price, displayPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerSubscriptionDetails {\n");
    sb.append("    soc: ").append(toIndentedString(soc)).append("\n");
    sb.append("    socName: ").append(toIndentedString(socName)).append("\n");
    sb.append("    partnerActivationUrl: ").append(toIndentedString(partnerActivationUrl)).append("\n");
    sb.append("    provisioningStatus: ").append(toIndentedString(provisioningStatus)).append("\n");
    sb.append("    partnerRecoveryUrl: ").append(toIndentedString(partnerRecoveryUrl)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    displayPrice: ").append(toIndentedString(displayPrice)).append("\n");
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


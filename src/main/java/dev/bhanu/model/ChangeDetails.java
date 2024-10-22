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
 * details of service being changed
 */

@Schema(name = "ChangeDetails", description = "details of service being changed")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T01:19:46.548500+05:30[Asia/Kolkata]", comments = "Generator version: 7.9.0")
public class ChangeDetails {

  private String changeType;

  private String soc;

  private String socName;

  private String serviceSubType;

  private String subCategory;

  private String action;

  private Integer sequenceNumber;

  private String effectiveDate;

  private String expirationDate;

  private String partnerTermsAndConditionText;

  private String autoRenewalTermsAndConditionText;

  public ChangeDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ChangeDetails(String changeType, String soc, String action, String effectiveDate) {
    this.changeType = changeType;
    this.soc = soc;
    this.action = action;
    this.effectiveDate = effectiveDate;
  }

  public ChangeDetails changeType(String changeType) {
    this.changeType = changeType;
    return this;
  }

  /**
   * type of soc in action ex service or data pass or data plan, allowed values are changeService/changeDataPass/changePlan for data service, data pass and data plan change respectively
   * @return changeType
   */
  @NotNull 
  @Schema(name = "changeType", example = "changeDataPass", description = "type of soc in action ex service or data pass or data plan, allowed values are changeService/changeDataPass/changePlan for data service, data pass and data plan change respectively", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("changeType")
  public String getChangeType() {
    return changeType;
  }

  public void setChangeType(String changeType) {
    this.changeType = changeType;
  }

  public ChangeDetails soc(String soc) {
    this.soc = soc;
    return this;
  }

  /**
   * soc of the item-in-action
   * @return soc
   */
  @NotNull @Pattern(regexp = "^.*$") 
  @Schema(name = "soc", example = "HDPASS", description = "soc of the item-in-action", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("soc")
  public String getSoc() {
    return soc;
  }

  public void setSoc(String soc) {
    this.soc = soc;
  }

  public ChangeDetails socName(String socName) {
    this.socName = socName;
    return this;
  }

  /**
   * Get socName
   * @return socName
   */
  
  @Schema(name = "socName", example = "Apple TV+ On Us", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("socName")
  public String getSocName() {
    return socName;
  }

  public void setSocName(String socName) {
    this.socName = socName;
  }

  public ChangeDetails serviceSubType(String serviceSubType) {
    this.serviceSubType = serviceSubType;
    return this;
  }

  /**
   * Sub type for the change type, populated for data plan flow
   * @return serviceSubType
   */
  @Pattern(regexp = "^.*$") 
  @Schema(name = "serviceSubType", example = "Video Streaming", description = "Sub type for the change type, populated for data plan flow", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceSubType")
  public String getServiceSubType() {
    return serviceSubType;
  }

  public void setServiceSubType(String serviceSubType) {
    this.serviceSubType = serviceSubType;
  }

  public ChangeDetails subCategory(String subCategory) {
    this.subCategory = subCategory;
    return this;
  }

  /**
   * Sub type for the change type, populated for data plan flow
   * @return subCategory
   */
  @Pattern(regexp = "^.*$") 
  @Schema(name = "subCategory", example = "AppleTVplus", description = "Sub type for the change type, populated for data plan flow", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subCategory")
  public String getSubCategory() {
    return subCategory;
  }

  public void setSubCategory(String subCategory) {
    this.subCategory = subCategory;
  }

  public ChangeDetails action(String action) {
    this.action = action;
    return this;
  }

  /**
   * action being taken on this soc ex ADD,REMOVE or MODIFY.
   * @return action
   */
  @NotNull @Pattern(regexp = "^.*$") 
  @Schema(name = "action", example = "ADD", description = "action being taken on this soc ex ADD,REMOVE or MODIFY.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("action")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public ChangeDetails sequenceNumber(Integer sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
    return this;
  }

  /**
   * sequenceNumber of the item-in-action,(For action Remove sequence Number is required)
   * @return sequenceNumber
   */
  
  @Schema(name = "sequenceNumber", example = "700064111", description = "sequenceNumber of the item-in-action,(For action Remove sequence Number is required)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sequenceNumber")
  public Integer getSequenceNumber() {
    return sequenceNumber;
  }

  public void setSequenceNumber(Integer sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }

  public ChangeDetails effectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

  /**
   * Date the given action has to be effective on the SOC
   * @return effectiveDate
   */
  @NotNull @Pattern(regexp = "^.*$") 
  @Schema(name = "effectiveDate", example = "2020-03-20T00:00:00.000Z", description = "Date the given action has to be effective on the SOC", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("effectiveDate")
  public String getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public ChangeDetails expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Date the given action has to be expired on the SOC
   * @return expirationDate
   */
  @Pattern(regexp = "^.*$") 
  @Schema(name = "expirationDate", example = "2020-03-20T00:00:00.000Z", description = "Date the given action has to be expired on the SOC", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expirationDate")
  public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }

  public ChangeDetails partnerTermsAndConditionText(String partnerTermsAndConditionText) {
    this.partnerTermsAndConditionText = partnerTermsAndConditionText;
    return this;
  }

  /**
   * Get partnerTermsAndConditionText
   * @return partnerTermsAndConditionText
   */
  @Pattern(regexp = "^.*$") 
  @Schema(name = "partnerTermsAndConditionText", example = "By checking the box, you agree to activate Netflix, a third-party service. T-Mobile will handle billing and payments for this service; recurring charges will appear on your T-Mobile bill. T-Mobile’s Terms and Conditions, including arbitration of disputes, apply to this transaction. You will also need to agree to the <strong><a class=\\\"link-secondary\\\" href=\\\"https://help.netflix.com/legal/termsofuse?locale=en-US\\\" target=\\\"_blank\\\">Netflix Subscription Terms</a></strong> before using Netflix.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partnerTermsAndConditionText")
  public String getPartnerTermsAndConditionText() {
    return partnerTermsAndConditionText;
  }

  public void setPartnerTermsAndConditionText(String partnerTermsAndConditionText) {
    this.partnerTermsAndConditionText = partnerTermsAndConditionText;
  }

  public ChangeDetails autoRenewalTermsAndConditionText(String autoRenewalTermsAndConditionText) {
    this.autoRenewalTermsAndConditionText = autoRenewalTermsAndConditionText;
    return this;
  }

  /**
   * Get autoRenewalTermsAndConditionText
   * @return autoRenewalTermsAndConditionText
   */
  @Pattern(regexp = "^.*$") 
  @Schema(name = "autoRenewalTermsAndConditionText", example = "By checking the box, you agree that after your 4-month promotional trial concludes, you will automatically be charged $9.99 per month on your T-Mobile bill. You may cancel at any time during the trial.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("autoRenewalTermsAndConditionText")
  public String getAutoRenewalTermsAndConditionText() {
    return autoRenewalTermsAndConditionText;
  }

  public void setAutoRenewalTermsAndConditionText(String autoRenewalTermsAndConditionText) {
    this.autoRenewalTermsAndConditionText = autoRenewalTermsAndConditionText;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeDetails changeDetails = (ChangeDetails) o;
    return Objects.equals(this.changeType, changeDetails.changeType) &&
        Objects.equals(this.soc, changeDetails.soc) &&
        Objects.equals(this.socName, changeDetails.socName) &&
        Objects.equals(this.serviceSubType, changeDetails.serviceSubType) &&
        Objects.equals(this.subCategory, changeDetails.subCategory) &&
        Objects.equals(this.action, changeDetails.action) &&
        Objects.equals(this.sequenceNumber, changeDetails.sequenceNumber) &&
        Objects.equals(this.effectiveDate, changeDetails.effectiveDate) &&
        Objects.equals(this.expirationDate, changeDetails.expirationDate) &&
        Objects.equals(this.partnerTermsAndConditionText, changeDetails.partnerTermsAndConditionText) &&
        Objects.equals(this.autoRenewalTermsAndConditionText, changeDetails.autoRenewalTermsAndConditionText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeType, soc, socName, serviceSubType, subCategory, action, sequenceNumber, effectiveDate, expirationDate, partnerTermsAndConditionText, autoRenewalTermsAndConditionText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeDetails {\n");
    sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
    sb.append("    soc: ").append(toIndentedString(soc)).append("\n");
    sb.append("    socName: ").append(toIndentedString(socName)).append("\n");
    sb.append("    serviceSubType: ").append(toIndentedString(serviceSubType)).append("\n");
    sb.append("    subCategory: ").append(toIndentedString(subCategory)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    partnerTermsAndConditionText: ").append(toIndentedString(partnerTermsAndConditionText)).append("\n");
    sb.append("    autoRenewalTermsAndConditionText: ").append(toIndentedString(autoRenewalTermsAndConditionText)).append("\n");
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


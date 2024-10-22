package dev.bhanu.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import dev.bhanu.model.AddedSocsData;
import dev.bhanu.model.RemovedSocsData;
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

@Schema(name = "ReviewServicesResponse", description = "request for review plan/service/datapass")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T01:48:13.122437+05:30[Asia/Kolkata]", comments = "Generator version: 7.9.0")
public class ReviewServicesResponse {

  private Float monthlyIncrease;

  private String currentBillingCycle;

  private String nextBillingCycle;

  private String todayDate;

  @Valid
  private List<@Valid AddedSocsData> addedSocs = new ArrayList<>();

  @Valid
  private List<@Valid RemovedSocsData> removedSocs = new ArrayList<>();

  public ReviewServicesResponse monthlyIncrease(Float monthlyIncrease) {
    this.monthlyIncrease = monthlyIncrease;
    return this;
  }

  /**
   * Get monthlyIncrease
   * @return monthlyIncrease
   */
  
  @Schema(name = "monthlyIncrease", example = "22.12", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("monthlyIncrease")
  public Float getMonthlyIncrease() {
    return monthlyIncrease;
  }

  public void setMonthlyIncrease(Float monthlyIncrease) {
    this.monthlyIncrease = monthlyIncrease;
  }

  public ReviewServicesResponse currentBillingCycle(String currentBillingCycle) {
    this.currentBillingCycle = currentBillingCycle;
    return this;
  }

  /**
   * Get currentBillingCycle
   * @return currentBillingCycle
   */
  
  @Schema(name = "currentBillingCycle", example = "2020-03-20", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentBillingCycle")
  public String getCurrentBillingCycle() {
    return currentBillingCycle;
  }

  public void setCurrentBillingCycle(String currentBillingCycle) {
    this.currentBillingCycle = currentBillingCycle;
  }

  public ReviewServicesResponse nextBillingCycle(String nextBillingCycle) {
    this.nextBillingCycle = nextBillingCycle;
    return this;
  }

  /**
   * Get nextBillingCycle
   * @return nextBillingCycle
   */
  
  @Schema(name = "nextBillingCycle", example = "2020-03-20", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nextBillingCycle")
  public String getNextBillingCycle() {
    return nextBillingCycle;
  }

  public void setNextBillingCycle(String nextBillingCycle) {
    this.nextBillingCycle = nextBillingCycle;
  }

  public ReviewServicesResponse todayDate(String todayDate) {
    this.todayDate = todayDate;
    return this;
  }

  /**
   * Get todayDate
   * @return todayDate
   */
  
  @Schema(name = "todayDate", example = "2020-03-20", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("todayDate")
  public String getTodayDate() {
    return todayDate;
  }

  public void setTodayDate(String todayDate) {
    this.todayDate = todayDate;
  }

  public ReviewServicesResponse addedSocs(List<@Valid AddedSocsData> addedSocs) {
    this.addedSocs = addedSocs;
    return this;
  }

  public ReviewServicesResponse addAddedSocsItem(AddedSocsData addedSocsItem) {
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
  public List<@Valid AddedSocsData> getAddedSocs() {
    return addedSocs;
  }

  public void setAddedSocs(List<@Valid AddedSocsData> addedSocs) {
    this.addedSocs = addedSocs;
  }

  public ReviewServicesResponse removedSocs(List<@Valid RemovedSocsData> removedSocs) {
    this.removedSocs = removedSocs;
    return this;
  }

  public ReviewServicesResponse addRemovedSocsItem(RemovedSocsData removedSocsItem) {
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
  public List<@Valid RemovedSocsData> getRemovedSocs() {
    return removedSocs;
  }

  public void setRemovedSocs(List<@Valid RemovedSocsData> removedSocs) {
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
    ReviewServicesResponse reviewServicesResponse = (ReviewServicesResponse) o;
    return Objects.equals(this.monthlyIncrease, reviewServicesResponse.monthlyIncrease) &&
        Objects.equals(this.currentBillingCycle, reviewServicesResponse.currentBillingCycle) &&
        Objects.equals(this.nextBillingCycle, reviewServicesResponse.nextBillingCycle) &&
        Objects.equals(this.todayDate, reviewServicesResponse.todayDate) &&
        Objects.equals(this.addedSocs, reviewServicesResponse.addedSocs) &&
        Objects.equals(this.removedSocs, reviewServicesResponse.removedSocs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monthlyIncrease, currentBillingCycle, nextBillingCycle, todayDate, addedSocs, removedSocs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewServicesResponse {\n");
    sb.append("    monthlyIncrease: ").append(toIndentedString(monthlyIncrease)).append("\n");
    sb.append("    currentBillingCycle: ").append(toIndentedString(currentBillingCycle)).append("\n");
    sb.append("    nextBillingCycle: ").append(toIndentedString(nextBillingCycle)).append("\n");
    sb.append("    todayDate: ").append(toIndentedString(todayDate)).append("\n");
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


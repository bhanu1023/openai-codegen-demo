package dev.bhanu.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import dev.bhanu.model.SubscriptionPlan;
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
 * subscription
 */

@Schema(name = "Subscription", description = "subscription")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T01:48:13.122437+05:30[Asia/Kolkata]", comments = "Generator version: 7.9.0")
public class Subscription {

  private String name;

  private String subscriptionGroup;

  private String imageUrl;

  private String largeImageUrl;

  private String imageText;

  @Valid
  private List<@Valid SubscriptionPlan> subscriptionPlans = new ArrayList<>();

  public Subscription name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", example = "Netflix. This field should not be used for display since it could be not user friendly e.g. AppleTVOnUs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Subscription subscriptionGroup(String subscriptionGroup) {
    this.subscriptionGroup = subscriptionGroup;
    return this;
  }

  /**
   * Get subscriptionGroup
   * @return subscriptionGroup
   */
  
  @Schema(name = "subscriptionGroup", example = "Netflix. This field should not be used for display since it could be not user friendly e.g. AppleTVOnUs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subscriptionGroup")
  public String getSubscriptionGroup() {
    return subscriptionGroup;
  }

  public void setSubscriptionGroup(String subscriptionGroup) {
    this.subscriptionGroup = subscriptionGroup;
  }

  public Subscription imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Get imageUrl
   * @return imageUrl
   */
  
  @Schema(name = "imageUrl", example = "https://...", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("imageUrl")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public Subscription largeImageUrl(String largeImageUrl) {
    this.largeImageUrl = largeImageUrl;
    return this;
  }

  /**
   * Get largeImageUrl
   * @return largeImageUrl
   */
  
  @Schema(name = "largeImageUrl", example = "https://...", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("largeImageUrl")
  public String getLargeImageUrl() {
    return largeImageUrl;
  }

  public void setLargeImageUrl(String largeImageUrl) {
    this.largeImageUrl = largeImageUrl;
  }

  public Subscription imageText(String imageText) {
    this.imageText = imageText;
    return this;
  }

  /**
   * Get imageText
   * @return imageText
   */
  
  @Schema(name = "imageText", example = "Netflix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("imageText")
  public String getImageText() {
    return imageText;
  }

  public void setImageText(String imageText) {
    this.imageText = imageText;
  }

  public Subscription subscriptionPlans(List<@Valid SubscriptionPlan> subscriptionPlans) {
    this.subscriptionPlans = subscriptionPlans;
    return this;
  }

  public Subscription addSubscriptionPlansItem(SubscriptionPlan subscriptionPlansItem) {
    if (this.subscriptionPlans == null) {
      this.subscriptionPlans = new ArrayList<>();
    }
    this.subscriptionPlans.add(subscriptionPlansItem);
    return this;
  }

  /**
   * list of subscription plans in the group
   * @return subscriptionPlans
   */
  @Valid 
  @Schema(name = "subscriptionPlans", description = "list of subscription plans in the group", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subscriptionPlans")
  public List<@Valid SubscriptionPlan> getSubscriptionPlans() {
    return subscriptionPlans;
  }

  public void setSubscriptionPlans(List<@Valid SubscriptionPlan> subscriptionPlans) {
    this.subscriptionPlans = subscriptionPlans;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subscription subscription = (Subscription) o;
    return Objects.equals(this.name, subscription.name) &&
        Objects.equals(this.subscriptionGroup, subscription.subscriptionGroup) &&
        Objects.equals(this.imageUrl, subscription.imageUrl) &&
        Objects.equals(this.largeImageUrl, subscription.largeImageUrl) &&
        Objects.equals(this.imageText, subscription.imageText) &&
        Objects.equals(this.subscriptionPlans, subscription.subscriptionPlans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, subscriptionGroup, imageUrl, largeImageUrl, imageText, subscriptionPlans);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscription {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subscriptionGroup: ").append(toIndentedString(subscriptionGroup)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    largeImageUrl: ").append(toIndentedString(largeImageUrl)).append("\n");
    sb.append("    imageText: ").append(toIndentedString(imageText)).append("\n");
    sb.append("    subscriptionPlans: ").append(toIndentedString(subscriptionPlans)).append("\n");
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


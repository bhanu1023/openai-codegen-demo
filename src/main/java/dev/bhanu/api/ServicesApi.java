/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.9.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package dev.bhanu.api;

import dev.bhanu.model.ServicesRequest;
import dev.bhanu.model.ServicesResponse;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T01:19:46.548500+05:30[Asia/Kolkata]", comments = "Generator version: 7.9.0")
@Validated
@Tag(name = "services", description = "the services API")
public interface ServicesApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /services : Get services
     * Get current and eligible services including data passes
     *
     * @param authorization Bearer prefix JWT Token (required)
     * @param xAuthorization Taap compliant POPT Token. (required)
     * @param xAuthOriginator Id token. (required)
     * @param contentType  (required)
     * @param services services (required)
     * @param acceptLanguage  (optional)
     * @param appVersion  (optional)
     * @param deviceOem  (optional)
     * @param deviceModel  (optional)
     * @param deviceOs  (optional)
     * @param deviceOsVersion  (optional)
     * @param osLanguage  (optional)
     * @param timestamp  (optional)
     * @param channelId  (optional)
     * @param originApplicationId  (optional)
     * @param applicationId  (optional)
     * @param sessionId  (optional)
     * @param interactionId  (optional)
     * @param activityId  (optional)
     * @return services (status code 200)
     *         or Bad request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Client access denied (status code 403)
     *         or Internal server error (status code 500)
     */
    @Operation(
        operationId = "services",
        summary = "Get services",
        description = "Get current and eligible services including data passes",
        tags = { "services" },
        responses = {
            @ApiResponse(responseCode = "200", description = "services", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ServicesResponse.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad request"),
            @ApiResponse(responseCode = "401", description = "Unauthorized"),
            @ApiResponse(responseCode = "403", description = "Client access denied"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
        },
        security = {
            @SecurityRequirement(name = "OAuth2")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/services",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<ServicesResponse> services(
        @NotNull @Pattern(regexp = ".*$") @Parameter(name = "Authorization", description = "Bearer prefix JWT Token", required = true, in = ParameterIn.HEADER) @RequestHeader(value = "Authorization", required = true) String authorization,
        @NotNull @Pattern(regexp = ".*$") @Parameter(name = "X-Authorization", description = "Taap compliant POPT Token.", required = true, in = ParameterIn.HEADER) @RequestHeader(value = "X-Authorization", required = true) String xAuthorization,
        @NotNull @Pattern(regexp = ".*$") @Parameter(name = "X-Auth-Originator", description = "Id token.", required = true, in = ParameterIn.HEADER) @RequestHeader(value = "X-Auth-Originator", required = true) String xAuthOriginator,
        @NotNull @Pattern(regexp = ".*$") @Parameter(name = "Content-Type", description = "", required = true, in = ParameterIn.HEADER) @RequestHeader(value = "Content-Type", required = true) String contentType,
        @Parameter(name = "services", description = "services", required = true) @Valid @RequestBody ServicesRequest services,
        @Parameter(name = "Accept-Language", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "Accept-Language", required = false) String acceptLanguage,
        @Parameter(name = "app-version", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "app-version", required = false) String appVersion,
        @Parameter(name = "device-oem", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "device-oem", required = false) String deviceOem,
        @Parameter(name = "device-model", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "device-model", required = false) String deviceModel,
        @Parameter(name = "device-os", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "device-os", required = false) String deviceOs,
        @Parameter(name = "device-os-version", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "device-os-version", required = false) String deviceOsVersion,
        @Parameter(name = "os-language", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "os-language", required = false) String osLanguage,
        @Parameter(name = "timestamp", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "timestamp", required = false) String timestamp,
        @Parameter(name = "channel-id", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "channel-id", required = false) String channelId,
        @Parameter(name = "origin-application-id", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "origin-application-id", required = false) String originApplicationId,
        @Parameter(name = "application-id", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "application-id", required = false) String applicationId,
        @Parameter(name = "session-id", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "session-id", required = false) String sessionId,
        @Parameter(name = "interaction-id", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "interaction-id", required = false) String interactionId,
        @Parameter(name = "activity-id", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "activity-id", required = false) String activityId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"currentDataPasses\" : [ { \"soc\" : \"INTL24NA\", \"usage\" : 15.3, \"expirationStatus\" : \"UPCOMING\", \"dataPassGroup\" : \"dataPassGroup\", \"expiryDate\" : \"2024-08-31\", \"beginDate\" : \"2024-08-30\", \"unit\" : \"MB/GB\", \"price\" : 5.15, \"name\" : \"1 Day (512MB) International Data Pass\", \"limit\" : 15360.0, \"expiryTime\" : \"10:08 AM PT\", \"serviceSequenceNumber\" : \"404549875\", \"beginTime\" : \"10:08 AM PT\" }, { \"soc\" : \"INTL24NA\", \"usage\" : 15.3, \"expirationStatus\" : \"UPCOMING\", \"dataPassGroup\" : \"dataPassGroup\", \"expiryDate\" : \"2024-08-31\", \"beginDate\" : \"2024-08-30\", \"unit\" : \"MB/GB\", \"price\" : 5.15, \"name\" : \"1 Day (512MB) International Data Pass\", \"limit\" : 15360.0, \"expiryTime\" : \"10:08 AM PT\", \"serviceSequenceNumber\" : \"404549875\", \"beginTime\" : \"10:08 AM PT\" } ], \"eligibleSubscriptions\" : [ { \"imageText\" : \"Netflix\", \"subscriptionGroup\" : \"Netflix. This field should not be used for display since it could be not user friendly e.g. AppleTVOnUs.\", \"subscriptionPlans\" : [ { \"soc\" : \"500GBG1\", \"displayName\" : \"displayName\", \"partnerTermsAndConditionText\" : \"partnerTermsAndConditionText\", \"isActive\" : true, \"subCategories\" : [ \"Data Service\" ], \"displayPrice\" : 5.99, \"price\" : 5.99, \"serviceTrialRemovalMessage\" : \"serviceTrialRemovalMessage\", \"isSelected\" : true, \"relatedServices\" : [ { \"soc\" : \"soc\", \"socName\" : \"socName\" }, { \"soc\" : \"soc\", \"socName\" : \"socName\" } ], \"serviceSequenceNumber\" : \"404549861\", \"availabilityStatus\" : \"ForSale\", \"serviceRemovalInfo\" : \"serviceRemovalInfo\", \"isMandatory\" : true, \"isPendingRemoval\" : true, \"level\" : \"PRODUCT (Plan level - applicable to all subscribers on the same plan)/SUBSCRIBER (Subscriber level)\", \"shortDescription\" : \"Have you backed up your phone lately? Don’t wait till it’s too late. Hold onto each puppy pic and vacation moment with the Google One 500GB storage plan. Get the first 30 days free just for being a T-Mobile customer. After trial, pay $5/mo. Cancel anytime.\", \"isRemovablePhp\" : true, \"planServiceDetails\" : { \"features\" : [ \"feature1\", \"feature 2\" ], \"includedServices\" : [ \"included service 1\", \"included service 2\" ], \"description\" : \"With MAXUp Data you get 40GB total of high-speed mobile hotspot data. After that, you get unlimited mobile hotspot on our network at max 3G speeds. On-device usage is prioritized over tethering usage, which may result in higher speeds for data used on device.\" }, \"subscriptionGroup\" : \"Netflix\", \"isPendingAddition\" : true, \"taxTreatment\" : \"TI\", \"conflictingServiceList\" : [ \"SOC1\", \"SOC2\" ], \"serviceDisclaimerMessage\" : \"serviceDisclaimerMessage\", \"name\" : \"Google One 500GB\", \"serviceSubType\" : \"Data Service\", \"autoRenewalTermsAndConditionText\" : \"autoRenewalTermsAndConditionText\", \"effectiveDate\" : \"2023-06-13\", \"prerequisiteServiceSocs\" : [ \"HDPASS\" ], \"freeTrialDescription\" : \"freeTrialDescription\" }, { \"soc\" : \"500GBG1\", \"displayName\" : \"displayName\", \"partnerTermsAndConditionText\" : \"partnerTermsAndConditionText\", \"isActive\" : true, \"subCategories\" : [ \"Data Service\" ], \"displayPrice\" : 5.99, \"price\" : 5.99, \"serviceTrialRemovalMessage\" : \"serviceTrialRemovalMessage\", \"isSelected\" : true, \"relatedServices\" : [ { \"soc\" : \"soc\", \"socName\" : \"socName\" }, { \"soc\" : \"soc\", \"socName\" : \"socName\" } ], \"serviceSequenceNumber\" : \"404549861\", \"availabilityStatus\" : \"ForSale\", \"serviceRemovalInfo\" : \"serviceRemovalInfo\", \"isMandatory\" : true, \"isPendingRemoval\" : true, \"level\" : \"PRODUCT (Plan level - applicable to all subscribers on the same plan)/SUBSCRIBER (Subscriber level)\", \"shortDescription\" : \"Have you backed up your phone lately? Don’t wait till it’s too late. Hold onto each puppy pic and vacation moment with the Google One 500GB storage plan. Get the first 30 days free just for being a T-Mobile customer. After trial, pay $5/mo. Cancel anytime.\", \"isRemovablePhp\" : true, \"planServiceDetails\" : { \"features\" : [ \"feature1\", \"feature 2\" ], \"includedServices\" : [ \"included service 1\", \"included service 2\" ], \"description\" : \"With MAXUp Data you get 40GB total of high-speed mobile hotspot data. After that, you get unlimited mobile hotspot on our network at max 3G speeds. On-device usage is prioritized over tethering usage, which may result in higher speeds for data used on device.\" }, \"subscriptionGroup\" : \"Netflix\", \"isPendingAddition\" : true, \"taxTreatment\" : \"TI\", \"conflictingServiceList\" : [ \"SOC1\", \"SOC2\" ], \"serviceDisclaimerMessage\" : \"serviceDisclaimerMessage\", \"name\" : \"Google One 500GB\", \"serviceSubType\" : \"Data Service\", \"autoRenewalTermsAndConditionText\" : \"autoRenewalTermsAndConditionText\", \"effectiveDate\" : \"2023-06-13\", \"prerequisiteServiceSocs\" : [ \"HDPASS\" ], \"freeTrialDescription\" : \"freeTrialDescription\" } ], \"imageUrl\" : \"https://...\", \"largeImageUrl\" : \"https://...\", \"name\" : \"Netflix. This field should not be used for display since it could be not user friendly e.g. AppleTVOnUs.\" }, { \"imageText\" : \"Netflix\", \"subscriptionGroup\" : \"Netflix. This field should not be used for display since it could be not user friendly e.g. AppleTVOnUs.\", \"subscriptionPlans\" : [ { \"soc\" : \"500GBG1\", \"displayName\" : \"displayName\", \"partnerTermsAndConditionText\" : \"partnerTermsAndConditionText\", \"isActive\" : true, \"subCategories\" : [ \"Data Service\" ], \"displayPrice\" : 5.99, \"price\" : 5.99, \"serviceTrialRemovalMessage\" : \"serviceTrialRemovalMessage\", \"isSelected\" : true, \"relatedServices\" : [ { \"soc\" : \"soc\", \"socName\" : \"socName\" }, { \"soc\" : \"soc\", \"socName\" : \"socName\" } ], \"serviceSequenceNumber\" : \"404549861\", \"availabilityStatus\" : \"ForSale\", \"serviceRemovalInfo\" : \"serviceRemovalInfo\", \"isMandatory\" : true, \"isPendingRemoval\" : true, \"level\" : \"PRODUCT (Plan level - applicable to all subscribers on the same plan)/SUBSCRIBER (Subscriber level)\", \"shortDescription\" : \"Have you backed up your phone lately? Don’t wait till it’s too late. Hold onto each puppy pic and vacation moment with the Google One 500GB storage plan. Get the first 30 days free just for being a T-Mobile customer. After trial, pay $5/mo. Cancel anytime.\", \"isRemovablePhp\" : true, \"planServiceDetails\" : { \"features\" : [ \"feature1\", \"feature 2\" ], \"includedServices\" : [ \"included service 1\", \"included service 2\" ], \"description\" : \"With MAXUp Data you get 40GB total of high-speed mobile hotspot data. After that, you get unlimited mobile hotspot on our network at max 3G speeds. On-device usage is prioritized over tethering usage, which may result in higher speeds for data used on device.\" }, \"subscriptionGroup\" : \"Netflix\", \"isPendingAddition\" : true, \"taxTreatment\" : \"TI\", \"conflictingServiceList\" : [ \"SOC1\", \"SOC2\" ], \"serviceDisclaimerMessage\" : \"serviceDisclaimerMessage\", \"name\" : \"Google One 500GB\", \"serviceSubType\" : \"Data Service\", \"autoRenewalTermsAndConditionText\" : \"autoRenewalTermsAndConditionText\", \"effectiveDate\" : \"2023-06-13\", \"prerequisiteServiceSocs\" : [ \"HDPASS\" ], \"freeTrialDescription\" : \"freeTrialDescription\" }, { \"soc\" : \"500GBG1\", \"displayName\" : \"displayName\", \"partnerTermsAndConditionText\" : \"partnerTermsAndConditionText\", \"isActive\" : true, \"subCategories\" : [ \"Data Service\" ], \"displayPrice\" : 5.99, \"price\" : 5.99, \"serviceTrialRemovalMessage\" : \"serviceTrialRemovalMessage\", \"isSelected\" : true, \"relatedServices\" : [ { \"soc\" : \"soc\", \"socName\" : \"socName\" }, { \"soc\" : \"soc\", \"socName\" : \"socName\" } ], \"serviceSequenceNumber\" : \"404549861\", \"availabilityStatus\" : \"ForSale\", \"serviceRemovalInfo\" : \"serviceRemovalInfo\", \"isMandatory\" : true, \"isPendingRemoval\" : true, \"level\" : \"PRODUCT (Plan level - applicable to all subscribers on the same plan)/SUBSCRIBER (Subscriber level)\", \"shortDescription\" : \"Have you backed up your phone lately? Don’t wait till it’s too late. Hold onto each puppy pic and vacation moment with the Google One 500GB storage plan. Get the first 30 days free just for being a T-Mobile customer. After trial, pay $5/mo. Cancel anytime.\", \"isRemovablePhp\" : true, \"planServiceDetails\" : { \"features\" : [ \"feature1\", \"feature 2\" ], \"includedServices\" : [ \"included service 1\", \"included service 2\" ], \"description\" : \"With MAXUp Data you get 40GB total of high-speed mobile hotspot data. After that, you get unlimited mobile hotspot on our network at max 3G speeds. On-device usage is prioritized over tethering usage, which may result in higher speeds for data used on device.\" }, \"subscriptionGroup\" : \"Netflix\", \"isPendingAddition\" : true, \"taxTreatment\" : \"TI\", \"conflictingServiceList\" : [ \"SOC1\", \"SOC2\" ], \"serviceDisclaimerMessage\" : \"serviceDisclaimerMessage\", \"name\" : \"Google One 500GB\", \"serviceSubType\" : \"Data Service\", \"autoRenewalTermsAndConditionText\" : \"autoRenewalTermsAndConditionText\", \"effectiveDate\" : \"2023-06-13\", \"prerequisiteServiceSocs\" : [ \"HDPASS\" ], \"freeTrialDescription\" : \"freeTrialDescription\" } ], \"imageUrl\" : \"https://...\", \"largeImageUrl\" : \"https://...\", \"name\" : \"Netflix. This field should not be used for display since it could be not user friendly e.g. AppleTVOnUs.\" } ], \"planDataServices\" : [ { \"isPendingRemoval\" : true, \"socConfig\" : \"For Sale/Non-removable SOC. Non-removable SOC implies this service is not removable if it was added previously.\", \"level\" : \"PRODUCT (Plan level - applicable to all subscribers on the same plan)/SUBSCRIBER (Subscriber level)\", \"soc\" : \"MPUDAT40\", \"displayName\" : \"Unlimited Promo\", \"shortDescription\" : \"MAXUp Data with 40GB of Hotspot Data\", \"subCategories\" : [ \"Data Service\" ], \"platforms\" : [ \"iOS\", \"Windows\", \"Android\" ], \"planServiceDetails\" : { \"features\" : [ \"feature1\", \"feature 2\" ], \"includedServices\" : [ \"included service 1\", \"included service 2\" ], \"description\" : \"With MAXUp Data you get 40GB total of high-speed mobile hotspot data. After that, you get unlimited mobile hotspot on our network at max 3G speeds. On-device usage is prioritized over tethering usage, which may result in higher speeds for data used on device.\" }, \"isPendingAddition\" : true, \"taxTreatment\" : \"TI\", \"displayPrice\" : 5.99, \"conflictingServiceList\" : [ \"SOC1\", \"SOC2\" ], \"price\" : 5.99, \"name\" : \"MAXUp Data with 40GB of Hotspot Data\", \"isSelected\" : true, \"pendingChangeEffectiveDate\" : \"2024-09-14\", \"serviceSubType\" : \"Data Service\", \"serviceSequenceNumber\" : \"404549855\", \"isShared\" : true, \"isMandatory\" : true, \"effectiveDate\" : \"2024-09-14\", \"prerequisiteServiceSocs\" : [ \"HDPASS\" ] }, { \"isPendingRemoval\" : true, \"socConfig\" : \"For Sale/Non-removable SOC. Non-removable SOC implies this service is not removable if it was added previously.\", \"level\" : \"PRODUCT (Plan level - applicable to all subscribers on the same plan)/SUBSCRIBER (Subscriber level)\", \"soc\" : \"MPUDAT40\", \"displayName\" : \"Unlimited Promo\", \"shortDescription\" : \"MAXUp Data with 40GB of Hotspot Data\", \"subCategories\" : [ \"Data Service\" ], \"platforms\" : [ \"iOS\", \"Windows\", \"Android\" ], \"planServiceDetails\" : { \"features\" : [ \"feature1\", \"feature 2\" ], \"includedServices\" : [ \"included service 1\", \"included service 2\" ], \"description\" : \"With MAXUp Data you get 40GB total of high-speed mobile hotspot data. After that, you get unlimited mobile hotspot on our network at max 3G speeds. On-device usage is prioritized over tethering usage, which may result in higher speeds for data used on device.\" }, \"isPendingAddition\" : true, \"taxTreatment\" : \"TI\", \"displayPrice\" : 5.99, \"conflictingServiceList\" : [ \"SOC1\", \"SOC2\" ], \"price\" : 5.99, \"name\" : \"MAXUp Data with 40GB of Hotspot Data\", \"isSelected\" : true, \"pendingChangeEffectiveDate\" : \"2024-09-14\", \"serviceSubType\" : \"Data Service\", \"serviceSequenceNumber\" : \"404549855\", \"isShared\" : true, \"isMandatory\" : true, \"effectiveDate\" : \"2024-09-14\", \"prerequisiteServiceSocs\" : [ \"HDPASS\" ] } ], \"eligibleDataPasses\" : [ { \"duration\" : 24.0, \"unit\" : \"GB\", \"isImmediateFlag\" : true, \"conflictingServiceList\" : [ \"SOC1\", \"SOC2\" ], \"soc\" : \"INTL24NA\", \"price\" : 5.99, \"name\" : \"1 Day (512MB) International Data Pass\", \"limit\" : 512.99, \"description\" : \"For up to 24 hours in 215+ destinations, you get: <ul><li>Up to 512MB of high-speed international data, this data can also be used as a Mobile Hotspot.</li><li>Unlimited calling. </li></ul>Note: Once you use all your high-speed data, you will continue to have unlimited calling and data for the full 24 hours but may experience slower data speeds. If you use all your high-speed data and purchase a NEW pass before the expiration of the first one, your second pass will begin immediately. Your original pass and any remaining benefits will expire when you activate the new pass. Speeds & coverage vary based on device and country. Qualifying plan required.\", \"dataPassGroup\" : \"dataPassGroup\", \"durationUnit\" : \"HOURS\", \"selectedDataPassEffectiveDate\" : \"2024-08-22T15:57:48.000-07:00\" }, { \"duration\" : 24.0, \"unit\" : \"GB\", \"isImmediateFlag\" : true, \"conflictingServiceList\" : [ \"SOC1\", \"SOC2\" ], \"soc\" : \"INTL24NA\", \"price\" : 5.99, \"name\" : \"1 Day (512MB) International Data Pass\", \"limit\" : 512.99, \"description\" : \"For up to 24 hours in 215+ destinations, you get: <ul><li>Up to 512MB of high-speed international data, this data can also be used as a Mobile Hotspot.</li><li>Unlimited calling. </li></ul>Note: Once you use all your high-speed data, you will continue to have unlimited calling and data for the full 24 hours but may experience slower data speeds. If you use all your high-speed data and purchase a NEW pass before the expiration of the first one, your second pass will begin immediately. Your original pass and any remaining benefits will expire when you activate the new pass. Speeds & coverage vary based on device and country. Qualifying plan required.\", \"dataPassGroup\" : \"dataPassGroup\", \"durationUnit\" : \"HOURS\", \"selectedDataPassEffectiveDate\" : \"2024-08-22T15:57:48.000-07:00\" } ], \"isLineInvoluntarySuspended\" : true, \"currentMonthlyTotal\" : 22.12, \"currentDate\" : \"2024-08-22\", \"passLimitExceededCatList\" : [ \"ON_NETWORK_TETHERING_ONLY\" ], \"isBanVoluntarySuspended\" : true, \"activeSubscriptions\" : [ { \"imageText\" : \"Netflix\", \"subscriptionPlans\" : [ { \"soc\" : \"500GBG1\", \"displayName\" : \"displayName\", \"partnerTermsAndConditionText\" : \"partnerTermsAndConditionText\", \"isActive\" : true, \"subCategories\" : [ \"Data Service\" ], \"displayPrice\" : 5.99, \"price\" : 5.99, \"serviceTrialRemovalMessage\" : \"serviceTrialRemovalMessage\", \"isSelected\" : true, \"relatedServices\" : [ { \"soc\" : \"soc\", \"socName\" : \"socName\" }, { \"soc\" : \"soc\", \"socName\" : \"socName\" } ], \"serviceSequenceNumber\" : \"404549861\", \"availabilityStatus\" : \"ForSale\", \"serviceRemovalInfo\" : \"serviceRemovalInfo\", \"isMandatory\" : true, \"isPendingRemoval\" : true, \"level\" : \"PRODUCT (Plan level - applicable to all subscribers on the same plan)/SUBSCRIBER (Subscriber level)\", \"shortDescription\" : \"Have you backed up your phone lately? Don’t wait till it’s too late. Hold onto each puppy pic and vacation moment with the Google One 500GB storage plan. Get the first 30 days free just for being a T-Mobile customer. After trial, pay $5/mo. Cancel anytime.\", \"isRemovablePhp\" : true, \"planServiceDetails\" : { \"features\" : [ \"feature1\", \"feature 2\" ], \"includedServices\" : [ \"included service 1\", \"included service 2\" ], \"description\" : \"With MAXUp Data you get 40GB total of high-speed mobile hotspot data. After that, you get unlimited mobile hotspot on our network at max 3G speeds. On-device usage is prioritized over tethering usage, which may result in higher speeds for data used on device.\" }, \"subscriptionGroup\" : \"Netflix\", \"isPendingAddition\" : true, \"taxTreatment\" : \"TI\", \"conflictingServiceList\" : [ \"SOC1\", \"SOC2\" ], \"serviceDisclaimerMessage\" : \"serviceDisclaimerMessage\", \"name\" : \"Google One 500GB\", \"serviceSubType\" : \"Data Service\", \"autoRenewalTermsAndConditionText\" : \"autoRenewalTermsAndConditionText\", \"effectiveDate\" : \"2023-06-13\", \"prerequisiteServiceSocs\" : [ \"HDPASS\" ], \"freeTrialDescription\" : \"freeTrialDescription\" }, { \"soc\" : \"500GBG1\", \"displayName\" : \"displayName\", \"partnerTermsAndConditionText\" : \"partnerTermsAndConditionText\", \"isActive\" : true, \"subCategories\" : [ \"Data Service\" ], \"displayPrice\" : 5.99, \"price\" : 5.99, \"serviceTrialRemovalMessage\" : \"serviceTrialRemovalMessage\", \"isSelected\" : true, \"relatedServices\" : [ { \"soc\" : \"soc\", \"socName\" : \"socName\" }, { \"soc\" : \"soc\", \"socName\" : \"socName\" } ], \"serviceSequenceNumber\" : \"404549861\", \"availabilityStatus\" : \"ForSale\", \"serviceRemovalInfo\" : \"serviceRemovalInfo\", \"isMandatory\" : true, \"isPendingRemoval\" : true, \"level\" : \"PRODUCT (Plan level - applicable to all subscribers on the same plan)/SUBSCRIBER (Subscriber level)\", \"shortDescription\" : \"Have you backed up your phone lately? Don’t wait till it’s too late. Hold onto each puppy pic and vacation moment with the Google One 500GB storage plan. Get the first 30 days free just for being a T-Mobile customer. After trial, pay $5/mo. Cancel anytime.\", \"isRemovablePhp\" : true, \"planServiceDetails\" : { \"features\" : [ \"feature1\", \"feature 2\" ], \"includedServices\" : [ \"included service 1\", \"included service 2\" ], \"description\" : \"With MAXUp Data you get 40GB total of high-speed mobile hotspot data. After that, you get unlimited mobile hotspot on our network at max 3G speeds. On-device usage is prioritized over tethering usage, which may result in higher speeds for data used on device.\" }, \"subscriptionGroup\" : \"Netflix\", \"isPendingAddition\" : true, \"taxTreatment\" : \"TI\", \"conflictingServiceList\" : [ \"SOC1\", \"SOC2\" ], \"serviceDisclaimerMessage\" : \"serviceDisclaimerMessage\", \"name\" : \"Google One 500GB\", \"serviceSubType\" : \"Data Service\", \"autoRenewalTermsAndConditionText\" : \"autoRenewalTermsAndConditionText\", \"effectiveDate\" : \"2023-06-13\", \"prerequisiteServiceSocs\" : [ \"HDPASS\" ], \"freeTrialDescription\" : \"freeTrialDescription\" } ], \"partnerActivationUrl\" : \"https://www.netflix.com/partner/home?ptoken=abc\", \"soc\" : \"500GBG1\", \"shortDescription\" : \"Have you backed up your phone lately? Don’t wait till it’s too late. Hold onto each puppy pic and vacation moment with the Google One 500GB storage plan. Get the first 30 days free just for being a T-Mobile customer. After trial, pay $5/mo. Cancel anytime.\", \"isActive\" : true, \"isPendingAddition\" : true, \"planServiceDetails\" : { \"features\" : [ \"feature1\", \"feature 2\" ], \"includedServices\" : [ \"included service 1\", \"included service 2\" ], \"description\" : \"With MAXUp Data you get 40GB total of high-speed mobile hotspot data. After that, you get unlimited mobile hotspot on our network at max 3G speeds. On-device usage is prioritized over tethering usage, which may result in higher speeds for data used on device.\" }, \"subscriptionGroup\" : \"Netflix\", \"taxTreatment\" : \"TI\", \"displayPrice\" : 5.99, \"price\" : 5.99, \"imageUrl\" : \"https://...\", \"largeImageUrl\" : \"https://...\", \"name\" : \"Google One 500GB\", \"serviceSequenceNumber\" : \"404549875\", \"isPartnerStatusApiFailure\" : true, \"effectiveDate\" : \"2023-06-13\" }, { \"imageText\" : \"Netflix\", \"subscriptionPlans\" : [ { \"soc\" : \"500GBG1\", \"displayName\" : \"displayName\", \"partnerTermsAndConditionText\" : \"partnerTermsAndConditionText\", \"isActive\" : true, \"subCategories\" : [ \"Data Service\" ], \"displayPrice\" : 5.99, \"price\" : 5.99, \"serviceTrialRemovalMessage\" : \"serviceTrialRemovalMessage\", \"isSelected\" : true, \"relatedServices\" : [ { \"soc\" : \"soc\", \"socName\" : \"socName\" }, { \"soc\" : \"soc\", \"socName\" : \"socName\" } ], \"serviceSequenceNumber\" : \"404549861\", \"availabilityStatus\" : \"ForSale\", \"serviceRemovalInfo\" : \"serviceRemovalInfo\", \"isMandatory\" : true, \"isPendingRemoval\" : true, \"level\" : \"PRODUCT (Plan level - applicable to all subscribers on the same plan)/SUBSCRIBER (Subscriber level)\", \"shortDescription\" : \"Have you backed up your phone lately? Don’t wait till it’s too late. Hold onto each puppy pic and vacation moment with the Google One 500GB storage plan. Get the first 30 days free just for being a T-Mobile customer. After trial, pay $5/mo. Cancel anytime.\", \"isRemovablePhp\" : true, \"planServiceDetails\" : { \"features\" : [ \"feature1\", \"feature 2\" ], \"includedServices\" : [ \"included service 1\", \"included service 2\" ], \"description\" : \"With MAXUp Data you get 40GB total of high-speed mobile hotspot data. After that, you get unlimited mobile hotspot on our network at max 3G speeds. On-device usage is prioritized over tethering usage, which may result in higher speeds for data used on device.\" }, \"subscriptionGroup\" : \"Netflix\", \"isPendingAddition\" : true, \"taxTreatment\" : \"TI\", \"conflictingServiceList\" : [ \"SOC1\", \"SOC2\" ], \"serviceDisclaimerMessage\" : \"serviceDisclaimerMessage\", \"name\" : \"Google One 500GB\", \"serviceSubType\" : \"Data Service\", \"autoRenewalTermsAndConditionText\" : \"autoRenewalTermsAndConditionText\", \"effectiveDate\" : \"2023-06-13\", \"prerequisiteServiceSocs\" : [ \"HDPASS\" ], \"freeTrialDescription\" : \"freeTrialDescription\" }, { \"soc\" : \"500GBG1\", \"displayName\" : \"displayName\", \"partnerTermsAndConditionText\" : \"partnerTermsAndConditionText\", \"isActive\" : true, \"subCategories\" : [ \"Data Service\" ], \"displayPrice\" : 5.99, \"price\" : 5.99, \"serviceTrialRemovalMessage\" : \"serviceTrialRemovalMessage\", \"isSelected\" : true, \"relatedServices\" : [ { \"soc\" : \"soc\", \"socName\" : \"socName\" }, { \"soc\" : \"soc\", \"socName\" : \"socName\" } ], \"serviceSequenceNumber\" : \"404549861\", \"availabilityStatus\" : \"ForSale\", \"serviceRemovalInfo\" : \"serviceRemovalInfo\", \"isMandatory\" : true, \"isPendingRemoval\" : true, \"level\" : \"PRODUCT (Plan level - applicable to all subscribers on the same plan)/SUBSCRIBER (Subscriber level)\", \"shortDescription\" : \"Have you backed up your phone lately? Don’t wait till it’s too late. Hold onto each puppy pic and vacation moment with the Google One 500GB storage plan. Get the first 30 days free just for being a T-Mobile customer. After trial, pay $5/mo. Cancel anytime.\", \"isRemovablePhp\" : true, \"planServiceDetails\" : { \"features\" : [ \"feature1\", \"feature 2\" ], \"includedServices\" : [ \"included service 1\", \"included service 2\" ], \"description\" : \"With MAXUp Data you get 40GB total of high-speed mobile hotspot data. After that, you get unlimited mobile hotspot on our network at max 3G speeds. On-device usage is prioritized over tethering usage, which may result in higher speeds for data used on device.\" }, \"subscriptionGroup\" : \"Netflix\", \"isPendingAddition\" : true, \"taxTreatment\" : \"TI\", \"conflictingServiceList\" : [ \"SOC1\", \"SOC2\" ], \"serviceDisclaimerMessage\" : \"serviceDisclaimerMessage\", \"name\" : \"Google One 500GB\", \"serviceSubType\" : \"Data Service\", \"autoRenewalTermsAndConditionText\" : \"autoRenewalTermsAndConditionText\", \"effectiveDate\" : \"2023-06-13\", \"prerequisiteServiceSocs\" : [ \"HDPASS\" ], \"freeTrialDescription\" : \"freeTrialDescription\" } ], \"partnerActivationUrl\" : \"https://www.netflix.com/partner/home?ptoken=abc\", \"soc\" : \"500GBG1\", \"shortDescription\" : \"Have you backed up your phone lately? Don’t wait till it’s too late. Hold onto each puppy pic and vacation moment with the Google One 500GB storage plan. Get the first 30 days free just for being a T-Mobile customer. After trial, pay $5/mo. Cancel anytime.\", \"isActive\" : true, \"isPendingAddition\" : true, \"planServiceDetails\" : { \"features\" : [ \"feature1\", \"feature 2\" ], \"includedServices\" : [ \"included service 1\", \"included service 2\" ], \"description\" : \"With MAXUp Data you get 40GB total of high-speed mobile hotspot data. After that, you get unlimited mobile hotspot on our network at max 3G speeds. On-device usage is prioritized over tethering usage, which may result in higher speeds for data used on device.\" }, \"subscriptionGroup\" : \"Netflix\", \"taxTreatment\" : \"TI\", \"displayPrice\" : 5.99, \"price\" : 5.99, \"imageUrl\" : \"https://...\", \"largeImageUrl\" : \"https://...\", \"name\" : \"Google One 500GB\", \"serviceSequenceNumber\" : \"404549875\", \"isPartnerStatusApiFailure\" : true, \"effectiveDate\" : \"2023-06-13\" } ], \"isBanInvoluntarySuspended\" : true, \"currentServices\" : [ { \"planServiceDetails\" : { \"features\" : [ \"feature1\", \"feature 2\" ], \"includedServices\" : [ \"included service 1\", \"included service 2\" ], \"description\" : \"With MAXUp Data you get 40GB total of high-speed mobile hotspot data. After that, you get unlimited mobile hotspot on our network at max 3G speeds. On-device usage is prioritized over tethering usage, which may result in higher speeds for data used on device.\" }, \"displayPrice\" : 10.15, \"planServiceStatus\" : \"REMOVED/CURRENT/FUTURE_DATED\", \"level\" : \"PRODUCT (Plan level - applicable to all subscribers on the same plan)/SUBSCRIBER (Subscriber level)\", \"soc\" : \"MGDATA\", \"price\" : 10.15, \"name\" : \"MAXUp Data with 40GB of Hotspot Data\", \"serviceSequenceNumber\" : \"404549875\", \"shortDescription\" : \"MAXUp Data with 40GB of Hotspot Data\", \"productType\" : \"GSM/MBB\", \"effectiveDate\" : \"2021-07-30\", \"expirationDate\" : \"2024-09-14\" }, { \"planServiceDetails\" : { \"features\" : [ \"feature1\", \"feature 2\" ], \"includedServices\" : [ \"included service 1\", \"included service 2\" ], \"description\" : \"With MAXUp Data you get 40GB total of high-speed mobile hotspot data. After that, you get unlimited mobile hotspot on our network at max 3G speeds. On-device usage is prioritized over tethering usage, which may result in higher speeds for data used on device.\" }, \"displayPrice\" : 10.15, \"planServiceStatus\" : \"REMOVED/CURRENT/FUTURE_DATED\", \"level\" : \"PRODUCT (Plan level - applicable to all subscribers on the same plan)/SUBSCRIBER (Subscriber level)\", \"soc\" : \"MGDATA\", \"price\" : 10.15, \"name\" : \"MAXUp Data with 40GB of Hotspot Data\", \"serviceSequenceNumber\" : \"404549875\", \"shortDescription\" : \"MAXUp Data with 40GB of Hotspot Data\", \"productType\" : \"GSM/MBB\", \"effectiveDate\" : \"2021-07-30\", \"expirationDate\" : \"2024-09-14\" } ], \"internationalDataPassLimit\" : 10.0, \"eligibleServices\" : [ { \"soc\" : \"BMMSS\", \"displayName\" : \"Unlimited Promo\", \"partnerTermsAndConditionText\" : \"partnerTermsAndConditionText\", \"subCategories\" : [ \"Block Messages\" ], \"platforms\" : [ \"iOS\", \"Windows\", \"Android\" ], \"displayPrice\" : 5.99, \"price\" : 5.99, \"serviceTrialRemovalMessage\" : \"serviceTrialRemovalMessage\", \"isSelected\" : true, \"relatedServices\" : [ { \"soc\" : \"soc\", \"socName\" : \"socName\" }, { \"soc\" : \"soc\", \"socName\" : \"socName\" } ], \"availabilityStatus\" : \"ForSale\", \"serviceRemovalInfo\" : \"serviceRemovalInfo\", \"isMandatory\" : true, \"isPendingRemoval\" : true, \"socConfig\" : \"For Sale/Non-removable SOC. Non-removable SOC implies this service is not removable if it was added previously.\", \"level\" : \"PRODUCT (Plan level - applicable to all subscribers on the same plan)/SUBSCRIBER (Subscriber level)\", \"shortDescription\" : \"MAXUp Data with 40GB of Hotspot Data\", \"isRemovablePhp\" : true, \"planServiceDetails\" : { \"features\" : [ \"feature1\", \"feature 2\" ], \"includedServices\" : [ \"included service 1\", \"included service 2\" ], \"description\" : \"With MAXUp Data you get 40GB total of high-speed mobile hotspot data. After that, you get unlimited mobile hotspot on our network at max 3G speeds. On-device usage is prioritized over tethering usage, which may result in higher speeds for data used on device.\" }, \"isPendingAddition\" : true, \"taxTreatment\" : \"TI\", \"conflictingServiceList\" : [ \"SOC1\", \"SOC2\" ], \"serviceDisclaimerMessage\" : \"404549855\", \"name\" : \"Block Chargeable Text and Picture Messages\", \"pendingChangeEffectiveDate\" : \"2024-09-14\", \"serviceSubType\" : \"BLOCKING\", \"autoRenewalTermsAndConditionText\" : \"autoRenewalTermsAndConditionText\", \"isShared\" : true, \"effectiveDate\" : \"2024-09-14\", \"prerequisiteServiceSocs\" : [ \"HDPASS\" ], \"freeTrialDescription\" : \"freeTrialDescription\" }, { \"soc\" : \"BMMSS\", \"displayName\" : \"Unlimited Promo\", \"partnerTermsAndConditionText\" : \"partnerTermsAndConditionText\", \"subCategories\" : [ \"Block Messages\" ], \"platforms\" : [ \"iOS\", \"Windows\", \"Android\" ], \"displayPrice\" : 5.99, \"price\" : 5.99, \"serviceTrialRemovalMessage\" : \"serviceTrialRemovalMessage\", \"isSelected\" : true, \"relatedServices\" : [ { \"soc\" : \"soc\", \"socName\" : \"socName\" }, { \"soc\" : \"soc\", \"socName\" : \"socName\" } ], \"availabilityStatus\" : \"ForSale\", \"serviceRemovalInfo\" : \"serviceRemovalInfo\", \"isMandatory\" : true, \"isPendingRemoval\" : true, \"socConfig\" : \"For Sale/Non-removable SOC. Non-removable SOC implies this service is not removable if it was added previously.\", \"level\" : \"PRODUCT (Plan level - applicable to all subscribers on the same plan)/SUBSCRIBER (Subscriber level)\", \"shortDescription\" : \"MAXUp Data with 40GB of Hotspot Data\", \"isRemovablePhp\" : true, \"planServiceDetails\" : { \"features\" : [ \"feature1\", \"feature 2\" ], \"includedServices\" : [ \"included service 1\", \"included service 2\" ], \"description\" : \"With MAXUp Data you get 40GB total of high-speed mobile hotspot data. After that, you get unlimited mobile hotspot on our network at max 3G speeds. On-device usage is prioritized over tethering usage, which may result in higher speeds for data used on device.\" }, \"isPendingAddition\" : true, \"taxTreatment\" : \"TI\", \"conflictingServiceList\" : [ \"SOC1\", \"SOC2\" ], \"serviceDisclaimerMessage\" : \"404549855\", \"name\" : \"Block Chargeable Text and Picture Messages\", \"pendingChangeEffectiveDate\" : \"2024-09-14\", \"serviceSubType\" : \"BLOCKING\", \"autoRenewalTermsAndConditionText\" : \"autoRenewalTermsAndConditionText\", \"isShared\" : true, \"effectiveDate\" : \"2024-09-14\", \"prerequisiteServiceSocs\" : [ \"HDPASS\" ], \"freeTrialDescription\" : \"freeTrialDescription\" } ], \"hasPendingPlansServices\" : true, \"isLineLevelSuspended\" : true, \"isTaxInclusive\" : true, \"isAccountLevelSuspended\" : true, \"maxFuturePurchaseDays\" : 30.0, \"hasPendingDatasService\" : true, \"productType\" : \"GSM/MBB\", \"banSuspensionDetails\" : { \"isNonPayment\" : true, \"pastDueAmount\" : 100.12, \"isOther\" : true } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
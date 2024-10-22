/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.9.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package dev.bhanu.api;

import dev.bhanu.model.ChangePlanRequest;
import dev.bhanu.model.ChangePlanResponse;
import dev.bhanu.model.Error;
import java.time.OffsetDateTime;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T01:48:13.122437+05:30[Asia/Kolkata]", comments = "Generator version: 7.9.0")
@Validated
@Tag(name = "services", description = "the services API")
public interface UpdateServicesApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /update-services : Change plan and services
     *
     * @param authorization Bearer prefix JWT Token (required)
     * @param xAuthorization Taap compliant POPT Token. (required)
     * @param xAuthOriginator Id token. (required)
     * @param body  (required)
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
     * @return Ok (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or ProducerId is not authorized to publish event in env or Event not associated with any Team name in DEEP.io Registry (status code 403)
     *         or Resource not found (status code 404)
     *         or Method Not Allowed (status code 405)
     *         or Mismatching data format (status code 406)
     *         or System Error (status code 500)
     *         or Service unavailable (status code 503)
     */
    @Operation(
        operationId = "apiToUpdatePlanServicesDatapass",
        summary = "Change plan and services",
        tags = { "services" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Ok", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ChangePlanResponse.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad Request", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "401", description = "Unauthorized", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "403", description = "ProducerId is not authorized to publish event in env or Event not associated with any Team name in DEEP.io Registry", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "404", description = "Resource not found", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "405", description = "Method Not Allowed", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "406", description = "Mismatching data format", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "500", description = "System Error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "503", description = "Service unavailable", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        security = {
            @SecurityRequirement(name = "OAuth2")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/update-services",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<ChangePlanResponse> apiToUpdatePlanServicesDatapass(
        @NotNull @Pattern(regexp = ".*$") @Parameter(name = "Authorization", description = "Bearer prefix JWT Token", required = true, in = ParameterIn.HEADER) @RequestHeader(value = "Authorization", required = true) String authorization,
        @NotNull @Pattern(regexp = ".*$") @Parameter(name = "X-Authorization", description = "Taap compliant POPT Token.", required = true, in = ParameterIn.HEADER) @RequestHeader(value = "X-Authorization", required = true) String xAuthorization,
        @NotNull @Pattern(regexp = ".*$") @Parameter(name = "X-Auth-Originator", description = "Id token.", required = true, in = ParameterIn.HEADER) @RequestHeader(value = "X-Auth-Originator", required = true) String xAuthOriginator,
        @Parameter(name = "body", description = "", required = true) @Valid @RequestBody ChangePlanRequest body,
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
                    String exampleString = "{ \"statusDetails\" : { \"status\" : \"SUCCESS\", \"statusCode\" : \"100\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"userMessage\" : \"userMessage\", \"systemMessage\" : \"systemMessage\", \"code\" : \"code\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"userMessage\" : \"userMessage\", \"systemMessage\" : \"systemMessage\", \"code\" : \"code\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"userMessage\" : \"userMessage\", \"systemMessage\" : \"systemMessage\", \"code\" : \"code\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"userMessage\" : \"userMessage\", \"systemMessage\" : \"systemMessage\", \"code\" : \"code\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"userMessage\" : \"userMessage\", \"systemMessage\" : \"systemMessage\", \"code\" : \"code\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"userMessage\" : \"userMessage\", \"systemMessage\" : \"systemMessage\", \"code\" : \"code\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"userMessage\" : \"userMessage\", \"systemMessage\" : \"systemMessage\", \"code\" : \"code\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"userMessage\" : \"userMessage\", \"systemMessage\" : \"systemMessage\", \"code\" : \"code\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}

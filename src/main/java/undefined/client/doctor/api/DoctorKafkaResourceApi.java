/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package undefined.client.doctor.api;

import undefined.client.doctor.model.PublishResult;
import undefined.client.doctor.model.SseEmitter;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-18T14:33:18.015+05:30[Asia/Calcutta]")

@Api(value = "DoctorKafkaResource", description = "the DoctorKafkaResource API")
public interface DoctorKafkaResourceApi {

    @ApiOperation(value = "consume", nickname = "consumeUsingGET", notes = "", response = SseEmitter.class, tags={ "doctor-kafka-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SseEmitter.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/doctor-kafka/consume",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<SseEmitter> consumeUsingGET(@NotNull @ApiParam(value = "consumerParams", required = true) @Valid @RequestParam(value = "consumerParams", required = true) Object consumerParams,@NotNull @ApiParam(value = "topic", required = true) @Valid @RequestParam(value = "topic", required = true) List<String> topic);


    @ApiOperation(value = "publish", nickname = "publishUsingPOST", notes = "", response = PublishResult.class, tags={ "doctor-kafka-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PublishResult.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/doctor-kafka/publish/{topic}",
        produces = "*/*", 
        method = RequestMethod.POST)
    ResponseEntity<PublishResult> publishUsingPOST(@NotNull @ApiParam(value = "message", required = true) @Valid @RequestParam(value = "message", required = true) String message,@ApiParam(value = "topic",required=true) @PathVariable("topic") String topic,@ApiParam(value = "key") @Valid @RequestParam(value = "key", required = false) String key);

}

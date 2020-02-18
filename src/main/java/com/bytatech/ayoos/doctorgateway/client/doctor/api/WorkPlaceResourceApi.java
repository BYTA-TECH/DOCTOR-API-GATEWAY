/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.bytatech.ayoos.doctorgateway.client.doctor.api;

import com.bytatech.ayoos.doctorgateway.client.doctor.model.WorkPlaceDTO;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-18T14:40:20.184+05:30[Asia/Calcutta]")

@Api(value = "WorkPlaceResource", description = "the WorkPlaceResource API")
public interface WorkPlaceResourceApi {

    @ApiOperation(value = "createWorkPlace", nickname = "createWorkPlaceUsingPOST", notes = "", response = WorkPlaceDTO.class, tags={ "work-place-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = WorkPlaceDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/work-places",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<WorkPlaceDTO> createWorkPlaceUsingPOST(@ApiParam(value = "workPlaceDTO" ,required=true )  @Valid @RequestBody WorkPlaceDTO workPlaceDTO);


    @ApiOperation(value = "deleteWorkPlace", nickname = "deleteWorkPlaceUsingDELETE", notes = "", tags={ "work-place-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/work-places/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteWorkPlaceUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllWorkPlaces", nickname = "getAllWorkPlacesUsingGET", notes = "", response = WorkPlaceDTO.class, responseContainer = "List", tags={ "work-place-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = WorkPlaceDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/work-places",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<WorkPlaceDTO>> getAllWorkPlacesUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getWorkPlace", nickname = "getWorkPlaceUsingGET", notes = "", response = WorkPlaceDTO.class, tags={ "work-place-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = WorkPlaceDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/work-places/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<WorkPlaceDTO> getWorkPlaceUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "updateWorkPlace", nickname = "updateWorkPlaceUsingPUT", notes = "", response = WorkPlaceDTO.class, tags={ "work-place-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = WorkPlaceDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/work-places",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<WorkPlaceDTO> updateWorkPlaceUsingPUT(@ApiParam(value = "workPlaceDTO" ,required=true )  @Valid @RequestBody WorkPlaceDTO workPlaceDTO);

}

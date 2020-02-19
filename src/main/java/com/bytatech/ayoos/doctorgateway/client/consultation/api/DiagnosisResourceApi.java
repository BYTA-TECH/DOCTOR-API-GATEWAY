/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.bytatech.ayoos.doctorgateway.client.consultation.api;

import com.bytatech.ayoos.doctorgateway.client.consultation.model.DiagnosisDTO;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-19T11:36:48.535+05:30[Asia/Calcutta]")

@Api(value = "DiagnosisResource", description = "the DiagnosisResource API")
public interface DiagnosisResourceApi {

    @ApiOperation(value = "createDiagnosis", nickname = "createDiagnosisUsingPOST", notes = "", response = DiagnosisDTO.class, tags={ "diagnosis-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DiagnosisDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/diagnoses",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<DiagnosisDTO> createDiagnosisUsingPOST(@ApiParam(value = "diagnosisDTO" ,required=true )  @Valid @RequestBody DiagnosisDTO diagnosisDTO);


    @ApiOperation(value = "deleteDiagnosis", nickname = "deleteDiagnosisUsingDELETE", notes = "", tags={ "diagnosis-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/diagnoses/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteDiagnosisUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllDiagnoses", nickname = "getAllDiagnosesUsingGET", notes = "", response = DiagnosisDTO.class, responseContainer = "List", tags={ "diagnosis-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DiagnosisDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/diagnoses",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<DiagnosisDTO>> getAllDiagnosesUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getDiagnosis", nickname = "getDiagnosisUsingGET", notes = "", response = DiagnosisDTO.class, tags={ "diagnosis-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DiagnosisDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/diagnoses/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<DiagnosisDTO> getDiagnosisUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchDiagnoses", nickname = "searchDiagnosesUsingGET", notes = "", response = DiagnosisDTO.class, responseContainer = "List", tags={ "diagnosis-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DiagnosisDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/diagnoses",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<DiagnosisDTO>> searchDiagnosesUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateDiagnosis", nickname = "updateDiagnosisUsingPUT", notes = "", response = DiagnosisDTO.class, tags={ "diagnosis-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DiagnosisDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/diagnoses",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<DiagnosisDTO> updateDiagnosisUsingPUT(@ApiParam(value = "diagnosisDTO" ,required=true )  @Valid @RequestBody DiagnosisDTO diagnosisDTO);

}

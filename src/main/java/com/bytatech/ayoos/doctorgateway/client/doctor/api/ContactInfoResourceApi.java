/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.bytatech.ayoos.doctorgateway.client.doctor.api;

import com.bytatech.ayoos.doctorgateway.client.doctor.model.ContactInfoDTO;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-03-07T12:55:19.430+05:30[Asia/Colombo]")

@Api(value = "ContactInfoResource", description = "the ContactInfoResource API")
public interface ContactInfoResourceApi {

    @ApiOperation(value = "createContactInfo", nickname = "createContactInfoUsingPOST", notes = "", response = ContactInfoDTO.class, tags={ "contact-info-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ContactInfoDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/contact-infos",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<ContactInfoDTO> createContactInfoUsingPOST(@ApiParam(value = "contactInfoDTO" ,required=true )  @Valid @RequestBody ContactInfoDTO contactInfoDTO);


    @ApiOperation(value = "deleteContactInfo", nickname = "deleteContactInfoUsingDELETE", notes = "", tags={ "contact-info-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/contact-infos/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteContactInfoUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllContactInfos", nickname = "getAllContactInfosUsingGET", notes = "", response = ContactInfoDTO.class, responseContainer = "List", tags={ "contact-info-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ContactInfoDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/contact-infos",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<ContactInfoDTO>> getAllContactInfosUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getContactInfo", nickname = "getContactInfoUsingGET", notes = "", response = ContactInfoDTO.class, tags={ "contact-info-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ContactInfoDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/contact-infos/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<ContactInfoDTO> getContactInfoUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchContactInfos", nickname = "searchContactInfosUsingGET", notes = "", response = ContactInfoDTO.class, responseContainer = "List", tags={ "contact-info-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ContactInfoDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/contact-infos",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<ContactInfoDTO>> searchContactInfosUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateContactInfo", nickname = "updateContactInfoUsingPUT", notes = "", response = ContactInfoDTO.class, tags={ "contact-info-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ContactInfoDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/contact-infos",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<ContactInfoDTO> updateContactInfoUsingPUT(@ApiParam(value = "contactInfoDTO" ,required=true )  @Valid @RequestBody ContactInfoDTO contactInfoDTO);

}

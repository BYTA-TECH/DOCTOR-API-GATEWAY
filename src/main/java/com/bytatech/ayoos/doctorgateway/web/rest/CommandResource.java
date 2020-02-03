package com.bytatech.ayoos.doctorgateway.web.rest;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.bytatech.ayoos.doctorgateway.client.doctor.model.*;
import  com.bytatech.ayoos.doctorgateway.service.DoctorCommandService;
/**
 * TODO Provide a detailed description here
 * 
 * @author AbdulRafeek Rafeekbytatech, abdul.rafeek@lxisoft.com
 */
@RestController
@RequestMapping("/api/commands")
public class CommandResource {
	@Autowired
	DoctorCommandService  doctorCommandService;
	@PostMapping("/test")
	public String test() {
		return "success";
	}
	
	  @PostMapping("/doctors")
	    public ResponseEntity<DoctorDTO> createDoctor(@RequestBody DoctorDTO doctorDTO) throws URISyntaxException {
		 
		
		  ResponseEntity<DoctorDTO> doctorDto =  doctorCommandService.createDoctor (doctorDTO); 
		    
		  return  doctorDto;
	  }
	  
	  @PutMapping("/doctors")
	    public ResponseEntity<DoctorDTO> updateDoctor(@RequestBody DoctorDTO doctorDTO)  {
		  return  doctorCommandService.updateDoctor (doctorDTO);
	  }    
	  
	  @PostMapping("/contact-infos")
	  public ResponseEntity<ContactInfoDTO> createContactInfo(@RequestBody ContactInfoDTO contactInfoDTO){
		  
		  ResponseEntity<ContactInfoDTO> contactInfo = doctorCommandService.createContactInfo (contactInfoDTO);
		  
		  return contactInfo;
	  }
	  
	  @PutMapping("/contact-infos")
	  public ResponseEntity<ContactInfoDTO> updateContactInfo(@RequestBody ContactInfoDTO contactInfoDTO){
		  return  doctorCommandService.updateContactInfo (contactInfoDTO);
	  }
	 
/*	  @DeleteMapping("/contact-infos/{id}")
	  public void deleteContactInfo(@PathVariable Long id){
		   doctorCommandService.deleteContactInfoUsingDELETE(id);
	  }*/
	  
	  @PostMapping("/qualifications")
	  public ResponseEntity<QualificationDTO> createQualification(@RequestBody QualificationDTO qualificationDTO){
		 return  doctorCommandService.createQualification (qualificationDTO);
	  }
	  @PutMapping("/qualifications")
	  public ResponseEntity<QualificationDTO> updateQualification(@RequestBody QualificationDTO qualificationDTO){
		 return  doctorCommandService.updateQualification (qualificationDTO);
	  }
	  
	  /*@DeleteMapping("/qualifications/{id}")
	  public void deleteQualification(@PathVariable Long id){
		   doctorCommandService.deleteQualificationUsingDELETE(id);
	  }*/
	  
	  @PostMapping("/work-places")
	  public ResponseEntity<WorkPlaceDTO> createWorkPlace(@RequestBody WorkPlaceDTO workPlaceDTO){
		  ResponseEntity<WorkPlaceDTO> workPlace=  doctorCommandService.createWorkPlace (workPlaceDTO);
		
		  return workPlace;
	  }
	  
	  @PutMapping("/work-places")
	  public ResponseEntity<WorkPlaceDTO> updateWorkPlace(@RequestBody WorkPlaceDTO workPlaceDTO){
		  
		  return doctorCommandService.updateWorkPlace (workPlaceDTO);
		  
	  }
	  
	 /* @DeleteMapping("/work-places")
	  public void deleteWorkPlace(@PathVariable Long id){
		  doctorCommandService.deleteWorkPlaceUsingDELETE(id);
	  }*/
	  
	
	 //please wire this method instead of createSessionInfo
	  @PostMapping("/sessionInfobydate")
		 public ResponseEntity<List<SessionInfoDTO>> createSessionInfoByDates(@RequestBody SessionInfoDTO sessionInfoDTO,
					@PathVariable String fromDate,@PathVariable String toDate){
			return   doctorCommandService.createSessionInfoByDates(sessionInfoDTO, toDate, fromDate);
		 }

	@PostMapping("/paymentSettings")
	public ResponseEntity<PaymentSettingsDTO> createPaymentSetting(@RequestBody PaymentSettingsDTO paymentSettingsDTO) {
		return  doctorCommandService.createPaymentSetting (paymentSettingsDTO);
	}

	@PutMapping("/paymentSettings")
	public ResponseEntity<PaymentSettingsDTO> updatePaymentSetting(@RequestBody PaymentSettingsDTO paymentSettingsDTO) {
		return  doctorCommandService.updatePaymentSetting (paymentSettingsDTO);
	}
	
	@PostMapping("/doctorSettings")
	public ResponseEntity<DoctorSettingsDTO> createDoctorSetting(@RequestBody DoctorSettingsDTO doctorSettingsDTO) {
		return  doctorCommandService.createDoctorSetting (doctorSettingsDTO);
	}
	
	@PutMapping("/doctorSettings")
	public ResponseEntity<DoctorSettingsDTO> updateDoctorSetting(@RequestBody DoctorSettingsDTO doctorSettingsDTO) {
		return  doctorCommandService.updateDoctorSetting (doctorSettingsDTO);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
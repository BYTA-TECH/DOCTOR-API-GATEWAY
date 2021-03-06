package com.bytatech.ayoos.doctorgateway.client.consultation.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.*;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConsultationDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-19T14:36:23.395+05:30[Asia/Calcutta]")

public class ConsultationDTO   {
  @JsonProperty("basicCheckUpId")
  private Long basicCheckUpId = null;

  @JsonProperty("date")
  private LocalDate date = null;

  @JsonProperty("diagnosisId")
  private Long diagnosisId = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("patientIdpCode")
  private String patientIdpCode = null;

  @JsonProperty("phoneNumber")
  private String phoneNumber = null;

  @JsonProperty("prescriptionId")
  private Long prescriptionId = null;

  @JsonProperty("trackingId")
  private String trackingId = null;

  public ConsultationDTO basicCheckUpId(Long basicCheckUpId) {
    this.basicCheckUpId = basicCheckUpId;
    return this;
  }

  /**
   * Get basicCheckUpId
   * @return basicCheckUpId
  **/
  @ApiModelProperty(value = "")


  public Long getBasicCheckUpId() {
    return basicCheckUpId;
  }

  public void setBasicCheckUpId(Long basicCheckUpId) {
    this.basicCheckUpId = basicCheckUpId;
  }

  public ConsultationDTO date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public ConsultationDTO diagnosisId(Long diagnosisId) {
    this.diagnosisId = diagnosisId;
    return this;
  }

  /**
   * Get diagnosisId
   * @return diagnosisId
  **/
  @ApiModelProperty(value = "")


  public Long getDiagnosisId() {
    return diagnosisId;
  }

  public void setDiagnosisId(Long diagnosisId) {
    this.diagnosisId = diagnosisId;
  }

  public ConsultationDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ConsultationDTO patientIdpCode(String patientIdpCode) {
    this.patientIdpCode = patientIdpCode;
    return this;
  }

  /**
   * Get patientIdpCode
   * @return patientIdpCode
  **/
  @ApiModelProperty(value = "")


  public String getPatientIdpCode() {
    return patientIdpCode;
  }

  public void setPatientIdpCode(String patientIdpCode) {
    this.patientIdpCode = patientIdpCode;
  }

  public ConsultationDTO phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "")


  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public ConsultationDTO prescriptionId(Long prescriptionId) {
    this.prescriptionId = prescriptionId;
    return this;
  }

  /**
   * Get prescriptionId
   * @return prescriptionId
  **/
  @ApiModelProperty(value = "")


  public Long getPrescriptionId() {
    return prescriptionId;
  }

  public void setPrescriptionId(Long prescriptionId) {
    this.prescriptionId = prescriptionId;
  }

  public ConsultationDTO trackingId(String trackingId) {
    this.trackingId = trackingId;
    return this;
  }

  /**
   * Get trackingId
   * @return trackingId
  **/
  @ApiModelProperty(value = "")


  public String getTrackingId() {
    return trackingId;
  }

  public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultationDTO consultationDTO = (ConsultationDTO) o;
    return Objects.equals(this.basicCheckUpId, consultationDTO.basicCheckUpId) &&
        Objects.equals(this.date, consultationDTO.date) &&
        Objects.equals(this.diagnosisId, consultationDTO.diagnosisId) &&
        Objects.equals(this.id, consultationDTO.id) &&
        Objects.equals(this.patientIdpCode, consultationDTO.patientIdpCode) &&
        Objects.equals(this.phoneNumber, consultationDTO.phoneNumber) &&
        Objects.equals(this.prescriptionId, consultationDTO.prescriptionId) &&
        Objects.equals(this.trackingId, consultationDTO.trackingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basicCheckUpId, date, diagnosisId, id, patientIdpCode, phoneNumber, prescriptionId, trackingId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultationDTO {\n");
    
    sb.append("    basicCheckUpId: ").append(toIndentedString(basicCheckUpId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    diagnosisId: ").append(toIndentedString(diagnosisId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    patientIdpCode: ").append(toIndentedString(patientIdpCode)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    prescriptionId: ").append(toIndentedString(prescriptionId)).append("\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


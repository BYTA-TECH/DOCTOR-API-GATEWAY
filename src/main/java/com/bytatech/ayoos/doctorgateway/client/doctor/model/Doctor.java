package com.bytatech.ayoos.doctorgateway.client.doctor.model;
import org.hibernate.annotations.Cache; 
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
 
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * A Doctor.
 */ 
public class Doctor implements Serializable {

    private static final long serialVersionUID = 1L;
 
    private Long id;
 
    private String imageLink;
 
    private String doctorIdpCode;
        
    private String specialization;
 
    private String registerNumber;
 
    private LocalDate practiceSince;
 
    private Double totalRating;
 
    private String firstName;
 
    private String email;
 
    private Long phoneNumber;
 
    private String dmsId;

    @OneToOne
    @JoinColumn(unique = true)
    private ContactInfo contactInfo;

    @OneToOne
    @JoinColumn(unique = true)
    private PaymentSettings paymentSettings;

    @OneToOne
    @JoinColumn(unique = true)
    private DoctorSettings doctorSettings;

    @OneToMany(mappedBy = "doctor")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<WorkPlace> workPlaces = new HashSet<>();

    @OneToMany(mappedBy = "doctor")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<Qualification> qualifications = new HashSet<>();

    @OneToMany(mappedBy = "doctor")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<UserRatingReview> userRatingReviews = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImageLink() {
        return imageLink;
    }

    public Doctor imageLink(String imageLink) {
        this.imageLink = imageLink;
        return this;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public String getDoctorIdpCode() {
        return doctorIdpCode;
    }

    public Doctor doctorIdpCode(String doctorIdpCode) {
        this.doctorIdpCode = doctorIdpCode;
        return this;
    }

    public void setDoctorIdpCode(String doctorIdpCode) {
        this.doctorIdpCode = doctorIdpCode;
    }

    public String getSpecialization() {
        return specialization;
    }

    public Doctor specialization(String specialization) {
        this.specialization = specialization;
        return this;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public Doctor registerNumber(String registerNumber) {
        this.registerNumber = registerNumber;
        return this;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public LocalDate getPracticeSince() {
        return practiceSince;
    }

    public Doctor practiceSince(LocalDate practiceSince) {
        this.practiceSince = practiceSince;
        return this;
    }

    public void setPracticeSince(LocalDate practiceSince) {
        this.practiceSince = practiceSince;
    }

    public Double getTotalRating() {
        return totalRating;
    }

    public Doctor totalRating(Double totalRating) {
        this.totalRating = totalRating;
        return this;
    }

    public void setTotalRating(Double totalRating) {
        this.totalRating = totalRating;
    }

    public String getFirstName() {
        return firstName;
    }

    public Doctor firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public Doctor email(String email) {
        this.email = email;
        return this;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public Doctor phoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDmsId() {
        return dmsId;
    }

    public Doctor dmsId(String dmsId) {
        this.dmsId = dmsId;
        return this;
    }

    public void setDmsId(String dmsId) {
        this.dmsId = dmsId;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public Doctor contactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
        return this;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public PaymentSettings getPaymentSettings() {
        return paymentSettings;
    }

    public Doctor paymentSettings(PaymentSettings paymentSettings) {
        this.paymentSettings = paymentSettings;
        return this;
    }

    public void setPaymentSettings(PaymentSettings paymentSettings) {
        this.paymentSettings = paymentSettings;
    }

    public DoctorSettings getDoctorSettings() {
        return doctorSettings;
    }

    public Doctor doctorSettings(DoctorSettings doctorSettings) {
        this.doctorSettings = doctorSettings;
        return this;
    }

    public void setDoctorSettings(DoctorSettings doctorSettings) {
        this.doctorSettings = doctorSettings;
    }

    public Set<WorkPlace> getWorkPlaces() {
        return workPlaces;
    }

    public Doctor workPlaces(Set<WorkPlace> workPlaces) {
        this.workPlaces = workPlaces;
        return this;
    }

    public Doctor addWorkPlace(WorkPlace workPlace) {
        this.workPlaces.add(workPlace);
        workPlace.setDoctor(this);
        return this;
    }

    public Doctor removeWorkPlace(WorkPlace workPlace) {
        this.workPlaces.remove(workPlace);
        workPlace.setDoctor(null);
        return this;
    }

    public void setWorkPlaces(Set<WorkPlace> workPlaces) {
        this.workPlaces = workPlaces;
    }

    public Set<Qualification> getQualifications() {
        return qualifications;
    }

    public Doctor qualifications(Set<Qualification> qualifications) {
        this.qualifications = qualifications;
        return this;
    }

    public Doctor addQualification(Qualification qualification) {
        this.qualifications.add(qualification);
        qualification.setDoctor(this);
        return this;
    }

    public Doctor removeQualification(Qualification qualification) {
        this.qualifications.remove(qualification);
        qualification.setDoctor(null);
        return this;
    }

    public void setQualifications(Set<Qualification> qualifications) {
        this.qualifications = qualifications;
    }

    public Set<UserRatingReview> getUserRatingReviews() {
        return userRatingReviews;
    }

    public Doctor userRatingReviews(Set<UserRatingReview> userRatingReviews) {
        this.userRatingReviews = userRatingReviews;
        return this;
    }

    public Doctor addUserRatingReview(UserRatingReview userRatingReview) {
        this.userRatingReviews.add(userRatingReview);
        userRatingReview.setDoctor(this);
        return this;
    }

    public Doctor removeUserRatingReview(UserRatingReview userRatingReview) {
        this.userRatingReviews.remove(userRatingReview);
        userRatingReview.setDoctor(null);
        return this;
    }

    public void setUserRatingReviews(Set<UserRatingReview> userRatingReviews) {
        this.userRatingReviews = userRatingReviews;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Doctor)) {
            return false;
        }
        return id != null && id.equals(((Doctor) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Doctor{" +
            "id=" + getId() +
            ", imageLink='" + getImageLink() + "'" +
            ", doctorIdpCode='" + getDoctorIdpCode() + "'" +
            ", specialization='" + getSpecialization() + "'" +
            ", registerNumber='" + getRegisterNumber() + "'" +
            ", practiceSince='" + getPracticeSince() + "'" +
            ", totalRating=" + getTotalRating() +
            ", firstName='" + getFirstName() + "'" +
            ", email='" + getEmail() + "'" +
            ", phoneNumber=" + getPhoneNumber() +
            ", dmsId='" + getDmsId() + "'" +
            "}";
    }
}

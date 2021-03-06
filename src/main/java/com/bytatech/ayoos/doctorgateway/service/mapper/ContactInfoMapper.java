package com.bytatech.ayoos.doctorgateway.service.mapper;

import com.bytatech.ayoos.doctorgateway.client.doctor.model.*; 

import org.mapstruct.*;

/**
 * Mapper for the entity {@link ContactInfo} and its DTO {@link ContactInfoDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface ContactInfoMapper extends EntityMapper<ContactInfoDTO, ContactInfo> {


    
    ContactInfo toEntity(ContactInfoDTO contactInfoDTO);

    default ContactInfo fromId(Long id) {
        if (id == null) {
            return null;
        }
        ContactInfo contactInfo = new ContactInfo();
        contactInfo.setId(id);
        return contactInfo;
    }
}

package com.bytatech.ayoos.doctorgateway.service.mapper;

import com.bytatech.ayoos.doctorgateway.client.doctor.model.*;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link PaymentSettings} and its DTO {@link PaymentSettingsDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface PaymentSettingsMapper extends EntityMapper<PaymentSettingsDTO, PaymentSettings> {



    default PaymentSettings fromId(Long id) {
        if (id == null) {
            return null;
        }
        PaymentSettings paymentSettings = new PaymentSettings();
        paymentSettings.setId(id);
        return paymentSettings;
    }
}
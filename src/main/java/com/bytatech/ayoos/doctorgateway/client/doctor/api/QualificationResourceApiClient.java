package com.bytatech.ayoos.doctorgateway.client.doctor.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.bytatech.ayoos.doctorgateway.client.doctor.ClientConfiguration;

@FeignClient(name="${doctor.name:doctor}", url="${doctor.url:35.209.250.234:8083/}", configuration = ClientConfiguration.class)
public interface QualificationResourceApiClient extends QualificationResourceApi {
}
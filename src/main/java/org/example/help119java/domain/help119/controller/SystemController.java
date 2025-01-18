package org.example.help119java.domain.help119.controller;

import org.example.help119java.domain.help119.dto.request.AmbulanceRequest;
import org.example.help119java.domain.help119.service.SystemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/119")
@RestController
public class SystemController {

    private final SystemService systemService;

    public SystemController(SystemService systemService) {
        this.systemService = systemService;
    }

    public ResponseEntity<Void> callByAmbulance(AmbulanceRequest ambulanceRequest) {
        systemService.callBy119(ambulanceRequest);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

//    public ResponseEntity<List<AmbulanceResponse>> getAmbulanceList() {
//        List<AmbulanceResponse> ambulanceList = systemService.getCalledAmbList();
//        return ResponseEntity.status(HttpStatus.OK).body(ambulanceList);
//    }
//
//    public ResponseEntity<AmbulanceResponse> getAmbulance(Long ambId) {
//        AmbulanceResponse ambulanceResponse = systemService.getCalledAmb(ambId);
//        return ResponseEntity.status(HttpStatus.OK).body(ambulanceResponse);
//    }
//
//    public ResponseEntity<Void> bookHospital(HospitalBookingRequest request) {
//        systemService.bookHospital(request);
//        return ResponseEntity.status(HttpStatus.OK).build();
//    }
}
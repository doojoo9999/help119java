package org.example.help119java.domain.help119.service;

import org.example.help119java.domain.help119.dto.request.AmbulanceRequest;
import org.example.help119java.domain.help119.dto.response.AmbulanceResponse;
import org.example.help119java.domain.help119.model.AmbulanceEntity;
import org.example.help119java.domain.help119.repository.AmbulanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SystemService {

    private final AmbulanceRepository ambulanceRepository;

    public SystemService(AmbulanceRepository ambulanceRepository) {
        this.ambulanceRepository = ambulanceRepository;
    }

    public void callBy119(AmbulanceRequest ambulanceRequest) {
        ambulanceRepository.save(new AmbulanceEntity(
                ambulanceRequest.getStatus(),
                ambulanceRequest.getArea(),
                ambulanceRequest.getTime()
        ));
    }

    public AmbulanceResponse getCalledAmb(Long ambId) {
        Optional<AmbulanceEntity> ambOptional = ambulanceRepository.findById(ambId);
        AmbulanceEntity amb = ambOptional.orElseThrow(() -> new IllegalStateException("Amb Not Found"));

        return new AmbulanceResponse(
                amb.getStatus(),
                amb.getArea(),
                amb.getTime()
        );
    }

    public List<AmbulanceResponse> getCalledAmbList() {
        return ambulanceRepository.findAll().stream()
                .map(amb -> new AmbulanceResponse(amb.getStatus(), amb.getArea(), amb.getTime()))
                .collect(Collectors.toList());
    }

}

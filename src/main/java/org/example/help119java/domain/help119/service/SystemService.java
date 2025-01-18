package org.example.help119java.domain.help119.service;

import org.example.help119java.domain.help119.dto.request.AmbulanceRequest;
import org.example.help119java.domain.help119.model.AmbulanceEntity;
import org.example.help119java.domain.help119.repository.AmbulanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SystemService {

    private final AmbulanceRepository ambulanceRepository;

    @Autowired
    public SystemService(AmbulanceRepository ambulanceRepository) {
        this.ambulanceRepository = ambulanceRepository;
    }

    public void callBy119(AmbulanceRequest ambulanceRequest){
        AmbulanceEntity ambulanceEntity = new AmbulanceEntity(
                ambulanceRequest.getStatus(),
                ambulanceRequest.getArea(),
                ambulanceRequest.time()
        );
        ambulanceRepository.save(ambulanceEntity);
    }

}

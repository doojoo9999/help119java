package org.example.help119java.domain.help119.dto.request;

import org.example.help119java.domain.help119.model.AmbulanceEntity;

import java.time.LocalDateTime;

public class AmbulanceRequest {

    private final String status;
    private final String area;
    private final LocalDateTime time;

    public AmbulanceRequest(String status, String area, LocalDateTime time) {
        this.status = status;
        this.area = area;
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public String getArea() {
        return area;
    }

    public LocalDateTime time() {
        return time;
    }

    public AmbulanceEntity toAmbulanceEntity() {
        return new AmbulanceEntity(status, area, time);
    }
}

package org.example.help119java.domain.help119.dto.response;

import java.time.LocalDateTime;

public class AmbulanceResponse {

    private final String status;
    private final String area;
    private final LocalDateTime time;

    public AmbulanceResponse(String status, String area, LocalDateTime time) {
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

    public LocalDateTime getTime() {
        return time;
    }
}
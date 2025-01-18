package org.example.help119java.domain.help119.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
//기본 생성자
public class AmbulanceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "area", nullable = false)
    private String area;

    @Column(name = "time", nullable = false)
    private LocalDateTime time;

    public AmbulanceEntity() {
    }
//매개변수가 있는 생성자
    public AmbulanceEntity(String status, String area, LocalDateTime time) {
        this.status = status;
        this.area = area;
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}

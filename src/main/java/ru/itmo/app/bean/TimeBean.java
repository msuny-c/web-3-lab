package ru.itmo.app.bean;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@Named
@ApplicationScoped
public class TimeBean implements Serializable {
    private LocalDateTime dateTime;
    @PostConstruct
    public void initialize() {
        dateTime = LocalDateTime.now();
    }
    public LocalDateTime now() {
        return dateTime;
    }
}

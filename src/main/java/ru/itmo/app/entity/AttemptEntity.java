package ru.itmo.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "attempt")
public @Data class AttemptEntity {
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", nullable=false, unique=true)
    @Id private long id;
    @Column(name="x", nullable=false)
    private double x;
    @Column(name="y", nullable=false)
    private double y;
    @Column(name="r", nullable=false)
    private double r;
    @Column(name="success", nullable=false)
    private boolean success;
}
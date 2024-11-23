package ru.itmo.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Table(name = "attempt")
public @Data class AttemptEntity {
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", nullable=false, unique=true)
    @Id private long id;
    @Column(name="x", nullable=false)
    @NotNull private double x;
    @Column(name="y", nullable=false)
    @NotNull private double y;
    @Column(name="r", nullable=false)
    @NotNull private double r;
    @Column(name="success", nullable=false)
    @NotNull private boolean success;
}
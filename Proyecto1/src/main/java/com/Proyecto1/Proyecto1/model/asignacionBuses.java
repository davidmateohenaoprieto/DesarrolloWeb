package com.Proyecto1.Proyecto1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="busAsig")

public class asignacionBuses {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @Column (name="name_driver",nullable=false)
    private String nombreCondu;

    @Column (name="plate",nullable=false)
    private String placa;

    @Column (name="days_asig",nullable=false)
    private String dias_asignacion;

    public asignacionBuses() {
    }

    public asignacionBuses(String nombreCondu, String placa, String dias_asignacion) {
        this.nombreCondu = nombreCondu;
        this.placa = placa;
        this.dias_asignacion = dias_asignacion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreCondu() {
        return nombreCondu;
    }

    public void setNombreCondu(String nombreCondu) {
        this.nombreCondu = nombreCondu;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getDias_asignacion() {
        return dias_asignacion;
    }

    public void setDias_asignacion(String dias_asignacion) {
        this.dias_asignacion = dias_asignacion;
    }


    



}

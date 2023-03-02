package com.Proyecto1.Proyecto1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="scheduleF")

public class HorarioFuncionamiento {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @Column (name="days",nullable=false)
    private String dia_atencion;

    @Column (name="startTime",nullable=false)
    private String horaInicio;

    @Column (name="endTime",nullable=false)
    private String horafin;
    
    public HorarioFuncionamiento() {
    }
    
    public HorarioFuncionamiento(String dia_atencion, String horaInicio, String horafin) {
        this.dia_atencion = dia_atencion;
        this.horaInicio = horaInicio;
        this.horafin = horafin;
    }
    public String getDia_atencion() {
        return dia_atencion;
    }
    public void setDia_atencion(String dia_atencion) {
        this.dia_atencion = dia_atencion;
    }
    public String getHoraInicio() {
        return horaInicio;
    }
    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }
    public String getHorafin() {
        return horafin;
    }
    public void setHorafin(String horafin) {
        this.horafin = horafin;
    }

    
}

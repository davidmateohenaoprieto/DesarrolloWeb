package com.Proyecto1.Proyecto1.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Route")

public class ruta {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @Column (name="code",nullable=false)
    private String codigo;

    @Column (name="parades",nullable=false)
    private String estaciones;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "HorarioFuncionamiento",referencedColumnName = "id")
    private HorarioFuncionamiento horario;

    
    public ruta() {
    }

    public ruta(String codigo, String estaciones, HorarioFuncionamiento horario) {
        this.codigo = codigo;
        this.estaciones = estaciones;
        this.horario = horario;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getEstaciones() {
        return estaciones;
    }
    public void setEstaciones(String estaciones) {
        this.estaciones = estaciones;
    }
    public HorarioFuncionamiento getHorario() {
        return horario;
    }
    public void setHorario(HorarioFuncionamiento horario) {
        this.horario = horario;
    }

    
}

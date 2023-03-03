package com.Proyecto1.Proyecto1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="RouteAsig")

public class asignacionRutas {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @Column (name="code",nullable=false)
    private int codigo;

    @Column (name="dayAsig",nullable=false)
    private String dia_asignado;

    @ManyToOne
    bus bus;

    public asignacionRutas() {
    }
    
    public asignacionRutas(int codigo, String dia_asignado) {
        this.codigo = codigo;
        this.dia_asignado = dia_asignado;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getDia_asignado() {
        return dia_asignado;
    }
    public void setDia_asignado(String dia_asignado) {
        this.dia_asignado = dia_asignado;
    }

    
}

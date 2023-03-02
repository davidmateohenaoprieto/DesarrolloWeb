package com.Proyecto1.Proyecto1.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Bus")

public class bus {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @Column (name="plate",nullable=false)
    private String  placa;

    @Column (name="model",nullable=false)
    private String modelo;

    @OneToMany(mappedBy = "bus")
    private List<asignacionRutas> rutasAsignadas=new ArrayList<>();

    public bus() {
    }
    
    public bus(String placa, String modelo, List<asignacionRutas> rutasAsignadas) {
        this.placa = placa;
        this.modelo = modelo;
        //this.rutasAsignadas = rutasAsignadas;
    }


    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<asignacionRutas> getRutasAsignadas() {
        return rutasAsignadas;
    }

    public void addRutaAsignada(asignacionRutas e) {
        this.rutasAsignadas.add(e);
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    
}

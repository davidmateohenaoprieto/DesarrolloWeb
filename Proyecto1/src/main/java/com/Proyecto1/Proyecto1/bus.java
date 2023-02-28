package com.Proyecto1.Proyecto1;

import java.util.List;

public class bus {
    private String  placa;
    private String modelo;
    private List<asignacionRutas> rutasAsignadas;

    public bus() {
    }
    
    public bus(String placa, String modelo, List<asignacionRutas> rutasAsignadas) {
        this.placa = placa;
        this.modelo = modelo;
        this.rutasAsignadas = rutasAsignadas;
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
    public List<asignacionRutas> getRutasAsignadas() {
        return rutasAsignadas;
    }
    public void setRutasAsignadas(List<asignacionRutas> rutasAsignadas) {
        this.rutasAsignadas = rutasAsignadas;
    }



    
}

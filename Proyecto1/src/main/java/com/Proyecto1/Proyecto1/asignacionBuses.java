package com.Proyecto1.Proyecto1;

public class asignacionBuses {
    private String nombrecondu;
    private String placa;
    private String dias_asignacion;


    
    public asignacionBuses() {
    }
    
    public asignacionBuses(String nombrecondu, String placa, String dias_asignacion) {
        this.nombrecondu = nombrecondu;
        this.placa = placa;
        this.dias_asignacion = dias_asignacion;
    }



    public String getNombrecondu() {
        return nombrecondu;
    }
    public void setNombrecondu(String nombrecondu) {
        this.nombrecondu = nombrecondu;
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

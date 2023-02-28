package com.Proyecto1.Proyecto1;

public class asignacionRutas {
    private int codigo;
    private String dia_asignado;

    
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

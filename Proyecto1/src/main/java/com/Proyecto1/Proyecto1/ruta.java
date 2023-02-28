package com.Proyecto1.Proyecto1;

public class ruta {
    
    private String codigo;
    private String estaciones;
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

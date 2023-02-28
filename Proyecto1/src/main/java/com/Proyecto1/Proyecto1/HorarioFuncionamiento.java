package com.Proyecto1.Proyecto1;

public class HorarioFuncionamiento {
    private String dia_atencion;
    private String horaInicio;
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

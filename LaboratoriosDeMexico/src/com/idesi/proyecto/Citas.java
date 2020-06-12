
package com.idesi.proyecto;

public class Citas {
    
    public String codigo, dia, mes, hora, tipoExam;

    public Citas(String codigo, String dia, String mes, String hora, String tipoExam) {
        this.codigo = codigo;
        this.dia = dia;
        this.mes = mes;
        this.hora = hora;
        this.tipoExam = tipoExam;
    }

    public Citas() {
        this.codigo = ("");
        this.dia = ("");
        this.mes = ("");
        this.hora = ("");
        this.tipoExam = ("");
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDia() {
        return dia;
    }

    public String getMes() {
        return mes;
    }

    public String getHora() {
        return hora;
    }

    public String getTipoExam() {
        return tipoExam;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setTipoExam(String tipoExam) {
        this.tipoExam = tipoExam;
    }
    
    
    
    
    
}

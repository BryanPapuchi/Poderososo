
package com.idesi.proyecto;


public class RecursosMateriales {
    
    public String codigo, tipoProducto, nombreProducto;
    public double existencia = 0;
    public double precio;
    
    public RecursosMateriales(String codigo, String tipoProducto, String nombreProducto, double existencia, double precio) {
        this.codigo = codigo;
        this.tipoProducto = tipoProducto;
        this.nombreProducto = nombreProducto;
        this.existencia = existencia;
        this.precio = precio;   
    }
    
    public RecursosMateriales() {
        this.codigo = "";
        this.tipoProducto = "";
        this.tipoProducto = "";    
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getExistencia() {
        return existencia;
    }

    public void setExistencia(double existencia) {
        this.existencia = existencia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}

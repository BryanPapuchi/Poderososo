
package com.idesi.proyecto;

public class Clientes {

    public String nombre, domicilio, codigo;
    public double edad;
    
    public Clientes(String nombre, double edad, String domicilio, String codigo) {
        
        this.nombre = nombre;
        this.edad = edad;
        this.domicilio = domicilio;
        this.codigo = codigo;
        
    }

    public Clientes() {
        this.nombre = ("");
        this.domicilio = ("");
        this.codigo = ("");
    }

    public String getNombre() {
        return nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

}

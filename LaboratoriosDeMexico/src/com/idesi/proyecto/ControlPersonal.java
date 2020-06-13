
package com.idesi.proyecto;


public class ControlPersonal {
    public String Nombre, RFC, tipoEmpleado , Codigo, Edad;
    public double Salario;
    
public ControlPersonal (String Nombre, String RFC, String tipoEmpleado, String Edad, String Codigo){
    this.Nombre = Nombre;
    this.RFC = RFC;
    this.Codigo = Codigo;
    this.Edad = Edad;
    this.tipoEmpleado = tipoEmpleado;
}

public ControlPersonal (){
    this.Nombre = "";
    this.RFC = "";
    this.tipoEmpleado="";
}


public void setNombre(String Nombre){
    this.Nombre= Nombre;
}

public String getNombre(){
    return Nombre;
}

public void setRFC(String RFC){
    this.RFC = RFC;
}

public String getRFC(){
    return RFC;
}

public void settipoEmpleado(String tipoEmpleado){
    this.tipoEmpleado = tipoEmpleado;
}

public String gettipoEmpleado(){
    return tipoEmpleado;
}

public void setEdad(String Edad){
    this.Edad = Edad;
}

public String getEdad(){
    return Edad;
}

public void setCodigo(String Codigo){
    this.Codigo = Codigo;
}

public String getCodigo(){
    return Codigo;
}

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

}

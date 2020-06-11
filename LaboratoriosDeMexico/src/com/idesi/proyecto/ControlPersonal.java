
package com.idesi.proyecto;


public class ControlPersonal {
    public String Nombre, RFC, tipoEmpleado ;
    public double Edad, Codigo ;
    
public ControlPersonal (String Nombre, String RFC, String tipoEmpleado, double Edad, double Codigo){
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

public void setEdad(double Edad){
    this.Edad = Edad;
}

public double getEdad(){
    return Edad;
}

public void setCodigo(double Codigo){
    this.Codigo = Codigo;
}

public double getCodigo(){
    return Codigo;
}
    
}

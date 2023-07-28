/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_junniorsauceda;

/**
 *
 * @author Junnior Sauceda
 */
public class Chef {
    
    String nombre;
    int edad;
    String turno;
    int estrellas;
    double sueldo;
    
    public Chef(){
        
    }
    public Chef(String Nombre,int Edad,String Turno,int Estrellas,double Sueldo){
        this.nombre=Nombre;
        this.edad=Edad;
        this.turno=Turno;
        this.estrellas=Estrellas;
        this.sueldo=Sueldo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    @Override
    public String toString(){
        String imprimir="";
        imprimir="Nombre:"+nombre+"\nEdad:"+edad+"\nTurno:"+turno+
                "\nN° de estrellas Michelin:"+estrellas+"\nSueldo"+sueldo+"\n";
        return imprimir;
    }
    
}

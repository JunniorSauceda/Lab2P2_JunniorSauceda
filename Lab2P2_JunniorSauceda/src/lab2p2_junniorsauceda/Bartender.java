/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_junniorsauceda;

/**
 *
 * @author Junnior Sauceda
 */
public class Bartender {
    
    String nombre;
    int edad;
    String turno;
    double sueldo;
    int licores;
    
    public Bartender(){
        
    }
    
    public Bartender(String Nombre,int Edad,String Turno,double Sueldo,int Licores){
        this.nombre=Nombre;
        this.edad=Edad;
        this.turno=Turno;
        this.sueldo=Sueldo;
        this.licores=Licores;
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

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getLicores() {
        return licores;
    }

    public void setLicores(int licores) {
        this.licores = licores;
    }
    public String toString(){
        String imprimir="";
        imprimir="Nombre:"+nombre+"\nEdad:"+edad+"\nTurno:"+turno+
                "\nSueldo"+sueldo+"\nN° de licores disponibles:"+licores;
        return imprimir;
    }
}

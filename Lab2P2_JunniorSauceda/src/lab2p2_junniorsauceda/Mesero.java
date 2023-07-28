/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_junniorsauceda;

/**
 *
 * @author Junnior Sauceda
 */
public class Mesero {
    
    String nombre;
    int edad;
    String turno;
    double sueldo;
    double propina;
    
    public Mesero(){
        
    }
    
    public Mesero(String Nombre,int Edad,String Turno,double Sueldo,double Propina){
        this.nombre=Nombre;
        this.edad=Edad;
        this.turno=Turno;
        this.sueldo=Sueldo;
        this.propina=Propina;
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

    public double getPropina() {
        return propina;
    }

    public void setPropina(double propina) {
        this.propina = propina;
    }
    public String toString(){
        String imprimir="";
        imprimir="Nombre:"+nombre+"\nEdad:"+edad+"\nTurno:"+turno+
                "\nSueldo"+sueldo+"\nPropina:"+propina+"\n";
        return imprimir;
    }
    
}

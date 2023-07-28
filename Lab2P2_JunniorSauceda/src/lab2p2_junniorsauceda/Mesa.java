/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_junniorsauceda;

/**
 *
 * @author Junnior Sauceda
 */
public class Mesa {
    
    int platos;
    int utensilios;
    double precio;
    
    public Mesa(){
        
    }
    
    public Mesa(int Platos,int Utensilios,double Precio){
        this.platos=Platos;
        this.utensilios=Utensilios;
        this.precio=Precio;
    }

    public int getPlatos() {
        return platos;
    }

    public void setPlatos(int platos) {
        this.platos = platos;
    }

    public int getUtensilios() {
        return utensilios;
    }

    public void setUtensilios(int utensilios) {
        this.utensilios = utensilios;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String toString(){
        String imprimir="";
        imprimir="\nN° de platos:"+platos+"\nN° de utensilios:"+utensilios+"\nPrecio:"+precio;
        return imprimir;
    }
    
}

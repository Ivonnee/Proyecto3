/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eagl.bg.sjga.proyecto1.controller;

/**
 *
 * @author T107
 */
public class Usuario {
    private String Nombre;
    private int Edad;
    private float sueldo;
    private Direccion direccion;

    public Usuario(String Nombre, int Edad, float sueldo, Direccion direccion) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.sueldo = sueldo;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", sueldo=" + sueldo + ", direccion=" + direccion + '}';
    }

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public float getSueldo() {
        return sueldo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maven.mvc;

/**
 *
 * @author T107
 */
public class ServicioSuperficie {
superficie superficie;

    public ServicioSuperficie() {
    }

    public ServicioSuperficie(superficie superficie) {
        this.superficie = superficie;
    }
    public String servicioArea(){
    Cuadrado d=new Cuadrado();
    d.setLado(5);
    return d.calcularArea();

    }
}

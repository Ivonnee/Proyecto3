/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eagl.bg.sjga.proyecto1.controller;


public class Direccion {
  private String calle;
   private String CP;
   private String Estado;
 
  private String colonia;

    public Direccion(String calle, String CP, String Estado, String colonia) {
        this.calle = calle;
        this.CP = CP;
        this.Estado = Estado;
        this.colonia = colonia;
    }
 

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", Estado=" + Estado + ", CP=" + CP + ", colonia=" + colonia + '}';
    }

    public String getCalle() {
        return calle;
    }

    public String getEstado() {
        return Estado;
    }

    public String getCP() {
        return CP;
    }

    public String getColonia() {
        return colonia;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public void setCP(String CP) {
        this.CP = CP;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
          
}

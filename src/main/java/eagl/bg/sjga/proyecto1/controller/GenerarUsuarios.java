/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eagl.bg.sjga.proyecto1.controller;

import java.util.ArrayList;

public class GenerarUsuarios {
public static ArrayList<Usuario> obtenerUsuarios(){
   ArrayList<Usuario> usuarios=new ArrayList<Usuario>();
   //primero creamos tres direcciones
   Direccion d1=new Direccion("calle de la muerte","55900","Azteca","Mexico");
   Direccion d2=new Direccion("calle de la amargura","55130","San geronimo","Chihuahua");
   Direccion d3=new Direccion("calle 13","55200","ska","Puerto Rico");
  //ahora asociamos las direcciones a sus usuarios
  Usuario u1=new Usuario ("juna",42,45000,d1);
  Usuario u2=new Usuario("Paquita la del barrio",72,1500,d2);
  Usuario u3=new Usuario("Ludoviko",7,3000,d3);
  
  usuarios.add(u1);
  usuarios.add(u2);
  usuarios.add(u3);
  
  
  return usuarios;
  
}    
}

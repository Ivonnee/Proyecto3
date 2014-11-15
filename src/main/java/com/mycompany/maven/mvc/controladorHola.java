package com.mycompany.maven.mvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

public class controladorHola {

    @RequestMapping(value="/hola",method=RequestMethod.GET,headers={"Accept=text/html"})
    public @ResponseBody String holaConGet(){
        return "Este es mi primer controller con get";
        
    }
    //crear un metodo get para los usuarios que me devulevan TODOS
    @RequestMapping(value="/usuario",method=RequestMethod.GET,headers={"Accept=Aplication/json"})
    public @ResponseBody String obtenerTodos(){
    //vamos a usar la implementacion de json para java de fasterxml o  codehouse
        ObjectMapper mapper=new Objectmapper();
    return mapper.weiteValueAsString(GenerarUsuario.obtenerUsuario());    

    }

    

}




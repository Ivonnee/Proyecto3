/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eagl.bg.sjga.proyecto1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")

public class ControladorHola {
    private Object RequesrMethod;
//primero hacemos el get
    @RequestMapping(value="/hola",method=RequestMethod.GET,headers={"/Accept=text/html"})
    public @ResponseBody String holaconGet(){
        return "Este es mi primer controller con get ";
    }
}

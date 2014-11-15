/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eagl.bg.sjga.proyecto1.controller;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 *
 * @author T107
 */
public class WebAp extends AbstractAnnotationConfigDispatcherServletInitializer{

    @Override
    protected Class<?>[] getRootConfigClasses() {
    System.out.println(">>>>>>>CARGANDOO CONFIGURACION CLASES DE CONFIG");
        return  new Class<?>[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
    System.out.println(">>>>>>>CARGANDOO CONFIGURACION CLASES DE SERVLETS");
         return new Class<?>[]{WebApConfig.class};
        
    }

    @Override
    protected String[] getServletMappings() {
 System.out.println(">>>>>>>CARGANDOO CONFIGURACION CLASES DE SERVICIOS");
        return new String[]{"/Servicios/*"};
    }
    
}

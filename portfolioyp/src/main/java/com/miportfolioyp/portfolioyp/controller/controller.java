/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miportfolioyp.portfolioyp.controller;

import com.miportfolioyp.portfolioyp.model.cliente;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kryca
 */

@RestController
public class controller {
    @GetMapping ("/cliente/traer")
    @ResponseBody
    
public List <cliente> traerClientes (){
    List<cliente>listaClientes= new ArrayList<cliente>();
     listaClientes.add(new cliente(1L,"carlos","Perez"));
     listaClientes.add(new cliente(2L,"Federico","Lopez"));
     listaClientes.add(new cliente(3L,"Juan","Rosales"));
     return listaClientes;
}
   
}
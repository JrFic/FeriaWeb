/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Usuarios;
import java.math.BigDecimal;
import model.UsuarioModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author ChristopherVaras
 */
@Controller
public class UsuarioController {
    
    @RequestMapping("index")
    public ModelAndView redireccio()
    {
        
        ModelAndView MV= new ModelAndView();
        MV.setView("index");
   //     MV.addObject("mensaje","Hola soy un mensaje desde copntrolador");
        
        return MV;
    }
    
    @RequestMapping(value="getAll",method = RequestMethod.GET)
    public String getAll(Model m){
        UsuarioModel model = new UsuarioModel();
        m.addAttribute("lst", model.getAll());
        return "data";
    }
    @RequestMapping(value="edit",method = RequestMethod.GET)
    public String edit(@RequestParam(value="rut") String rut,Model m){
        UsuarioModel model = new UsuarioModel();
        Usuarios u = new Usuarios();
        u=model.getUsuario(rut);
        m.addAttribute("u", u);
        return "edit";
    }
    
    
    @RequestMapping(value = "update",method=RequestMethod.POST)
    public String update(@ModelAttribute(value="Usuario") Usuarios u)
    {
        
        
       UsuarioModel model= new UsuarioModel();
      
       Usuarios aux= new Usuarios();
        aux=model.getUsuario(u.getRut());
        aux.setNombreUsuario(u.getNombreUsuario());
        aux.setApellidoUsuario(u.getApellidoUsuario());
        aux.setCelularUsuario(u.getCelularUsuario());
        aux.setEmailUsuario(u.getEmailUsuario());

        model.edit(aux);
        return "redirect:getAll.html";
    }

    @RequestMapping(value = "remove", method = RequestMethod.GET)
    public String remove(@RequestParam(value = "rut") String id, Model m) {

        
        UsuarioModel model = new UsuarioModel();
        Usuarios e = new Usuarios();
        e = model.getUsuario(id);
        model.remove(e);
                    

        return "redirect:getAll.html";
    }
    
    
     @RequestMapping(value="crear",method = RequestMethod.GET)
    public String create(Model m)
    {
      
        UsuarioModel model= new UsuarioModel();
        Usuarios u =new Usuarios();
        
                
        m.addAttribute("u",u);
               
        return "create";
    }
    
    
    
    @RequestMapping(value = "add",method=RequestMethod.POST)
    public String create(@ModelAttribute(value="Usuario") Usuarios u)
    {
        
       
        u.setRut(u.getRut());
        
        
       
        UsuarioModel model=new UsuarioModel();
        model.create(u);
        return "redirect:getAll.html";
    }
   
    
   
 
}

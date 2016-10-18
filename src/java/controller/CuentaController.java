/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Cuentas;
import entity.Usuarios;
import model.CuentaModel;
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
public class CuentaController {
     
    
    
    @RequestMapping(value="getAllacc",method = RequestMethod.GET)
    public String getAll(Model m){
        CuentaModel model = new CuentaModel();
        m.addAttribute("lst", model.getAll());
        return "datoscuenta";
    }
    @RequestMapping(value="editcuenta",method = RequestMethod.GET)
    public String edit(@RequestParam(value="id") int id,Model m){
        CuentaModel model = new CuentaModel();
        Cuentas c = new Cuentas();
        c=model.getCuenta(id);
        m.addAttribute("c", c);
        return "editcuenta";
    }
    
    
    @RequestMapping(value = "updatecuenta",method=RequestMethod.POST)
    public String update(@ModelAttribute(value="Cuenta") Cuentas c)
    {
        
        
       CuentaModel model= new CuentaModel();
      
       Cuentas aux= new Cuentas();
        aux=model.getCuenta(c.getIdCuenta());
        //aux.setNombreCuenta(c.getNombreCuenta());
        aux.setPasswordCuenta(c.getPasswordCuenta());
        //aux.setFechaCreacionCuenta(c.getFechaCreacionCuenta());
        model.edit(aux);
        return "redirect:getAllacc.html";
    }

    @RequestMapping(value = "removecuenta", method = RequestMethod.GET)
    public String remove(@RequestParam(value = "id") int id, Model m) {

        
        CuentaModel model = new CuentaModel();
        Cuentas e = new Cuentas();
        e = model.getCuenta(id);
        model.remove(e);
                    

        return "redirect:getAllacc.html";
    }
    
    
     @RequestMapping(value="crearcuenta",method = RequestMethod.GET)
    public String create(Model m)
    {
      
        CuentaModel model= new CuentaModel();
        Cuentas c =new Cuentas();
        
                
        m.addAttribute("c",c);
               
        return "crearcuenta";
    }
    
    
    
    @RequestMapping(value = "addcuenta",method=RequestMethod.POST)
    public String create(@ModelAttribute(value="Cuenta") Cuentas c)
    {
        
       c.setIdCuenta(c.getIdCuenta());
        
        
        
       
        CuentaModel model=new CuentaModel();
        model.create(c);
        return "redirect:getAllacc.html";
    }
   
    
}

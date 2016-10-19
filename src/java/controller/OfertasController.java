/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Ofertas;
import entity.Usuarios;
import model.OfertaModel;
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
public class OfertasController {
    
   
    
    @RequestMapping(value="PaginaInicio",method = RequestMethod.GET)
    public String getAll(Model m){
        OfertaModel model = new OfertaModel();
        m.addAttribute("catalogo", model.getOfertas());
        return "index";
    }
    
    @RequestMapping(value="DescripcionProducto",method = RequestMethod.GET)
    public String getProducto(@RequestParam(value="idOferta") long idOferta, Model m){
        OfertaModel model = new OfertaModel();
        m.addAttribute("producto", model.getOferta(idOferta));
        return "descripcionOferta";
    }
    
    @RequestMapping(value="editarOferta",method = RequestMethod.GET)
    public String edit(@RequestParam(value="idOferta") long idOferta, Model m){
        OfertaModel model = new OfertaModel();
        Ofertas o = new Ofertas();
        o=model.getEditarOferta(idOferta);
        m.addAttribute("o", o);
        return "editarOferta";
    }
    
    
    @RequestMapping(value = "updateOferta",method=RequestMethod.POST)
    public String update(@ModelAttribute(value="Oferta") Ofertas o)
    {
        
        
       OfertaModel model= new OfertaModel();
      
       Ofertas aux= new Ofertas();
        aux=model.getEditarOferta(o.getIdOferta());
        //Definir que variables se modificaran

        model.edit(aux);
        return "redirect:catalogo.html";
    }

    @RequestMapping(value = "eliminarOferta", method = RequestMethod.GET)
    public String remove(@RequestParam(value = "id") long id, Model m) {

        
        OfertaModel model = new OfertaModel();
        Ofertas e = new Ofertas();
        e = model.getEditarOferta(id);
        model.remove(e);
                    

        return "redirect:catalogo.html";
    }
    
    
     @RequestMapping(value="crearOferta",method = RequestMethod.GET)
    public String create(Model m)
    {
      
        OfertaModel model= new OfertaModel();
        Ofertas o =new Ofertas();
        
                
        m.addAttribute("o",o);
               
        return "haceroferta";
    }
    
    
    
    @RequestMapping(value = "agregarOferta",method=RequestMethod.POST)
    public String create(@ModelAttribute(value="Oferta") Ofertas o)
    {
        
       
        o.setIdOferta(o.getIdOferta());
        
        
       
        OfertaModel model=new OfertaModel();
        model.create(o);
        return "redirect:getAll.html";
    }
   
    
   
}

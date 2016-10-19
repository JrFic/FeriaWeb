/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Ofertas;
import entity.Productos;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author ChristopherVaras
 */
public class ProductoModel {
    public List<Object> getProductos() {
       List<Object> lst = new ArrayList<Object>();
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            lst = s.createQuery("from Ofertas o, Productos p where o.productos = p").list();
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
        
        
        return lst;
    }

}

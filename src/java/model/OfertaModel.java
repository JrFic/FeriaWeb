/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Ofertas;
import entity.Productos;
import entity.Usuarios;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author ChristopherVaras
 */
public class OfertaModel {
    public List<Ofertas> getOfertas() {
        
       List<Ofertas> lst = new ArrayList<Ofertas>();
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            //Las consultas a multiples tablas siguen la misma logica de un join simple
            //las consultas son sensibles a mayus y minusculas, las tablas y variables son las que estan
            //en el mapeo de las clases
            lst = s.createQuery("from Ofertas o, Productos p where o.productos = p").list();
            //lst = s.createQuery("select  p.nombreProducto as nombreProducto,o.costoUnidad as costoUnidad ,o.descripcionOferta as descripcionOferta from Ofertas as o, Productos as  p where o.productos = p").list();
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
      
        
        
        return lst;
    
    }
    public List<Ofertas> getAll() {
       List<Ofertas> lst = new ArrayList<Ofertas>();
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            lst = s.createCriteria(Ofertas.class).list();
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
        
        
        return lst;
    }

    //Create
    public void create(Ofertas o) {

        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            s.save(o);

            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }

    }

    //remove
    public void remove(Ofertas o) {

        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            s.delete(o);
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }

    }

    //update
    public void update(Ofertas o) {

        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            s.update(o);
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }

    }

    public void edit(Ofertas o) {

        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            s.update(o);
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }

    }
    public Ofertas getEditarOferta(long id) {

        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        Ofertas o = new Ofertas();

        try {
            s.beginTransaction();
            o=(Ofertas) s.get(Ofertas.class, id);
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
        return o;
    }
    public List<Ofertas> getOferta(long idOferta) {
        
       List<Ofertas> lst = new ArrayList<Ofertas>();
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            lst = s.createQuery("from Ofertas o, Productos p,  Productores pr, Pesajes pes, Categorias cat, Usuarios u where o.productos = p and p.categorias = cat and p.pesajes=pes and o.productores = pr and\n" +
"pr.usuarios = u and o.idOferta="+idOferta+"").list();
            //lst = s.createQuery("select  p.nombreProducto as nombreProducto,o.costoUnidad as costoUnidad ,o.descripcionOferta as descripcionOferta from Ofertas as o, Productos as  p where o.productos = p").list();
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
      
        
        
        return lst;
    
    }
    public List<Ofertas> getOfertas(long idProductor) {
        List<Ofertas> lstOfertasP = new ArrayList<Ofertas>();
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            lstOfertasP = s.createQuery("from Ofertas where PRODUCTOR_PRODUCTOR_ID='"+idProductor+"'").list();
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
        
        
        return lstOfertasP;
    }
}

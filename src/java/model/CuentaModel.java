/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Cuentas;
import entity.Usuarios;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author ChristopherVaras
 */
public class CuentaModel {
    //conexion
    public List<Cuentas> getAll() {
        List<Cuentas> lst = new ArrayList<Cuentas>();
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            lst = s.createCriteria(Cuentas.class).list();
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
        
        
        return lst;
    }

    //Create
    public void create(Cuentas c) {

        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            s.save(c);

            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }

    }

    //remove
    public void remove(Cuentas c) {

        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            s.delete(c);
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }

    }

    //update
    public void update(Cuentas c) {

        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            s.update(c);
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }

    }

    public void edit(Cuentas c) {

        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            s.update(c);
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }

    }

    public Cuentas getCuenta(int id) {

        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        Cuentas c = new Cuentas();

        try {
            s.beginTransaction();
            c=(Cuentas) s.get(Cuentas.class, id);
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
        return c;
    }
}

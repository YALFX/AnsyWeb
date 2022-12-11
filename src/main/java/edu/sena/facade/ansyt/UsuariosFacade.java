/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.sena.facade.ansyt;

import edu.sena.entity.ansyt.Usuarios;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author anderson
 */
@Stateless
public class UsuariosFacade extends AbstractFacade<Usuarios> implements UsuariosFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_AnsyWeb_war_1.0-VERSIONPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuariosFacade() {
        super(Usuarios.class);
    }

    @Override
    public Usuarios validarUsuario(String correoIn, String claveIn) {
        try {
            Query q = em.createQuery("SELECT p FROM Usuarios p WHERE p.usCorreo = :p1 AND p.usClave = :p2");
            q.setParameter("p1", correoIn);
            q.setParameter("p2", claveIn);
            return (Usuarios) q.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
    
    @Override
    public Usuarios validarUsuarioReg(String correoIn) {
        try {
            Query q = em.createQuery("SELECT p FROM Usuarios p WHERE p.usCorreo = :p1");
            q.setParameter("p1", correoIn);
            return (Usuarios) q.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.sena.facade.ansyt;

import edu.sena.entity.ansyt.Planes;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author anderson
 */
@Stateless
public class PlanesFacade extends AbstractFacade<Planes> implements PlanesFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_AnsyWeb_war_1.0-VERSIONPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PlanesFacade() {
        super(Planes.class);
    }
    
    @Override
    public List<Planes> planesSelecionados(String tipo) {
        try {
            em.getEntityManagerFactory().getCache().evictAll();
            Query q = em.createQuery("SELECT p FROM Planes p WHERE p.planTipoPlan = :p1 ");
            q.setParameter("p1", tipo);
            return q.getResultList();            
        } catch (Exception e) {
            return null;
        }
    }

    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.sena.facade.ansyt;

import edu.sena.entity.ansyt.Estados;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author anderson
 */
@Stateless
public class EstadosFacade extends AbstractFacade<Estados> implements EstadosFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_AnsyWeb_war_1.0-VERSIONPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EstadosFacade() {
        super(Estados.class);
    }
    
}

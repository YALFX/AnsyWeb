/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.sena.facade.ansyt;

import edu.sena.entity.ansyt.TiposDocumentos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author anderson
 */
@Stateless
public class TiposDocumentosFacade extends AbstractFacade<TiposDocumentos> implements TiposDocumentosFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_AnsyWeb_war_1.0-VERSIONPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TiposDocumentosFacade() {
        super(TiposDocumentos.class);
    }
    
}

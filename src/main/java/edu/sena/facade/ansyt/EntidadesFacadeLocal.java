/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.sena.facade.ansyt;

import edu.sena.entity.ansyt.Entidades;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author anderson
 */
@Local
public interface EntidadesFacadeLocal {

    void create(Entidades entidades);

    void edit(Entidades entidades);

    void remove(Entidades entidades);

    Entidades find(Object id);

    List<Entidades> findAll();

    List<Entidades> findRange(int[] range);

    int count();
    
}

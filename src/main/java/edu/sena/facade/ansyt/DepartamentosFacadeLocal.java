/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.sena.facade.ansyt;

import edu.sena.entity.ansyt.Departamentos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author anderson
 */
@Local
public interface DepartamentosFacadeLocal {

    void create(Departamentos departamentos);

    void edit(Departamentos departamentos);

    void remove(Departamentos departamentos);

    Departamentos find(Object id);

    List<Departamentos> findAll();

    List<Departamentos> findRange(int[] range);

    int count();
    
}

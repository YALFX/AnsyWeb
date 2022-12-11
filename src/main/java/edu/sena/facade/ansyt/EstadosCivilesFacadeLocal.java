/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.sena.facade.ansyt;

import edu.sena.entity.ansyt.EstadosCiviles;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author anderson
 */
@Local
public interface EstadosCivilesFacadeLocal {

    void create(EstadosCiviles estadosCiviles);

    void edit(EstadosCiviles estadosCiviles);

    void remove(EstadosCiviles estadosCiviles);

    EstadosCiviles find(Object id);

    List<EstadosCiviles> findAll();

    List<EstadosCiviles> findRange(int[] range);

    int count();
    
}

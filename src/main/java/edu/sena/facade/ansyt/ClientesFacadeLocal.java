/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.sena.facade.ansyt;

import edu.sena.entity.ansyt.Clientes;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author anderson
 */
@Local
public interface ClientesFacadeLocal {

    void create(Clientes clientes);

    void edit(Clientes clientes);

    void remove(Clientes clientes);

    Clientes find(Object id);

    List<Clientes> findAll();

    List<Clientes> findRange(int[] range);

    int count();
    
}

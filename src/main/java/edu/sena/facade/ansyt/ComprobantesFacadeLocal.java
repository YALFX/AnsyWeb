/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.sena.facade.ansyt;

import edu.sena.entity.ansyt.Comprobantes;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author anderson
 */
@Local
public interface ComprobantesFacadeLocal {

    void create(Comprobantes comprobantes);

    void edit(Comprobantes comprobantes);

    void remove(Comprobantes comprobantes);

    Comprobantes find(Object id);

    List<Comprobantes> findAll();

    List<Comprobantes> findRange(int[] range);

    int count();
    
}

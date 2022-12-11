/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.sena.facade.ansyt;

import edu.sena.entity.ansyt.Planes;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author anderson
 */
@Local
public interface PlanesFacadeLocal {

    void create(Planes planes);

    void edit(Planes planes);

    void remove(Planes planes);

    Planes find(Object id);

    List<Planes> findAll();

    List<Planes> findRange(int[] range);

    int count();
    
    public List<Planes> planesSelecionados(String tipo);

    
}

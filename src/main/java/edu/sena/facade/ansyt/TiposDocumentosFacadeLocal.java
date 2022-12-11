/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.sena.facade.ansyt;

import edu.sena.entity.ansyt.TiposDocumentos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author anderson
 */
@Local
public interface TiposDocumentosFacadeLocal {

    void create(TiposDocumentos tiposDocumentos);

    void edit(TiposDocumentos tiposDocumentos);

    void remove(TiposDocumentos tiposDocumentos);

    TiposDocumentos find(Object id);

    List<TiposDocumentos> findAll();

    List<TiposDocumentos> findRange(int[] range);

    int count();
    
}

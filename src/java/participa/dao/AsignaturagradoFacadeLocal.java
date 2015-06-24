/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package participa.dao;

import java.util.List;
import javax.ejb.Local;
import participa.modelo.Asignaturagrado;

/**
 *
 * @author USUARIO
 */
@Local
public interface AsignaturagradoFacadeLocal {

    void create(Asignaturagrado asignaturagrado);

    void edit(Asignaturagrado asignaturagrado);

    void remove(Asignaturagrado asignaturagrado);

    Asignaturagrado find(Object id);

    List<Asignaturagrado> findAll();

    List<Asignaturagrado> findRange(int[] range);

    int count();
    
}

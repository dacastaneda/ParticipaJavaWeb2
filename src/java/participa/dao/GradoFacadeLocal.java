/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package participa.dao;

import java.util.List;
import javax.ejb.Local;
import participa.modelo.Grado;

/**
 *
 * @author USUARIO
 */
@Local
public interface GradoFacadeLocal {

    void create(Grado grado);

    void edit(Grado grado);

    void remove(Grado grado);

    Grado find(Object id);

    List<Grado> findAll();

    List<Grado> findRange(int[] range);

    int count();
    
}

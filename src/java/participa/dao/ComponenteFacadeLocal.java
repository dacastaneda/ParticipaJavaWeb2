/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package participa.dao;

import java.util.List;
import javax.ejb.Local;
import participa.modelo.Componente;

/**
 *
 * @author USUARIO
 */
@Local
public interface ComponenteFacadeLocal {

    void create(Componente componente);

    void edit(Componente componente);

    void remove(Componente componente);

    Componente find(Object id);

    List<Componente> findAll();

    List<Componente> findRange(int[] range);

    int count();
    
}

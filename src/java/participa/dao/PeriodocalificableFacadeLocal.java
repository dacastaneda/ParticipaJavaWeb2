/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package participa.dao;

import java.util.List;
import javax.ejb.Local;
import participa.modelo.Periodocalificable;

/**
 *
 * @author USUARIO
 */
@Local
public interface PeriodocalificableFacadeLocal {

    void create(Periodocalificable periodocalificable);

    void edit(Periodocalificable periodocalificable);

    void remove(Periodocalificable periodocalificable);

    Periodocalificable find(Object id);

    List<Periodocalificable> findAll();

    List<Periodocalificable> findRange(int[] range);

    int count();
    
}

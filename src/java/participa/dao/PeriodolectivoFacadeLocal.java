/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package participa.dao;

import java.util.List;
import javax.ejb.Local;
import participa.modelo.Periodolectivo;

/**
 *
 * @author USUARIO
 */
@Local
public interface PeriodolectivoFacadeLocal {

    void create(Periodolectivo periodolectivo);

    void edit(Periodolectivo periodolectivo);

    void remove(Periodolectivo periodolectivo);

    Periodolectivo find(Object id);

    List<Periodolectivo> findAll();

    List<Periodolectivo> findRange(int[] range);

    int count();
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package participa.dao;

import java.util.List;
import javax.ejb.Local;
import participa.modelo.Logro;

/**
 *
 * @author USUARIO
 */
@Local
public interface LogroFacadeLocal {

    void create(Logro logro);

    void edit(Logro logro);

    void remove(Logro logro);

    Logro find(Object id);

    List<Logro> findAll();

    List<Logro> findRange(int[] range);

    int count();
    
}

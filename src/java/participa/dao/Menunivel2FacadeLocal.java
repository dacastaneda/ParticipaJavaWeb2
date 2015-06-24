/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package participa.dao;

import java.util.List;
import javax.ejb.Local;
import participa.modelo.Menunivel2;

/**
 *
 * @author USUARIO
 */
@Local
public interface Menunivel2FacadeLocal {

    void create(Menunivel2 menunivel2);

    void edit(Menunivel2 menunivel2);

    void remove(Menunivel2 menunivel2);

    Menunivel2 find(Object id);

    List<Menunivel2> findAll();

    List<Menunivel2> findRange(int[] range);

    int count();
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package participa.dao;

import java.util.List;
import javax.ejb.Local;
import participa.modelo.Actividadacalificar;

/**
 *
 * @author USUARIO
 */
@Local
public interface ActividadacalificarFacadeLocal {

    void create(Actividadacalificar actividadacalificar);

    void edit(Actividadacalificar actividadacalificar);

    void remove(Actividadacalificar actividadacalificar);

    Actividadacalificar find(Object id);

    List<Actividadacalificar> findAll();

    List<Actividadacalificar> findRange(int[] range);

    int count();
    
}

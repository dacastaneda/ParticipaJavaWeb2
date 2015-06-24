/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package participa.dao;

import java.util.List;
import javax.ejb.Local;
import participa.modelo.Cursoestudiante;

/**
 *
 * @author USUARIO
 */
@Local
public interface CursoestudianteFacadeLocal {

    void create(Cursoestudiante cursoestudiante);

    void edit(Cursoestudiante cursoestudiante);

    void remove(Cursoestudiante cursoestudiante);

    Cursoestudiante find(Object id);

    List<Cursoestudiante> findAll();

    List<Cursoestudiante> findRange(int[] range);

    int count();
    
}

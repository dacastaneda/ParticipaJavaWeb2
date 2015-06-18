/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package participa.controlador;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import participa.dao.ComponenteFacade;
import participa.modelo.Componente;

/**
 *
 * @author DIEGOCH
 */
@Stateless
public class Controlador {
    @EJB
    private ComponenteFacade componenteFacade;

    public List<Componente> getTodosComponentes() {
        return componenteFacade.findAll();
    }

}

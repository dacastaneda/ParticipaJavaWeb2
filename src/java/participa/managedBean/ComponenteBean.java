/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package participa.managedBean;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import participa.controlador.Controlador;
import participa.modelo.Componente;

/**
 *
 * @author DIEGOCH
 */
@ManagedBean
@RequestScoped
public class ComponenteBean {
    private Controlador controlador;

    List<Componente> componentes;
    
    public ComponenteBean() {
    }

    public List<Componente> getComponentes() {
        
        componentes = controlador.getTodosComponentes();
        
        return componentes;
    }
    
    
}

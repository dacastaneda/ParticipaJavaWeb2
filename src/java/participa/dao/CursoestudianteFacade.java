/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package participa.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import participa.modelo.Cursoestudiante;

/**
 *
 * @author DIEGOCH
 */
@Stateless
public class CursoestudianteFacade extends AbstractFacade<Cursoestudiante> {
    @PersistenceContext(unitName = "ParticipaJavaWebPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CursoestudianteFacade() {
        super(Cursoestudiante.class);
    }
    
}

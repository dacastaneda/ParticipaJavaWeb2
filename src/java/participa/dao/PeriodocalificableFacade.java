/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package participa.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import participa.modelo.Periodocalificable;

/**
 *
 * @author USUARIO
 */
@Stateless
public class PeriodocalificableFacade extends AbstractFacade<Periodocalificable> implements PeriodocalificableFacadeLocal {
    @PersistenceContext(unitName = "ParticipaJavaWebPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PeriodocalificableFacade() {
        super(Periodocalificable.class);
    }
    
}

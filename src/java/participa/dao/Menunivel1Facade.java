/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package participa.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import participa.modelo.Menunivel1;

/**
 *
 * @author USUARIO
 */
@Stateless
public class Menunivel1Facade extends AbstractFacade<Menunivel1> implements Menunivel1FacadeLocal {
    @PersistenceContext(unitName = "ParticipaJavaWebPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Menunivel1Facade() {
        super(Menunivel1.class);
    }
    
}

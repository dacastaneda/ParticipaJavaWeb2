/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package participa.controlador;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import participa.dao.Menunivel1FacadeLocal;
import participa.modelo.Menunivel1;

/**
 *
 * @author USUARIO
 */
@Named
@ViewScoped
public class Menunivel1Controller implements Serializable{

    @EJB
    private Menunivel1FacadeLocal menunivel1EJB;
    private Menunivel1 menunivel1;

    public Menunivel1 getMenunivel1() {
        return menunivel1;
    }

    public void setMenunivel1(Menunivel1 menunivel1) {
        this.menunivel1 = menunivel1;
    }

    @PostConstruct
    public void init() {
        menunivel1 = new Menunivel1();
    }

    public void registrar() {
        try {
            menunivel1EJB.create(menunivel1);
        } catch (Exception e) {
            // algo para aponer 
        }
    }
}

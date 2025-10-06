package com.restauranterodrigues;

import com.restauranterodrigues.persistencia.JPAUtil;
import com.restauranterodrigues.gui.TelaInicial;
import jakarta.persistence.EntityManager;

public class Restauranterodrigues {        
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManager();           
        JPAUtil.closeEtityManager(); 
        
        TelaInicial TI = new TelaInicial();
        TI.setVisible(true);          
    }
}

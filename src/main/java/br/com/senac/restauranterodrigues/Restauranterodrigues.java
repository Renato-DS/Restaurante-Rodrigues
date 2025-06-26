package br.com.senac.restauranterodrigues;

import br.com.senac.restauranterodrigues.gui.*;
import br.com.senac.restauranterodrigues.persistencia.*;

public class Restauranterodrigues {
    public static void main(String[] args) {
        JPAUtil.getEntityManager();
        JPAUtil.closeEtityManager();
        
        TelaInicial TI = new TelaInicial();
        TI.setVisible(true);          
    }
}

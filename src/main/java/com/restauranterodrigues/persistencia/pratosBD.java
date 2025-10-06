package com.restauranterodrigues.persistencia;

import com.restauranterodrigues.gui.AtualizarPedido;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;
import javax.swing.JOptionPane;

public class pratosBD {
    EntityManager em = JPAUtil.getEntityManager();

public void cadastrar(pratos p) {    
try {
        em.getTransaction().begin();
        em.persist(p);       
        this.update();
}catch(Exception e){
        em.getTransaction().rollback();
         throw e;
}
finally{
     JPAUtil.closeEtityManager();
    }
  }

public void update(){    
       String sql = "UPDATE pedidos p SET valor_total = (SELECT sum(pr.quantidade * c.preco) FROM pratos pr JOIN cardapio c ON c.id = pr.cardapio_id WHERE pr.id_pedidos = p.id AND pr.cardapio_id = c.id) WHERE p.id = :novoValor";
       Query query = em.createNativeQuery(sql);
       query.setParameter("novoValor", AtualizarPedido.pedidoId);
       
       query.executeUpdate();
       em.getTransaction().commit();
       JOptionPane.showMessageDialog(null, "Pedido atualizado com sucesso!");
}

public List<pratos> listar(){
      List prato = null;
      try{
          String textoQuery = "SELECT p FROM pratos p";
          
          Query consulta = em.createQuery(textoQuery);       
          
          prato = consulta.getResultList();
      }finally{
          JPAUtil.closeEtityManager();
      }
      return prato;
    }
}

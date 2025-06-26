package br.com.senac.restauranterodrigues.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;
import javax.swing.JOptionPane;

public class pedidosBD {
    
EntityManager em = JPAUtil.getEntityManager();
    
public boolean cadastrar(pedidos p) {
 if (JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja cadstrar um pedido? ESTA AÇÃO É IRREVERSÍVEL!") == 0) {
  try {
    em.getTransaction().begin();
    em.persist(p);
    em.getTransaction().commit();    
    return true;
   /*
    * A ideia do cadastro ser irreversível é que os pedidos são as vendas,
    * assim, são usados para notas fiscais e fins jurídicos, caso necessário. 
    */
  }catch(Exception e){
        em.getTransaction().rollback();   
        return false; 
   }
  finally{
    JPAUtil.closeEtityManager();
        }
    }
 else { return false; }
 }
public void atualizar(pedidos p){
 try {
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
 }catch(Exception e){
            em.getTransaction().rollback();
            throw e;
    }
 finally{
   JPAUtil.closeEtityManager();
    }
  }
    public List<pedidos> listar(){
      List Pedidos = null;
      try{
          String textoQuery = "SELECT p FROM pedidos p";
          
          Query consulta = em.createQuery(textoQuery);               
          
          Pedidos = consulta.getResultList();
      }finally{
          JPAUtil.closeEtityManager();
      }
      return Pedidos;
    }
}

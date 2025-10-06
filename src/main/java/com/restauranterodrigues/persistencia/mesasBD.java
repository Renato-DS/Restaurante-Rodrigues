package com.restauranterodrigues.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

public class mesasBD { 
    EntityManager em = JPAUtil.getEntityManager(); 
public void adicionar (mesas m) {    
    try {
    em.getTransaction().begin();
    em.persist(m);
    em.getTransaction().commit();
}catch(Exception e){
    em.getTransaction().rollback();
    throw e; 
}   
    }
     
    public void remover(int id) { 
          try{
          mesas m = em.find(mesas.class, id);   
          String tabela = "mesas";
          String sql = "ALTER TABLE " + tabela + " AUTO_INCREMENT= :novoValor";       
          String upd = "UPDATE pedidos SET mesas_id = null WHERE mesas_id= :novoVal";
          if(m != null){            
            em.getTransaction().begin();
            em.createNativeQuery(upd).setParameter("novoVal", id).executeUpdate();
            em.remove(m);
            
        /*    
        * Ao remover, o ID será retrocedido em 1
        * utilizando o "ALTER TABLE " + tabela + " AUTO_INCREMENT= :novoValor".
        * Pretende-se que, ao se excluir uma mesa que foi utilizada em chave-estrangeira,
        * os dados referenciando esta mesa se transforme em um 0 (ou nulo). Indicando que
        * houve exclusão da mesa essa funcionalidade servirá apenas para organização do 
        * ambiente (que ainda É o que se espera dessa aplicação!)
        */    
           
            em.createNativeQuery(sql).setParameter("novoValor", id).executeUpdate();
            em.getTransaction().commit();           
          }
      }catch(Exception e){
          em.getTransaction().rollback();
          throw e; 
      }
      finally{
          JPAUtil.closeEtityManager();
      }   
}
    
    public void atualizar(mesas m){
 try {
            em.getTransaction().begin();
            em.merge(m);
            em.getTransaction().commit();
 }catch(Exception e){
            em.getTransaction().rollback();
            throw e;
    }
 finally{
   JPAUtil.closeEtityManager();
    }
  }
    public List<mesas> listar(){
      List Mesas = null;
      try{
          String textoQuery = "SELECT m FROM mesas m";
          
          Query consulta = em.createQuery(textoQuery);               
          
          Mesas = consulta.getResultList();
      }finally{
          JPAUtil.closeEtityManager();
      }
      return Mesas;
    }
}

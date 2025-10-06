package com.restauranterodrigues.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

public class cardapioBD {
 
public List<cardapio> listar(){
      EntityManager em = JPAUtil.getEntityManager();
      List cardapio = null;
      try{
          String textoQuery = "SELECT c FROM cardapio c";
          
          Query consulta = em.createQuery(textoQuery);       
          
          cardapio = consulta.getResultList();
      }finally{
          JPAUtil.closeEtityManager();
      }
      return cardapio;
    }
}

package br.com.senac.restauranterodrigues.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author Renato Rodrigues
 */ 
/* Classe para estabelecer a conexão com o JPA */
  public class JPAUtil {
    private static final String PERSISTENCE_UNIT = "restaRodrigues";
    
    private static EntityManager em;
    private static EntityManagerFactory fabrica;
    
 
    public static EntityManager getEntityManager(){
        if(fabrica == null || !fabrica.isOpen())
            fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        
        if(em == null || !em.isOpen())
            em = fabrica.createEntityManager();

        return em;
    }
    

public static void closeEtityManager(){
        if(em.isOpen() && em != null){
            em.close();
            fabrica.close();
        }
   }
}    


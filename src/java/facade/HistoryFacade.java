/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.History;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author pupil
 */
public class HistoryFacade extends AbstractFacade<History>{

        @PersistenceContext(unitName = "JPTV20WebShopPU")
        private EntityManager em;
        
        
        @Override
        protected EntityManager getEntityManager() {
            return em;
        }
        
        public HistoryFacade(){
            super(History.class);
        
    }
    
}

package facade;

import entity.User;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class UserFacade extends AbstractFacade<User> {

    @PersistenceContext(unitName = "JPTV20_webBootsShopPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserFacade() {
        super(User.class);
    }
    
    public User findByLogin(String login){
        try {
            return (User) em.createQuery("SELECT u FROM User u WHERE u.login=:login").setParameter("login", login).getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

}
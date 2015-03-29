/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magic.dao;

import magic.cards.Land;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author max
 */
public class LandDAO implements AbstractDao<Land>{

    @Override
    public void createEntity(Land card) {
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.persist(card);
        tx.commit();
        session.flush();
        session.close();
        System.out.println("La carte "+card.toString()+" a bien été persité.");
    }

    @Override
    public void updateEntity(Land card) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteEntiry(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

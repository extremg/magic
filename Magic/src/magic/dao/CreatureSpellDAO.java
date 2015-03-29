/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magic.dao;

import java.util.ArrayList;
import java.util.List;
import magic.cards.CreatureSpell;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author maxime
 */
public class CreatureSpellDAO implements AbstractDao<CreatureSpell>{

    @Override
    public void createEntity(CreatureSpell card) {
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(card);
        tx.commit();
        session.flush();
        session.close();
    }

    public List<CreatureSpell> readEntityByName(String name) {
        ArrayList<CreatureSpell> listOfCard = new ArrayList<>();
        SessionFactory sf = HibernateUtils.getSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
        Query query = session.createQuery("from CreatureSpell card select card.");
        session.getTransaction().commit();
        session.close();
        return listOfCard;
    }

    @Override
    public void updateEntity(CreatureSpell card) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteEntiry(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

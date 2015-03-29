/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magic.dao;

import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author maxime
 */
public class HibernateUtils {
    private static SessionFactory sessionFactory = buildSessionFactory();
 
   private static SessionFactory buildSessionFactory() {
      try {
         if (sessionFactory == null) {
            Configuration configuration = new Configuration().configure(HibernateUtil.class.getResource("magic/configuration/hibernate.cfg.xml"));
            StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
            serviceRegistryBuilder.applySettings(configuration.getProperties());
            ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
         }
         return sessionFactory;
      } catch (Throwable ex) {
         System.err.println("Initial SessionFactory creation failed." + ex);
         throw new ExceptionInInitializerError(ex);
      }
   }
 
   public static SessionFactory getSessionFactory() {
      return sessionFactory;
   }
 
   public static void shutdown() {
      getSessionFactory().close();
   }
}

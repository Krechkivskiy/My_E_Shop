package util;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfiguration {
    private static final SessionFactory sessionFactory = buildSessionFactory();
    private static final Logger logger = Logger.getLogger(HibernateConfiguration.class);

    private HibernateConfiguration() {
    }

    private static SessionFactory buildSessionFactory() {
        try {
            return new Configuration().configure().buildSessionFactory();
        } catch (Exception e) {
            logger.error("Try to build SessionFactory was failed!", e);
        }
        return null;
    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    }



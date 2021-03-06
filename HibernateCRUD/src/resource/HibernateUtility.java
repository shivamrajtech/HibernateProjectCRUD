package resource;



import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtility{
	
	private static final String CONFIGURATION_LOCATION ="resource/hibernate.cfg.xml";
	private static SessionFactory sessionFactory = getSessionFactory();
	private static SessionFactory getSessionFactory() {
		try {
			if(sessionFactory==null) {
				// step1:
				Configuration configuration = new Configuration();
				configuration.configure(CONFIGURATION_LOCATION);
				//step2:
				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
				
			}
		}catch(Exception e) {
			System.out.println("ERROR : HibernnatUtility :" + e.getMessage());
			e.printStackTrace();
		}
		return sessionFactory;
	}
		public static SessionFactory createSessionFactory() {
			return getSessionFactory();
		}
		public static void closeSessionFactory() {
			if(!sessionFactory.isClosed()||sessionFactory!=null) {
				sessionFactory.close();
			}
	}
	
}

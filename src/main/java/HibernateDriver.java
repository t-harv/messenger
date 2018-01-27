import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.tutorial.rest.messenger.model.Message;
import org.tutorial.rest.messenger.model.Profile;

public class HibernateDriver {
	public static void main(String[] args){
		//long id, String message, String author
		Message msg = new Message(1, "What it is!", "Toyan");
		//public Profile(long id, String profileName, String firstName, String lastName) {
		Profile prof = new Profile(1, "tharv", "Toyan", "Harvey");

		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			try{
				session.beginTransaction();
				session.save(msg);
				session.save(prof);
				session.getTransaction().commit();
			} catch(Exception ex){
				session.getTransaction().rollback();
				ex.printStackTrace();
			}
		}catch(Exception ex){
			ex.printStackTrace();

		}
		System.out.println("BOOSH!");
	}
}

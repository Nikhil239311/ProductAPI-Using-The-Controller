package tka.com;

import java.sql.Connection;
import java.sql.DriverManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MyConfig {
	static String url = "jdbc:mysql://localhost:3306/emphibernate";
	static String user = "root";
	static String pass = "Nikhil2393";
	static Connection con=null;
	
	public static Connection getDBConnection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection(url, user, pass);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}

	public static Session getHibernateConnection() {
		Configuration cfg= new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Product.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session = factory.openSession();
		return session;
	}
	
	
}

package tka.com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class DaoProduct {
	Connection con;
	PreparedStatement pst;
	ResultSet rs;

	public void addProductDetails(Product p) {

		try {

			con = MyConfig.getDBConnection();
			String query = "insert into product values(?,?,?,?,?,?)";
			pst = con.prepareStatement(query);

			pst.setInt(1, p.getId());
			pst.setString(2, p.getName());
			pst.setInt(3, p.getQty());
			pst.setDouble(4, p.getCost());
			pst.setString(5, p.getMfgdate());
			pst.setString(6, p.getExpdate());

			pst.executeUpdate();

			System.out.println("Data Inserted " + p.id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Product addProductDetails(int id, String name) {
		Product p = new Product();
		try {
			con = MyConfig.getDBConnection();
			String query = "UPDATE product  SET name = ? WHERE id =?";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, "book");
			pst.setInt(2, 1);
			pst.executeUpdate();
			System.out.println("Product Updated Success ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}

	public Product deleteProduct(int id) {

		Product p = new Product();
		try {
			con = MyConfig.getDBConnection();
			String query = "DELETE FROM product WHERE id =?";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, id);
			pst.executeUpdate();
			System.out.println("Product deleted Success ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}

	public Product dispalyProductById(int id) {
		Product p = new Product();
		try {
			con = MyConfig.getDBConnection();
			String query = "select * FROM product WHERE id =3";
			PreparedStatement pst = con.prepareStatement(query);
			rs = pst.executeQuery();
			while (rs.next()) {
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setCost(rs.getDouble(3));
				p.setQty(rs.getInt(4));
				p.setMfgdate(rs.getString(5));
				p.setExpdate(rs.getString(6));

				System.out.println("Product fetched Success ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;

	}

	public List<Product> dipslayAllDetails() {

		List<Product> lp = new ArrayList<Product>();
		try {
			con = MyConfig.getDBConnection();
			String query = "select * FROM product";
			PreparedStatement pst = con.prepareStatement(query);
			rs = pst.executeQuery();
			while (rs.next()) {
				Product p = new Product();
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setCost(rs.getDouble(3));
				p.setQty(rs.getInt(4));
				p.setMfgdate(rs.getString(5));
				p.setExpdate(rs.getString(6));

				lp.add(p);
			}
			System.out.println("Product fetched Success ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lp;
	}

	public List<Product> dipslayDetailsByName(String name) {

		List<Product> lp = new ArrayList<Product>();
		try {
			con = MyConfig.getDBConnection();
			String query = "select * FROM product WHERE name='pen'";
			PreparedStatement pst = con.prepareStatement(query);
			rs = pst.executeQuery();
			while (rs.next()) {
				Product p = new Product();
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setCost(rs.getDouble(3));
				p.setQty(rs.getInt(4));
				p.setMfgdate(rs.getString(5));
				p.setExpdate(rs.getString(6));

				lp.add(p);
			}
			System.out.println("Product fetched Success ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lp;

	}

	public Product dispalyProductByIdRes() {
		Product p = new Product();
		try {

			con = MyConfig.getDBConnection();
			Session session = MyConfig.getHibernateConnection();

			Criteria criteria = session.createCriteria(Product.class);

			criteria.add(Restrictions.eq("id", 1));

			List<Product> plist = criteria.list();

			for (Product product : plist) {
				System.out.println(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}

	public List<Product> dipslayDetailsByNameRes() {
		List<Product> pc = new ArrayList<Product>();

		try {
			con = MyConfig.getDBConnection();
			Session session = MyConfig.getHibernateConnection();

			Criteria criteria = session.createCriteria(Product.class);

			criteria.add(Restrictions.eq("name", "book"));

			List<Product> plist = criteria.list();

			for (Product product : plist) {
				System.out.println(product);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pc;
	}

	public List<Product> displayDetailsByPatternName() {
		List<Product> ps = new ArrayList<Product>();

		try {
			con = MyConfig.getDBConnection();
			Session session = MyConfig.getHibernateConnection();

			Criteria criteria = session.createCriteria(Product.class);
			criteria.add(Restrictions.like("name", "b%"));

			List<Product> plist = criteria.list();
			for (Product product : plist) {
				System.out.println(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return ps;
	}

	public List<Product> dipslayDetailsByPrice() {
		List<Product> ps = new ArrayList<Product>();

		try {
			con = MyConfig.getDBConnection();
			Session session = MyConfig.getHibernateConnection();

			Criteria criteria = session.createCriteria(Product.class);
			criteria.add(Restrictions.eq("cost", 25.0));

			List<Product> plist = criteria.list();
			for (Product product : plist) {
				System.out.println(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return ps;
	}

	public List<Product> dipslayDetailsByCostRange() {
		List<Product> pc = new ArrayList<Product>();

		try {
			con = MyConfig.getDBConnection();
			Session session = MyConfig.getHibernateConnection();

			Criteria criteria = session.createCriteria(Product.class);
			criteria.add(Restrictions.between("cost", 25.0, 100.0));
			List<Product> plist = criteria.list();

			for (Product product : plist) {
				System.out.println(product);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pc;
	}

	public List<Product> dipslayDetailsByMaxCost() {
		List<Product> pc = new ArrayList<Product>();

		try {

			con = MyConfig.getDBConnection();
			Session session = MyConfig.getHibernateConnection();

			Criteria criteria = session.createCriteria(Product.class);
			criteria.setProjection(Projections.max("cost"));

			Object uniqueResult = criteria.uniqueResult();

			ProjectionList projectionList = Projections.projectionList();
			criteria.setProjection(projectionList);
			projectionList.add(Projections.property("name"));
			projectionList.add(Projections.property("qty"));
			projectionList.add(Projections.property("cost"));

			List<Object[]> plist = criteria.list();

			System.out.println("Max value of Cost is :" + uniqueResult);
			System.out.println("Name-Qty-Cost");
			for (Object[] objects : plist) {
				for (Object objects2 : objects) {
					System.out.print(objects2 + " ");
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pc;
	}

	public List<Product> dipslayExpiredDetails() {
		List<Product> pc = new ArrayList<Product>();

		try {

			con = MyConfig.getDBConnection();
			Session session = MyConfig.getHibernateConnection();
			Criteria criteria = session.createCriteria(Product.class);
			criteria.add(Restrictions.eq("cost", 0.0));
			List<Product> plist = criteria.list();

			for (Product product : plist) {
				System.out.println(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pc;

	}

	public List<Product> dipslayAscCost() {
		List<Product> pc = new ArrayList<Product>();

		try {
			con = MyConfig.getDBConnection();
			Session session = MyConfig.getHibernateConnection();

			Criteria criteria = session.createCriteria(Product.class);
			criteria.addOrder(Order.asc("cost"));
			List<Product> plist = criteria.list();

			for (Product product : plist) {
				System.out.println(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return pc;
	}
}

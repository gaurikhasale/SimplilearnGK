package services;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.UserDetails;

@WebServlet("/HibernateTestServlet")
public class HibernateTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
void register(UserDetails user){
		
		SessionFactory sessionFactory=new Configuration().configure(new File("C:\\Users\\Lenovo\\eclipse-workspace-phase2\\AddingNewProductInDatabase\\src\\main\\java\\hibernate.cfg.xml")).buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		
		session.getTransaction().commit();
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int uid=Integer.parseInt(request.getParameter("txtUid"));
		String uname=request.getParameter("txtName");
		
		//create Object of UserDetails
		UserDetails user=new UserDetails();
		user.setId(uid);
		user.setUsername(uname);
	
		//call register method
		register(user);
		
	}
}

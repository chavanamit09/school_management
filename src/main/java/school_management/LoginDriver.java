package school_management;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/zxy1")
public class LoginDriver extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("desto");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("select u from Principal u where u.email=?1 and u.password=?2");
		q.setParameter(1, email);
		q.setParameter(2, pass);
		List<Principal>l=q.getResultList();
		if(l.size()>0) {
//			PrintWriter p=resp.getWriter();
//			System.out.println("log in");
//			p.write("Login Succssful");
			RequestDispatcher rd=req.getRequestDispatcher("mainu.html");
			rd.forward(req, resp);
		}
		else {
			PrintWriter p=resp.getWriter();
			System.out.println("Invalid credntial");
			p.write("Try again");
			RequestDispatcher rd=req.getRequestDispatcher("Login.html");
			rd.forward(req, resp);
		}
	}
}

package school_management;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/stud04")
public class RemoveStudent extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
        //		super.doPost(req, resp);
		
		
		int id= Integer.parseInt(req.getParameter("id"));
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("desto");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student1 s=em.find(Student1.class,id);
		
		et.begin();
		em.remove(s);
		et.commit();
		System.out.println("Removed Successfully...!");
		RequestDispatcher rd= req.getRequestDispatcher("Student.html")		;
		rd.forward(req, resp);
	}

}

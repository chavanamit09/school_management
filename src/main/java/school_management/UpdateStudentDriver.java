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
@WebServlet("/stud03")
public class UpdateStudentDriver extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		String name=req.getParameter("name");
		String id=req.getParameter("id");
		String stream= req.getParameter("stream");
		String fees= req.getParameter("fees");
		
		
		double fees1 = Double.parseDouble(fees);
		int id1=Integer.parseInt(id);
	
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("desto");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
	    Student1 s=new Student1();
		s.setFees(fees1);
		s.setId(id1);
		s.setName(name);
		s.setStream(stream);
		et.begin();
		em.merge(s);
		et.commit();
		
		System.out.println("Student Successfully Updated...!");
		RequestDispatcher rd=req.getRequestDispatcher("Student.html");
		rd.forward(req, resp);
	}
	

}

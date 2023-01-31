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
@WebServlet("/teach02")
public class UpdateTeacher extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
        //		super.doPost(req, resp);
		
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String sub=req.getParameter("sub");
		double sal=Double.parseDouble(req.getParameter("sal"));
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("desto");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Teacher t=new Teacher();
		t.setId(id);
		t.setName(name);
		t.setSalary(sal);
		t.setSubject(sub);
		
		et.begin();
		em.merge(t);
		et.commit();
		
		System.out.println("Teacher Updated Successfully......!");
		RequestDispatcher rd= req.getRequestDispatcher("Teacher.html");
		rd.forward(req, resp);
		
	}

}

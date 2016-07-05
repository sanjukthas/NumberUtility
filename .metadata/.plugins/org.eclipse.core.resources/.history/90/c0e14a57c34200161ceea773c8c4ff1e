package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.persistence.EntityManager;
import customTools.*;
import customTools.DBUtil;
import model.Employee;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		EntityManager em= DBUtil.getEmFactory().createEntityManager();
		try{
			model.Employee cust =em.find(model.Employee.class, (long)100);
			//System.out.println(cust.getFirstName());
			response.setContentType("text/html");
			
			PrintWriter out =response.getWriter();
			
			
			out.println("&lt;h1&gt;" +cust.getFirstName()+ "&lt;/h1&gt;");
		}catch(Exception e){
			System.out.println(e);
		}finally{
			em.close();
			System.out.println("cerrado!");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
    }
    


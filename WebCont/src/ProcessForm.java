

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Bhuser;
import model.DBUtil;
import model.UserHelp;



/**
 * Servlet implementation class ProcessForm
 */
@WebServlet("/ProcessForm")
public class ProcessForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessForm() {
        super();
        // TODO Auto-generated constructor stub
    }
//      	
    	
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*String email = request.getParameter("email");
		String password = request.getParameter("password");
		response.setContentType("text/html");
		String message ="your email is " + email + "<br>" + "your password " +password;
		PrintWriter out = response.getWriter();
		out.println(message);*/
	
	
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		boolean result = UserHelp.isValidUser(email, password);
		
		if (UserHelp.isValidUser(email, password))
		{
			result= true;
			String nextURL = "Home.jsp";
			 //response.sendRedirect(request.getContextPath() + nextURL);
			request.setAttribute("message", email);
			request.getRequestDispatcher(nextURL).forward(request,response);
			
			
	    }
		else{
			System.out.println("Incorrect");
		}
		
	/*response.setContentType("text/html");
	PrintWriter out =response.getWriter();
	out.println("&lt;h1&gt;");*/
		
	}
		

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

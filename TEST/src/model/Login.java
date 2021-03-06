package model;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String email = request.getParameter("email");
		String pwd1 = request.getParameter("pwd1");
		String action = request.getParameter("action");
		UserHelp.isValidUser(email, pwd1);
		HttpSession session = request.getSession();
		Loginuser user = null;
		
		if (UserHelp.isValidUser(email, pwd1))
		{
			request.setAttribute("message", email);
			
		}
		else{
			System.out.println("Incorrect");
	}
				
		user = UserHelp.getUserByEmail(email);
		session.setAttribute("user", user);
		

	
			 String nextURL = "Home.jsp";
		
		
		request.getRequestDispatcher(nextURL).forward(request,response);		
		
	
	}

}

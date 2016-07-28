

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Bhpost;
import model.Bhuser;
import model.DBUtil;
import model.DbBullhorn;
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
		 List<Bhpost> posts = null;
		 posts = DbBullhorn.bhPost();	
//		 
//	ArrayList<Bhuser> users= new ArrayList();
//	
//	Bhuser dave = new Bhuser();
//	dave.setBhuserid(100);
//	dave.setUseremail("dave@gmail.com");
//	dave.setUsername("dave1");
//	dave.setUserpassword("Qwert");
//	users.add(dave);
//	
//	Bhuser shy =new Bhuser();
//	shy.setBhuserid(99);
//	shy.setUseremail("shy@gmail.com");
//	shy.setUsername("shy1");
//	shy.setUserpassword("abcd");
//	users.add(shy);
//	
//	Bhuser happy = new Bhuser();
//	happy.setBhuserid(99);
//	happy.setUseremail("happy@gmail.com");
//	happy.setUsername("  happy1");
//	happy.setUserpassword("pqrst");
//	users.add(happy);
//	
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		UserHelp.isValidUser(email, password);
		
		if (UserHelp.isValidUser(email, password))
		{
			
			request.setAttribute("message", email);
					
	    }
		else{
			System.out.println("Incorrect");
		}
		String nextURL = "Home.jsp";
		int columnCount = 1;
		
//		System.out.println(UserHelp.gettablelist(users, columnCount));
//      
//		String table = UserHelp.gettablelist(users, columnCount);
//		
//		request.setAttribute("table", table);
		HttpSession session = request.getSession();
		session.setAttribute("posts", posts);
		
 		request.getRequestDispatcher(nextURL).forward(request,response);		
	
		
	/*response.setContentType("text/html");
	PrintWriter out =response.getWriter();
	out.println("&lt;h1&gt;");*/
		
	}
		

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

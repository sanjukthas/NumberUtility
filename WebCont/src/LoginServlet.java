

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Bhuser;
import model.MD5Util;
import model.UserHelp;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String useremail = request.getParameter("email");
        String userpassword = request.getParameter("password");
        String action = request.getParameter("action");
        //String remember = request.getParameter("remember");
        String nextURL = "/error.jsp";
        HttpSession session = request.getSession();
        Bhuser user = null;
      if (action.equals("logout")){
          session.invalidate();
          nextURL = "/login.jsp";
         
       }else{
            user = UserHelp.getUserByEmail(useremail);
            String password="password";
			String email="user1@gmail.com";
		if (UserHelp.isValidUser(email, password))
			{
                session.setAttribute("user", user);
                int size = 30;
                String gravatarURL = UserHelp.getGravatarURL(useremail, size);
                System.out.println(UserHelp.getGravatarURL(useremail, size));
                session.setAttribute("gravatarURL", gravatarURL);
                
                nextURL = "/home.jsp";
            }	else{
               nextURL = "/login.jsp";
            }
            
        }
        response.sendRedirect(request.getContextPath() + nextURL);
    
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

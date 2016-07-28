

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Assignmenttype;

import model.DBGradebook;

import model.Gradebook;

/**
 * Servlet implementation class Account
 */
@WebServlet("/Account")
public class Account extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Account() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//check if type entered exists in DB table AssType
			// get type id
			//if type id returned is not null
			// create gradebook and create assType obj for it
			// set all vars and insert
			Gradebook gradebook = new Gradebook();
			gradebook.setStudentid(request.getParameter("StudentID"));
			gradebook.setDateHw(request.getParameter("Date_Hw"));
			gradebook.setGrade(request.getParameter("Grade"));
			gradebook.setAssignmentname(request.getParameter("Assignmentname"));
			
			String Typeid= DBGradebook.getTypeId(request.getParameter("Type"));
			
			
		//	HttpSession session = request.getSession();
			
					
			DBGradebook.insert(gradebook);
							
			} catch (NoResultException e){
				e.printStackTrace();
			} catch (NonUniqueResultException e){
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		request.getRequestDispatcher("Account.jsp").forward(request,response);		
	}	
				
	


	private Object getTypeid() {
		// TODO Auto-generated method stub
		return null;
	}

	private Assignmenttype Assignmenttype() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

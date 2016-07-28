

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Printtable
 */
@WebServlet("/Printtable")
public class Printtable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Printtable() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
		
		PrintWriter out =response.getWriter();
		String message = "<html>"
+ "<head>"
+"<title>Insert title here</title>"
+"</head>"
+"<body>"
+"<table>"

+ "</tr>"
+"<ths> Origin</ths>"
+"<ths> Food</ths>"
+"<ths> Rating</ths>"
+"</tr>"

+"<tr>"
+"<td> miani</td>"
+"<td> Mango</td>"
+"<td> 12</td>"
+ "</tr>"

+"<tr>"
+"<td> miani</td>"
+"<td> Mango</td>"
+"<td> 12</td>"
+ "</tr>"
+"<tr>"
+"<td> miani</td>"
+"<td> Mango</td>"
+"<td> 12</td>"
+ "</tr>"

+"<tr>"
+"<td> miani</td>"
+"<td> Mango</td>"
+"<td> 12</td>"
+ "</tr>"
+ "<>/table>"
+ "</body>"
+ "</html>";
		
		out.println("&lt;h1&gt;" +message+ "&lt;/h1&gt;");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

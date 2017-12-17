package mvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("test doGet");
		String text, pwd;
		text = request.getParameter("text1");
		pwd = request.getParameter("pwd");
		
		if(text.equals("ali") && pwd.equals("123")){
			request.getRequestDispatcher("success.jsp").forward(request, response);
		}
		else{
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
		/*System.out.println("Hello "+ text);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//response.getWriter().append("This is what you wrote in the field"+text );
		PrintWriter pr = response.getWriter();
		pr.println("<html><head><tiltle> Essai </tiltle> </head><body>");
		pr.println("This is what you wrote in the field"+text);
		pr.println("</body></html>");*/
		//request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

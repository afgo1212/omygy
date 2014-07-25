package tw.edu.kuas.mis.ooo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class a2
 */
@WebServlet("/a2")
public class a2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public a2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		java.io.PrintWriter out = response.getWriter();
	
		
		//if(request.getSession().getAttribute("aaaa").equals("123")){
		out.print("<html><body><form action = \"HellowWorld\" method=\"Get\">");
		//out.print(request.getSession().getAttribute("aaaa").equals("123"));
		out.print("年：<input type = text name = y></br>");
		out.print("月：<input type = text name = m></br>");
		out.print("<input type = submit value = 送出>");
		out.print("</form></body></html>");
		//}
		//else{
		//out.print("請先登入");	
			
		//}
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

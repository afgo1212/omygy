package tw.edu.kuas.mis.ooo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HellowWorld
 */
@WebServlet("/HellowWorld")
public class HellowWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HellowWorld() {
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
		out.print("<html><body>");
		out.print("<table border = '1' width = '300'>");
		out.print("<tr><td>日</td><td>一</td><td>二</td><td>三</td><td>四</td><td>五</td><td>六</td></tr>");
		String year,m,c,y;
	 	int a ,ii;
	 	int x = 0;
	 	int s = 0;
	 	year=request.getParameter("y");
		m=request.getParameter("m");
		out.print("民國: "+year+" "+ m +"月");
		if (m.equals("1") || m.equals("3") || m.equals("5") || m.equals("7") || m.equals("8") || m.equals("10") || m.equals("12")){
			ii = 31;
			if (m.equals("1")){
				m = "13";
			}
			}
			else{
			ii =30;
				if (m.equals("2")){
					ii =28; 
					m = "14";
					if(Integer.parseInt(year) % 4 == 0 || Integer.parseInt(year) % 400 == 0 && Integer.parseInt(year) % 100 !=0){
						ii = 29;
					}
				}
				}
		
		
		c=year.substring(0,2);
		y=year.substring(2);
		
		a = Integer.parseInt(y) + (Integer.parseInt(y)/4)+(Integer.parseInt(c)/4)-2*Integer.parseInt(c)+(26*(Integer.parseInt(m)+1)/10);
	 	a = a %7;
	 	for (int i = 0 ;i <6;i++){
	 		
	 		out.print("<tr>");
	 		for (int j =0; j<7;j++){
	 			if (a!=0 && x != a ){
	 				out.print("<td>&nbsp&nbsp</td>");
	 				x = x +1;
	 				}
	 				else {
	 					s= s +1 ;
	 					out.print("<td>"+s+"</td>");
	 				if(s==ii){
	 					break;
	 				}
	 				}
	 			}
	 		if (s==ii){
	 			break;
	 		}
	 		out.print("</tr>");
	 		}  
				
		out.print("</table>");
		out.print("</body></html>");
		
	}
			
			

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		java.io.PrintWriter out = response.getWriter();
		out.print("查詢成功");
	}

}

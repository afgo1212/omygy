<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>Insert title here</title>
</head>
<body>
     <%
     
     int s = 0;
     out.print("<table border = '1' bordercolor = 'red' width = '300'>");
     out.print("<tr><td>日</td><td>一</td><td>二</td><td>三</td><td>四</td><td>五</td><td>六</td></tr>");
     for (int i =0 ; i<5 ; i++){ 
    	 out.print("<tr>");
   		for(int j = 0 ; j <7; j ++){
			s = s +1; 
			if (s > 31) {
				break;
			}
			else if (j==0){
				out.print("<td bgcolor = 'yellow'>"+s+"</td>");
			}
			else if (j == 6){
				out.print("<td bgcolor = 'green'>"+s+"</td>");
			}
			else{	
			out.print("<td>"+s+"</td>");
			}
   		}
     }
   		out.print("</table>");
     %>
				
</body>
</html>

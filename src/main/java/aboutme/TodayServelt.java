package aboutme;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/today")
public class TodayServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TodayServelt() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset = UTF-8");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset = UTF-8");
		
		PrintWriter out = response.getWriter();
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:ss");
		String time = sdf.format(d);
		
		out.println("<h2><a href=\"http://localhost/aboutme/index.html\">메인화면</a></h2>");
		out.println("<h1><center>현재시간 : " + time);

	}

}

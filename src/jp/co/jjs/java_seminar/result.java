package jp.co.jjs.java_seminar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class result
 */
@WebServlet("/result")
public class result extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public result() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html;charset=UTF-8");
	    request.setCharacterEncoding("UTF-8");
		PrintWriter writer = response.getWriter();
		writer.println("<html><head><meta charset='UTF-8' /><title>title</title></head><body>");
		writer.println("性別：" + request.getParameter("sex") + "<br>");
		writer.println("年齢：" +request.getParameter("age") + "<br>");
		writer.println("職業：" +request.getParameter("job") + "<br>");
		writer.println("今日の気分：" +request.getParameter("feel") + "<br><br>");
		writer.println("<U>" + "ご協力ありがとうございました" + "</U>");
		writer.println("</body></html>");
	}

}

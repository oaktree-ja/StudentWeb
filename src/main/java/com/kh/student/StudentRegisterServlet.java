package com.kh.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*
 * �л� ���� ���
 * url : /student/register
 */
@WebServlet("/student/register")
public class StudentRegisterServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Student> sList = new ArrayList<Student>();
		String name = request.getParameter("name");
		int firstScore, secondScore;
		firstScore = Integer.parseInt(request.getParameter("firstScore")); // ���� �� �ذ���
		secondScore = Integer.parseInt(request.getParameter("secondScore")); 
		// ���� : ���ڿ��� int�� ��ȯ�� �� ����.
		// �ذ��� : ���ڿ��� int�� ��ȯ���ָ� ��. ���?
		// Integer.parseInt("")
		sList.add(new Student("�Ͽ���", 99, 88));
		sList.add(new Student("�̿���", 88, 77));
		RequestDispatcher view;
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		for(Student std: sList) {
			if(std.getName().equals(name)) {
				out.println("<!DOCTYPE html>");
				out.println("<html>");
				out.println("<head>");
				out.println("<meta charset='utf-8'>");
				out.println("<title>�̸� �ߺ� �ȳ�</title>");
				out.println("<style>h1{color:red}</style>");
				out.println("</head>");
				out.println("<body>");
				out.println("<h1>�̹� �����ϴ� �̸��Դϴ�.</h1>");
				out.println("</body>");
				out.println("</html>");
//				view = request.getRequestDispatcher("/WEB-INF/views/common/duplicate.html");
//				view.forward(request, response);
				return;		// �޼ҵ带 �����Ͽ� �ؿ� �ڵ尡 �ȵ��ư����� ��.
			}
		}
		sList.add(new Student(name, firstScore, secondScore));
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='utf-8'>");
		out.println("<title>�л� ���� �߰� ����</title>");
		out.println("<style>h1{color:blue}</style>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>�л� ���� �߰� �����Ǿ����ϴ�.</h1>");
		out.println("</body>");
		out.println("</html>");
//		view = request.getRequestDispatcher("/WEB-INF/views/common/success.html");
//		view.forward(request, response);
	}
}










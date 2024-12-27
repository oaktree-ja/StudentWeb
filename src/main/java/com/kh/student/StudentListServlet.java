package com.kh.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*
 * �л� ����Ʈ ��ȸ
 * url : /student/list
 */
@WebServlet("/student/list")
public class StudentListServlet extends HttpServlet{
	@Override
	protected void service(
			HttpServletRequest request, HttpServletResponse response) 
											throws ServletException, IOException {
		List<Student> sList = new ArrayList<Student>();
		sList.add(new Student("�Ͽ���", 99, 88));
		sList.add(new Student("�̿���", 88, 77));
		sList.add(new Student("�����", 77, 66));
		sList.add(new Student("�����", 66, 55));
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<h1>�л� ����Ʈ ��ȸ</h1>");
		for(int i = 0; i < sList.size(); i++) {
			String name = sList.get(i).getName();
			int fScore = sList.get(i).getFirstScore();
			int sScore = sList.get(i).getSecondScore();
			out.println("<ul><li>�л� �̸� : "+name+"</li>");
			out.println("<li>1�� ���� : "+fScore+"��</li>");
			out.println("<li>2�� ���� : "+sScore+"��</li></ul>");
		}
//		for(Student std: sList) {
//			System.out.println(std.toString());
//		}
	}
}

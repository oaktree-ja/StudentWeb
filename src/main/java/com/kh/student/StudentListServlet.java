package com.kh.student;
/*
 *�л� ����Ʈ ��ȸ
 * url : /student/list 
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/student/list")
public class StudentListServlet extends HttpServlet{

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Student> sList = new ArrayList<Student>();
		sList.add(new Student("�Ͽ���", 99, 88));
		sList.add(new Student("�̿���", 77, 88));
		sList.add(new Student("�����", 66, 88));
		sList.add(new Student("�����", 55, 88));
		
		RequestDispatcher view;
		Student student = sList.get(0);
		request.setAttribute("student", student);
		
//		request.setAttribute("sList",sList);
//		request.setAttribute("name", sList.get(0).getFirstScore());
//		request.setAttribute("fisrtScore", sList.get(0).getFirstScore());
//		request.setAttribute("secondScore", sList.get(0).getSecondScore());
		view = request.getRequestDispatcher("/WEB-INF/views/student/list.jsp");
		view.forward(request, response);
	}
}
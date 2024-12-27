package com.kh.student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/student/insert")
public class StudentInsertServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Student> sList = new ArrayList<Student>();
		sList.add(new Student("�Ͽ���", 99, 88));
		sList.add(new Student("�̿���", 88, 77));
		String name = request.getParameter("name");
		String message = "";
		boolean duplicate = false;
		for(Student std: sList) {
			if(std.getName().equals(name)) {
				message = "�̹� �����ϴ� �̸��Դϴ�.";
				// �̹� ����
				// ������ ���� + ������ ���� ���� ��� -> JSP�� ����
				request.setAttribute("message", message);
				RequestDispatcher view;
				view = request.getRequestDispatcher("/WEB-INF/views/common/result.jsp");
				view.forward(request, response);
				return;
			}
		}
		message = "�������� �ʽ��ϴ�.";
		request.setAttribute("message", message);
		RequestDispatcher view;
		view = request.getRequestDispatcher("/WEB-INF/views/common/result.jsp");
		view.forward(request, response);
	}
}









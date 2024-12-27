package com.kh.student;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/student/login")
public class StudentLoginServlet extends HttpServlet{
	// doGet, doPost �޼ҵ�� get��û�� post��û�� �ϳ��� �������� ó������
	// -> StudentLoginViewServlet.java�� �ʿ����.
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ������ �ּ�ǥ���ٿ� http://localhost:8888/student/login �Է��ϰ�
		// ���͸� ó�� ������ ��û�ϴ� ���� GET��� ��û(�⺻��)
		RequestDispatcher view;
		view = request
				.getRequestDispatcher(
						"/WEB-INF/views/student/login.jsp");
		view.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// form�±׸� ����ϰ� method�� post�� ��� ��û�� �ϸ� POST��� ��û��.
		// ���� post����� form �±׷θ� ����
		String studentId, studentPw;
		studentId = request.getParameter("studentId");
		studentPw = request.getParameter("studentPw");
		String message = "";
		if("admin".equals(studentId)&&"admin".equals(studentPw)) {
			message = "�����ڴ� ȯ���մϴ�.";
		}else {
			message = "�Ϲݻ���ڴ� ȯ���մϴ�.";
		}
		request.setAttribute("message", message);
		RequestDispatcher view;
		view = request
				.getRequestDispatcher(
						"/WEB-INF/views/common/result.jsp");
		view.forward(request, response);
	}
}

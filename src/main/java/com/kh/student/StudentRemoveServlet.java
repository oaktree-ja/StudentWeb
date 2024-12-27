package com.kh.student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/*
 * �л� ���� ����
 * url : /student/remove
 */
@WebServlet("/student/remove")
public class StudentRemoveServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Student> sList = new ArrayList<Student>();
		sList.add(new Student("�Ͽ���", 99, 88));
		sList.add(new Student("�̿���", 88, 77));
		sList.add(new Student("�����", 77, 66));
		sList.add(new Student("�����", 88, 76));
		// �̸��� �Էµȴٰ� ���� �� 
		// �ش� �̸��� ������ ����� ������ �̸��� ���ٰ� �޽��� ����ϵ���
		// �ڵ带 �ۼ��غ�����~
		String name;
		for(Student std: sList) 
			System.out.println(std);
		System.out.println("====================================");
		sList.remove(0);
		for(Student std: sList)
			System.out.println(std);
	}
}

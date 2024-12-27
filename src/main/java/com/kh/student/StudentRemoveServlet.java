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
 * 학생 정보 삭제
 * url : /student/remove
 */
@WebServlet("/student/remove")
public class StudentRemoveServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Student> sList = new ArrayList<Student>();
		sList.add(new Student("일용자", 99, 88));
		sList.add(new Student("이용자", 88, 77));
		sList.add(new Student("삼용자", 77, 66));
		sList.add(new Student("사용자", 88, 76));
		// 이름이 입력된다고 했을 때 
		// 해당 이름이 있으면 지우고 없으면 이름이 없다고 메시지 출력하도록
		// 코드를 작성해보세요~
		String name;
		for(Student std: sList) 
			System.out.println(std);
		System.out.println("====================================");
		sList.remove(0);
		for(Student std: sList)
			System.out.println(std);
	}
}

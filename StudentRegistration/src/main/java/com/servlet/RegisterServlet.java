package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.RegisterDAO;
import com.Db.ConnectionProvider;
import com.entity.Student;

@WebServlet("/RegisterServle")
public class RegisterServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String dob = req.getParameter("dob");
		String address = req.getParameter("address");
		String phone = req.getParameter("phone");
		String gender = req.getParameter("gender");
		String password = req.getParameter("password");
		
	System.out.println(name +" " + email+" " +dob+" "+address+" "+phone+" "+gender+" "+password );
		
		Student obj = new Student();
		obj.setName(name);
		obj.setEmail(email);
		obj.setDob(dob);
		obj.setAddress(address);
		obj.setPhone(phone);
		obj.setGender(gender);
		obj.setPassword(password);
		RegisterDAO dao = new RegisterDAO(ConnectionProvider.getConnection());
		
		 boolean f = dao.studentRegister(obj);
		 if(f) {
			 resp.sendRedirect("login.jsp");
		 }else {
			resp.sendRedirect("error.jsp ");
		}
	}
}

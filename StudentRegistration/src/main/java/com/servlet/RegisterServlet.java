package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.RegisterDAO;
import com.Db.ConnectionProvider;
import com.entity.Student;
import com.mysql.cj.Session;

@WebServlet("/RegisterServlet")
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
		 HttpSession session = req.getSession();
		 if(f) {
			 
			 session.setAttribute("suc","Registration successful....");
			 resp.sendRedirect("index.jsp");
		 }else {
			 session.setAttribute("error","something went wrong on server....");
			resp.sendRedirect("index.jsp ");
		}
	}
}

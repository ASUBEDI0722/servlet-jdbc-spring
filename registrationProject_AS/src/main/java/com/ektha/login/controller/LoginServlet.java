package com.ektha.login.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ektha.login.dao.CustomerDAO;
import com.ektha.login.entity.Customer;

@WebServlet("/loginRegister")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		CustomerDAO customerDAO = new CustomerDAO();

		String userName = request.getParameter("username");
		String password = request.getParameter("password1");
		String submitType = request.getParameter("submit");

		Customer customer = customerDAO.getCustomer(userName, password);

		if (submitType.equals("login") && customer != null && customer.getName() != null) {

			request.setAttribute("message", customer.getName());
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		}

		else if (submitType.equals("register")) {

			customer.setName(request.getParameter("name"));
			customer.setUserName(userName);
			customer.setPassword(password);
			customerDAO.insertCustomer(customer);

			request.setAttribute("successMessage", "Registration successful, please login to continue !!!");
			request.getRequestDispatcher("login.jsp").forward(request, response);

		}

		else {

			request.setAttribute("message", "Data not found, please click to register");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}

	}

}

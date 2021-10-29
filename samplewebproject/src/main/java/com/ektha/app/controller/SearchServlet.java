package com.ektha.app.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ektha.pms.dao.IProductDAO;
import com.ektha.pms.dao.ProductDAO;
import com.ektha.pms.entity.Product;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	IProductDAO productDAO = null;
	
	public void init(ServletConfig config) throws ServletException{
		
		productDAO = new ProductDAO();
	}
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int pid = Integer.parseInt(request.getParameter("productid"));
		
		Product product = productDAO.findById(pid);
		
		request.setAttribute("product", product);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("productview.jsp");
		
		requestDispatcher.forward(request, response);
		
		
		
		
		
		
		
		
		
	}

}

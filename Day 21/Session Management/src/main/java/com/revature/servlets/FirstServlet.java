package com.revature.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Product;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		//below is the code for the session
//		HttpSession session=request.getSession();
//		String uName=request.getParameter("username");
//		session.setAttribute("username", uName);
//		out.print("<h2>Welcome "+uName.toUpperCase()+"</h2>");
//		Product p1=new Product(1,"Mouse");
//		Product p2=new Product (2,"Keyboard");
//		List<Product> pList=new ArrayList<>();
//		pList.add(p1);
//		pList.add(p2);
//		session.setAttribute("productList", pList);
//		out.print("<a href='two'>Servlet2</a>");
		
		//following is the code for the cookies
		String uName = request.getParameter("username");
		Cookie ck = new Cookie("username", uName); // Creating cookie object
		response.addCookie(ck); // Adding cookie to the response

		out.print("<h2>Welcome " + uName.toUpperCase() + "</h2>");
		out.print("<a href='two'>Servlet2</a>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

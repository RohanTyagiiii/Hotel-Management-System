package hms.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import hms.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		PrintWriter pw=response.getWriter();
		String action=request.getParameter("action");
		LoginService ls=new LoginService();
		if(action.equals("loginAdmin")) {
			System.out.println("dfghjn");
			String uname=request.getParameter("uname");
			String psw=request.getParameter("psw");
			boolean flag=ls.sLoginAdmin(uname, psw);
			if(flag) {
				HttpSession sn = request.getSession();
				sn.setAttribute("aname", uname);
			   	RequestDispatcher  rd= request.getRequestDispatcher("homeAdmin.html");
				rd.forward(request, response);

				//response.sendRedirect("homeAdmin.html");
			}
			else { 
//				HttpSession sn = request.getSession();
//			  sn.setAttribute("s1", "Invalid User");
//			RequestDispatcher  rd= request.getRequestDispatcher("HomeServlet");
//			rd.forward(request, response);
				pw.write("<h1>Not</h1>");
			}
		}
		
		if(action.equals("loginCustomer")) {
			String uname=request.getParameter("uname");
			String psw=request.getParameter("psw");
			boolean flag=ls.sLoginCustomer(uname, psw);
			if(flag) {
				HttpSession sn = request.getSession();
				sn.setAttribute("cname", uname);
			   	RequestDispatcher  rd= request.getRequestDispatcher("homeCustomer.html");
				rd.forward(request, response);

				
			}
			else
				pw.write("<h1>Not</h1>");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

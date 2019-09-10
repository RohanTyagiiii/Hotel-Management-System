package hms.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hms.bean.SignUp;
import hms.service.SignUpService;

/**
 * Servlet implementation class SignUpServelet
 */
public class SignUpServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("Hii here");
		response.setContentType("text/html"); 
		PrintWriter pw=response.getWriter();
		String action=request.getParameter("action");
		if(action.equals("SignUp")) {
			String name=request.getParameter("name");
			String gender=request.getParameter("sex");
			String email=request.getParameter("email");
			String mobile=request.getParameter("mobile-no");
			String address=request.getParameter("address");
			String country=request.getParameter("country");
			String typeOfId=request.getParameter("type-of-id");
			String idNo=request.getParameter("id");
			String pasword=request.getParameter("psw");
			SignUp su=new SignUp(name, gender, email, mobile, address, country, typeOfId, idNo, pasword);
			SignUpService sus=new SignUpService();
			boolean flag=sus.hmsInesertCustomerDetails(su);
			if(flag) {
				
				response.sendRedirect("login.html");
			}
			else
				response.sendRedirect("signuphtml.html");
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

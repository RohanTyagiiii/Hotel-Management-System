package hms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import hms.bean.AddHotelDetails;
import hms.bean.BookHotelCustomer;
import hms.bean.SignUp;
import hms.service.CustomerService;

/**
 * Servlet implementation class CustomerServlet
 */
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerServlet() {
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
		CustomerService cs=new CustomerService();
		if(action.equals("showHotels")) {
			ArrayList<AddHotelDetails> al=cs.sShowHotel();
			HttpSession sn=request.getSession();
			sn.setAttribute("s1", al);
			RequestDispatcher rd=request.getRequestDispatcher("bookHotel.jsp");
			rd.forward(request, response);
			
		}
		
		if(action.equals("myProfile")) {
			 HttpSession sn=request.getSession(false);
			 String uname=(String)sn.getAttribute("cname");
			 SignUp s=cs.sCustomerProfile(uname);
			 System.out.println(s.getName()+" "+s.getAddress());
			 request.setAttribute("Profile", s);
			 RequestDispatcher rd = request.getRequestDispatcher("customerProfile.jsp");
			 rd.forward(request, response);
		//	SignUp s=cs.sCustomerProfile();
			
			
		}
		
		
		if(action.equals("logout")) {
			HttpSession sn=request.getSession(false);
			sn.invalidate();
			response.sendRedirect("login.html");
		}
		
		if(action.equals("changePassword")) {
			System.out.println("change");
			HttpSession sn=request.getSession(false);
			String uname=(String)sn.getAttribute("cname");
			String newPassword=request.getParameter("newPassword");
			System.out.println(uname);
			System.out.println(newPassword);
			boolean flag=cs.sChangePassword(uname, newPassword);
			if(flag) {
				response.sendRedirect("passchanged.html");
			}else {
				pw.write("<h1>Not</h1>");
			}
			
		}
		
		if(action.equals("BookHotel")) {
			//response.sendRedirect("bookingDetailsCustomer.html");
			HttpSession sn=request.getSession();
			String uname=(String)sn.getAttribute("cname");
			String hotelName=request.getParameter("hotelName");
			String fromDate=request.getParameter("fromDate");
			String toDate=request.getParameter("toDate");
			int totalRoom=Integer.parseInt(request.getParameter("noOfRoom"));
			BookHotelCustomer bhc=new BookHotelCustomer(uname, hotelName, fromDate, toDate, totalRoom);
			boolean flag=cs.hotelBookDetails(bhc);
			if(flag)
				response.sendRedirect("custoemrBookDetails.jsp");
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

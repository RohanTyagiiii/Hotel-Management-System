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

import hms.bean.SignUp;
import hms.service.AdminService;

/**
 * Servlet implementation class AdminServlet
 */
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
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
		PrintWriter pw = response.getWriter();
		String action=request.getParameter("action");
		AdminService as = new AdminService();
		if(action.equals("ADD")) {
			System.out.println("Hello im here");
			String hotelName=request.getParameter("hotelname");
			String city=request.getParameter("city");
			String hotelAddress=request.getParameter("address");
			int contactNumber=Integer.parseInt(request.getParameter("contact"));
			int rating=Integer.parseInt(request.getParameter("rating"));
			int totalRoom=Integer.parseInt(request.getParameter("total"));
			System.out.println(hotelName);
			System.out.println(totalRoom);
			AddHotelDetails ah=new AddHotelDetails(hotelName, city, hotelAddress, contactNumber, totalRoom, rating);
			
			boolean flag=as.sAddHotels(ah);
			if(flag) {
				pw.write("<h1 style=green>Your Hotel Has Been added</h1>");
				response.sendRedirect("addHotel.html");
			}
			else {
				pw.write("<h1>Some Technical Error</h1>");
			}
		}
		if(action.equals("show")) {
			ArrayList<AddHotelDetails> al=as.sShowHotel();
			HttpSession sn=request.getSession();
			sn.setAttribute("s1", al);
			RequestDispatcher rd=request.getRequestDispatcher("showHotels.jsp");
			rd.forward(request, response);
			
		}
		if(action.equals("logout")) {
			HttpSession sn=request.getSession(false);
			sn.invalidate();
			response.sendRedirect("login.html");
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

package parcel.info.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import parcel.info.dao.ParcelInfoDao;
import parcel.info.model.ParcelInfo;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ParcelInfoServlet
 */
@WebServlet("/register")
public class ParcelInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ParcelInfoDao parcelinfoDao = new ParcelInfoDao();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ParcelInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/parcelinforegister.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String senderName = request.getParameter("senderName");
		String senderAddress = request.getParameter("senderAddress");
		String senderPhoneNo = request.getParameter("senderPhoneNo");
		
		String receiverName = request.getParameter("receiverName");
		String receiverAddress = request.getParameter("receiverAddress");
		String receiverPhoneNo = request.getParameter("receiverPhoneNo");
		
		String weightParcel = request.getParameter("weightParcel");
		String shippingState = request.getParameter("shippingState");
		
		String cost = request.getParameter("cost");
		
		
		ParcelInfo parcelinfo = new ParcelInfo();
		parcelinfo.setSenderName(senderName);
		parcelinfo.setSenderAddress(senderAddress);
		parcelinfo.setSenderPhoneNo(senderPhoneNo);
		
		parcelinfo.setReceiverName(receiverName);
		parcelinfo.setReceiverAddress(receiverAddress);
		parcelinfo.setReceiverPhoneNo(receiverPhoneNo);
		
		parcelinfo.setWeightParcel(weightParcel);
		parcelinfo.setShippingState(shippingState);
		
		parcelinfo.setCost(cost);
		
		ParcelInfoDao parcelinfoDao = new ParcelInfoDao();
		String result = parcelinfoDao.insert(parcelinfo);
		response.getWriter().print(result);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/displayparcelinfo.jsp");
		dispatcher.forward(request, response);	
		
		
	}
	
	

}

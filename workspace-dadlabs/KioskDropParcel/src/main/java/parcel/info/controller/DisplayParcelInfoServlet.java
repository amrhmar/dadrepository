package parcel.info.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayParcelInfoServlet
 */
@WebServlet("/DisplayParcelInfoServlet")
public class DisplayParcelInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DisplayParcelInfoServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String strweightParcel = request.getParameter("weightParcel");
		String strshippingState = request.getParameter("shippingState");

		String strwithinState = request.getParameter("withinState");
		String strwithinPeninsular = request.getParameter("withinPeninsular");
		String strsabahSarawak = request.getParameter("sabahSarawak");

		double shippingRate;

		double weightParcel = Double.parseDouble(strweightParcel);

		// calculate for Within State (Peninsular)

		if (strshippingState.equals("withinState")) {

			if (weightParcel <= 0.5) {
				shippingRate = 8.00;

			} else if (weightParcel > 0.5 && weightParcel <= 1.00) {
				shippingRate = 9.00;

			} else if (weightParcel > 1.01 && weightParcel <= 1.50) {
				shippingRate = 10.05;

			} else if (weightParcel > 1.51 && weightParcel <= 2.00) {
				shippingRate = 10.60;

			} else if (weightParcel > 2.01 && weightParcel <= 2.50) {
				shippingRate = 11.65;

			} else if (weightParcel > 2.51 && weightParcel <= 3.00) {
				shippingRate = 12.70;

			} else if (weightParcel > 3.01 && weightParcel <= 3.50) {
				shippingRate = 13.80;

			} else if (weightParcel > 3.51 && weightParcel <= 4.00) {
				shippingRate = 14.30;

			} else if (weightParcel > 4.01 && weightParcel <= 4.50) {
				shippingRate = 14.30;

			} else if (weightParcel > 4.51 && weightParcel <= 5.00) {
				shippingRate = 14.85;

			} else if (weightParcel > 5.01 && weightParcel <= 5.50) {
				shippingRate = 15.90;

			} else if (weightParcel > 5.51 && weightParcel <= 6.00) {
				shippingRate = 15.90;

			} else if (weightParcel > 6.01 && weightParcel <= 6.50) {
				shippingRate = 16.95;

			} else if (weightParcel > 6.51 && weightParcel <= 7.00) {
				shippingRate = 16.95;

			} else if (weightParcel > 7.01 && weightParcel <= 7.50) {
				shippingRate = 18.00;

			} else if (weightParcel > 7.51 && weightParcel <= 8.00) {
				shippingRate = 18.00;

			} else if (weightParcel > 8.01 && weightParcel <= 8.50) {
				shippingRate = 20.15;

			} else if (weightParcel > 8.51 && weightParcel <= 9.00) {
				shippingRate = 20.15;

			} else if (weightParcel > 9.01 && weightParcel <= 9.50) {
				shippingRate = 21.20;

			} else {
				shippingRate = 21.20;
			}
		}

		// calculate for Within Peninsular
		if (strshippingState.equals("withinPeninsular")) {
			if (weightParcel <= 0.5) {
				shippingRate = 8.50;

			} else if (weightParcel > 0.5 && weightParcel <= 1.00) {
				shippingRate = 10.05;

			} else if (weightParcel > 1.01 && weightParcel <= 1.50) {
				shippingRate = 11.15;

			} else if (weightParcel > 1.51 && weightParcel <= 2.00) {
				shippingRate = 12.20;

			} else if (weightParcel > 2.01 && weightParcel <= 2.50) {
				shippingRate = 15.15;

			} else if (weightParcel > 2.51 && weightParcel <= 3.00) {
				shippingRate = 16.90;

			} else if (weightParcel > 3.01 && weightParcel <= 3.50) {
				shippingRate = 18.65;

			} else if (weightParcel > 3.51 && weightParcel <= 4.00) {
				shippingRate = 20.40;

			} else if (weightParcel > 4.01 && weightParcel <= 4.50) {
				shippingRate = 22.15;

			} else if (weightParcel > 4.51 && weightParcel <= 5.00) {
				shippingRate = 23.30;

			} else if (weightParcel > 5.01 && weightParcel <= 5.50) {
				shippingRate = 24.50;

			} else if (weightParcel > 5.51 && weightParcel <= 6.00) {
				shippingRate = 25.65;

			} else if (weightParcel > 6.01 && weightParcel <= 6.50) {
				shippingRate = 26.80;

			} else if (weightParcel > 6.51 && weightParcel <= 7.00) {
				shippingRate = 28.00;

			} else if (weightParcel > 7.01 && weightParcel <= 7.50) {
				shippingRate = 29.15;

			} else if (weightParcel > 7.51 && weightParcel <= 8.00) {
				shippingRate = 30.30;

			} else if (weightParcel > 8.01 && weightParcel <= 8.50) {
				shippingRate = 31.50;

			} else if (weightParcel > 8.51 && weightParcel <= 9.00) {
				shippingRate = 32.65;

			} else if (weightParcel > 9.01 && weightParcel <= 9.50) {
				shippingRate = 33.80;

			} else {
				shippingRate = 35;
			}
		}

		// calculate for Sabah & Sarawak
		if (strshippingState.equals("sabahSarawak")) {

			if (weightParcel <= 0.5) {
				shippingRate = 14.85;

			} else if (weightParcel > 0.5 && weightParcel <= 1.00) {
				shippingRate = 21.20;

			} else if (weightParcel > 1.01 && weightParcel <= 1.50) {
				shippingRate = 27.55;

			} else if (weightParcel > 1.51 && weightParcel <= 2.00) {
				shippingRate = 33.90;

			} else if (weightParcel > 2.01 && weightParcel <= 2.50) {
				shippingRate = 40.30;

			} else if (weightParcel > 2.51 && weightParcel <= 3.00) {
				shippingRate = 46.65;

			} else if (weightParcel > 3.01 && weightParcel <= 3.50) {
				shippingRate = 53.00;

			} else if (weightParcel > 3.51 && weightParcel <= 4.00) {
				shippingRate = 59.35;

			} else if (weightParcel > 4.01 && weightParcel <= 4.50) {
				shippingRate = 65.70;

			} else if (weightParcel > 4.51 && weightParcel <= 5.00) {
				shippingRate = 72.10;

			} else if (weightParcel > 5.01 && weightParcel <= 5.50) {
				shippingRate = 78.45;

			} else if (weightParcel > 5.51 && weightParcel <= 6.00) {
				shippingRate = 84.80;

			} else if (weightParcel > 6.01 && weightParcel <= 6.50) {
				shippingRate = 91.15;

			} else if (weightParcel > 6.51 && weightParcel <= 7.00) {
				shippingRate = 97.50;

			} else if (weightParcel > 7.01 && weightParcel <= 7.50) {
				shippingRate = 103.90;

			} else if (weightParcel > 7.51 && weightParcel <= 8.00) {
				shippingRate = 110.25;

			} else if (weightParcel > 8.01 && weightParcel <= 8.50) {
				shippingRate = 116.60;

			} else if (weightParcel > 8.51 && weightParcel <= 9.00) {
				shippingRate = 122.95;

			} else if (weightParcel > 9.01 && weightParcel <= 9.50) {
				shippingRate = 129.30;

			} else {
				shippingRate = 135.70;
			}
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/displayparcelinfo.jsp");
		dispatcher.forward(request, response);

	}

}

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Parcel Delivery Details</title>
</head>
<body>
	<section>
		<div align=center>
			<table>

				<%@page import="java.sql.*"%>
				<%@page import="parcel.info.project.ConnectionProvider"%>
				<%
				try {
					Connection con = ConnectionProvider.getCon();
					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("select * from kioskparcel.parcelinfo");
					while (rs.next()) {
				%>
				<thead>
				<h1>Parcel Delivery Details</h1>
				<p>Successfully Registered!</p>
					<tr>
						<td><b>Sender Name:</b> <%=rs.getString(2)%></td>
					</tr>
					<tr>
						<td><br><b>Sender Address:</b> <%=rs.getString(3)%></td>
					</tr>
					<tr>
						<td><br><b>Sender Phone No:</b> <%=rs.getString(4)%></td>
					</tr>
					<tr>
						<td><br><b>Receiver Name:</b> <%=rs.getString(5)%></td>
					</tr>
					<tr>
						<td><br><b>Receiver Address:</b> <%=rs.getString(6)%></td>
					</tr>
					<tr>
						<td><br><b>Receiver Phone No:</b> <%=rs.getString(7)%></td>
					</tr>
					<tr>
						<td><br><b>Shipping:</b> <%=rs.getString(9)%></td>
					</tr>
					<tr>
						<td><br><b>Weight (kg):</b> <%=rs.getString(8)%></td>
					</tr>
					<tr>
						<td><br><b>Total Amount Price (RM):</b> <%=rs.getString(10)%></td>
					</tr>
				</thead>
				<%
				}
				} catch (Exception e) {
				}
				%>
			
			</table>
			<h1>Payment Method</h1>
			<div id="paypal-button-container"></div>

		</div>
	</section>
	<script src="https://www.paypal.com/sdk/js?client-id=Abyu3jlt8UrQ94laENRhJ7r6XKG3W8Euc8oXPjA1K2DjSO5OYKT-cY_TfDoepKXFG3Vm18TQfhSpgeBR"></script>
		<script>
		paypal.Buttons( {
			createOrder: function(data, actions) {
				return actions.order.create({
					
					payer: {
						name: {
							given_name:"Amirah Mardhiah"
						},
						address: {
							address_line_1:"No. 54, Jalan Mahang 4",
							address_line_2:"Taman Meru Utama, 41050, Meru",
							admin_area2:"Klang",
							admin_are_1:"Selangor",
							postal_code:"41050",
							country_code:"Malaysia"
						},
						phone: {
							phone_type:"MOBILE",
							phone_number: {
								national_number:"0196029373"	
							}
						}
					},
					
					purchase_units: [{
						parcel: {
							weight_parcel:"7.41",
							shipping_state:"Peninsular",
							value:"18.00",
							currency_code:"MYR"
						}
					}]
				});
			},
			onApprove: function(data, actions) {
			      return actions.order.capture().then(function(details) {
			        alert("Thanks for your payment! \nTracking number is EM56722913865 to \nUTeM Melaka, Jalan Hang Tuah Jaya, 76100, \nPhone Number:  062701000, \nCost (RM): 18.00");
			      });
			}/*,
			onCancel: function(data) {
				alert("Payment cancelled");
			},
			onError: function(err) {
				alert("Sorry! Payment rejected");
			}*/
			
		}).render('#paypal-button-container');
		</script>
</body>
</html>
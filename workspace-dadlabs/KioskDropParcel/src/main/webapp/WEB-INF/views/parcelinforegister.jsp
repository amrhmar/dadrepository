<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 50%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: center;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>
<meta charset="ISO-8859-1">
<title>Kiosk Drop Parcel</title>
</head>
<body>
	<div align="center">
		<h1>Welcome To Kiosk Drop Parcel</h1>
		<h3>Delivery Rate</h3>
		<table>
			<tr>
				<th>Weight (kg)</th>
				<th>Within State (Peninsular)</th>
				<th>Within Peninsular</th>
				<th>Sabah Sarawak</th>
			</tr>
			<tr>
				<td>0.00 - 0.50</td>
				<td>RM 8.00</td>
				<td>RM 8.50</td>
				<td>RM 14.85</td>
			</tr>
			<tr>
				<td>0.51 - 1.00</td>
				<td>RM 9.00</td>
				<td>RM 10.05</td>
				<td>RM 21.20</td>
			</tr>
			<tr>
				<td>1.01 - 1.50</td>
				<td>RM 10.05</td>
				<td>RM 11.15</td>
				<td>RM 27.55</td>
			</tr>
			<tr>
				<td>1.51 - 2.00</td>
				<td>RM 10.60</td>
				<td>RM 12.20</td>
				<td>RM 33.90</td>
			</tr>
			<tr>
				<td>2.01 - 2.50</td>
				<td>RM 11.65</td>
				<td>RM 15.15</td>
				<td>RM 40.30</td>
			</tr>
			<tr>
				<td>2.51 - 3.00</td>
				<td>RM 12.70</td>
				<td>RM 16.90</td>
				<td>RM 46.65</td>
			</tr>
			<tr>
				<td>3.01 - 3.50</td>
				<td>RM 13.80</td>
				<td>RM 18.65</td>
				<td>RM 53.00</td>
			</tr>
			<tr>
				<td>3.51 - 4.00</td>
				<td>RM 14.30</td>
				<td>RM 20.40</td>
				<td>RM 59.35</td>
			</tr>
			<tr>
				<td>4.01 - 4.50</td>
				<td>RM 14.85</td>
				<td>RM 22.15</td>
				<td>RM 65.70</td>
			</tr>
			<tr>
				<td>4.51 - 5.00</td>
				<td>RM 14.85</td>
				<td>RM 23.30</td>
				<td>RM 72.10</td>
			</tr>
			<tr>
				<td>5.01 - 5.50</td>
				<td>RM 15.90</td>
				<td>RM 24.50</td>
				<td>RM 78.45</td>
			</tr>
			<tr>
				<td>5.51 - 6.00</td>
				<td>RM 15.90</td>
				<td>RM 25.65</td>
				<td>RM 84.80</td>
			</tr>
			<tr>
				<td>6.01 - 6.50</td>
				<td>RM 16.95</td>
				<td>RM 26.80</td>
				<td>RM 91.15</td>
			</tr>
			<tr>
				<td>6.51 - 7.00</td>
				<td>RM 16.95</td>
				<td>RM 28.00</td>
				<td>RM 97.50</td>
			</tr>
			<tr>
				<td>7.01 - 7.50</td>
				<td>RM 18.00</td>
				<td>RM 29.15</td>
				<td>RM 103.90</td>
			</tr>
			<tr>
				<td>7.51 - 8.00</td>
				<td>RM 18.00</td>
				<td>RM 30.30</td>
				<td>RM 110.25</td>
			</tr>
			<tr>
				<td>8.01 - 8.50</td>
				<td>RM 20.15</td>
				<td>RM 31.50</td>
				<td>RM 116.60</td>
			</tr>
			<tr>
				<td>8.51 - 9.00</td>
				<td>RM 20.15</td>
				<td>RM 32.65</td>
				<td>RM 122.95</td>
			</tr>
			<tr>
				<td>9.01 - 9.50</td>
				<td>RM 21.20</td>
				<td>RM 33.80</td>
				<td>RM 129.30</td>
			</tr>
			<tr>
				<td>9.51 - 10.00</td>
				<td>RM 21.20</td>
				<td>RM 35.00</td>
				<td>RM 135.70</td>
			</tr>
		</table>
		<h3>Drop Parcel Form</h3>
		<form action="<%=request.getContextPath()%>/register" method="post">
		
			<label for="senderName">Sender Name:</label><br> 
			<input type="text" id="senderName" name="senderName" required ><br><br>
			
			<label for="senderAddress">Sender Address:</label><br> 
			<input type="text" id="senderAddress" name="senderAddress" required ><br><br>
			
			<label for="senderPhoneNo">Sender Phone Number:</label><br> 
			<input type="tel" id="senderPhoneNo" name="senderPhoneNo" placeholder="0123456789" required ><br><br>
				
			<label for="receiverName">Receiver Name:</label><br> 
			<input type="text" id="receiverName" name="receiverName" required ><br><br>
			
			<label for="receiverAddress">Receiver Address:</label><br> 
			<input type="text" id="receiverAddress" name="receiverAddress" required ><br><br>
			
			<label for="receiverPhoneNo">Receiver Phone Number:</label><br> 
			<input type="tel" id="receiverPhoneNo" name="receiverPhoneNo" placeholder="0123456789" required ><br><br>
			
			<label for="weightParcel">Weight Parcel:</label><br> 
			<input type="text" id="weightParcel" name="weightParcel"><br>
			
			<p>Shipping:</p>
			<input type="radio" id="withinState" name="shippingState" value="Within State (Peninsular)" required>
  			<label for="html">Within State (Peninsular)</label><br>
			
 		 	<input type="radio" id="withinPeninsular" name="shippingState" value="Within Peninsular" required>
 			<label for="css">Within Peninsular</label><br>

 			<input type="radio" id="sabahSarawak" name="shippingState" value="Sabah & Sarawak" required>
 			<label for="javascript">Sabah & Sarawak</label><br><br>

			<label for="cost">Cost (RM):</label><br> 
			<input type="text" id="cost" name="cost" required ><br><br>
			
			<input type="submit" value="Submit" />
		</form>
	</div>
</body>
</html>
package parcel.info.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import parcel.info.model.ParcelInfo;

public class ParcelInfoDao {
	
	private String dburl = "jdbc:mysql://localhost:3306/kioskparcel";
	private String dbuname = "root";
	private String dbpassword = "root";
	private String dbdriver = "com.mysql.jdbc.Driver";
	public void loadDriver(String dbDriver)
	{
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection()
	{
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(dburl, dbuname, dbpassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
	public String insert(ParcelInfo parcelinfo)
	{
		
		loadDriver(dbdriver);
		Connection con = getConnection();
		String result = "Data Entered Successfully!";
		String sql = "insert into kioskparcel.parcelinfo values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, parcelinfo.getSenderName());
            preparedStatement.setString(3, parcelinfo.getSenderAddress());
            preparedStatement.setString(4, parcelinfo.getSenderPhoneNo());
            preparedStatement.setString(5, parcelinfo.getReceiverName());
            preparedStatement.setString(6, parcelinfo.getReceiverAddress());
            preparedStatement.setString(7, parcelinfo.getReceiverPhoneNo());
            preparedStatement.setString(8, parcelinfo.getWeightParcel());
            preparedStatement.setString(9, parcelinfo.getShippingState());
            preparedStatement.setString(10, parcelinfo.getCost());
            preparedStatement.executeUpdate();
            
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "Data Not Successfully!";
		}
		
		return result;
		
	}
	
}
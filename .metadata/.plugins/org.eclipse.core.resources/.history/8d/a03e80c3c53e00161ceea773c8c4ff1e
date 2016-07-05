package DBUtility;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DataBU {
	public static Connection con = null;
	public static ResultSet rs = null;
	public static PreparedStatement sql = null;
	
	
	public static void selectData (String query, String params) {
				try {
			Driver myDriver = new oracle.jdbc.driver.OracleDriver();
			DriverManager.registerDriver(myDriver);
			con = DriverManager.getConnection("jdbc:oracle:thin:ora1/ora1@localhost:1521:orcl");
			sql = con.prepareStatement(query);
			String[] paras =  params.split(",");
			for(int i = 0;i<paras.length;i++){
				sql.setString(i+1, paras[i]);
			 			
		}		
			
			rs = sql.executeQuery();
			ResultSetMetaData rsm  = rs.getMetaData();
			int cols = rsm.getColumnCount();
			int count =0;
			while (rs.next()) {
				List<String> newCol = new ArrayList<String>();
				for (int i=1;i<=cols;i++) {
					newCol.add(rs.getString(i));
				}
				count++;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				sql.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		return;
	}
	
	public static int updateData(String query, String params) {
		int res = -1;
		try {
			Driver myDriver = new oracle.jdbc.driver.OracleDriver();
			DriverManager.registerDriver(myDriver);
			con = DriverManager.getConnection("jdbc:oracle:thin:ora1/ora1@localhost:1521:orcl");
			sql = con.prepareStatement(query);
			String[] paras =  params.split(",");
			for(int i = 0;i<paras.length;i++){
				sql.setString(i, paras[i]);
			}
			res = sql.executeUpdate();
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				sql.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		return res;
	}

}
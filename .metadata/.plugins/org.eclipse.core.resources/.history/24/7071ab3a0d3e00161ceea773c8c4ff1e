import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CustomerApp {
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		System.out.println("Enter the customer ID");
		Scanner keyboard = new Scanner(System.in);
		int cus = keyboard.nextInt();

		System.out.println("Press (1) to search for another customer or press (2) to Edit the customer's address");
		// Scanner keyboard1 =new Scanner(System.in);
		int popt = keyboard.nextInt();
		keyboard.nextLine();
		try {
			if (popt == 1) {
				// String sql = " select * from customers where customerid=938";

				Class.forName("oracle.jdbc.driver.OracleDriver");
				// con = DriverManager.getConnection("jdbc:oracle:thin:sys as
				// sysdba/oracle@localhost:1521:orcl");
				con = DriverManager.getConnection("jdbc:oracle:thin:ora1/ora1@localhost:1521:orcl");
				// stmt = con.createStatement();
				pstmt = con.prepareStatement("select * from customers where customerid= ?");
				pstmt.setInt(1, cus);
				// pstmt.setINT

				rs = pstmt.executeQuery();
				while (rs.next()) {
					System.out.println(rs.getString(1) + "\t");
					System.out.println(rs.getString(2));
				}

			}

			else {

				Class.forName("oracle.jdbc.driver.OracleDriver");
				// con = DriverManager.getConnection("jdbc:oracle:thin:sys as
				// sysdba/oracle@localhost:1521:orcl");
				con = DriverManager.getConnection("jdbc:oracle:thin:ora1/ora1@localhost:1521:orcl");
				// stmt = con.createStatement();
				pstmt = con.prepareStatement("Update  customers set streetaddress=? , zipcode=? where customerid= ?");
				pstmt.setInt(3, cus);
				System.out.println(" enter the streetaddress: ");
				pstmt.setString(1, keyboard.nextLine());
				System.out.println(" enter the zipcode: ");
				pstmt.setString(2, keyboard.next());

				// System.out.println(" enter the streetaddress and zipcode: ");
				// Scanner keyboard2 =new Scanner(System.in);
				// int data = keyboard2.nextInt();

				// sql = con.prepareStatement("select * from customers where
				// customerid= ? and streetaddress=? and zipcode=?");

				// pstmt.setINT

				int res = pstmt.executeUpdate();
				con.commit();

			}
		}

		catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
}
package DataBaseConnection.connect;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class Service {
	
	/*public  List<Company> getCompanyInfo() throws SQLException {
		 
	    List<Company> companys = new ArrayList<Company>();
	 	Certificate cer = new Certificate();
		String dbUrl = "jdbc:mysql://192.168.1.106/8BITDB";
		String query = "Select * FROM tbl_company";
		String query1 = "Select * FROM tbl_beecertificate";
		String userName = "bit", password = "123";

		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection (dbUrl, userName, password);
			
			Statement stmt2 = con.createStatement();
			ResultSet rs1 = stmt2.executeQuery(query1);
		
			
				while (rs1.next()) {
					
					cer.setCertificateId(rs1.getInt(1));
					cer.setCertificateGuid(rs1.getString(2));
					cer.setCertificateNumber(rs1.getString(3));
					cer.setIssuedDate(rs1.getDate(4));
					cer.setExpiryDate(rs1.getDate(5));
					cer.setLastChangedDateTime(rs1.getDate(6));
					cer.setLastChangedUser(rs1.getString(7));
					}
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				
				while (rs.next()) {
				Company com = new Company();
				com.setCompanyId(rs.getString(1));
				com.setCompanyGuid(rs.getString(2));
				com.setRegisterdName(rs.getString(3));
				com.setTradingAsName(rs.getString(4));
				com.setCipcRegistration(rs.getString(5));
				com.setSars_Registration(rs.getString(6));
				com.setSarsIdRegistration(rs.getString(7));
				com.setSarsPayeRegistration(rs.getString(8));
				com.setUifRegistration(rs.getString(9));
				com.setCompComRegistration(rs.getString(10));
				com.setLastChangedDate(rs.getDate(11));
				com.setLastChangedUser(rs.getString(12));
				//com.setCertificateificate(cer);
				companys.add(com);
				

			} //end while
			con.close();
		} catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			
		}
		return companys;
	}
	
public  List<Certificate> getCertificates() throws SQLException {
		
		List<Certificate> cerficates = new ArrayList<Certificate>();

		String dbUrl = "jdbc:mysql://192.168.1.106/8BITDB";
		String query = "Select * FROM tbl_beecertificate";
		String userName = "bit", password = "123";

		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection (dbUrl, userName, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				Certificate cer = new Certificate();
				cer.setCertificateId(rs.getInt(1));
				cer.setCertificateGuid(rs.getString(2));
				cer.setCertificateNumber(rs.getString(3));
				cer.setIssuedDate(rs.getDate(4));
				cer.setExpiryDate(rs.getDate(5));
				cer.setLastChangedDateTime(rs.getDate(6));
				cer.setLastChangedUser(rs.getString(7));
				cerficates.add(cer);
		} //end while
		con.close();
	} catch(ClassNotFoundException e) {
		System.out.println(e.getMessage());
	} catch(SQLException e) {
		System.out.println(e.getMessage());
	} finally {	}
		return cerficates;
	}
	
	public List<Company> getCompanyBYID(int CompanyID ){
		List<Company> ce = new ArrayList<Company>();
		String dbUrl = "jdbc:mysql://192.168.1.106/8BITDB";
		String query = "Select * FROM tbl_company where Company_ID = '" + CompanyID+"'";
		String userName = "bit", password = "123";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection (dbUrl, userName, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()){
				Company comp = new Company();
				comp.setCompanyId(rs.getString(1));
				comp.setCompanyGuid(rs.getString(2));
				comp.setRegisterdName(rs.getString(3));
				comp.setTradingAsName(rs.getString(4));
				comp.setCipcRegistration(rs.getString(5));
				comp.setSars_Registration(rs.getString(6));
				comp.setSarsIdRegistration(rs.getString(7));
				comp.setSarsPayeRegistration(rs.getString(8));
				comp.setUifRegistration(rs.getString(9));
				comp.setCompComRegistration(rs.getString(10));
				comp.setLastChangedDate(rs.getDate(11));
				comp.setLastChangedUser(rs.getString(12));
				ce.add(comp);
			}
			
			con.close();
		} catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		} finally {	}
		return ce;
	}
	
	*/
public CompanyInfor GetCompanyDetails(String compId)
{
	CompanyInfor compInfor = new CompanyInfor();
	HeartBeat HB = new HeartBeat();
	List<Certificate> certList = new ArrayList<Certificate>();
	Company comp = new Company();
	
	
	String dbUrl = "jdbc:mysql://192.168.1.106/8BITDB";
	String query = "Select * FROM tbl_company,tbl_beecertificate where tbl_company.Company_ID = "
			       + " tbl_beecertificate.Company_ID  and tbl_company.Company_ID =" + compId;
	String userName = "bit", password = "123";
try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection (dbUrl, userName, password);
	Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery(query);
	
	HB.setServiceName("CompanySvc");
	HB.setOperationNmae("GetCompanyInfo");
	HB.setRespCode(0);
	HB.setRespMsg("seccess");
	while(rs.next())
	{
		Certificate Cert = new Certificate();
		Cert.setCertificateId(rs.getInt("Certificate_ID"));
		Cert.setCertificateGuid(rs.getString("Certificate_Guid"));
		Cert.setCertificateNumber(rs.getString("Certificate_Number"));
		Cert.setIssuedDate(rs.getDate("Issue_Date"));
		Cert.setExpiryDate(rs.getDate("Expiry_Date"));
		Cert.setLastChangedDateTime(rs.getDate("Last_Changed_DateTime"));
		Cert.setLastChangedUser(rs.getString("Last_Changed_User"));
		certList.add(Cert);	
		comp.setCompanyId(rs.getString("Company_ID"));
		comp.setCompanyGuid(rs.getString("Company_Guid"));
		comp.setRegisterdName(rs.getString("Registered_Name"));
		comp.setTradingAsName(rs.getString("Trading_As_Name"));
		comp.setCipcRegistration(rs.getString("Cipc_Registration"));
		comp.setSars_Registration(rs.getString("Sars_Registration"));
		comp.setSarsIdRegistration(rs.getString("Sars_SdlRegistration"));
		comp.setSarsPayeRegistration(rs.getString("Sars_Paye_Registration"));
		comp.setUifRegistration(rs.getString("UifRegistration"));
		comp.setCompComRegistration(rs.getString("Comp_Com_Registration"));
		comp.setLastChangedDate(rs.getDate("Last_Changed_dateTime"));
		comp.setLastChangedUser(rs.getString("Last_Changed_User"));
		
	}
	comp.setCertificateificate(certList);
	compInfor.setHeartbeat(HB);
	compInfor.setCompany(comp);
	
	 } catch (ClassNotFoundException e) {
		System.out.println("class not found");
	 } catch (SQLException e) {
		System.out.println("sql error");
	}
	return compInfor;
}
}

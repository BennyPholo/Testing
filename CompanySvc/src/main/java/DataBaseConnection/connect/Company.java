package DataBaseConnection.connect;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="RespHeader")
@XmlAccessorType(XmlAccessType.FIELD)
public class Company {
	private String CompanyId;
	private String CompanyGuid;
	private String RegisterdName;
	private String TradingAsName;
	private String CipcRegistration;
	private String Sars_Registration;
	private String SarsIdRegistration;
	private String SarsPayeRegistration;
	private String UifRegistration;
	private String CompComRegistration;
	private Date LastChangedDate;
	private String LastChangedUser;
	private List<Certificate> certificateificate;
	public Company() {
		
	}
	
	public Company(String companyId, String companyGuid, String registerdName,
			String tradingAsName, String cipcRegistration,
			String sars_Registration, String sarsIdRegistration,
			String sarsPayeRegistration, String uifRegistration,
			String compComRegistration, Date lastChangedDate,
			List<Certificate> certificateificate) {
		CompanyId = companyId;
		CompanyGuid = companyGuid;
		RegisterdName = registerdName;
		TradingAsName = tradingAsName;
		CipcRegistration = cipcRegistration;
		Sars_Registration = sars_Registration;
		SarsIdRegistration = sarsIdRegistration;
		SarsPayeRegistration = sarsPayeRegistration;
		UifRegistration = uifRegistration;
		CompComRegistration = compComRegistration;
		LastChangedDate = lastChangedDate;
		this.certificateificate = certificateificate;
	}

	public String getCompanyId() {
		return CompanyId;
	}
	public void setCompanyId(String companyId) {
		CompanyId = companyId;
	}
	public String getCompanyGuid() {
		return CompanyGuid;
	}
	public void setCompanyGuid(String companyGuid) {
		CompanyGuid = companyGuid;
	}
	public String getRegisterdName() {
		return RegisterdName;
	}
	public void setRegisterdName(String registerdName) {
		RegisterdName = registerdName;
	}
	public String getTradingAsName() {
		return TradingAsName;
	}
	public void setTradingAsName(String tradingAsName) {
		TradingAsName = tradingAsName;
	}
	public String getCipcRegistration() {
		return CipcRegistration;
	}
	public void setCipcRegistration(String cipcRegistration) {
		CipcRegistration = cipcRegistration;
	}
	public String getSars_Registration() {
		return Sars_Registration;
	}
	public void setSars_Registration(String sars_Registration) {
		Sars_Registration = sars_Registration;
	}
	public String getSarsIdRegistration() {
		return SarsIdRegistration;
	}
	public void setSarsIdRegistration(String sarsIdRegistration) {
		SarsIdRegistration = sarsIdRegistration;
	}
	public String getSarsPayeRegistration() {
		return SarsPayeRegistration;
	}
	public void setSarsPayeRegistration(String sarsPayeRegistration) {
		SarsPayeRegistration = sarsPayeRegistration;
	}
	public String getUifRegistration() {
		return UifRegistration;
	}
	public void setUifRegistration(String uifRegistration) {
		UifRegistration = uifRegistration;
	}
	public String getCompComRegistration() {
		return CompComRegistration;
	}
	public void setCompComRegistration(String compComRegistration) {
		CompComRegistration = compComRegistration;
	}
	public Date getLastChangedDate() {
		return LastChangedDate;
	}
	public void setLastChangedDate(Date lastChangedDate) {
		LastChangedDate = lastChangedDate;
	}	
	public String getLastChangedUser() {
		return LastChangedUser;
	}

	public void setLastChangedUser(String lastChangedUser) {
		LastChangedUser = lastChangedUser;
	}
	
	public List<Certificate> getCertificateificate() {
		return certificateificate;
	}
	public void setCertificateificate(List<Certificate> certificateificate) {
		this.certificateificate = certificateificate;
	}


}

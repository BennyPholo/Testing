package DataBaseConnection.connect;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.*;

@XmlRootElement(name = "GetCompanyDetailsResp")

public class CompanyInfor {
	
	private HeartBeat Aheartbeat;
	private Company company;

	public CompanyInfor() {
	}
	
	public CompanyInfor(HeartBeat heartbeat, Company company) {
		this.Aheartbeat = heartbeat;
		this.company = company;
	}
    @XmlElement(name = "RespHeader")
	public HeartBeat getHeartbeat() {
		return Aheartbeat;
	}
	public void setHeartbeat(HeartBeat heartbeat) {
		this.Aheartbeat = heartbeat;
	}
	@XmlElement(name = "Company")
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	
	

}

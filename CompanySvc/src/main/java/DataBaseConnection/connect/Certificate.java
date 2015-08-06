package DataBaseConnection.connect;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
//@XmlType(name = " Certificatezzz",propOrder = {"CertificateId","CertificateGuid"," CertificateNumber", "IssuedDate", "ExpiryDate", "LastChangedDateTime", "LastChangedUser"})
public class Certificate {
	private int CertificateId;
	private String CertificateGuid;
	private String CertificateNumber;
	private Date  IssuedDate;
	private Date ExpiryDate;
	private Date LastChangedDateTime;
	private String LastChangedUser;
	public Certificate() {
		
	}
	public Certificate(int certificateId, String certificateGuid,
			String certificateNumber, Date issuedDate, Date expiryDate,
			Date lastChangedDateTime, String lastChangedUser) {
		CertificateId = certificateId;
		CertificateGuid = certificateGuid;
		CertificateNumber = certificateNumber;
		IssuedDate = issuedDate;
		ExpiryDate = expiryDate;
		LastChangedDateTime = lastChangedDateTime;
		LastChangedUser = lastChangedUser;
	}
	public int getCertificateId() {
		return CertificateId;
	}
	public void setCertificateId(int certificateId) {
		CertificateId = certificateId;
	}
	public String getCertificateGuid() {
		return CertificateGuid;
	}
	public void setCertificateGuid(String certificateGuid) {
		CertificateGuid = certificateGuid;
	}
	public String getCertificateNumber() {
		return CertificateNumber;
	}
	public void setCertificateNumber(String certificateNumber) {
		CertificateNumber = certificateNumber;
	}
	public Date getIssuedDate() {
		return IssuedDate;
	}
	public void setIssuedDate(Date issuedDate) {
		IssuedDate = issuedDate;
	}
	public Date getExpiryDate() {
		return ExpiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		ExpiryDate = expiryDate;
	}
	public Date getLastChangedDateTime() {
		return LastChangedDateTime;
	}
	public void setLastChangedDateTime(Date lastChangedDateTime) {
		LastChangedDateTime = lastChangedDateTime;
	}
	public String getLastChangedUser() {
		return LastChangedUser;
	}
	public void setLastChangedUser(String lastChangedUser) {
		LastChangedUser = lastChangedUser;
	}

}

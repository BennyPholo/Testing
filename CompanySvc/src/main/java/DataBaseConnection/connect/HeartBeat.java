package DataBaseConnection.connect;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RespHeader")
public class HeartBeat {

	private String ServiceName;
	private String OperationNmae;
	private int RespCode;
	private String RespMsg;
	
	public HeartBeat() {
	}
	
	public HeartBeat(String serviceName, String operationNmae, int respCode,
			String respMsg) {
		ServiceName = serviceName;
		OperationNmae = operationNmae;
		RespCode = respCode;
		RespMsg = respMsg;
	}

	public String getServiceName() {
		return ServiceName;
	}
	public void setServiceName(String serviceName) {
		ServiceName = serviceName;
	}
	public String getOperationNmae() {
		return OperationNmae;
	}
	public void setOperationNmae(String operationNmae) {
		OperationNmae = operationNmae;
	}
	public int getRespCode() {
		return RespCode;
	}
	public void setRespCode(int respCode) {
		RespCode = respCode;
	}
	public String getRespMsg() {
		return RespMsg;
	}
	public void setRespMsg(String respMsg) {
		RespMsg = respMsg;
	}
	
	
	
}

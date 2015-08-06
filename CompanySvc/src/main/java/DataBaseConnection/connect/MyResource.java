
package DataBaseConnection.connect;

import java.sql.SQLException;
import java.util.List;

import javax.jws.WebMethod;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/Company")
public class MyResource {
   
	Service ser = new Service();
	
//    @GET
//    @Produces(MediaType.APPLICATION_XML)
//    @Path("/{CompanyID}")
//    public List<Company> getCompanyBYID(@PathParam("CompanyID") int CompanyID ){
//    	return ser.getCompanyBYID(CompanyID);
//    		
//    }
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("/{compId}")
    public CompanyInfor getCompanyDeatails(@PathParam("compId") String CompanyID)
    {
    	System.out.println("test");
    	return ser.GetCompanyDetails(CompanyID);
    }
    
}

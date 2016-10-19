package tests;

import org.apache.cayenne.Cayenne;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.configuration.server.ServerRuntime;

import jcommops.db.orm.rest.Ptf;
import serviceutil.MethodAgencyToProg;

public class TestMethodAgencyPrg {
	public static void main(String[] args) {
		
		ServerRuntime runtime = new ServerRuntime("cayenne-project.xml");
    	//Getting Object Context
    	ObjectContext context = runtime.getContext();
    	
    	MethodAgencyToProg mp = new MethodAgencyToProg();
    	
			mp.FindProgramAgencies(488912);
			
//			PtfStatus platformstatus = Cayenne.objectForPK(context, PtfStatus.class, platform.getToPtfStatus()); 	//Get the platform Status
			
    	
    		runtime.shutdown();

	

	}

}
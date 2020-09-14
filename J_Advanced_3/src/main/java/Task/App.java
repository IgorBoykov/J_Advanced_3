package Task;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class App {
	
	private static Logger LOG = Logger.getLogger(App.class);
   
	public static void main( String[] args ) {
       
		runDomConfigurator();
		
    }
	
	
	public static void runDomConfigurator() {
		DOMConfigurator.configure("logCon.xml");	
		LOG.debug("DEBUG mesaage");
		LOG.info("INFO mesaage");
		LOG.warn("WARN mesaage");
		LOG.error("ERROR mesaage");
	}
}

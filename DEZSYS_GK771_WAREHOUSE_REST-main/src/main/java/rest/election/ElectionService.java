package rest.election;

import org.springframework.stereotype.Service;
import rest.model.ElectionData;

@Service
public class ElectionService {
	
	public String getGreetings( String inModule ) {
        return "Greetings from " + inModule;
    }

    public ElectionData getElectionData(String inID ) {
    	
    	ElectionSimulation simulation = new ElectionSimulation();
        return simulation.getData( inID );
        
    }
    
}
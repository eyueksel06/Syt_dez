package rest.election;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.MediaType;

import rest.model.ElectionData;

@RestController
public class ElectionController {

    @Autowired
    private ElectionService service;

    @RequestMapping("/")
    public String electionMain() {
    	String mainPage = "This is the election application! (DEZSYS_ELECTION_REST) <br/><br/>" +
                          "<a href='http://localhost:8080/election/001/json'>Link to election/001/json</a><br/>"+
                          "<a href='http://localhost:8080/election/001/xml'>Link to election/001/xml</a><br/>" ;
        return mainPage;
    }

    @RequestMapping(value="/election/{inID}/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public ElectionData electionData(@PathVariable String inID ) {
        return service.getElectionData( inID );
    }
    @RequestMapping(value="/election/{inID}/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public ElectionData electionDataXML(@PathVariable String inID ) {
        return service.getElectionData( inID );
    }
}
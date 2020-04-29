package ch.mabaka.journal.app.rest;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ch.mabaka.journal.app.persistence.journal.Journal;
import ch.mabaka.journal.app.service.journal.JournalService;

@Path("/journal")
public class JournalRest {
	
	@Inject
	JournalService journalService;
	

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllJournals() {
        return Response.ok(journalService.readAllJournal()).build();
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addJournal(Journal newJournal) {
    	try {
    		journalService.addJournal(newJournal);
    		return Response.ok().build();	
    	} catch (Exception e) {
    		return Response.serverError().build();
    	}
    	
    }

}

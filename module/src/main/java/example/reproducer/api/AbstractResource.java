package example.reproducer.api;

import example.reproducer.dto.ModuleDto;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
@Consumes(MediaType.APPLICATION_JSON)
public abstract class AbstractResource {

    @POST
    public abstract ModuleDto helloPost(ModuleDto moduleDto);
}

package example.reproducer.api;

import example.reproducer.dto.ModuleDto;

import javax.enterprise.context.RequestScoped;
import javax.validation.Valid;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/module")
@RequestScoped
public class ModuleResource extends AbstractResource {

    @GET
    public String hello() {
        return "Hello Module";
    }

    @Override
    public ModuleDto helloPost(@Valid ModuleDto moduleDto) {
        return moduleDto;
    }
}
package example.reproducer.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
public class ModuleDto implements Serializable {
    private static final long serialVersionUID = 433032811167094621L;

    @NotEmpty(message = "Empty")
    private String test;
}

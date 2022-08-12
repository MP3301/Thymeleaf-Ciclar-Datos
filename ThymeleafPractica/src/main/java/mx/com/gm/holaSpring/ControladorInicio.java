package mx.com.gm.holaSpring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@Controller
@Slf4j
public class ControladorInicio {

    @GetMapping("/")
    public String inicio (Model model) {
       
       
       
       
       Persona persona = new Persona();
       
       persona.setNombre("a");
       persona.setApellido("b");
       persona.setEmail("c@c.com");
       persona.setTelefono("1");
       
       
       Persona persona2 = new Persona();
       
       persona2.setNombre("x");
       persona2.setApellido("x");
       persona2.setEmail("x@x.com");
       persona2.setTelefono("2");
       
       
       List<Persona> personas = Arrays.asList(persona,persona2);

       String mensaje = "Hola mundo con thymeleaf";
       
       model.addAttribute("persona1", persona);
       
       model.addAttribute("personas", personas);
       
       log.info("Ejecutando controlador index");
    
    return "index";
    }
}
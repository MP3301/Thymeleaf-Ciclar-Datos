package mx.com.gm.holaSpring;

import lombok.Data;

// con data lombok crea getter setter to string equals y hashcode
@Data
public class Persona {

  private String nombre;
  private String apellido;
  private String email;
  private String telefono;
}
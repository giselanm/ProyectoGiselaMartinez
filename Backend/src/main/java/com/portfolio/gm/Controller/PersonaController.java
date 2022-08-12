package com.portfolio.gm.Controller;

import com.portfolio.gm.Entity.Persona;
import com.portfolio.gm.Interface.InterPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    @Autowired InterPersonaService interPersonaService;
    
@GetMapping("personas/traer")    
public List <Persona> getPersona(){
    return interPersonaService.getPersona();
    }

@PostMapping("/personas/crear")
public String createPersona(@RequestBody Persona persona){
    interPersonaService.savePersona(persona);
    return "Persona creada con exito";
}

@DeleteMapping("/personas/borrar/(id)")
public String deletePersona (@PathVariable Long id){
    interPersonaService.deletePersona(id);
    return "Persona eliminada con exito";
}

//URL:PUERTO/Personas/editar/4/nombre & apellido & img
@PutMapping("/personas/editar/(id)")
public Persona editPersona (@PathVariable Long id,
                            @RequestParam("nombre") String nuevoNombre,
                            @RequestParam("apellido") String nuevoApellido,
                            @RequestParam("img") String nuevoImg){
    Persona persona = interPersonaService.findPersona(id);
    
    persona.setNombre(nuevoNombre);
    persona.setApellido(nuevoApellido);
    persona.setImg(nuevoImg);
    
    interPersonaService.savePersona(persona);
    return persona;   
}

}

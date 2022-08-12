package com.portfolio.gm.Interface;

import com.portfolio.gm.Entity.Persona;
import java.util.List;

public interface InterPersonaService {
    //Traer lista de personas
    public List<Persona> getPersona();
            
    //Guardar objeto tipo persona  
    public void savePersona(Persona persona); 
    
    //Eliminar objeto buscado por Id
    public void deletePersona(Long id);
    
    //Buscar persona por Id
    public Persona findPersona(Long id);
}

package com.portfolio.gm.Service;

import com.portfolio.gm.Entity.Persona;
import com.portfolio.gm.Interface.InterPersonaService;
import com.portfolio.gm.Repository.InterPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements InterPersonaService{
    @Autowired InterPersonaRepository interPersonaRepository;

    @Override
    public List<Persona> getPersona() {
       List<Persona> persona =  interPersonaRepository.findAll();
       return persona;
    }

    @Override
    public void savePersona(Persona persona) {
      interPersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
     interPersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
      Persona persona = interPersonaRepository.findById(id).orElse(null);
      return persona;
    }
    
}

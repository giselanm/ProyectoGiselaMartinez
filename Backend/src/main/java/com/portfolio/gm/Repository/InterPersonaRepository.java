package com.portfolio.gm.Repository;

import com.portfolio.gm.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterPersonaRepository extends JpaRepository<Persona,Long>{
    
}


package com.prueba.dai.Service;

import com.prueba.dai.Entity.Experiencia;
import com.prueba.dai.Repository.RExperiencia;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia {
    @Autowired
    RExperiencia rExperiencia;
    
    public List<Experiencia> list(){
        return rExperiencia.findAll();
    }
    public Optional<Experiencia> getOne(int id){
        return rExperiencia.findById(id);
    }
    public Optional<Experiencia> getByNombre(String nombreE){
        return rExperiencia.findByNombreE(nombreE);
    }
    public void save(Experiencia expe){
        rExperiencia.save(expe);
    }
    public void delete(int id){
        rExperiencia.deleteById(id);
    }
    public boolean existsById(int id){
        return rExperiencia.existsById(id);
    }
    public boolean existsByNombreE(String NombreE){
        return rExperiencia.existsByNombreE(NombreE); 
    }

}

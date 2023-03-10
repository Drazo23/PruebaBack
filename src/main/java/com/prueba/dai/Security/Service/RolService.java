
package com.prueba.dai.Security.Service;

import com.prueba.dai.Security.Entity.Rol;
import com.prueba.dai.Security.Enums.RolNombre;
import com.prueba.dai.Security.Repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    public void save(Rol rol){
      irolRepository.save(rol);
    }
    
}

package pe.edu.cibertec.appwebtrasanction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.appwebtrasanction.model.bd.Direccion;
import pe.edu.cibertec.appwebtrasanction.repository.DireccionRepository;

@Service
public class DireccionService {
    @Autowired
    private DireccionRepository direccionRepository;

    public Direccion guardarDireccion(Direccion direccion){
        return direccionRepository.save(direccion);
    }
}

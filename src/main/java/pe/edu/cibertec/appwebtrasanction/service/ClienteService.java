package pe.edu.cibertec.appwebtrasanction.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.appwebtrasanction.model.bd.Cliente;
import pe.edu.cibertec.appwebtrasanction.model.bd.Direccion;
import pe.edu.cibertec.appwebtrasanction.model.request.ClienteRequest;
import pe.edu.cibertec.appwebtrasanction.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private DireccionService direccionService;

    @Transactional
    public Boolean guardarCliente(ClienteRequest clienteRequest){
        Cliente cliente = new Cliente();
        cliente.setNombre(clienteRequest.getNomcliente());
        cliente.setApellido(clienteRequest.getApecliente());
        Cliente nuevoCliente = clienteRepository.save(cliente);
        Direccion direccion = null;
        direccion.setDescripcion(clienteRequest.getDescdireccion());
        direccion.setCliente(cliente);
        direccionService.guardarDireccion(direccion);
        return nuevoCliente.getId() > 0;
    }

}

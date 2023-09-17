package pe.edu.cibertec.appwebtrasanction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.appwebtrasanction.model.request.ClienteRequest;
import pe.edu.cibertec.appwebtrasanction.model.response.ResultadoResponse;
import pe.edu.cibertec.appwebtrasanction.service.ClienteService;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/frmcliente")
    public String frmcliente(){
        return "cliente/frmcliente";
    }

    @PostMapping("/registrarcliente")
    @ResponseBody
    public ResultadoResponse registrarcliente(
            @RequestBody ClienteRequest clienteRequest
            ){
        String mensaje = "";
        Boolean respuesta;
        respuesta = clienteService.guardarCliente(clienteRequest);
        mensaje = respuesta ? "Cliente registrado correctamente."
                : "Cliente no registrado";
        return ResultadoResponse.builder()
                .mensaje(mensaje)
                .respuesta(respuesta).build();
    }

}

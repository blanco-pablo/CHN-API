package com.example.API.Cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/cliente")
public class ClienteController {

    private final ClienteService clienteService;

    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public List<Cliente> getClientes() {
        return clienteService.getClientes();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping
    public void crearCliente(@RequestBody Cliente cliente) {
        clienteService.crearCliente(cliente);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping(path = "{ID_CLIENTE}")
    public void deleteCliente(@PathVariable("ID_CLIENTE") Integer id_cliente) {
        clienteService.deleteCliente(id_cliente);
    }
}

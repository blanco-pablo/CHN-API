package com.example.API.Cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> getClientes() {
        return clienteRepository.findAll();
    }

    public void crearCliente(Cliente cliente) {
        System.out.println(cliente);
        clienteRepository.save(cliente);
    }

    public void deleteCliente(Integer id_cliente) {
        System.out.println(id_cliente);
        boolean existe = clienteRepository.existsById(id_cliente);
        if (!existe) {
            throw new IllegalStateException("Cliente ID " + id_cliente + " No existe");
        }
        clienteRepository.deleteById(id_cliente);
    }
}

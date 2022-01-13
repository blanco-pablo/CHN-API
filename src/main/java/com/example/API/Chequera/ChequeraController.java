package com.example.API.Chequera;

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
@RequestMapping(path = "api/chequera")
public class ChequeraController {

    private final ChequeraService chequeraService;

    @Autowired
    public ChequeraController(ChequeraService chequeraService) {
        this.chequeraService = chequeraService;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public List<Chequera> getClientes() {
        return chequeraService.getChequera();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping
    public void crearCliente(@RequestBody Chequera chequera) {
        chequeraService.crearChequera(chequera);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping(path = "{ID_CHEQUERA}")
    public void deleteCliente(@PathVariable("ID_CHEQUERA") Integer id_chequera) {
        chequeraService.deleteChequera(id_chequera);
    }
}

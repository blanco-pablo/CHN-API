package com.example.API.Cuenta;

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
@RequestMapping(path = "api/cuenta")
public class CuentaController {

    private final CuentaService cuentaService;

    @Autowired
    public CuentaController(CuentaService cuentaService) {
        this.cuentaService = cuentaService;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public List<Cuenta> getClientes() {
        return cuentaService.getCuenta();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping
    public void crearCliente(@RequestBody Cuenta cuenta) {
        cuentaService.crearCuenta(cuenta);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping(path = "{ID_CUENTA}")
    public void deleteCliente(@PathVariable("ID_CUENTA") Integer id_cuenta) {
        cuentaService.deleteCuenta(id_cuenta);
    }
}

package com.example.API.Cuenta;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CuentaService {

    private final CuentaRepository cuentaRepository;

    @Autowired
    public CuentaService(CuentaRepository cuentaRepository) {
        this.cuentaRepository = cuentaRepository;
    }

    public List<Cuenta> getCuenta() {
        return cuentaRepository.findAll();
    }

    public void crearCuenta(Cuenta cuenta) {
        System.out.println(cuenta);
        cuentaRepository.save(cuenta);
    }

    public void deleteCuenta(Integer id_cuenta) {
        System.out.println(id_cuenta);
        boolean existe = cuentaRepository.existsById(id_cuenta);
        if (!existe) {
            throw new IllegalStateException("Cuenta ID " + id_cuenta + " No existe");
        }
        cuentaRepository.deleteById(id_cuenta);
    }
}

package com.example.API.Chequera;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChequeraService {

    private final ChequeraRepository chequeraRepository;

    @Autowired
    public ChequeraService(ChequeraRepository chequeraRepository) {
        this.chequeraRepository = chequeraRepository;
    }

    public List<Chequera> getChequera() {
        return chequeraRepository.findAll();
    }

    public void crearChequera(Chequera chequera) {
        System.out.println(chequera);
        chequeraRepository.save(chequera);
    }

    public void deleteChequera(Integer id_chequera) {
        System.out.println(id_chequera);
        boolean existe = chequeraRepository.existsById(id_chequera);
        if (!existe) {
            throw new IllegalStateException("Chequera ID " + id_chequera + " No existe");
        }
        chequeraRepository.deleteById(id_chequera);
    }
}

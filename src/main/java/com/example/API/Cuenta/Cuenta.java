package com.example.API.Cuenta;

import javax.persistence.*;

@Entity
@Table
public class Cuenta {
    @Id
    @Column(name = "ID_CUENTA", updatable = false)
    private int ID_CUENTA;

    public Cuenta() {
    }

    public int getId_cuenta() {
        return ID_CUENTA;
    }

    public void setId_cuenta(int id_cuenta) {
        this.ID_CUENTA = id_cuenta;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(String numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public Cuenta(int iD_CUENTA, String numero_cuenta, Double saldo, int id_tipo, int id_cliente) {
        ID_CUENTA = iD_CUENTA;
        this.setNumero_cuenta(numero_cuenta);
        this.setSaldo(saldo);
        this.setId_tipo(id_tipo);
        this.setId_cliente(id_cliente);
    }

    public Cuenta(String numero_cuenta, Double saldo, int id_tipo, int id_cliente) {
        this.setNumero_cuenta(numero_cuenta);
        this.setSaldo(saldo);
        this.setId_tipo(id_tipo);
        this.setId_cliente(id_cliente);
    }

    private String numero_cuenta;
    private Double saldo;
    private int id_tipo;
    private int id_cliente;

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Cliente" +
                " numero_cuenta=" + numero_cuenta +
                " saldo=" + saldo +
                " id_tipo=" + id_tipo +
                " id_cliente=" + id_cliente;
    }
}

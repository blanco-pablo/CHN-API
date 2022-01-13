package com.example.API.Chequera;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table
public class Chequera {
    @Id
    @Column(name = "ID_CHEQUERA", updatable = false)
    private int ID_CHEQUERA;

    public Chequera(int iD_CHEQUERA, Date fecha, int num_inicio, int num_fin, int id_cuenta) {
        ID_CHEQUERA = iD_CHEQUERA;
        this.setFecha(fecha);
        this.setNum_inicio(num_inicio);
        this.setNum_fin(num_fin);
        this.setId_cuenta(id_cuenta);
    }

    public int getId_chequera() {
        return ID_CHEQUERA;
    }

    public void setId_chequera(int ID_CHEQUERA) {
        this.ID_CHEQUERA = ID_CHEQUERA;
    }

    public int getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    public int getNum_fin() {
        return num_fin;
    }

    public void setNum_fin(int num_fin) {
        this.num_fin = num_fin;
    }

    public int getNum_inicio() {
        return num_inicio;
    }

    public void setNum_inicio(int num_inicio) {
        this.num_inicio = num_inicio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Chequera() {
    }

    public Chequera(Date fecha, int num_inicio, int num_fin, int id_cuenta) {
        this.setFecha(fecha);
        this.setNum_inicio(num_inicio);
        this.setNum_fin(num_fin);
        this.setId_cuenta(id_cuenta);
    }

    private Date fecha;
    private int num_inicio;
    private int num_fin;
    private int id_cuenta;

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Chequera" +
                " fecha=" + fecha +
                " num_inicio=" + num_inicio +
                " num_fin=" + num_fin +
                " id_cuenta=" + id_cuenta;
    }

}

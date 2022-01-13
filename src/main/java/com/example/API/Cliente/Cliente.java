package com.example.API.Cliente;

import javax.persistence.*;

@Entity
@Table
public class Cliente {
    @Id
    @Column(name = "ID_CLIENTE", updatable = false)
    private int ID_CLIENTE;

    public Cliente(int ID_CLIENTE, String cui, String nombre, String apellido, String direccion, String telefono) {
        setID_CLIENTE(ID_CLIENTE);
        setcui(cui);
        setnombre(nombre);
        setapellido(apellido);
        setdireccion(direccion);
        settelefono(telefono);
    }

    public String gettelefono() {
        return telefono;
    }

    public void settelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getdireccion() {
        return direccion;
    }

    public void setdireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getapellido() {
        return apellido;
    }

    public void setapellido(String apellido) {
        this.apellido = apellido;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getcui() {
        return cui;
    }

    public void setcui(String cui) {
        this.cui = cui;
    }

    public int getID_CLIENTE() {
        return ID_CLIENTE;
    }

    public void setID_CLIENTE(int ID_CLIENTE) {
        this.ID_CLIENTE = ID_CLIENTE;
    }

    public Cliente(String cui, String nombre, String apellido, String direccion, String telefono) {
        setcui(cui);
        setnombre(nombre);
        setapellido(apellido);
        setdireccion(direccion);
        settelefono(telefono);
    }

    public Cliente() {
    }

    private String cui;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Cliente" +
                " ID_CLIENTE=" + ID_CLIENTE +
                " cui=" + cui +
                " nombre=" + nombre +
                " apellido=" + apellido +
                " telefono=" + telefono +
                " direccion=" + direccion;
    }
}

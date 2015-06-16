package com.mycompany.app;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by pepesan on 10/6/15.
 */
public class Cliente implements Serializable {

    public String nombre;
    public String apellidos;
    public String dni;
    public String email;
    public Date fechaNac;

    public Cliente() {
        this.nombre = "";
        this.apellidos = "";
        this.dni = "";
        this.email = "";
        this.fechaNac = new Date();
    }

    public Cliente(String nombre, String apellidos, String dni, String email, Date fecha_nac) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.email = email;
        this.fechaNac = fecha_nac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", fechaNac=" + fechaNac +
                '}';
    }
}

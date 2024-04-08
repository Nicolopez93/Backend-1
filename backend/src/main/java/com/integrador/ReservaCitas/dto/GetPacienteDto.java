package com.integrador.ReservaCitas.dto;

import java.util.Date;

public class GetPacienteDto {
    private String nombre;
    private String apellido;
    private String dni;
    private String fechaAlta;
    private DomicilioDto domicilio;

    public GetPacienteDto() {
    }

    public GetPacienteDto(String nombre, String apellido, String dni, String fechaAlta, DomicilioDto domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaAlta = fechaAlta;
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public DomicilioDto getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(DomicilioDto domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "GetPacienteDto{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", fechaAlta=" + fechaAlta + ", domicilio=" + domicilio + '}';
    }
}

package com.corhuila.corte_2_parcial_2.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "reservas")
public class Reserva {
    //columnas
    @Id 
    @GeneratedValue( strategy = GenerationType.IDENTITY )
     @Column (nullable = false)
    private Integer id;

    @Column(nullable = false)
    private String nombre;
    
    @Column(nullable = false)
    private String direccion;
    
    @Column(nullable = false)
    private String telefono;
    
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String fecha_hora;
    @Column(nullable = false)
    private String  mesa_reservada;
    
    // contructor
    public Reserva(String fecha_hora, String mesa_reservada) {
        this.fecha_hora = fecha_hora;
        this.mesa_reservada = mesa_reservada;
    }

    public Reserva(String nombre, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }
    //getter y setters

    public String getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(String fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public String getMesa_reservada() {
        return mesa_reservada;
    }

    public void setMesa_reservada(String mesa_reservada) {
        this.mesa_reservada = mesa_reservada;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Reserva() {
    }

   
    
}

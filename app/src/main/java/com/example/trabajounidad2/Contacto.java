package com.example.trabajounidad2;
public class Contacto {
    int id;
    String nombre;
    String apellido;
    String email;
    String telefono;
    String ciudad;

    public  Contacto(){

    }
    public Contacto(String nombre, String apellido, String email, String telefono, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.ciudad = ciudad;
    }

    public Contacto(int id, String nombre, String apellido, String email, String telefono, String ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.ciudad = ciudad;
    }

    // Getters
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getEmail() {
        return email;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getCiudad() {
        return ciudad;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}

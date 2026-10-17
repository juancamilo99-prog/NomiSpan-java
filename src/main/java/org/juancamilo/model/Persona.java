package org.juancamilo.model;

public class Persona {

    private Long id;
    private String nombre;
    private String identificador;
    private String direccion;
    private String correo;
    private String telefono;

    public Persona() {
    }

    public Persona(Long id, String nombre, String identificador, String direccion, String correo, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.identificador = identificador;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

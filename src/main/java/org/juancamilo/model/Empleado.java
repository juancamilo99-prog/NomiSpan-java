package org.juancamilo.model;

import java.math.BigDecimal;

public abstract class Empleado extends Persona{

    private Cargo cargo;
    private int aniosExperiencia;

    public Empleado(Long id, String nombre, String identificador, String direccion, String correo, String telefono, Cargo cargo, int aniosExperiencia) {
        super(id, nombre, identificador, direccion, correo, telefono);
        this.cargo = cargo;
        this.aniosExperiencia = aniosExperiencia;
    }

    public abstract BigDecimal calcularPago();


}

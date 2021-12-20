package CapaNegocio;

import java.util.*;

public class Empleados 
{
    private String nombres;
    private String apellidos;
    private Date horaEntrada;
    private Date horaSalida;
    private String cargo;
    private String numeroTelef;

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNumeroTelef() {
        return numeroTelef;
    }

    public void setNumeroTelef(String numeroTelef) {
        this.numeroTelef = numeroTelef;
    }
    
    public String Atener()
    {
        return "El metodo atener aun no ha sido implementado";
    }
    public String Orientar()
    {
        return "El metodo orientar aun no ha sido implementado";
    }
}

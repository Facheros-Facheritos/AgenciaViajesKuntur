package CapaNegocio;

import java.util.*;

public class Reserva 
{
    private String lugarOrigen;
    private String lugarDestino;
    private float cantidadDias;
    private int numeroPersonas;
    private String representante;
    private String precio;
    private Date fechaPartida;
    private Date fechaLlegada;

    public String getLugarOrigen() {
        return lugarOrigen;
    }

    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    public String getLugarDestino() {
        return lugarDestino;
    }

    public void setLugarDestino(String lugarDestino) {
        this.lugarDestino = lugarDestino;
    }

    public float getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(float cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public Date getFechaPartida() {
        return fechaPartida;
    }

    public void setFechaPartida(Date fechaPartida) {
        this.fechaPartida = fechaPartida;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }
    
    public String Reservar()
    {
        return "el metodo reservar aun no ha sido implementado";
    }
    public String Guardar()
    {
        return "el metodo guardar aun no ha sido implementado";
    }
    public String Comprobar()
    {
        return "el metodo comprobar aun no ha sido implementado";
    }
}

package CapaNegocio;

public class Personas extends Proveedores
{

    public String getConexion() {
        return conexion;
    }

    public void setConexion(String conexion) {
        this.conexion = conexion;
    }
    private String conexion;
    
}

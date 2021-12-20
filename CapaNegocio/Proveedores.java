package CapaNegocio;

public class Proveedores 
{
    private String nombre;
    private String montoPago;
    private String gradoImportancia;
    private String lugarOrigen;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMontoPago() {
        return montoPago;
    }

    public void setMontoPago(String montoPago) {
        this.montoPago = montoPago;
    }

    public String getGradoImportancia() {
        return gradoImportancia;
    }

    public void setGradoImportancia(String gradoImportancia) {
        this.gradoImportancia = gradoImportancia;
    }

    public String getLugarOrigen() {
        return lugarOrigen;
    }

    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }
    
    public String Aportar()
    {
        return "El método Aportar recién será implementado";
    }
    public String Promocionar()
    {
        return "El método Promocionar recién será implementado";
    }
}

package Persona;
public class Persona {
    public String nombres;
    public String apellidos;
    public String tipoDocumento;
    public int numeroDocumento;
    public String direccion;
    public String telefono;

    public Persona(String nombres, String apellidos, String tipoDocumento, int numeroDocumento, String direccion, String telefono) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.direccion = direccion;
        this.telefono = telefono;
    }

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

    public String getTipoDocumento() {
        return tipoDocumento;
    }
    public int getNumeroDocumento() {
        return numeroDocumento;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", tipoDocumento='" + tipoDocumento + '\'' +
                ", numeroDocumento=" + numeroDocumento +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}


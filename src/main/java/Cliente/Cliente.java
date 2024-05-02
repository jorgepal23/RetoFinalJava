package Cliente;

import Persona.Persona;
public class Cliente extends Persona {
    //private static Object numClienteModificar;
    public String tipoProducto;
    public String numeroProducto;
    public Cliente(String nombres, String apellidos, String tipoDocumento, int numeroDocumento, String direccion, String telefono, String tipoProducto, String numeroProducto) {
        super(nombres, apellidos, tipoDocumento, numeroDocumento, direccion, telefono);
        this.tipoProducto = tipoProducto;
        this.numeroProducto = numeroProducto;
    }
    public String getTipoProducto() {
        return tipoProducto;
    }
    public String getNumeroProducto() {
        return numeroProducto;
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "tipoProducto='" + tipoProducto + '\'' +
                ", numeroProducto='" + numeroProducto + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", tipoDocumento='" + tipoDocumento + '\'' +
                ", numeroDocumento=" + numeroDocumento +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}

package Banco;

import Cliente.Cliente;
import Persona.Persona;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
public class Banco {
    public static ArrayList<Cliente> listaClientes= new ArrayList<Cliente>();
    public static void agregarCliente() {
        String tipoDocumento = JOptionPane.showInputDialog("Digite el tipo de documento del cliente\n\nC: Cedula de ciudadania\nN: NIT persona juridica\nT: Tarjeta de identidad\nP: Pasaporte");
        int numeroDocumento = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de documento:"));
        String nombres = JOptionPane.showInputDialog("Digite los nombres del cliente:");
        String apellidos = JOptionPane.showInputDialog("Digite los apellidos del cliente:");
        String direccion = JOptionPane.showInputDialog("Digite la direccion del cliente:");
        String telefono = JOptionPane.showInputDialog("Digite el numero de contacto:");
        String tipoProducto = JOptionPane.showInputDialog("Digite el tipo de producto\n\nAH: Cuenta de ahorros\nCC: Cuenta corriente\nTC: Tarjeta credito\nCR: Credito");
        Random aleatorio = new Random(System.currentTimeMillis());
        String numeroProducto = String.valueOf(aleatorio.nextInt(999999999));
        JOptionPane.showMessageDialog(null, "Producto asignado exitosamente\n\nEl numero de producto asignado es\n" + numeroProducto);
        listaClientes.add(new Cliente(nombres, apellidos, tipoDocumento, numeroDocumento, direccion, telefono,tipoProducto,numeroProducto));
        JOptionPane.showMessageDialog(null, "Cliente creado existosamente");
    }
    public static void mostrarClientes(){

        for (Cliente cliente :listaClientes){
            JOptionPane.showMessageDialog(null, "***Base de datos de clientes***\n\nNombres: " +  cliente.getNombres() + "\nApellidos: " + cliente.getApellidos() + "\nTipo de documento: " + cliente.getTipoDocumento() + "\nNumero de documento: " + cliente.getNumeroDocumento() + "\nTipo de cuenta: " + cliente.getTipoProducto() + "\nNumero de cuenta: " + cliente.getNumeroProducto() +"\n\nClic en OK para continuar");
        }
    }
    public static Persona buscarCliente (int numeroDocumento){
        numeroDocumento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de documento de identidad"));
        int i = 0;
        while (i<listaClientes.size()) {
            if (Objects.equals(listaClientes.get(i).getNumeroDocumento(), numeroDocumento)){
                JOptionPane.showMessageDialog(null, "***El cliente ya existe***\n\nNombres: " + listaClientes.get(i).getNombres() + "\nApellidos: " + listaClientes.get(i).getApellidos() + "\nTipo de documento: " + listaClientes.get(i).getTipoDocumento() + "\nNumero de documento: " + listaClientes.get(i).getNumeroDocumento() + "\nTipo de cuenta: " + listaClientes.get(i).getTipoProducto() + "\nNumero de cuenta: " + listaClientes.get(i).getNumeroProducto());
                break;
              }
            i++;
            if(i== listaClientes.size()) {
                JOptionPane.showMessageDialog(null, "El cliente no existe");
            }
        }
        return null;
    }
    public static void actualizaCliente(int numeroDocumento){
        numeroDocumento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de documento de identidad"));
        int i = 0;
        while (i<listaClientes.size()) {
            if (Objects.equals(listaClientes.get(i).getNumeroDocumento(), numeroDocumento)){
                String actNombres = JOptionPane.showInputDialog("Digite los nombres del cliente:");
                listaClientes.get(i).setNombres(actNombres);
                String actApellidos = JOptionPane.showInputDialog("Digite los apellidos del cliente:");
                listaClientes.get(i).setApellidos(actApellidos);
                String actDireccion = JOptionPane.showInputDialog("Digite la direccion del cliente:");
                listaClientes.get(i).setDireccion(actDireccion);
                String actTelefono = JOptionPane.showInputDialog("Digite el numero de telefono:");
                listaClientes.get(i).setTelefono(actTelefono);
                JOptionPane.showMessageDialog(null, "***Se actualiza el cliente correctamente***\n\nNombres: " +  listaClientes.get(i).getNombres() + "\nApellidos: " + listaClientes.get(i).getApellidos() + "\nTipo de documento: " + listaClientes.get(i).getTipoDocumento() + "\nNumero de documento: " + listaClientes.get(i).getNumeroDocumento() + "\nTipo de cuenta: " + listaClientes.get(i).getTipoProducto() + "\nNumero de cuenta: " + listaClientes.get(i).getNumeroProducto() +"\n\nClic en OK para continuar");
                break;
            }
            i++;
            if(i== listaClientes.size()) {
                JOptionPane.showMessageDialog(null, "El cliente no existe");
            }
        }
    }
}
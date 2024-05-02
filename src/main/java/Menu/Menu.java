package Menu;
import Persona.Persona;
import Banco.Banco;
public class Menu {
    int menu;
    public int menu (){
        javax.swing.JOptionPane.showMessageDialog(null, "Bienvenidos al banco de Bogota\n¿Que deseas hacer el dia de hoy?\n*****************************\n1. Creacion de cliente nuevo\n2. Actualizacion de clientes de banco\n3. Buscar cliente por numero de identificacion\n4. Ver clientes banco\n5. Salir del sistema\n*****************************");
        menu= Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Que deseas realizar?"));

        do {
            switch (menu) {
                case 1:
                    javax.swing.JOptionPane.showMessageDialog(null, "Selecciono crear cliente nuevo, por favor agregar la informacion");
                    Banco.agregarCliente();
                    menu();
                    break;
                case 2:
                    javax.swing.JOptionPane.showMessageDialog(null, "Selecciono actualizacion de clientes, por favor ingrese numero de cedula");
                    Banco.actualizaCliente(0);
                    menu();
                    break;
                case 3:
                    javax.swing.JOptionPane.showMessageDialog(null, "Selecciono buscar clientes, por favor ingrese numero de identificacion del cliente");
                    Banco.buscarCliente(0);
                    menu();
                    break;
                case 4:
                    javax.swing.JOptionPane.showMessageDialog(null, "Selecciono ver cliente, a continuacion se desplegaran");
                    Banco.mostrarClientes();
                    menu();
                    break;
                default:
                    javax.swing.JOptionPane.showMessageDialog(null, "Gracias y que vuelvas pronto");
                    return 0;
            }
        }
        while (menu<5);
        return 0;
    }
}

/* Importamos todas las clases del
 * paquete java.util.*/
import java.util.*;
public class prueba {
    public static void main(String[] args) {

        // Declaro un objeto lectura para leer los datos
        // introducidos por el usuario.
        Scanner lectura=new Scanner(System.in);
        // Variabla para almacenar el nombre
        String miNombre="";
        // Variabla para almacenar la edad
        int edad=0; //
        // Pedimos el nombre al usuario
        System.out.println("Escribe tu nombre:");
        // Leemos el nombre y lo almacenamos en miNombre
        miNombre=lectura.nextLine();
        // Ahora pedimos su edad.
        System.out.println("Escribe tu edad");
        // Guardamos la edad.
        edad=lectura.nextInt();
        // Muestro un mensaje con el nombre y la edad
        System.out.println("Tu nombre es " + miNombre
                + "y tu edad es " + edad + " años.");
        // Mostramos que finalizó el programa
        System.out.println("Programa finalizado con éxito.");
        // Cerramos el objeto lectura para no consumir rescursos
        lectura.close();
    }
}

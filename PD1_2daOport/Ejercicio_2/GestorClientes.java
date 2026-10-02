//ERROR: No existe ningun tipo de documentacion, ni comentarios que expliquen la funcionalidad de la clase
import java.util.ArrayList;
import java.util.List;

//ERROR: Nombre GestorClientes muy generico, no dice que hace la clase
public class GestorClientes {

    //ERROR: el nombre "eliminarInactivos" puede ser mas especifico
    public static void eliminarInactivos(List<String> clientes, String inactivo) {
        
        //ERROR: Se modifica la lista mientras se esta recorriendo
        //puede generar errores de concurrencia
        for (String cliente : clientes) {

            //ERROR: la cadena compara referencias no contenido
            //usando "==" en lugar de .equals(), lo que puede generar errores
            if (cliente == inactivo) {
                clientes.remove(cliente);
            }
        }
    }

    public static void main(String[] args) {
        List<String> clientes = new ArrayList<>();
        clientes.add("Juan");
        clientes.add("Pedro");
        clientes.add(new String("Pedro"));
        eliminarInactivos(clientes, "Pedro");
        System.out.println(clientes);
    }
}
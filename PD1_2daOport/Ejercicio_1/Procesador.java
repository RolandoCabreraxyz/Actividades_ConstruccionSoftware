
//ERROR: No existe ningun tipo de documentacion, ni comentarios que expliquen la funcionalidad de la clase y el metodo
//ERROR: Nombre Procesador muy generico, no dice que procesa, o que hace la clase
public class Procesador {


    // ERROR: el nombre "datos" para el arreglo es poco ambiguo si no se sabe que tipo de datos se trabaja
    public static void procesar(int[] datos) {

        int i = 0;
        int suma = 0;

        while (i < datos.length) {

            //ERROR: el valor se suman antes de hacer la validacion de si es negativo o positivo
            suma += datos[i];

            if (datos[i] < 0) {
                System.out.println("Valor negativo encontrado, se omite");
                continue;
            }
            //ERROR: i++ en posicin incorrecta, debe ir antes del continue
            //dado a que esta despues del continue, esto genera un buble infinito
            i++;
        }
        //ERROR: no se imprime el resultado de la suma, solo se imprime el mensaje de que se omite el valor negativo
        //no tiene return
        System.out.println("Suma total: " + suma);
    }

    public static void main(String[] args) {
        int[] datos = {5, 10, -3, 8};

        procesar(datos);
    }
}
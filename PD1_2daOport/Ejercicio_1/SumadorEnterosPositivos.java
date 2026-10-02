/*
 * clase para sumar numeros enteros positivos y saltarse los negativos
 */
public class SumadorEnterosPositivos {

    /*
     * suma los numeros positivos o cero de un arreglo
     * los negativos los ignora
     * 
     * @throws IllegalArgumentException si el arreglo viene nulo
     */
    public static int sumarEnterosPositivos(int[] numeros) {

        if (numeros == null) {
            throw new IllegalArgumentException(
                "el arreglo no puede ser null."
            );
        }

        int sumaTotal = 0;

        for (int numero : numeros) {
            if (numero < 0) {
                continue;
            }

            sumaTotal += numero;
        }

        return sumaTotal;
    }

    /*
     * main para probar que el metodo funcione bien
     *
     */
    public static void main(String[] args) {

        int[] numerosPrueba = {5, 10, -3, 8};

        try {
            int resultado = sumarEnterosPositivos(numerosPrueba);

            System.out.println("Datos de entrada: 5, 10, -3, 8");
            System.out.println("Suma total: " + resultado);

        } catch (IllegalArgumentException exepcion) {
            System.out.println("Error: " + exepcion.getMessage());
        }
    }
}
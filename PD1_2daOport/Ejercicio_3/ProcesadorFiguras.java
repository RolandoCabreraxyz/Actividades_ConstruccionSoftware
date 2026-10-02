/**
 * Clase encargada de mostrar el area de diferentes figuras
 */
public class ProcesadorFiguras {

    /**
     * imprime el area de una figura utilizando polimorfismo.
     */
    public static void imprimirArea(Figuras figuras) {

        System.out.println(
            "Area: " + figuras.calcularArea()
        );
    }

    /**
     * Main para realizar pruebas
     */
    public static void main(String[] args) {

            Figuras rectangulo = new Rectangulo(4, 5);
            Figuras triangulo = new Triangulo(4, 5);

            imprimirArea(rectangulo);
            imprimirArea(triangulo);

    }
}
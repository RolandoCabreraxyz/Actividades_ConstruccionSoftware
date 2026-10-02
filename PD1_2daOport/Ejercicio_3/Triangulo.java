/**
 *  Clase que representa un triangulo con una base y una altura que hereda de la clase Figuras
 */
public class Triangulo extends Figuras {

    private double base;
    private double altura;

    /**
     * constructor
     */
    public Triangulo(double base, double altura) {

        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException(
                "La base y la altura deben ser mayores que cero."
                //mismo caso, tambien se pueden validar por separado, para dar un mensaje mas exacto
            );
        }

        this.base = base;
        this.altura = altura;
    }

    /**
     * metodo para calcular el area de la clase
     */
    
    //polimorfismo
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
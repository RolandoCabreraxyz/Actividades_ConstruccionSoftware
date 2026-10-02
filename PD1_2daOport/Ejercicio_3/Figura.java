//ERROR: No existe ningun tipo de documentacion, ni comentarios que expliquen la funcionalidad de la clase
//ERROR: Nombre Figura un poco implicito, no dice que hace o que figura representa
public class Figura {

    //ERROR: altura y base son publicos
    public double base;
    public double altura;

    public double calcularArea() {
        return base * altura;
    }
}

//ERROR: el error mas notable y visible es que existen varias clases
// en un mismo archivo, es una mala practica y no es tan recomendabel

public class Triangulo1 extends Figura {
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
//ERROR: la clase depende de la clase de figura
public class Procesador {
    public void imprimirArea(Figura figura) {
        //ERROR: uso inesenario de instanceof, ya que la clase 
        // Figura no tiene un metodo abstracto para calcular el area
        if (figura instanceof Triangulo1) {
            Triangulo t = (Triangulo1) figura;
            System.out.println("Área del triángulo: " + t.calcularArea());
        } else {
            System.out.println("Área: " + figura.calcularArea());
        }
    }

    //Error: no se usa polimorfismo, falta de encapsulamiento,
    //falta de abstraccion, y se violan los principios de 
    // abierto/cerrado y responsabilidad inica

    public static void main(String[] args) {
        Procesador p = new Procesador();
        Figura rectangulo = new Figura();
        rectangulo.base = 4;
        rectangulo.altura = 5;

        Triangulo triangulo = new Triangulo1();
        triangulo.base = 4;
        triangulo.altura = 5;

        p.imprimirArea(rectangulo);
        p.imprimirArea(triangulo);
    }
}
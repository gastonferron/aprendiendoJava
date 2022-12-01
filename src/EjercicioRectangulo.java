import java.util.Scanner;

public class EjercicioRectangulo {
    public static void main (String args []){
        var scanner = new Scanner(System.in);
        int alto;
        int ancho;

        System.out.println("Ingrese alto del rectangulo");
        alto = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese ancho del rectangulo");
        ancho = Integer.parseInt(scanner.nextLine());

        var area = alto * ancho;
        var perimetro = (alto + ancho) / 2;

        System.out.println("El area del rectangulo es " + area);
        System.out.println("El perimetro del rectangulo es " + perimetro);
    }
}

import java.util.Scanner;

public class EjercicioInstruccionesDeTareas {
    public static void main(String args[]) {
        var scanner = new Scanner(System.in);
        double calificacion;

        System.out.println("Ingrese su calificacion");

        calificacion = Double.parseDouble(scanner.nextLine());

        if (calificacion >= 9 && calificacion <= 10 ){
            System.out.println("Tu calificacion es A");
        }
        else if (calificacion >= 8 && calificacion < 9 ){
            System.out.println("Tu calificacion es B");
        }
        else if (calificacion >= 7 && calificacion < 8 ){
                System.out.println("Tu calificacion es C");
            }else if (calificacion >= 6 && calificacion < 7 ){
            System.out.println("Tu calificacion es D");
        }else if (calificacion >= 0 && calificacion < 6 ){
            System.out.println("Tu calificacion es F");
        }else{
            System.out.println("Tu calificacion es desconocida");
        }
    }
}

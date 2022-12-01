import java.util.Scanner;

public class EjercicioUnstruccionesDeTareas {
    public static void main (String args []){
        var scanner = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.println("Ingrese el primer numero");
        numero1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese el segundo numero");
        numero2 = Integer.parseInt(scanner.nextLine());

        var resultado = (numero1 > numero2) ? numero1 : numero2;
        System.out.println("El numero mayor es = " + resultado);
    }
}
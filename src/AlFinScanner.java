import java.util.Scanner;

public class AlFinScanner {
    public static void main (String args []){
        System.out.println("Escribe tu nombre");
        Scanner consola = new Scanner(System.in);
        var usuario = consola.nextLine();
        System.out.println("Usuario = " + usuario);
        System.out.println("Escribe tu Titulo");
        var titulo = consola.nextLine();
        System.out.println("Resultado : " + titulo + " " + usuario);
    }
}

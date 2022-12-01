import java.util.Scanner;

public class ConversionPrimitivos {
    public static void main (String args []){
        //Convertir tipo String a Int
        var edad = Integer.parseInt("20");
        System.out.println(edad);
        System.out.println("edad = " + (edad + 1));

        var varPi = Double.parseDouble("3.1416");
        System.out.println("Valor Pi = " + varPi);

        //Pedir un valor
        var consola = new Scanner(System.in);

        /* System.out.println("Proporciona tu edad");
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("edad = " + edad); */

        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);

        var caracter = "hola".charAt(0);
        System.out.println("caracter = " + caracter);

        System.out.println("Proporciona un caracter");
        caracter = consola.nextLine().charAt(0);
        System.out.println("Consola = " + caracter);
    }
}

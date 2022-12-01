import java.util.Scanner;

public class CondicionalIfElse {
    public static void main (String args []){
    /*
   //var condicion = true;
        var condicion = false;

        if (condicion == true){
            System.out.println("La condicion es verdadero");
        }
        else {
            System.out.println("La condicion es falsa");
        }

        //var numero = 2;
        var numero = 6;
        var numeroTexto = "Numero desconocido";

        if (numero == 1){
            numeroTexto = "Numero Uno";
        } else if (numero == 2) {
            numeroTexto = "Numero Dos";
        } else if (numero == 3) {
            numeroTexto = "Numero Tres";
        }
        else if (numero == 4){
            numeroTexto = "Numero Cuatro";
        }
        //else {
        //     numeroTexto = "Numero no encontrado";
        // }
        System.out.println("NumeroTexto = " + numeroTexto);
    */
        //var mes = 1;
        var scanner = new Scanner(System.in);
       // int  mes;
        var estacion = "Estacion desconocida";

        System.out.println("Ingrese el mes");
        var mes = Integer.parseInt(scanner.nextLine());

        if (mes == 1 || mes == 2 || mes == 12){
            estacion = "Invierno";
        }
        else if (mes == 3 || mes == 4 || mes == 5){
            estacion = "Primavera";
        }
        else if (mes == 6 || mes == 7 || mes == 8){
            estacion = "Verano";
        }
        else if (mes == 9 || mes == 10 || mes == 11){
            estacion = "Otoño";
        }
        System.out.println("estacion = " + estacion);
    }
}

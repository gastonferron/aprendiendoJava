import java.util.Scanner;

public class SenteciaSwitch {
    public static void main(String args[]) {
        /*
        * //var numero = 2;
        //var numero = 3;
        var numero = 8;
        var numeroTexto = "Valor Desconocido";

        switch (numero){
            case 1:
                numeroTexto = "Numero Uno";
                break;
            case 2:
                numeroTexto = "Numero Dos";
                break;
            case 3:
                numeroTexto = "Numero Tres";
                break;
            case 4:
                numeroTexto = "Numero Cuatro";
                break;
            default:
                numeroTexto = "Caso no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
        */

        //var mes = 1;
        var estacion = "Estacion Desconocida";
        //int mes;

        var scanner = new Scanner(System.in);

        System.out.println("Ingrese el mes");

        var mes = Integer.parseInt(scanner.nextLine());

        switch (mes){
            case 1: case 2: case 12:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otoño";
                break;
        }
    }
}

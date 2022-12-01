import java.util.Scanner;

public class SolicitaLibros {
    public static void main (String args []){

        var consola = new Scanner(System.in);

        String nombre;
        int id;
        double precio;
        boolean envioGratuito;

        System.out.println("Proporciona el nombre:");
        nombre = consola.nextLine();

        System.out.println("Proporciona el id:");
        id = Integer.parseInt(consola.nextLine());

        System.out.println("Proporciona el precio:");
        precio = Double.parseDouble(consola.nextLine());

        System.out.println("Proporciona el envio gratuito:");
        envioGratuito = Boolean.parseBoolean(consola.nextLine());

        System.out.println(nombre + " " + id);
        System.out.println("Precio:" +" "+ "$" + precio);
        if (envioGratuito == true){
            System.out.println("Envio gratuito:" + envioGratuito);
        }
        else {
            System.out.println("Envio gratuito:" + envioGratuito);
        }
    }
}
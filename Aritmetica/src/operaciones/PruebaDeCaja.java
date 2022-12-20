package operaciones;

public class PruebaDeCaja {
    public static void main(String[] args) {
        //Instancio la clase Caja
        Caja caja1 = new Caja();
        //Instancio el constructor con argumentos
        Caja caja2 = new Caja(3, 2, 6);
        //Ejecuto el metodo contruirCaja con los valores del constructor
        caja2.construirCaja();
    }
}

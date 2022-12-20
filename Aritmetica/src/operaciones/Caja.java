package operaciones;

public class Caja {
    //Declaro Variables
    int ancho;
    int alto;
    int profundo;

    //Constructor vacio
    public Caja (){
        System.out.println("Este constructor esta vacio");
    }
    //Constructor con argumentos
    public Caja(int an , int al ,int pro){
        this.ancho = an;
        this.alto = al;
        this.profundo = pro;
        System.out.println("Ejecutando contructor con argumentos");
    }
    //Metodo para calcular el volumen de la caja
    public void construirCaja(){
        int volumen;
        volumen = ancho * alto * profundo;

        System.out.println("El volumen de la caja es = " + volumen);
    }
}

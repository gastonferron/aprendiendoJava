package operaciones;

public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;

    //Constructor
    public Aritmetica(){
        System.out.println("Ejecutando constructor");
    }
    public Aritmetica(int a , int b){
         this.a = a;
         this.b = b;
        System.out.println("Ejecutando contructor con argumentos");
    }

    //Metodos
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    public int sumarConRetorno(){
        //int resultado = a + b;
        //return  resultado;
        return a + b;
        //return (a + b);
    }
    public int sumarConArgumentos(int a, int b){
        this.a = a;
        this.b = b;
        //return a + b;
        return this.sumarConRetorno();
    }
}

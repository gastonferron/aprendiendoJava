package pasoPorValor;

public class PasoPorValor {
    public static void main(String[] args) {
        //Declaro variable local e imprimo
        var x = 10;
        System.out.println("x = " + x);
        cambioValor(x);

        System.out.println("nuevo valor de x = " + x);

    }
    public static void cambioValor(int arg1){
        System.out.println("arg1 = " + arg1);

        arg1 = 15;
    }
}

package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        //Instancio la clase Aritmetica
        Aritmetica aritmetica1 = new Aritmetica();

        System.out.println("aritmetica1 a: = " + aritmetica1.a);
        System.out.println("aritmetica1 b: = " + aritmetica1.b);

        Aritmetica artimetica2 = new Aritmetica(5,8);
        System.out.println("artimetica2 a: = " + artimetica2.a);
        System.out.println("artimetica2 b: = " + artimetica2.b);

        //Declaro las variables a y b
        aritmetica1.a = 3;
        aritmetica1.b = 2;

        //Ejecuto el metodo para sumar a y b
        aritmetica1.sumar();

        //ejectua metoda sumarConRetorno
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado desde sumar con retorno = " + resultado);

        //Ejecuta metodo sumarConArgumentos
        resultado = aritmetica1.sumarConArgumentos(5 , 8);
        System.out.println("resultado con argumentos = " + resultado);
    }
}

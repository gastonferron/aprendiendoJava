public class Asignacion {
    public static void main (String args []){
        int a = 3, b=2;
        int c = a + 5 - b;

        System.out.println("El valor de c = " + c);

        a += 1;
        System.out.println("Valor a = " + a);

        a += 3;
        System.out.println("a = " + a);

        a-= 2;
        System.out.println("valor a = " + a);

        //Ejercicio * , / , %

        a*= 10;
        System.out.println("multi = " + a);

        a/= 2;
        System.out.println("division = " + a);

        a%=2;
        System.out.println("%" + a);
    }
}

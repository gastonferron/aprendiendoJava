public class OperadorTernarioi {
    public static void main (String args []){
        //var resutado = (3>2) ? "verdadero":"falso";
        var resutado = (1>2) ? "verdadero" : "falso";
        System.out.println("resutado = " + resutado);

        //var numero =9;
        var numero =8;
        resutado = (numero % 2 == 0) ? "numero par" : "numero impar";
        System.out.println("resultado = " + resutado);
    }
}

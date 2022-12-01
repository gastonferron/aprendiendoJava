//Segunda tarea
public class Tarea2 {
    public static void main(String args[]) {
        //Definimos la variable
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);

        //Modificamos el valor de la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);

        //Creamos una variable de tipo String
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);

        //Modificamos el valor de mivariableCadena
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);

        //var - Inferencia de tipos en Java
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);

        //Ejercicio hacer miVariableCadena2 con Var
        var miVariableCadena2 = "Chau";
        System.out.println(miVariableCadena2);

        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;
        //var áVariable = 10; No se recomienda utilizar
        //var #miVariable = 2 No se permite utilizar caracteres especiales
    }
}
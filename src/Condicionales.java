public class Condicionales {
    public static void main (String args []){
        //var a = 10;
        var a = -1;
        var valorMin = 0;
        var ValorMax = 10;

        var resultado = a >= 0 && a <= 10;

        if (resultado){
            System.out.println("Dentro de rango");
        }
        else{
            System.out.println("Fuera de rango");
        }

        //var vacaciones = false;
        var vacaciones = true;
        var diaDescanso = false;

        if (vacaciones || diaDescanso){
            System.out.println("Puede asistir al juego de su hijo");
        }
        else{
            System.out.println("El padre esta ocupado");
        }

    }
}

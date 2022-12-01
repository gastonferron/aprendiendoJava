public class IgualdadYRacionales {
    public static void main (String args []){
        var a = 3;
        var b = 2;
        var c = (a==b);

        System.out.println("c = " + c);
        
        var d = a != b;
        System.out.println("d = " + d);

        var cadena1 = "hola";
        var cadena2 = "Adios";
        var e = cadena1 == cadena2;//compara referencias de objetos

        System.out.println("e = " + e);

        var f = cadena1.equals(cadena2);//comparamos contenido de cadenas
        System.out.println("f = " + f);

        var g = a >= b;//mayor que > o mayor o igual >=
        System.out.println("g = " + g);

        if(a % 2== 0){
            System.out.println("Numero par");
        }
        else{
            System.out.println("Es numero Impar");
        }

        var edad  = 30;
        var adulto = 18;

        if (edad >= adulto){
            System.out.println("Es adulto");
        }
        else{
            System.out.println("Es menor de edad");
        }

    }
}

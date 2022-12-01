public class OperadoresUnarios {
    public static void main (String args []){
        //cambio de signo
        var a = 3;
        var b = -a;

        System.out.println("Valor a = " + a);
        System.out.println("Valor b = " + b);

        //Negacion boolean
        var c = true;
        var d = !c;

        System.out.println("Valor c = " + c);
        System.out.println("Valor d = " + d);

        //Incremento
        //Pre Incremento
        var e = 3;
        var f = ++e;

        System.out.println("Valor e = " + e);
        System.out.println("Valor f = " + f);
        //ambas valen 4

        //Post Incremento
        var g = 5;
        var h = g ++;

        System.out.println("Valor g = " + g);//Tenia pendiente un incremento
        System.out.println("Valor h = " + h);//Valor de g antes de incrementar

        //decremento
        //pre decremento
        var i = 2;
        var j = --i;
        System.out.println("Valor i = " + i);//ya esta decrementada
        System.out.println("Valor j = " + j);

        //post Decremento
        var k = 4;
        var l = k --;
        System.out.println("Valor k = " + k);//pendiente decremento
        System.out.println("Valor l = " + l);

    }
}

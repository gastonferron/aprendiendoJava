public class DatosPrimitivosFlotantes {
    public static void main (String args []){
        /*
        tipos primitivos de tipo flotante: float, double
         */
        float numeroFloat = (float) 3.4028235E38D;
        System.out.println("Numero float:" + numeroFloat);
        System.out.println("Valior minimo" + Float.MIN_VALUE);
        System.out.println("Valior maximo" + Float.MAX_VALUE);

        double numeroDouble = 1.7976931348623157E308;
        System.out.println("Numero double:" + numeroDouble);
        System.out.println("Valior minimo" + Double.MIN_VALUE);
        System.out.println("Valior maximo" + Double.MAX_VALUE);
    }
}

public class Concatenacion {
    public static void main (String args []){
        var usuario = "Gaston";
        var titulo = "Ayudante de Cocina";
        var union = titulo + " " + usuario;
            System.out.println("union = " + union);
        var  i = 3;
        var j = 4;

        System.out.println(i + j);//Se realiza suma de numeros
        System.out.println(i + j + usuario);//Evaluacion de izquierda a derecha realiza suma
        System.out.println(usuario + i + j);//contexto cadena, todo es cadena
        System.out.println(usuario + (i + j));//Prioridad de parentesis
    }
}

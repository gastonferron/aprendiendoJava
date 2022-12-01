package clases;

public class PruebaPersona {
    public static void main(String[] args) {
        //Instancia
        Persona persona1= new Persona();
        //Declaro valores
        persona1.nombre = "Gaston";
        persona1.apellido = "Ferron";
        //Utilizo el metodo para desplegar la data
        persona1.desplegarInfromacion();

        Persona persona2 = new Persona();
        System.out.println("persona1 = " + persona1);
        System.out.println("persona2 = " + persona2);

        persona2.desplegarInfromacion();

        persona2.nombre = "Karla";
        persona2.apellido = "Lara";

        persona2.desplegarInfromacion();
    }
}

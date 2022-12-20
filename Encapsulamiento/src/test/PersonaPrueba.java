package test;
import dominio.Persona;
public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Gaston" , 5000.00, false);
        System.out.println("Nombre de la persona 1: " + persona1.getNombre());

        //Siguiente clase toString
        System.out.println("persona1 " + persona1.toString());

        persona1.setNombre("Tony");
        //System.out.println("Nombre de la persona 1: " + persona1.getNombre());
        //System.out.println("Sueldo de persona 1 : " + persona1.getSueldo());
        //System.out.println("Eliminado de persona 1 : " + persona1.isEliminado());


        System.out.println("persona1 " + persona1.toString());

        //Ejercicio
        //Inicializo persona2
        Persona persona2 = new Persona("Daniel" , 20000.00, false);
        //Imprimo los valores actuales
        //System.out.println("Nombre de la persona 2: " + persona2.getNombre());
        //System.out.println("Sueldo de la persona 2: " + persona2.getSueldo());
        //System.out.println("Eliminado de la persona 2: " + persona2.isEliminado());
        System.out.println("persona2 " + persona2.toString());
        //Asigno nuevos valores
        persona2.setNombre("Daniel Patron");
        persona2.setSueldo(25000.50);
        persona2.setEliminado(true);
        //Imprimo los nuevos valores asignados
        //System.out.println("Nombre de la persona 2: " + persona2.getNombre());
        //System.out.println("Sueldo de la persona 2: " + persona2.getSueldo());
        //System.out.println("Eliminado de la persona 2: " + persona2.isEliminado());
        System.out.println("persona2 " + persona2.toString());
    }
}

package pasoPorReferencia;

import clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        //Persona persona1 = new Persona();
        //persona1.nombre = "Gaston";
        Persona persona1 = null;
        System.out.println("persona1 nombre = " + persona1.nombre);
        //cambiarValor(persona1);
        persona1 = cambiarValor(persona1);
        System.out.println("persona1 cambio = " + persona1.nombre);
    }
   // public static void cambiarValor(Persona persona){
  //      persona.nombre = "TuVieja";
  //  }
    public static Persona cambiarValor(Persona persona){
        if (persona == null){
            System.out.println("Valor de persona invalido : null");
            return null;
        }
        persona.nombre = "tuVieja";
        return persona;
    }
}

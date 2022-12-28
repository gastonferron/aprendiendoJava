package test;

import domain.Persona;

public class TestArreglosObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        //Caza chorros
        personas[0] = new Persona("MatiasDs");
        personas[1] = new Persona("Rodri");

        System.out.println("personas[0] = " + personas[0]);
        System.out.println("personas[1] = " + personas[1]);

        for (int i = 0; i < personas.length; i ++){
            System.out.println("personas "+ i + ":" + personas[i]);
        }
        
        String frutas[] = {"Naranja", "Banana","Uva","Mandarina"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("fruta "+i + " = " + frutas[i]);
        }
    }
}

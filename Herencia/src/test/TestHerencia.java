package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        var fecha = new Date();

        Empleado empleado1 = new Empleado("Gaston" , 5000);
        Cliente cliente1 = new Cliente(fecha,true,"ElSabrina", 'H',21, "ñeryCentro");

        System.out.println("empleado1 = " + empleado1);
        System.out.println("cliente1 = " + cliente1);
    }
}

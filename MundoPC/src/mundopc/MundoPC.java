package mundopc;

import com.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        Orden orden1 = new Orden();
        Monitor monitorA = new Monitor("Acer", 23);
        Teclado tecladoH = new Teclado("USB","HyperX");
        Raton ratonL = new Raton("USB", "Logitech");
        Computadora miComputadora = new Computadora("EltongasPC",monitorA,tecladoH,ratonL);

        Monitor monitor = new Monitor("Asus", 19);
        Teclado teclado = new Teclado("USB","Logitech");
        Raton raton = new Raton("Bluethoot", "Logitech");
        Computadora computadora = new Computadora("DaniPC",monitor,teclado,raton);

        Monitor monitorB = new Monitor("Acer", 27);
        Teclado tecladoB = new Teclado("USB","Ruidoso");
        Raton ratonB = new Raton("USB", "Logitech");
        Computadora miComputadoraB = new Computadora("KaibaPC",monitorB,tecladoB,ratonB);

        Monitor monitorC = new Monitor("Panavox", 13);
        Teclado tecladoC = new Teclado("Bluethoot","Razer");
        Raton ratonC = new Raton("Bluethoot", "Razer");
        Computadora miComputadoraC = new Computadora("ParguaPC",monitorC,tecladoC,ratonC);

        orden1.agregarComputadoras(miComputadora);
        orden1.agregarComputadoras(computadora);
        orden1.agregarComputadoras(miComputadoraB);
        orden1.agregarComputadoras(miComputadoraC);

        orden1.mostrarOrden();
    }
}

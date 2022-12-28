package com.mundopc;

public class Orden {
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;

    public Orden() {
        this.idOrden = ++ Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }
    public void agregarComputadoras(Computadora computadora){
        if (this.contadorComputadoras < this.MAX_COMPUTADORAS){
            this.computadoras[this.contadorComputadoras ++] = computadora;
        }
        else {
            System.out.println("Se ha llegado al limite de almacenaje de computadoras" + this.MAX_COMPUTADORAS);
        }
    }
    public void mostrarOrden(){
        System.out.println("Orden #:" + this.idOrden);
        System.out.println("Computadoras de la orden #:" + this.idOrden);
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i].toString());
        }
    }
}

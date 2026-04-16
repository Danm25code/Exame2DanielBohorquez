package co.edu.poli.examen2_DanielBohorquez.modelo;

public class Casa extends Inmueble {

    private int niveles;

    public Casa(String numero, String fechaCompra, boolean estado, Propietario propietario, int niveles) {
        super(numero, fechaCompra, estado, propietario);
        this.niveles = niveles;
    }

    public int getNiveles() {
        return niveles;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNiveles: " + niveles;
    }
}
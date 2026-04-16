package co.edu.poli.examen2_DanielBohorquez.modelo;

public class Apartamento extends Inmueble {

    private int piso;

    public Apartamento(String numero, String fechaCompra, boolean estado, Propietario propietario, int piso) {
        super(numero, fechaCompra, estado, propietario);
        this.piso = piso;
    }

    public int getPiso() {
        return piso;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPiso: " + piso;
    }
}
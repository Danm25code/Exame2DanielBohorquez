package co.edu.poli.examen2_DanielBohorquez.modelo;

public class Inmueble {

    protected String numero;
    protected String fechaCompra;
    protected boolean estado;
    protected Propietario propietario;

    public Inmueble(String numero, String fechaCompra, boolean estado, Propietario propietario) {
        this.numero = numero;
        this.fechaCompra = fechaCompra;
        this.estado = estado;
        this.propietario = propietario;
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public boolean isEstado() {
        return estado;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    @Override
    public String toString() {
        return "Número: " + numero +
                "\nFecha compra: " + fechaCompra +
                "\nEstado: " + estado +
                "\nPropietario: " + propietario;
    }
}
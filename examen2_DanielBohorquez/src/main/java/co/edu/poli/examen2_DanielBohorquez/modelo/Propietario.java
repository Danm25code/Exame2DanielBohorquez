package co.edu.poli.examen2_DanielBohorquez.modelo;

public class Propietario {

    private int id;
    private String nombre;

    public Propietario(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
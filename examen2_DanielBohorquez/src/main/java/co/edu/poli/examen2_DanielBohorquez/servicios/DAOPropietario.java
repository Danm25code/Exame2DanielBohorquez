package co.edu.poli.examen2_DanielBohorquez.servicios;

import co.edu.poli.examen2_DanielBohorquez.modelo.Propietario;
import java.util.ArrayList;
import java.util.List;

public class DAOPropietario {

    public List<Propietario> readall() {

        List<Propietario> lista = new ArrayList<>();

        lista.add(new Propietario(1, "Juan Perez"));
        lista.add(new Propietario(2, "Maria Lopez"));
        lista.add(new Propietario(3, "Carlos Torres"));

        return lista;
    }
}
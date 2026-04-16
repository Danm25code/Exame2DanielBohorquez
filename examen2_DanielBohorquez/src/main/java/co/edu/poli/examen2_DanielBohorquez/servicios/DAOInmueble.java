package co.edu.poli.examen2_DanielBohorquez.servicios;

import co.edu.poli.examen2_DanielBohorquez.modelo.Inmueble;
import java.util.HashMap;
import java.util.Map;

public class DAOInmueble {

    private static Map<String, Inmueble> base = new HashMap<>();

    public String create(Inmueble i) {

        if (base.containsKey(i.getNumero()))
            return "❌ El inmueble ya existe";

        base.put(i.getNumero(), i);

        return "✔ Inmueble guardado";
    }

    public Inmueble readone(String numero) {
        return base.get(numero);
    }
}
package co.edu.poli.examen2_DanielBohorquez.controlador;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import co.edu.poli.examen2_DanielBohorquez.modelo.*;
import co.edu.poli.examen2_DanielBohorquez.servicios.*;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ControlFormInmueble {

    @FXML
    private TextField txtNumeroConsulta;

    @FXML
    private TextArea txtResultado;

    @FXML
    private TextField txtNumeroCrear;

    @FXML
    private DatePicker dateCompra;

    @FXML
    private ComboBox<Propietario> cmbPropietario;

    @FXML
    private RadioButton radioApartamento;

    @FXML
    private RadioButton radioCasa;

    @FXML
    private TextField txtDatoExtra;

    private DAOInmueble daoInmueble;
    private DAOPropietario daoPropietario;

    @FXML
    private void initialize() {

        daoInmueble = new DAOInmueble();
        daoPropietario = new DAOPropietario();

        dateCompra.setValue(LocalDate.now());

        List<Propietario> lista = daoPropietario.readall();
        cmbPropietario.getItems().setAll(lista);
    }

    @FXML
    private void pressConsulta() {

        txtResultado.clear();

        Inmueble i = daoInmueble.readone(txtNumeroConsulta.getText());

        if (i != null)
            txtResultado.setText(i.toString());
        else
            mostrar("No existe el inmueble");
    }

    @FXML
    private void pressCrear() {

        String numero = txtNumeroCrear.getText();

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fecha = dateCompra.getValue().format(f);

        Propietario p = cmbPropietario.getValue();

        int extra = Integer.parseInt(txtDatoExtra.getText());

        Inmueble nuevo;

        if (radioApartamento.isSelected())
            nuevo = new Apartamento(numero, fecha, true, p, extra);
        else
            nuevo = new Casa(numero, fecha, true, p, extra);

        String r = daoInmueble.create(nuevo);

        mostrar(r);
    }

    private void mostrar(String m) {

        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText(m);
        a.show();
    }
}
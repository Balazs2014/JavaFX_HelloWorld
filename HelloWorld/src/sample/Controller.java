package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {

    @FXML
    private ListView<Ember> emberLista;
    @FXML
    private Spinner<Integer> eletkorBevitel;
    @FXML
    private TextField nevBevitel;
    @FXML
    private Label eletkorLabel;
    @FXML
    public void felvetelClick() {
        String nev = nevBevitel.getText();
        int eletkor = eletkorBevitel.getValue();

        Ember ember = new Ember(nev, eletkor);
        emberLista.getItems().add(ember);
    }

    @FXML
    public void helloClick() {
        String nev = nevBevitel.getText();
        Alert felugroAblak = new Alert(Alert.AlertType.NONE);
        felugroAblak.setTitle("Ciga");
        felugroAblak.setHeaderText("Sziasztok Ciga");
        felugroAblak.setContentText("Csumi " + nev);
        felugroAblak.getButtonTypes().add(ButtonType.OK);
        felugroAblak.showAndWait();
        eletkorLabel.setText("Csumi" );
    }
}

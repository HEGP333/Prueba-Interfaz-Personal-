import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class ControllerCosa {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAvanzaHora;

    @FXML
    private Button btnAvanzaMinuto;

    @FXML
    private Button btnAvanzaSegundo;

    @FXML
    private Button btnRetrocedeHora;

    @FXML
    private Button btnRetrocedeMinuto;

    @FXML
    private Button btnRetrocedeSegundo;

    @FXML
    private ImageView imgAmogus;

    @FXML
    private Label lblHorario;

    @FXML
    private Label lblHoras;

    @FXML
    private Label lblMinutero;

    @FXML
    private Label lblMinutos;

    @FXML
    private Label lblSecundero;

    @FXML
    private Label lblSegundos;

    @FXML
    private Label lblTitulo;

    @FXML
    private TextField txtHoras;

    @FXML
    private TextField txtMinutos;

    @FXML
    private TextField txtSegundos;
    
    private Reloj reloj;

    @FXML
    void avanzarHora(ActionEvent event) {
        reloj.avanzarHoras();
        actualizarGUI();
    }

    @FXML
    void avanzarMinuto(ActionEvent event) {
        reloj.avanzarMinutos();
        actualizarGUI();
    }

    @FXML
    void avanzarSegundo(ActionEvent event) {
        reloj.avanzarSegundos();
        actualizarGUI();
    }

    @FXML
    void retrocederHora(ActionEvent event) {
        reloj.retrocederHoras();
        actualizarGUI();
    }

    @FXML
    void retrocederMinuto(ActionEvent event) {
        reloj.retrocederMinutos();
        actualizarGUI();
    }

    @FXML
    void retrocederSegundo(ActionEvent event) {
        reloj.retrocederSegundos();
        actualizarGUI();
    }
    
    private void actualizarGUI(){
        String horas = String.valueOf(reloj.getHoras());
        String minutos = String.valueOf(reloj.getMinutos());
        String segundos = String.valueOf(reloj.getSegundos());
        
        txtHoras.setText(horas);
        txtMinutos.setText(minutos);
        txtSegundos.setText(segundos);
    }

    @FXML
    void initialize() {
        assert btnAvanzaHora != null : "fx:id=\"btnAvanzaHora\" was not injected: check your FXML file 'Vista.fxml'.";
        assert btnAvanzaMinuto != null : "fx:id=\"btnAvanzaMinuto\" was not injected: check your FXML file 'Vista.fxml'.";
        assert btnAvanzaSegundo != null : "fx:id=\"btnAvanzaSegundo\" was not injected: check your FXML file 'Vista.fxml'.";
        assert btnRetrocedeHora != null : "fx:id=\"btnRetrocedeHora\" was not injected: check your FXML file 'Vista.fxml'.";
        assert btnRetrocedeMinuto != null : "fx:id=\"btnRetrocedeMinuto\" was not injected: check your FXML file 'Vista.fxml'.";
        assert btnRetrocedeSegundo != null : "fx:id=\"btnRetrocedeSegundo\" was not injected: check your FXML file 'Vista.fxml'.";
        assert imgAmogus != null : "fx:id=\"imgAmogus\" was not injected: check your FXML file 'Vista.fxml'.";
        assert lblHorario != null : "fx:id=\"lblHorario\" was not injected: check your FXML file 'Vista.fxml'.";
        assert lblHoras != null : "fx:id=\"lblHoras\" was not injected: check your FXML file 'Vista.fxml'.";
        assert lblMinutero != null : "fx:id=\"lblMinutero\" was not injected: check your FXML file 'Vista.fxml'.";
        assert lblMinutos != null : "fx:id=\"lblMinutos\" was not injected: check your FXML file 'Vista.fxml'.";
        assert lblSecundero != null : "fx:id=\"lblSecundero\" was not injected: check your FXML file 'Vista.fxml'.";
        assert lblSegundos != null : "fx:id=\"lblSegundos\" was not injected: check your FXML file 'Vista.fxml'.";
        assert lblTitulo != null : "fx:id=\"lblTitulo\" was not injected: check your FXML file 'Vista.fxml'.";
        assert txtHoras != null : "fx:id=\"txtHoras\" was not injected: check your FXML file 'Vista.fxml'.";
        assert txtMinutos != null : "fx:id=\"txtMinutos\" was not injected: check your FXML file 'Vista.fxml'.";
        assert txtSegundos != null : "fx:id=\"txtSegundos\" was not injected: check your FXML file 'Vista.fxml'.";
        
        //eso
        reloj = new Reloj(0, 0, 0);
        actualizarGUI();
    }
}

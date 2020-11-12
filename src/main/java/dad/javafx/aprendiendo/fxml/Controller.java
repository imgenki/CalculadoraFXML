package dad.javafx.aprendiendo.fxml;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class Controller implements Initializable {
	
	CalculadoraModel calc = new CalculadoraModel();
	
	@FXML
	private GridPane view;
	
	@FXML
	private TextField resultadoText;
	
	@FXML
	private Button nueveButton; 
	
	@FXML
	private Button sieteButton; 
	
	@FXML
	private Button ochoButton; 
	
	@FXML
	private Button borrarTodoButton; 
	
	@FXML
	private Button borrarButton; 
	
	@FXML
	private Button cuatroButton; 
	
	@FXML
	private Button cincoButton; 
	
	@FXML
	private Button seisButton; 
	
	@FXML
	private Button multiplicarButton; 
	
	@FXML
	private Button dividirButton; 
	
	@FXML
	private Button unoButton; 
	
	@FXML
	private Button dosButton; 
	
	@FXML
	private Button tresButton; 
	
	@FXML
	private Button restarButton; 
	
	@FXML
	private Button igualButton; 
	
	@FXML
	private Button ceroButton; 
	
	@FXML
	private Button comaButton; 
	
	@FXML
	private Button sumarButton; 
	
	@FXML 
	void onNueveButtonAction(ActionEvent e){
		calc.insertar('9');
    	resultadoText.setText(calc.getPantalla());
	}
	
	@FXML 
	void onOchoButtonAction(ActionEvent e){
		calc.insertar('8');
    	resultadoText.setText(calc.getPantalla());
	}
	
	@FXML 
	void onSieteButtonAction(ActionEvent e){
		calc.insertar('7');
    	resultadoText.setText(calc.getPantalla());
	}
	
	@FXML 
	void onSeisButtonAction(ActionEvent e){
		calc.insertar('6');
    	resultadoText.setText(calc.getPantalla());
	}
	
	@FXML 
	void onCincoButtonAction(ActionEvent e){
		calc.insertar('5');
    	resultadoText.setText(calc.getPantalla());
	}
	
	@FXML 
	void onCuatroButtonAction(ActionEvent e){
		calc.insertar('4');
    	resultadoText.setText(calc.getPantalla());
	}
	
	@FXML 
	void onTresButtonAction(ActionEvent e){
		calc.insertar('3');
    	resultadoText.setText(calc.getPantalla());
	}
	
	@FXML 
	void onDosButtonAction(ActionEvent e){
		calc.insertar('2');
    	resultadoText.setText(calc.getPantalla());
	}
	
	@FXML 
	void onUnoButtonAction(ActionEvent e){
		calc.insertar('1');
    	resultadoText.setText(calc.getPantalla());
	}
	
	@FXML 
	void onCeroButtonAction(ActionEvent e){
		calc.insertar('0');
    	resultadoText.setText(calc.getPantalla());
	}
	
	@FXML 
	void onBorrarButtonAction(ActionEvent e){
		calc.borrar();
		resultadoText.setText(calc.getPantalla());
	}
	
	@FXML 
	void onBorrarTodoButtonAction(ActionEvent e){
		calc.borrarTodo();
		resultadoText.setText(calc.getPantalla());
	}
	
	@FXML 
	void onIgualButtonAction(ActionEvent e){
		calc.operar(CalculadoraModel.IGUAL);
		resultadoText.setText(calc.getPantalla());
	}
	
	@FXML 
	void onSumarButtonAction(ActionEvent e){
		calc.operar(CalculadoraModel.SUMAR);
		resultadoText.setText(calc.getPantalla());
	}
	
	@FXML 
	void onRestarButtonAction(ActionEvent e){
		calc.operar(CalculadoraModel.RESTAR);
		resultadoText.setText(calc.getPantalla());
	}
	
	@FXML 
	void onMultiplicarButtonAction(ActionEvent e){
		calc.operar(CalculadoraModel.MULTIPLICAR);
		resultadoText.setText(calc.getPantalla());
	}
	
	@FXML 
	void onDividirButtonAction(ActionEvent e){
		calc.operar(CalculadoraModel.DIVIDIR);
		resultadoText.setText(calc.getPantalla());
	}
	
	@FXML 
	void onComaButtonAction(ActionEvent e){
		calc.insertarComa();
		resultadoText.setText(calc.getPantalla());
	}
	public Controller() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/View.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	public GridPane getView() {
		return view;
	}

}

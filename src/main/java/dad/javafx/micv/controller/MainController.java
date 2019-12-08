package dad.javafx.micv.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.javafx.micv.model.CV;
import dad.javafx.micv.model.Personal;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;

public class MainController implements Initializable {

	@FXML
	private BorderPane root;

	@FXML
	private MenuBar MenuBar;

	@FXML
	private Menu firstMenu;

	@FXML
	private Menu secondMenu;

	@FXML
	private TabPane TabPane;

	@FXML
	private Tab personalTab;

	@FXML
	private Tab contactoTab;

	@FXML
	private Tab formacionTab;

	@FXML
	private Tab experienciaTab;

	@FXML
	private Tab conocimientosTab;

	// model
	PersonalController personal = new PersonalController();
	ContactoController contacto = new ContactoController();
	FormacionController formacion = new FormacionController();
	ExperienciaController experiencia = new ExperienciaController();
	ConocimientosController conocimiento = new ConocimientosController();

	CV model = new CV();

	public MainController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MainView.fxml"));
		loader.setController(this);
		loader.load();
	}

	public BorderPane getView() {
		return root;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		model.personalProperty().bindBidirectional(personal.getModel().personalProperty());
		model.contactoProperty().bindBidirectional(contacto.getModel().contactoProperty());
		model.formacionProperty().bindBidirectional(experiencia.getModel().formacionProperty());
		model.experienciasProperty().bindBidirectional(experiencia.getModel().experienciasProperty());
		model.habilidadesProperty().bindBidirectional(conocimiento.getModel().habilidadesProperty());

		personalTab.setContent(personal.getView());
		contactoTab.setContent(contacto.getView());
		formacionTab.setContent(formacion.getView());
		experienciaTab.setContent(experiencia.getView());
		conocimientosTab.setContent(conocimiento.getView());

	}

	@FXML
	void onNuevoAction(ActionEvent event) {
		model = new CV();
	
	}

	@FXML
	void onAbrirAction(ActionEvent event) {
	}

	@FXML
	void onGuardarAction(ActionEvent event) {

	}

	@FXML
	void onGuardarComoAction(ActionEvent event) {

	}

	@FXML
	void onSalirAction(ActionEvent event) {
	}

}

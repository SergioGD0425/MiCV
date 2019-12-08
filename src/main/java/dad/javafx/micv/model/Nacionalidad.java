package dad.javafx.micv.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Nacionalidad {
	
	private StringProperty nacionalidad = new SimpleStringProperty();

	public final StringProperty nacionalidadProperty() {
		return this.nacionalidad;
	}
	

	public final String getNacionalidad() {
		return this.nacionalidadProperty().get();
	}
	

	public final void setNacionalidad(final String nacionalidad) {
		this.nacionalidadProperty().set(nacionalidad);
	}
	
	@Override
	public String toString() {
		return nacionalidad.getValue();
	}
	
	@Override
	public boolean equals(Object nac) {
		if(!(nac instanceof Nacionalidad ))return false;
		Nacionalidad aux = (Nacionalidad) nac;
		return this.getNacionalidad().equals(aux.getNacionalidad());
	}
	
}

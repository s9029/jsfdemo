package web;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIForm;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;
import javax.faces.model.ListDataModel;
import javax.faces.validator.ValidatorException;
import javax.inject.Inject;
import javax.inject.Named;

import project.*;

import services.*;


@SessionScoped
@Named("autoBean")
public class AutoFormBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Auto auto = new Auto(AutoType.Limuzyna, null , 0, 0);

	private ListDataModel<Auto> cars = new ListDataModel<Auto>();

	@Inject
	private AutoDBManager autoDBManager;

	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}
	
	public String addAuto() {
		auto.setAutoType(AutoType.valueOf(auto.getAutoTypeString()));
		autoDBManager.addAuto(auto);
		return "showCars";
	}
		
	public ListDataModel<Auto> getAllCars() {
		cars.setWrappedData(autoDBManager.getAllCars());
		return cars;
	}


	public void deleteAuto() {
		Auto autoToDelete = cars.getRowData();
		autoDBManager.deleteAuto(autoDBManager.findAutoByModel(autoToDelete.getModel()));
	}




}

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
@Named("motorcycleBean")
public class MotorcycleFormBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Motorcycle motorcycle = new Motorcycle(Brand.Aprillia, null , 0, 0);

	private ListDataModel<Motorcycle> motorcycles = new ListDataModel<Motorcycle>();

	@Inject
	private MotoDBManager motoDBManager;

	public Motorcycle getMotorcycle() {
		return motorcycle;
	}

	public void setMotorcycle(Motorcycle motorcycle) {
		this.motorcycle = motorcycle;
	}
	
	public String addMotorcycle() {
		motorcycle.setBrand(Brand.valueOf(motorcycle.getBrandString()));
		motoDBManager.addMotorcycle(motorcycle);
		return "showMotorcycles";
	}
		
	public ListDataModel<Motorcycle> getAllMotorcycle() {
		motorcycles.setWrappedData(motoDBManager.getAllMotorcycles());
		return motorcycles;
	}


	public void deleteMotorcycle() {
		Motorcycle motorcycleToDelete = motorcycles.getRowData();
		motoDBManager.deleteMotorcycle(motoDBManager.findMotorcycleByModel(motorcycleToDelete.getModel()));
	}




}

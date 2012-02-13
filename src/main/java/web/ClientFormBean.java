package web;

import java.io.Serializable;
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
@Named("clientBean")
public class ClientFormBean implements Serializable {

	private static final long serialVersionUID = 1L;

	Client client = new Client(null, null);

	ListDataModel<Client> clients = new ListDataModel<Client>();

	@Inject
	ClientDBManager clientDBManager = new ClientDBManager();

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public String addClient() {
		clientDBManager.addClient(client);
		return "showClient";
	}
		
	public ListDataModel<Client> getAllClients() {
		clients.setWrappedData(clientDBManager.getAllClient());
		return clients;
	}


	public void deleteClient() {
		Client clientToDelete = clients.getRowData();
		clientDBManager.deleteClient(clientDBManager.findClientBySurname(clientToDelete.getSurname()));
	}


}

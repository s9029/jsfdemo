package project;
//
import java.util.*;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class Client {

	public String firstName;
	public String surname;
	
	List<Auto> listOfCars = new ArrayList<Auto>();

	public Client(String firstName, String surname) {
		this.firstName = firstName;
		this.surname = surname;
		this.listOfCars = new ArrayList<Auto>();
		
	}
	
	@Size(min = 1)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Size(min = 1)
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public List<Auto> getListOfCars() {
		return listOfCars;
	}

	public void setlistOfAuto(List<Auto> listOfAuto) {
		this.listOfCars = listOfAuto;
	}
}
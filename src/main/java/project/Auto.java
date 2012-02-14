package project;
//
public class Auto {

	public AutoType autoType;
	public String model;
	public int price;
	public int yearOfManufacture;
	public String autotypeString;
	
	public Auto(AutoType autoType, String model, int price, int yearOfManufacture){
		this.autoType = autoType;
		this.model = model;
		this.price = price;
		this.yearOfManufacture = yearOfManufacture;
		this.autotypeString = autotypeString;
	}
	
	public void printAuto(){
	System.out.println("Typ i model: " + this.autoType + " " + this.model + "\t Cena wypozyczenia: " + this.price +" zl" + "\tRocznik: " + this.yearOfManufacture);
	}

	public AutoType getAutoType() {
		return autoType;
	}

	public void setAutoType(AutoType autoType) {
		this.autoType = autoType;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}
	
	public String getAutoTypeString() {
		return autotypeString;
	}

	public void setAutoTypeString(String autotypeString) {
		this.autotypeString = autotypeString;
	}


	 
	}
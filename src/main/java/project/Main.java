package project;

import services.MotoDBManager;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotoDBManager dbMoto = new MotoDBManager();
		dbMoto.addMotorcycle(new Motorcycle(Brand.Honda, "CBR", 7000, 1996));
	}

}

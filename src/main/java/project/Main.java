package project;

import services.AutoDBManager;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoDBManager dbAuto = new AutoDBManager();
		dbAuto.addAuto(new Auto(AutoType.VAN, "Mercedes Vito", 1000, 1996));
	}

}

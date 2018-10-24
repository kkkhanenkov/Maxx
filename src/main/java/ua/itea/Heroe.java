package ua.itea;

public class Heroe {
	private String NAME;
	private String ULTIMATE;
	private int ID;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getULTIMATE() {
		return ULTIMATE;
	}
	public void setULTIMATE(String uLTIMATE) {
		ULTIMATE = uLTIMATE;
	}
	@Override
	public String toString() {
		return "Heroe [NAME=" + NAME + ", ULTIMATE=" + ULTIMATE + ", ID=" + ID + "]";
	}
	
	

}

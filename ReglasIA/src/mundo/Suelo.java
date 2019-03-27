
package mundo;

public class Suelo {

	public static final String ALCALINO = "alcalino";
	public static final String LIGERAMENTE_ALCALINO = "alcalino";
	public static final double ALTA = 1000;
	public static final double BAJA = 1000;
	private double ph;
	private double conductividadElectrica;
	private double arcilla;
	private double arena;
	private double limo;
	private String PH;
	
	
	public String getPH() {
		return PH;
	}

	public void setPH(String pH) {
		PH = pH;
	}

	public double getPh() {
		return ph;
	}

	public void setPh(double ph) {
		this.ph = ph;
	}

	public double getConductividadElectrica() {
		return conductividadElectrica;
	}

	public void setConductividadElectrica(double conductividadElectrica) {
		this.conductividadElectrica = conductividadElectrica;
	}

	public double getArcilla() {
		return arcilla;
	}

	public void setArcilla(double arcilla) {
		this.arcilla = arcilla;
	}

	public double getArena() {
		return arena;
	}

	public void setArena(double arena) {
		this.arena = arena;
	}

	public double getLimo() {
		return limo;
	}

	public void setLimo(double limo) {
		this.limo = limo;
	}
	
	
}


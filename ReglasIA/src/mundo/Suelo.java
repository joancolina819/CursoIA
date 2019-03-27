package mundo;

public class Suelo {
	
	private double ph;
	private double conductividadElectrica;
	private double arcilla;
	private double arena;
	private double limo;
	
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

	public double getPh() {
		return ph;
	}

	public void setPh(double ph) {
		this.ph = ph;
	}
	
}

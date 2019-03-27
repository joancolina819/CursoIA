package mundo;

public class AnalisisSuelo {

	private Suelo suelo;

	public void rule0() {
		if (suelo.getPh()>7.2) {
			System.out.println("\n\n\n");
	        System.out.println("==> ph: ALCALINO");
		}
	}
	
	public void rule1() {
		if (suelo.getPh()>6.8&&suelo.getPh()<6.8) {
			System.out.println("\n\n\n");

	        System.out.println("==> ph: LIGERAMENTE ALCALINO");
		}
	}
	
	public void rule2() {
		if (suelo.getPh()>=6.2&&suelo.getPh()<=6.8) {
			System.out.println("\n\n\n");

	        System.out.println("==> ph: NEUTRO");
		}
	}
}

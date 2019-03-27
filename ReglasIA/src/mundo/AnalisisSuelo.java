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
	
	public void rule3() {
		if (suelo.getPh()>=5.2&&suelo.getPh()<=6.2) {
			System.out.println("\n\n\n");

	        System.out.println("==> ph: LIGERAMENTE ACIDO");

		}
	}
	
	
	public void rule4() {
		if (suelo.getPh()<=5.6) {
			System.out.println("\n\n\n");

	        System.out.println("==> ph: ACIDO");

		}
	}
	public void rule5() {
		if (suelo.getConductividadElectrica()<=0.8) {
			System.out.println("\n\n\n");

	        System.out.println("==> conductividadElectrica: BAJA");


		}
	}
	
	public void rule6() {
		if (suelo.getConductividadElectrica()>=0.8) {
			System.out.println("\n\n\n");

	        System.out.println("==> conductividadElectrica: ALTA");

		}
	}
	
	public void rule7() {
		if (suelo.getPH()==Suelo.ALCALINO) {
			System.out.println("\n\n\n");

	        System.out.println("==> ExtractoSoluble: True");

		}
	}
	
	public void rule8() {
		if (suelo.getPH()==Suelo.LIGERAMENTE_ALCALINO) {
			System.out.println("\n\n\n");

	        System.out.println("==> ExtractoSoluble: True");


		}
	}
	
	public void rule9() {
		if (suelo.getArcilla()>=40.0&&suelo.getPH()==Suelo.ALCALINO&&suelo.getConductividadElectrica()==Suelo.ALTA) {
			System.out.println("\n\n\n");

	        System.out.println("==> ExtractoSoluble: True");


		}
	}
	
	
	
}

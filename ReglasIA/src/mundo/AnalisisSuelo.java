
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

			 System.out.println("     |-(1) Limitaciones de movimiento de agua");

		        System.out.println("     |-(2) Baja difusion de Oxigeno y flujo de gases");    

		        System.out.println("     |-(3) Baja mineralizacion de MO (Baja actvidad microbiologica");

		        System.out.println("     |-(4) Acumulacion de iones alcalinoterreos	");
		}
	}

	public void rule10() {
		if (suelo.getArena()>=50.0&&suelo.getPH()==Suelo.ALCALINO&&suelo.getConductividadElectrica()==Suelo.ALTA) {
			System.out.println("\n\n\n");

			

	        System.out.println("     |-(1) Revisar las mediciones realizadas.");
		}
	}
	
	public void rule11() {
		if (suelo.getLimo()>=45.0&&suelo.getPH()==Suelo.ALCALINO&&suelo.getConductividadElectrica()==Suelo.ALTA) {
			System.out.println("\n\n\n");


	        System.out.println("     |-(1) Coloraciones grises suelo (Glaizeado)");

	        System.out.println("     |-(2) Suelo Hidromorfico");    

	        System.out.println("     |-(3) Limitaciones fisicas temporales");

	        System.out.println("     |-(4) Baja difusion de Oxigeno y flujo de gases");
		}
	}
	
	public void rule12() {
		if (suelo.getLimo()<=40.0&&suelo.getArena()<=40.0&&suelo.getArcilla()<=40.0&&suelo.getPH()==Suelo.ALCALINO&&suelo.getConductividadElectrica()==Suelo.ALTA) {
			System.out.println("\n\n\n");



	        System.out.println("     |-(1) Baja disponibilidad de Fosforo (Precipitación)");

	        System.out.println("     |-(2) Baja disponibilidad de Calcio");  
		}
	}
	
	public void rule13() {
		if (suelo.getArcilla()>=40.0&&suelo.getPH()==Suelo.ALCALINO&&suelo.getConductividadElectrica()==Suelo.BAJA) {
			System.out.println("\n\n\n");




	        System.out.println("     |-(1) Limitaciones de movimiento de agua");

	        System.out.println("     |-(2) Baja difusion de Oxigeno y flujo de gases");    

	        System.out.println("     |-(3) Baja mineralizacion de MO (Baja actvidad microbiologica");

	        System.out.println("     |-(4) Acumulacion de iones alcalinoterreos	");

	        System.out.println("     |-(5) Baja disponibilidad de elementos menores ");

	        
		}
	}
	
	public void rule14() {
		if (suelo.getArena()>=50.0&&suelo.getPH()==Suelo.ALCALINO&&suelo.getConductividadElectrica()==Suelo.BAJA) {
			System.out.println("\n\n\n");





	        System.out.println("     |-(1) Revisar las mediciones realizadas.");

	        
		}
	}
	
	public void rule15() {
		if (suelo.getLimo()>=45.0&&suelo.getPH()==Suelo.ALCALINO&&suelo.getConductividadElectrica()==Suelo.BAJA) {
			System.out.println("\n\n\n");



	        System.out.println("     |-(1) Coloraciones grises suelo (Glaizeado)");

	        System.out.println("     |-(2) Suelo Hidromorfico");    

	        System.out.println("     |-(3) Limitaciones fisicas temporales");

	        System.out.println("     |-(4) Baja difusion de Oxigeno y flujo de gases");

	        System.out.println("     |-(5) Baja disponibilidad de elementos menores ");
	        
		}
	}
	
	public void rule16() {
		if (suelo.getLimo()<=40.0&&suelo.getArcilla()<=40.0&&suelo.getArena()<=40.0&&suelo.getPH()==Suelo.ALCALINO&&suelo.getConductividadElectrica()==Suelo.ALTA) {
			System.out.println("\n\n\n");



			 System.out.println("     |-(1) Baja disponibilidad de Fosforo (Precipitación)");

		        System.out.println("     |-(2) Baja disponibilidad de Calcio");   

		        System.out.println("     |-(3) Baja disponibilidad de elementos menores "); 

		}
	}
	
	public void rule17() {
		if (suelo.getArcilla()>=40.0&&suelo.getPH()==Suelo.LIGERAMENTE_ALCALINO&&suelo.getConductividadElectrica()==Suelo.ALTA) {
			System.out.println("\n\n\n");




	        System.out.println("     |-(1) Limitaciones de movimiento de agua");

	        System.out.println("     |-(2) Baja difusion de Oxigeno y flujo de gases");    

	        System.out.println("     |-(3) Baja mineralizacion de MO (Baja actvidad microbiologica");

	        System.out.println("     |-(4) Acumulacion de iones alcalinoterreos	");

	        System.out.println("     |-(5) Alta saturación de calcio");

	        System.out.println("     |-(6) Salinidad en el suelo");

	        System.out.println("     |-(7) Baja disponibilidad de Fosforo (Precipitación)");

		}
	}
	
	
	public void rule18() {
		if (suelo.getArena()>=50.0&&suelo.getPH()==Suelo.LIGERAMENTE_ALCALINO&&suelo.getConductividadElectrica()==Suelo.ALTA) {
			System.out.println("\n\n\n");



			  System.out.println("     |-(1) Revisar las mediciones realizadas.");

		}
	}
	
	public void rule19() {
		if (suelo.getLimo()>=45.0&&suelo.getPH()==Suelo.LIGERAMENTE_ALCALINO&&suelo.getConductividadElectrica()==Suelo.ALTA) {
			System.out.println("\n\n\n");

			 System.out.println("     |-(1) Coloraciones grises suelo (Glaizeado)");

		        System.out.println("     |-(2) Suelo Hidromorfico");    

		        System.out.println("     |-(3) Limitaciones fisicas temporales");

		        System.out.println("     |-(4) Baja difusion de Oxigeno y flujo de gases");
		}
	}
	
	public void rule20() {
		if (suelo.getLimo()<=40.0&&suelo.getArena()<=40.0&&suelo.getArcilla()<=40.0&&suelo.getPH()==Suelo.LIGERAMENTE_ALCALINO&&suelo.getConductividadElectrica()==Suelo.ALTA) {
			System.out.println("\n\n\n");

	        System.out.println("     |-(1) Baja disponibilidad de Fosforo (Precipitación)");

	        System.out.println("     |-(2) Baja disponibilidad de Calcio");  
		}
	}
	
	public void rule21() {
		if (suelo.getArcilla()>=40.0&&suelo.getPH()==Suelo.LIGERAMENTE_ALCALINO&&suelo.getConductividadElectrica()==Suelo.ALTA) {
			System.out.println("\n\n\n");


	        System.out.println("     |-(1) Limitaciones de movimiento de agua");

	        System.out.println("     |-(2) Baja difusion de Oxigeno y flujo de gases");    

	        System.out.println("     |-(3) Baja mineralizacion de MO (Baja actvidad microbiologica");

	        System.out.println("     |-(4) Acumulacion de iones alcalinoterreos	");

	        System.out.println("     |-(5) Baja disponibilidad de elementos menores ");

		}
	}
	
	public void rule22() {
		if (suelo.getArena()>=50.0&&suelo.getPH()==Suelo.LIGERAMENTE_ALCALINO&&suelo.getConductividadElectrica()==Suelo.BAJA) {
			System.out.println("\n\n\n");



	        System.out.println("     |-(1) Revisar las mediciones realizadas.");
		}
	}
	
	
	public void rule23() {
		if (suelo.getLimo()>=45.0&&suelo.getPH()==Suelo.LIGERAMENTE_ALCALINO&&suelo.getConductividadElectrica()==Suelo.BAJA) {
			System.out.println("\n\n\n");
			

	        System.out.println("     |-(1) Coloraciones grises suelo (Glaizeado)");

	        System.out.println("     |-(2) Suelo Hidromorfico");    

	        System.out.println("     |-(3) Limitaciones fisicas temporales");

	        System.out.println("     |-(4) Baja difusion de Oxigeno y flujo de gases");

	        System.out.println("     |-(5) Baja disponibilidad de elementos menores ");
		}
	}
	
	public void rule24() {
		if (suelo.getLimo()<=40.0&&suelo.getArcilla()<=40.0&&suelo.getArena()<=40.0&&suelo.getPH()==Suelo.LIGERAMENTE_ALCALINO&&suelo.getConductividadElectrica()==Suelo.ALTA) {
			System.out.println("\n\n\n");
			

			 System.out.println("     |-(1) Baja disponibilidad de Fosforo (Precipitación)");

		        System.out.println("     |-(2) Baja disponibilidad de Calcio");   

		        System.out.println("     |-(3) Baja disponibilidad de elementos menores "); 

		}
	}
	
	
	
	public void rule29() {
		
		if(suelo.getArcilla()>40.0) {
		System.out.println("     |-(1) Baja mineralizacion de MO (Baja actvidad microbiologica)	");
        System.out.println("     |-(2) Baja difusion de Oxigeno y flujo de gases");    
        System.out.println("     |-(3) Salinidad en el suelo");
		}
	}
	
}
	
	
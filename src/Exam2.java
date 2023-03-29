import java.util.ArrayList;
import java.util.Scanner;

public class Exam2 {
	
	public static Scanner entrada = new Scanner(System.in);
	public static ArrayList<BegudesSenseSucre>llistaBegudesSS = new ArrayList<BegudesSenseSucre>();
	public static ArrayList<BegudesEnsucrades>llistaBegudesEnsucrades = new ArrayList<BegudesEnsucrades>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcio;
		
		do {
		
		System.out.println("Introdueix l´opció desitjada: \n1. Crear Beguda"
				+ "\n2. Veure Beguda"
				+ "\n3. Eliminar Beguda"
				+ "\n4. Preu total de les Begudes d´una Marca"
				+ "\n5. Preu total de les Begudes Ensucrades"
				+ "\n6. Preu total de les Begudes Sense Sucre"
				+ "\n7. Preu total de les Begudes al magatzem"
				+ "\n0. Sortir");
		
		opcio = entrada.nextInt();
		
		switch(opcio) {
		
		case 1: crearBeguda();
			break;
		case 2: veureBeguda();
			break;
		case 3: eliminarBeguda();
			break;
		case 4: System.out.println("El preu total de la marca escollida es de " + getPreuMarca() + " Euros.");
			System.out.println("");
			break;
		case 5:  System.out.println("El preu total de les begudes de la prestatgeria de "
				+ "begudes ensucrades es de " + getPreuBens() + " Euros.");
			System.out.println("");
			break;
		case 6: System.out.println("El preu total de les begudes de la prestatgeria de "
				+ "begudes Sense Sucre es de " + getPreuBss() + " Euros.");
			System.out.println("");
			break;
		case 7: System.out.println("El preu total de les begudes del magatem es de " +
				 (getPreuBss() + getPreuBens()) + " Euros.");
			System.out.println("");
			break;
		case 0: 
			System.out.println("Adéu!");
			break;
		default:
			System.out.println("L´opció escollida no es vàlida!");
			System.out.println("");
		}
		
		
	}while(opcio != 0);
	}
		
		public static void crearBeguda() {
			int opcio;
			
			do {
			
			System.out.println("Introdueix l´opció desitjada: \n1. Crear Beguda Ensucrada"
					+ "\n2. Crear Beguda Sense Sucre"
					+ "\n0. Sortir");
			
			opcio = entrada.nextInt();
			
			switch(opcio) {
			
			case 1: crearBegudaEn();
				break;
			case 2: crearBegudaSS();
				break;
			case 0: 
				System.out.println("Adéu!");
				System.out.println("");
				break;
			default:
				System.out.println("L´opció escollida no es vàlida!");
				System.out.println("");
			}
			
			
		}while(opcio != 0);
			
		}
		
		
		public static void crearBegudaEn() {
			
			int id = (int)Math.round(Math.random()*10000);
			float llitres;
			float preu;
			String marca;
			int sucre;
			int promocio;
			int j = 0;
			boolean endW = false;
			int posBegSS = -1;
			
			while(j < llistaBegudesEnsucrades.size() && !endW) {
				BegudesEnsucrades begudaTrovada = llistaBegudesEnsucrades.get(j);
				
				if(id == begudaTrovada.getId()) {
					endW = true;
					posBegSS = j;		
				}
			j++;
			}
			if(endW) {
				System.out.println(llistaBegudesEnsucrades.get(posBegSS).toString());
				System.out.println("La beguda no es pot crear, ID ja existent!");
			}else {		
				entrada.nextLine();
				System.out.println("Introdueix els llitres de recipient de la beguda: ");
				llitres = entrada.nextFloat();
				System.out.println("Introdueix el preu de la beguda: ");
				preu = entrada.nextFloat();
				entrada.nextLine();
				System.out.println("Introdueix la marca de la beguda: ");
				marca = entrada.nextLine();
				System.out.println("Introdueix el percentatge de sucre de la beguda");
				sucre = entrada.nextInt();
				System.out.println("Introdueix el percentatge de la promoció de la beguda:");
				promocio = entrada.nextInt();
				
				BegudesEnsucrades BegEn0 = new BegudesEnsucrades(id,llitres,preu,marca,sucre,promocio);
				llistaBegudesEnsucrades.add(BegEn0);	
			}
		}
		
		public static void crearBegudaSS() {
			
			int id = 10000 + (int)Math.round(Math.random()*10000);
			float llitres;
			float preu;
			String marca;
			String origen;
			int j = 0;
			boolean endW = false;
			int posBegSS = -1;
			
			while(j < llistaBegudesSS.size() && !endW) {
				BegudesSenseSucre begudaTrovada = llistaBegudesSS.get(j);
				
				if(id == begudaTrovada.getId()) {
					endW = true;
					posBegSS = j;		
				}
			j++;
			}
			if(endW) {
				System.out.println(llistaBegudesSS.get(posBegSS).toString());
				System.out.println("La beguda no es pot crear, ID ja existent!");
			}else {
				
				entrada.nextLine();
				System.out.println("Introdueix els llitres de recipient de la beguda: ");
				llitres = entrada.nextFloat();
				System.out.println("Introdueix el preu de la beguda: ");
				preu = entrada.nextFloat();
				entrada.nextLine();
				System.out.println("Introdueix la marca de la beguda: ");
				marca = entrada.nextLine();
				System.out.println("Introdueix l´origen de la beguda: ");
				origen = entrada.nextLine();
				
				BegudesSenseSucre BegSS0 = new BegudesSenseSucre(id,llitres,preu,marca,origen);
				llistaBegudesSS.add(BegSS0);
			}
				
		}
	
		public static void veureBeguda() {
			
			int opcio;
			
			do {
			
			System.out.println("Introdueix l´opció desitjada: \n1. Veure Beguda Ensucrada"
					+ "\n2. Veure Beguda Sense Sucre"
					+ "\n0. Sortir");
			
			opcio = entrada.nextInt();
			
			switch(opcio) {
			
			case 1: veureBegudaEns();
				break;
			case 2: veureBegudaSS();
				break;
			case 0: 
				System.out.println("");
				break;
			default:
				System.out.println("L´opció escollida no es vàlida!");
				System.out.println("");
			}
			
			
		}while(opcio != 0);
			
		}
		
		public static void veureBegudaSS() {
			
			int id;
			int j = 0;
			boolean endW = false;
			int posBegSS = -1;
			
			for(int i = 0; i < llistaBegudesSS.size();i++) {
			System.out.println(llistaBegudesSS.get(i).getId());
			}
			System.out.println("");
			entrada.nextLine();
			System.out.println("Introdueix l´ID de la beguda Sense Sucre que vols cercar: ");
			id = entrada.nextInt();
			
			while(j < llistaBegudesSS.size() && !endW) {
				BegudesSenseSucre begudaTrovada = llistaBegudesSS.get(j);
				
				if(id == begudaTrovada.getId()) {
					endW = true;
					posBegSS = j;		
				}
			j++;
			}
			if(endW) {
				System.out.println(llistaBegudesSS.get(posBegSS).toString());
			}else {
				System.out.println("La cerca no ha trovat resultats!");
				System.out.println("");
			}
		}
		
		public static void veureBegudaEns() {
	
			int id;
			int j = 0;
			boolean endW = false;
			int posBegSS = -1;
			
			for(int i = 0; i < llistaBegudesEnsucrades.size();i++) {
			System.out.println(llistaBegudesEnsucrades.get(i).getId());
			}
			System.out.println("");
			entrada.nextLine();
			System.out.println("Introdueix l´ID de la beguda Ensucrada que vols cercar: ");
			id = entrada.nextInt();
			
			while(j < llistaBegudesEnsucrades.size() && !endW) {
				BegudesEnsucrades begudaTrovada = llistaBegudesEnsucrades.get(j);
				
				if(id == begudaTrovada.getId()) {
					endW = true;
					posBegSS = j;		
				}
			j++;
			}
			if(endW) {
				System.out.println(llistaBegudesEnsucrades.get(posBegSS).toString());
			}else {
				System.out.println("La cerca no ha trovat resultats!");
				System.out.println("");
			}
		}
		
		public static void eliminarBeguda() {
			
			int opcio;
			
			do {
			
			System.out.println("Introdueix l´opció desitjada: \n1. Eliminar Beguda Ensucrada"
					+ "\n2. Eliminar Beguda Sense Sucre"
					+ "\n0. Sortir");
			
			opcio = entrada.nextInt();
			
			switch(opcio) {
			
			case 1: eliminarBegudaEns();
				break;
			case 2: eliminarBegudaSS();
				break;
			case 0: 
				System.out.println("");
				break;
			default:
				System.out.println("L´opció escollida no es vàlida!");
				System.out.println("");
			}
			
			
		}while(opcio != 0);
			
		}
		
		public static void eliminarBegudaEns() {
			
			int id;
			int j = 0;
			boolean endW = false;
			int posBegSS = -1;
			String opcio;
			
			for(int i = 0; i < llistaBegudesEnsucrades.size();i++) {
			System.out.println(llistaBegudesEnsucrades.get(i).toString());
			}
			System.out.println("");
			entrada.nextLine();
			System.out.println("Introdueix l´ID de la beguda Ensucrada que vols eliminar: ");
			id = entrada.nextInt();
			
			while(j < llistaBegudesEnsucrades.size() && !endW) {
				BegudesEnsucrades begudaTrovada = llistaBegudesEnsucrades.get(j);
				
				if(id == begudaTrovada.getId()) {
					endW = true;
					posBegSS = j;		
				}
			j++;
			}
			if(endW) {
				System.out.println(llistaBegudesEnsucrades.get(posBegSS).toString());
				System.out.println("");
				entrada.nextLine();
				System.out.println("Vols eliminar aquesta beguda S/N: ");
				opcio = entrada.next();
				
				if(opcio.equalsIgnoreCase("s")) {
					llistaBegudesEnsucrades.remove(posBegSS);
					System.out.println("Beguda eliminada amb èxit!");
					System.out.println("");
				}else {
					System.out.println("Eliminació avortada!");
					System.out.println("");
				}
				
			}else {
				System.out.println("La cerca no ha trovat resultats!");
				System.out.println("");
			}			
		}
		
		public static void eliminarBegudaSS() {
			
			int id;
			int j = 0;
			boolean endW = false;
			int posBegSS = -1;
			String opcio;
			
			for(int i = 0; i < llistaBegudesSS.size();i++) {
			System.out.println(llistaBegudesSS.get(i).toString());
			}
			
			System.out.println("");
			entrada.nextLine();
			System.out.println("Introdueix l´ID de la beguda Sense Sucre que vols eliminar: ");
			id = entrada.nextInt();
			
			while(j < llistaBegudesSS.size() && !endW) {
				BegudesSenseSucre begudaTrovada = llistaBegudesSS.get(j);
				
				if(id == begudaTrovada.getId()) {
					endW = true;
					posBegSS = j;		
				}
			j++;
			}
			if(endW) {
				System.out.println(llistaBegudesSS.get(posBegSS).toString());
				System.out.println("");
				entrada.nextLine();
				System.out.println("Vols eliminar aquesta beguda S/N: ");
				opcio = entrada.next();
				
				if(opcio.equalsIgnoreCase("s")) {
					llistaBegudesSS.remove(posBegSS);
					System.out.println("Beguda eliminada amb èxit!");
					System.out.println("");
				}else {
					System.out.println("Eliminació avortada!");
					System.out.println("");
				}
				
			}else {
				System.out.println("La cerca no ha trovat resultats!");
				System.out.println("");
			}
			
		}
		
		public static float getPreuBss() {
			
			float preuBss = 0f;
			
			for(int i = 0; i < llistaBegudesSS.size();i++) {
				BegudesSenseSucre BssTrovada = llistaBegudesSS.get(i);
				preuBss += BssTrovada.getPreu();
			}
			
			return preuBss;
		}
		
	public static float getPreuBens() {
			
			float preuBens= 0f;
			
			for(int i = 0; i < llistaBegudesEnsucrades.size();i++) {
				BegudesEnsucrades BssTrovada = llistaBegudesEnsucrades.get(i);
				preuBens += BssTrovada.getPreu();
			}
			
			return preuBens;
		}
	
	public static float getPreuMarca() {
		
		String marca;
		int posBegSS = -1;
		float preuSS = 0;
		float preuEn = 0;
		
		entrada.nextLine();
		System.out.println("Introdueix la marca de la beguda: ");
		marca = entrada.nextLine();
		
		for(int j = 0; j < llistaBegudesSS.size();j++) {
			BegudesSenseSucre begudaTrovada = llistaBegudesSS.get(j);
			
			if(marca.equalsIgnoreCase(begudaTrovada.getMarca())) {		
				posBegSS = j;	
				preuSS += llistaBegudesSS.get(posBegSS).getPreu();
			}
		}
		for(int j = 0; j < llistaBegudesEnsucrades.size();j++) {
			BegudesEnsucrades begudaTrovada = llistaBegudesEnsucrades.get(j);
			
			if(marca.equalsIgnoreCase(begudaTrovada.getMarca())) {		
				posBegSS = j;	
				preuEn += llistaBegudesEnsucrades.get(posBegSS).getPreu();
			}
		}
	
		return (preuSS + preuEn);
	}
	
	}



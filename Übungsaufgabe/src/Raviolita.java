import java.util.Scanner;

public class Raviolita {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double pi = Math.PI;
		
		System.out.print("Bitte geben sie den Umfang der Dose in cm an:");
		double u = scanner.nextInt();
		
		System.out.print("Bitte geben sie die Höhe der Dose in cm an:");
		double h = scanner.nextInt();
		
		scanner.close();
		
		double l_diag = Math.sqrt(Math.pow(u, 2.0) + Math.pow(h, 2.0));
		double d_boden = u/pi;
		double f_boden = pi*Math.pow(d_boden/2, 2.0);
		double f_mantel = u*h;
		double f_gesamt = 2*f_boden + f_mantel;
		double volumen = f_boden * h; 
		
		System.out.print("Laenge der Diagonalen des Blechstuecks: "+ l_diag+ "cm"+"\n" + "Durchmesssssssser des Dosenbodens: "+ d_boden+"cm"+"\n"+ "Flaeche des Dosenbodens: "+ f_boden+"cm"+"\n" + "Mantelflaeche der Dose: "+ f_mantel+"cm"+"\n"+
				"Gesamtflaeche der Dose: " + f_gesamt+"cm"+"\n"+ "Volumen der Dose: "+volumen );
		
	}

}

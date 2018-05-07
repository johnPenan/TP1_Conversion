import java.util.Scanner;

public class Tp_Conversion {

	public static void main(String[] args) {
		// Déclaration des variables
		double resC = 0.0d, resF = 0.0d, conversionC = 0.0d, conversionF = 0.0d;
		int choix;
		double arrondC, arrondF;
		Scanner sc = new Scanner(System.in);
		char reponse = 'O';
		while (reponse == 'O') {
			System.out.println("Choisissez le mode de conversion:");
			System.out.println("1- Convertisseur Celsius - Fahrenheit");
			System.out.println("2- Convertisseur Fahrenheit - Celsius");
			choix = sc.nextInt();
			if (choix == 1) {
				System.out.println("Température à convertir: ");
				conversionC = sc.nextDouble();
				resF = (9 * conversionC) / 5 + 32;
				arrondF = arrondi(resF, 2);
				System.out.println(conversionC + " °C correspond à " + arrondF + " °F");
				sc.nextLine();
			} else if (choix == 2) {
				System.out.println("Température à convertir: ");
				conversionF = sc.nextDouble();
				resC = ((conversionF - 32) * 5) / 9;
				arrondC = arrondi(resC, 2);
				System.out.println(conversionF + " °F correspond à " + arrondC + " °C");
				sc.nextLine();
			} else {
				System.out.println("Veillez choisir le bon mode de conversion...!");
				sc.nextLine();
			}
			reponse = ' ';
			while (reponse != 'O' && reponse != 'N') {
				System.out.println("Voulez-vous continuer ? (O/N)");
				reponse = sc.nextLine().charAt(0);
			}
		}
		System.out.println("Au revoir...!");
	}
	//méthode pour arrondir les resultats des conversions.
	public static double arrondi(double A, int B) {
		return (double) ((int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
	}

}

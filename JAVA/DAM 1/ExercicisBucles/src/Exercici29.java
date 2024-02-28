import java.util.Random;
import java.util.Scanner;
public class Exercici29 {

	public static void main(String[] args) {
/*
		70. Fer un joc en el qual l�ordinador s�inventar� dos n�mero (entre el 1 i el 100) i l�usuari haur� de dir quin �s el
		resultat de la seva multiplicaci�. Si l�usuari l�encerta guanya i se li mostr� un missatge de guanyador. Si l�usuari
		no indica correctament el resultat de la multiplicaci� anir� introduint valors fins que l�encerti. Al finalitzar se li
		preguntar� si vol fer un altre partida, en cas afirmatiu el proc�s torna a comen�ar.
 */
		Scanner e = new Scanner(System.in);
		Random random = new Random();
		int max = 100;int min = 1;
		boolean jugar = true;
		int numU,numDos,j;
		String menu;
		
		while(true) {
			numU = random.nextInt(max - min)+min;
			numDos = random.nextInt(max - min)+min;
			while(jugar == true) {
				System.out.printf("OPERACIO: %d � %d = ",numU,numDos);j = e.nextInt();
				if ((numU*numDos) == j) {
					System.out.println("GUANYADOR!");
					jugar = false;
				}
			}
			System.out.println("Vols tornar a fer un altre partida? (s/N) > ");menu = e.next();
			if (menu.charAt(0) == 'S' || menu.charAt(0) =='s') {
				jugar=true;
			}
			else if (menu.charAt(0) == 'N' || menu.charAt(0) =='n') {
				break;
			}
			else {
				System.err.println("�Caracter No Valido!");
			}
		}
	}
}

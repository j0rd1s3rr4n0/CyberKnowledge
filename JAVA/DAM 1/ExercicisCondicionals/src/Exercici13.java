import java.util.Random;
import java.util.Scanner;
public class Exercici13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* L�ordinador pensa un n�mero entre 1 i 10, l�usuari l�intenta encertar, si es aix� mostrar un
		 * missatge d�enhorabona en cas contrari indicar que ha fallat.
		 */
		int randnum,choose,vides;
		vides = 3;
		String pista;
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		randnum = rand.nextInt(9)+1;
		
		while(vides > 0) {
			System.out.print("Number: ");
			choose = input.nextInt();	
			
			if (choose == randnum) {
				System.out.println("\nEnhorabona! El nombre correste es: "+randnum);
				break;
			}else {
				pista ="";
				if (choose > randnum) {
					pista = "M�s petit"; 
				}
				else if (choose < randnum) {
					pista = "M�s gran";	
				}
				vides-=1;
				System.out.println("\nHas Fallat.\nPista: "+pista+"\nVides Restants: "+vides);
			}				
		}
	}
}

import java.util.Scanner;
import java.util.Random;
public class Exercici27 {

	public static void main(String[] args) {
		/*
		 * 68. Fer un joc en el qual l�ordinador s�inventi un n�mero entre el 1 i el 100. Per cada intent el jugador intentar�
		encertar el n�mero. En el cas de que l�encerti el joc finalitzar�, en cas contrari se li haur� d�indicar al jugador
		si el n�mero es m�s gran o m�s petit que el que ha d�encertar. Al final, una vegada el jugador hagi encertat el
		n�mero, se li mostrar� quantes oportunitats ha necessitat per endevinar el n�mero.
		 */
		Scanner e = new Scanner(System.in);
		Random random = new Random();
		int max = 100;
		int min = 1;
		int num = random.nextInt(max - min)+min;
		int i = 0; // Intents
		//System.out.println(num);
		int turn = 0;
		while(turn != num) {
			System.out.print("Numero del 1-100> ");
			turn = e.nextInt(); // Tria Jugador
			if (turn > num) {
				System.out.println("Mes baix");
				i++;
			}
			else {
				System.out.println("Mes Alt");
				i++;
			}
		}
		System.out.printf("\nENHORABONA! EL NUMERO ERA %d.\nNUMERO D' INTENTS: %d",num,i);
	}
	

	}


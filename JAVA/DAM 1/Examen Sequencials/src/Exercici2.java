import java.util.Scanner;
public class Exercici2 {

	public static void main(String[] args) {
		//VARIABLES
		double numU,numDos,numTres,minim,maxim,dif;
		Scanner input = new Scanner(System.in);
		
		//INPUT USUARI
		System.out.print("Num 1:");numU = input.nextDouble();
		System.out.print("Num 2:");numDos = input.nextDouble();
		System.out.print("Num 3:");numTres = input.nextDouble();
		
		// CALCULS
		if (numU != numDos && numDos != numTres && numU != numTres) {
			if(numU > numDos && numU > numTres) {
				if (numDos > numTres) {
					minim = numTres;	
				}
				else {
					minim = numDos;
				}
				maxim = numU;
			}
			else if(numU < numDos && numDos > numTres) {
				if (numU > numTres) {
					minim = numTres;	
				}
				else {
					minim = numU;
				}
				maxim = numDos;
			}
			else {
				if (numU > numDos) {
					minim = numDos;
				}
				else {
					minim = numU;
				}
				maxim = numTres;
			}
		}
		
		else {
			maxim = numU;
			minim = numU;	
		}
		
		// INPUT MENU USUARI + OUTPUT
		System.out.println("m.- Nom�s mostrar el m�s gran\nt.- Mostrar el m�s gran i el m�s petit\nx.- Mostrar el m�s gran, el m�s petit i la difer�ncia entre ells");
		char opcio = input.next().charAt(0);
		switch(opcio) {
			case 'M':;
			case 'm':System.out.println("El m�s gran: " + (int)maxim);break;
			case 'T':;
			case 't':System.out.println("El m�s gran: " + (int)maxim+"\nEl m�s petit: " + (int)minim);break;
			case 'X':;
			case 'x':dif=maxim-minim;System.out.println("El m�s gran: " + (int)maxim+"\nEl m�s petit: " + (int)minim+"\nDiferencia �s " + (int)dif+" ("+(int)maxim+"+"+(int)minim+")");break;
		}		
	}
}

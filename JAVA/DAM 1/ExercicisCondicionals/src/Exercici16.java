import java.util.Scanner;
public class Exercici16 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*  Fer un programa que permet� calcular descomptes segons unes premises donades per
		*	l'usuari, les regles i passos a seguir son els seg�ents:
		*	� Decidir quin �s el valor m�nim per optar al descompte, quin percentatge es
		*	descomptar� i el valor m�xim possible.
		*	� Demanar que s�introdueixi el preu inicial, en euros, pel teclat.
		*	� Llegir-lo.
		*	� Comprovar que el preu �s correcte i no �s negatiu.
		*	� Si es compleix, veure si el preu introdu�t �s igual o superior al valor m�nim per
		*	optar al descompte.
		*	� Si �s aix�, calcular el descompte.
		*	� Comprovar si el descompte supera el m�xim permissible.
		*	� Si �s aix�, el descompte es redueix al m�xim permissible.
		*	� Aplicar el descompte sobre el preu inicial.
		*	� Mostrar el preu final.
		*	� Si el preu era negatiu, mostrar un missatge d�error.
		*/
		
		//VARIABLES
		double valorminim,valormaxim,descompte,valorinicial,preufinal;
		Scanner user = new Scanner(System.in);/*
		valorminim = 1;
		descompte = 1;
		valormaxim = 1;
*/
		System.out.print("Valor minim per optar a descompte (�) > ");valorminim = user.nextDouble();
		System.out.print("Decompte (%) > ");descompte = user.nextDouble();
		System.out.print("Valor maxim possible (�) > ");valormaxim = user.nextDouble();
		// VALOR INICIAL
		System.out.print("Valor Inicial (�) > ");valorinicial = user.nextDouble();
		
		
		//CONDICIONALS
		if(valorinicial >= 0){
			if(valorinicial >= valorminim) {
				//CALCULAR DESCOMPTE
				if (descompte > valormaxim) {
					descompte = 0;		
				}
				//CALCULAR PREUFINAL
				preufinal = valorinicial - (valorinicial * (descompte/100));
				System.out.println("PREU FINAL: "+preufinal+" �");
			}
		}
		else {
			//MISSATGE ERROR
			System.out.println("ERROR - NO SE PUEDEN A�ADIR VALORES NEGATIVOS");
		}
		user.close();
		
	}

}

import java.util.Scanner;
public class Exercici28 {

	public static void main(String[] args) {
		/*
			69. Fer un programa per entrar (car�cter a car�cter) un text (no buit) acabat pel car�cter �/�. El car�cter �*�
			significa final de l�nia. Entre les diferents paraules podr� haver-hi m�s d� una espai en blanc o b� un asterisc. El
			programa haur� d� escriure el n�mero de l�nies, el n�mero de paraules i el de car�cters diferents de � �, �*�, �/�
			que hi ha en el text.
			Exemple: LA CASA ESTAVA* MOLT MACA* PER� AVUI JA*NO TANT *//*
			Car�cters 36 Paraules 10 L�nies 4
		*/
		Scanner e = new Scanner(System.in);
		int caracters = 0;
		int paraules = 0;
		int linea = 0;
		char simbols = ' ';
		
		
		while(simbols!='/') {
			
			System.out.print("Caracter > ");String Text = e.nextLine();
			if (Text == "") {
				System.err.println("No es permet introduir text buit");
				System.out.print("Caracter > ");
				Text = e.nextLine();
			}
			simbols = Text.charAt(0);
			
			
			if ( simbols ==' ') {
				paraules++;
			}
			else if ( simbols =='*') {
				linea++;
				paraules++;
			}
			else if (simbols !='/') {
				caracters ++;
			}
		}
		System.out.printf("INFORMACIO DELS PARAMETRES INTRODUITS:\nCARACTERS: %d\nLINIES:%d\nPARAULES: %d",caracters,linea,paraules);
	}
}

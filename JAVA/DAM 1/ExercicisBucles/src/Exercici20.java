import java.util.Scanner;
public class Exercici20 {

	public static void main(String[] args) {
		// �dem anterior per� ara heu de dir el nombre de car�cters diferents de A
		
		String a;
		int i = 0;
		Scanner e = new Scanner(System.in);
		System.out.println("Text:");
		while(true) {
			a = e.nextLine();
			if (a ==""){
				System.out.printf("S'ha repetit 'a' %d vegades",i);
				break;
			}
			else {
				char s = a.charAt(0);
				if (s!='a'||s!='A') {
					i++;
				}
			}
		}
	}
}

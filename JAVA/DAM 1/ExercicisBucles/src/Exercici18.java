import java.util.Scanner;
public class Exercici18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Fer un programa de validaci� d�una data. Heu de tenir en compte els anys de trasp�s. Aquesta data la llegireu
		com tres n�meros enters (dia, mes i any). En cas que la data sigui correcta s� escriur� data correcta i en cas
		contrari data incorrecta (per simplificar es considerar� que a excepci� del Febrer tots els mesos tenen 30 dies)

		 */
		boolean g = true;
		Scanner e = new Scanner(System.in);
		boolean status;
		
		while(g == true) {
			System.out.print("DIA: ");int dia = (int)e.nextInt();
			System.out.print("MES: ");int mes = (int)e.nextInt();
			System.out.print("ANY: ");double any = (int)e.nextInt();
			
			//ANY TRASPAS
			if (any/4 == (int)any/4) {
				status = true;
			}
			else {
				status = false;
			}
			
			if (status == false) {
				if ((dia<30&&dia>0)&&(mes<13&&dia>0)&&((int)any>0)) {
					if (mes==2&&dia<=29) {
						System.out.println("ERROR FEBRERO NO TIENE "+dia+" dias");
						g = true;
					}
					else if (mes==2&&dia>=28) {
						System.out.println(dia+"/"+mes+"/"+(int)any);
						g = false;
					}	
					else {
						System.out.println(dia+"/"+mes+"/"+(int)any);
						g = true;
					}
				}
				else {
					System.out.println("ERROR FECHA INCORRECTA");
					g = false;
				}
			}
			else {
				if ((dia<30&&dia>0)&&(mes<13&&dia>0)&&(any>0)) {
					if (mes==2&&dia<=30) {
						System.out.println("ERROR FEBRERO NO TIENE "+dia+" dias");
						g = true;
					}
					else if (mes==2&&dia>=29) {
						System.out.println(dia+"/"+mes+"/"+(int)any);
						g = false;
					}	
					else {
						System.out.println(dia+"/"+mes+"/"+(int)any);
						g = true;
					}
				}
				else {
					System.out.println("ERROR FECHA INCORRECTA");
					g = false;
				}
			}

		}
	}
}

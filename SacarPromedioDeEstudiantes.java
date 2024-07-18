package Ejercicio;

import java.util.Scanner;

public class SacarPromedioDeEstudiantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int TP, A, E, NF, C;
		do {
			System.out.println("Ingrese la cantidad de estudiantes");
			 C = new Scanner(System.in).nextInt();
		} while (C<0);

		
		do {
			System.out.println("Ingrese el nombre del estudiante");
			String N = new Scanner(System.in).next();
			
			do {	
			System.out.println("Trabajo Practico");
			 TP = new Scanner(System.in).nextInt();
			
			} while (TP < 0 || TP > 60);
			
			do {	
			System.out.println("Asistencia");
			 A = new Scanner(System.in).nextInt();
			
			} while ( A < 0 || A > 10);
			
			do {	
			System.out.println("Examen");
			 E = new Scanner(System.in).nextInt();
			
			} while (E < 0 || E > 30);
			
			NF = TP + A + E;
			/*-------------------------------------------------------------*/
			
			/*Nombre*/
			System.out.println("Nombre: "+N);
			
			/*Nota final*/
			System.out.println("Nota: "+NF);
			
			/*Reprobo o aprobo*/
			if(NF >= 60){
				System.out.println("Aprobo");
			}else{
				System.out.println("Reprobo");
			}
			System.out.println("----------------------------------------");
			
			
			C--;
				
		} while (C != 0);
		
		System.out.println("----------------FIN--------------------");
		
		
	}

}

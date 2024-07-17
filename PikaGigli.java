package Ejercicio;

import java.util.Scanner;

public class PikaGigli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
			int pika=100,gigli=100,t=1,A;
			
			while(pika>0 && gigli >0){
				


				if(t==1){
					System.out.println("[TURNO DE PIKACHU]");
					do {
						A = new Scanner(System.in).nextInt();
			
					} while (A<0 || A>100);
					
					
					System.out.println("Pikachu ataco a Gigli");
					
					gigli = gigli - A;
					
					System.out.println("Vida actual de Giglipuf: " + gigli+" HP");
					

					t=0;
				}else{
					System.out.println("[TURNO DE GIGLIPUF]");
					
					A = new Scanner(System.in).nextInt();
					
					System.out.println("Gigli ataco a Pikachu");
					
					pika = pika - A;
					
					System.out.println("Vida actual de Pikachu: " + pika+" HP" );
					

					t=1;
				}
			}
			if(pika<=0){
				System.out.println("PICACHU ESTA FUERA DE COMBATE");
				System.out.println("----------------¡GANADOR GLIGLIPUF!----------------------");
			}else{
				System.out.println("GIGLIPUF ESTA FUERA DE COMBATE");
				System.out.println("----------------¡GANADOR PIKACHU!-----------------------");
			}
		
		
		
		
	}

}

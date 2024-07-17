package Ejercicio;

import java.util.Scanner;

public class PikaGigli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
			int pika=100,gigli=100,t=1,A;
			
			while(pika>0 && gigli >0){
				
					System.out.println("ingresar valor de ataque");
					A = new Scanner(System.in).nextInt();

				
				if(t==1){
					System.out.println("Pikachu ataco a Gigli");
					
					gigli = gigli - A;
					
					System.out.println("Vida actual de Gigli: " + gigli);
					System.out.println("[TURNO DE GIGLIPUF]");

					t=0;
				}else{
					System.out.println("Gigli ataco a Pikachu");
					
					pika = pika - A;
					
					System.out.println("Vida actual de Pikachu" + pika);
					System.out.println("[TURNO DE PIKACHU]");

					t=1;
				}
			}
			if(pika<=0){
				System.out.print("----------------GANADOR GLIGLIPUF----------------------");
			}else{
				System.out.print("----------------GANADOR PIKACHU-----------------------");
			}
		
		
		
		
	}

}

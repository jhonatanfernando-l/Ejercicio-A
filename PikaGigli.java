package Ejercicio;

import java.util.Scanner;

public class PikaGigli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
			int pika=100,gigli=100,t=1,A;
			
			while(pika>0 && gigli >0){
				
					System.out.print("ingresar ataque");
					A = new Scanner(System.in).nextInt();

				
				if(t==1){
					System.out.println(" ataque gigli");
					System.out.println("turno de gigli");
					gigli = gigli - A;
					t=0;
				}else{
					System.out.println("ataque pika");
					System.out.println("turno pika");
					pika = pika - A;
					t=1;
				}
			}
			if(pika<=0){
				System.out.print("----------------giglipuf gana----------------------");
			}else{
				System.out.print("----------------pikachu gana-----------------------");
			}
		
		
		
		
	}

}

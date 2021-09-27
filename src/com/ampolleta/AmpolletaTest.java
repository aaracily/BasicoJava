package com.ampolleta;

import java.util.Scanner;

public class AmpolletaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean miB = true;
		Ampolleta amp1 = new Ampolleta();
		int opcion;
		int pottNew=0, potencia;
		while(miB){
			Scanner src = new Scanner(System.in);
			System.out
					.println("¿Quë desea hacer? Digite el número\n 1.Encender\n 2.Apagar\n 3.Ver Estado\n 4.Cambiar Potencia\n 5. Ver Potencia\n 6. Cambiar Color \n 7. Ver Color\n 8.Recargar \n 9.Salir ");
			
			opcion = src.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Opción 1");
				amp1.encender();
				break;
			case 2:
				System.out.println("Opción 2");
				amp1.apagar();
				break;
			case 3:
				System.out.println("Opción 3");
				amp1.verEstado();
				break;
			case 4:
				System.out.println("Opción 4");
				amp1.cambiarPotencia();
				break;
			case 5:
				System.out.println("Opción 5");
				amp1.verPotencia();
				break;
			case 6:
				System.out.println("Opción 6");
				amp1.cambiarColor();
				break;
			case 7:
				System.out.println("Opción 7");
				amp1.verColor();
				break;
			case 8:
				System.out.println("Opción 8");
				amp1.recargar();
				break;
			case 9:
				System.out.println("Opción 9- Hasta la próxima");
				miB=false;
				break;
			
			}
			

		}
		}
			
		}
		



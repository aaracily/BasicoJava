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
					.println("�Qu� desea hacer? Digite el n�mero\n 1.Encender\n 2.Apagar\n 3.Ver Estado\n 4.Cambiar Potencia\n 5. Ver Potencia\n 6. Cambiar Color \n 7. Ver Color\n 8.Recargar \n 9.Salir ");
			
			opcion = src.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Opci�n 1");
				amp1.encender();
				break;
			case 2:
				System.out.println("Opci�n 2");
				amp1.apagar();
				break;
			case 3:
				System.out.println("Opci�n 3");
				amp1.verEstado();
				break;
			case 4:
				System.out.println("Opci�n 4");
				amp1.cambiarPotencia();
				break;
			case 5:
				System.out.println("Opci�n 5");
				amp1.verPotencia();
				break;
			case 6:
				System.out.println("Opci�n 6");
				amp1.cambiarColor();
				break;
			case 7:
				System.out.println("Opci�n 7");
				amp1.verColor();
				break;
			case 8:
				System.out.println("Opci�n 8");
				amp1.recargar();
				break;
			case 9:
				System.out.println("Opci�n 9- Hasta la pr�xima");
				miB=false;
				break;
			
			}
			

		}
		}
			
		}
		



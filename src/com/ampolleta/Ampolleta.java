package com.ampolleta;

import java.util.Scanner;

public class Ampolleta {
	private boolean estado = false;
	private int potencia;
	private String color;
	private float horas = 10f;

	// getter y setter
	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getHoras() {
		return horas;
	}

	public void setHoras(float horas) {
		this.horas = horas;
	}

	// metodo para encender
	public void encender() {
		//float hrsEncendido;
		estado = true;
		System.out.println("Ampolleta Encendida");
		/*Scanner src = new Scanner(System.in);
		if (horas < 0) {
			
			System.out
					.println("Ya está encendida\n Por cuántas horas encenderá la ampolleta?\n");
			hrsEncendido = src.nextFloat();
			
			if (horas >= hrsEncendido) {
				horas -= hrsEncendido;
				System.out.println("La ampolleta estará encendida  "
						+ hrsEncendido + "hras\n");
				System.out.println("Quedan " + horas + "de uso\n");
			}else {
				System.out.println("No quedan horas disponible de uso ");

			}
		} else{
			System.out.println("Ops, necesita recargar para encender la ampolleta");
		}*/
	}

	public void apagar() {
			estado = false;
			System.out.println("Ampolleta apagada");
		
	}

	public void verEstado() {
		System.out.println( "La ampolleta está : "+estado);
	}

	public void cambiarPotencia() {
		int pottNew;
		Scanner p =new Scanner(System.in);
		System.out.println("Ingrese nueva potencia");
		pottNew=p.nextInt();
		potencia = pottNew;
	}

	public void verPotencia() {
		System.out.println("La potencia actual es : "+potencia);
	}

	public void cambiarColor() {
		String newColor;
		Scanner c= new Scanner(System.in);
		System.out.println("¿Cuál es el nuevo color?");
		newColor=c.nextLine();
		color = newColor;
		if (estado) {
			this.apagar();//=false
				
		}

	}

	public void verColor() {
		 System.out.println("El color actual es: " + color);
	}

	public void recargar() {
		float recarga;
		Scanner src= new Scanner(System.in);
		System.out.println("¿Cuántas horas quiere recargar?");
		recarga=src.nextFloat();
		horas+=recarga;
		System.out.println("Tendrá un total de :"+horas+" horas");
		
	}

}

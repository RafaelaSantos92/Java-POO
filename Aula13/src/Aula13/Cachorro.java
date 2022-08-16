package Aula13;

public class Cachorro extends Lobo {
	
	@Override
	public void emitirSom() {
		System.out.println("Au AU AU AU");
	}
	
	public void reagir(String frase) {
		if(frase == "toma cuidado" || frase == "Olá") {
			System.out.println("\nAbanar e latir");
		} else {
			System.out.println("Rosnar");
		}
		
	}
	public void reagir(int hora, int min) {
		if(hora < 12) {
			System.out.println("\nAbanar");
		} else if (hora >= 18) {
			System.out.println("\nIgnorar");
		} else {
			System.out.println("\nAbanar e latir");
		}
	}
	public void reagir(boolean dono) {
		if(dono) {
			System.out.println("\nAbanar");
		} else {
			System.out.println("\nRosnar e latir");
		}
	}
	public void reagir(int idade, float peso) {
		if(idade < 5 ) {
		if (peso < 10) {
			System.out.println("\nAbanar");
		} else {
			System.out.println("\nLatir");
		}
		} else {
			
			if(peso < 10) {
				System.out.println("\nRosnar");
		} else {
			System.out.println("\nIgnorar");
		}
		}
	}
}

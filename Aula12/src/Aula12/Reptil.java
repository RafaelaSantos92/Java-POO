package Aula12;

public class Reptil extends Animal {
	
	private String escama;
	
	
	public String getEscama() {
		return escama;
	}

	public void setEscama(String escama) {
		this.escama = escama;
	}

	@Override
	public void locomover() {
		System.out.println("\nRastejando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("\nComendo vegetais");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("\nSom de réptil");
		
	}
	
	

}

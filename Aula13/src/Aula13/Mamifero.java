package Aula13;

public class Mamifero extends Animal {
	protected String corPelo;
	
	

	public String getCorPelo() {
		return corPelo;
	}



	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}



	@Override
	public void emitirSom() {
		System.out.println("\nEmitir som de mam�fero");
		
	}
	
	

}

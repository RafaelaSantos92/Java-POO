package Aula12;

public class Peixe extends Animal {
	private String corEscama;
	

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public void locomover() {
		System.out.println("\nNadando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("\nComendo subst�ncias");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("\nPeixe n�o faz som");
		
	}
	
	public void soltarBolha() {
		System.out.println("\nSoltou bolha");
	}
	
}

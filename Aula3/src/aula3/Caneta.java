package aula3;

public class Caneta {
	
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;
	
	public void status() {
		System.out.println("Uma caneta " + this.cor);
		System.out.println("ponta: " + this.ponta);
		System.out.println("carga: " + this.carga);
		System.out.println("está tampada? " + this.tampada);
	}
	
	public void rabiscar() {
		if(this.tampada == true) {
			System.out.println("Erro! Não posso rabiscar por estou tampada!");
		}else {
			System.out.println("Estou rabiscando!");
		}
		
	}
	
	protected void tampar() {
		this.tampada = true;
	}
	
	protected void destampar() {
		this.tampada = false;		
	}

}
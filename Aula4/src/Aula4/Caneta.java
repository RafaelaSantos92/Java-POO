package Aula4;

public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	private boolean tampada;
	

	public Caneta(String m, String c, Float p) {
		this.tampar();
		this.cor = c;
		this.modelo = m;
		this.ponta = p;
				
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	
	public void setPonta(float p) {
		this.ponta = p;
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	public void status() {
		System.out.println("Sobre a caneta:");
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Cor: " + this.cor);
		System.out.println("tampada: " + this.tampada);
	}
}

package Aula02;

public class Aula02 {

	public static void main(String[] args) {
		
		Caneta C1 = new Caneta();
			C1.cor = "azul";
			C1.ponta = 0.5f;
			C1.destampar();
			C1.rabiscar();
			C1.status();
			
		Caneta C2 = new Caneta();
		C2.cor = "vermelha";
		C2.modelo = "bic";
		C2.ponta = 0.7f;
		C2.tampar();
		C2.status();
		C2.rabiscar();
		
	}

}

package Aula5;

public class Movimentacoes {

	public static void main(String[] args) {
		ContaBanco C1 = new ContaBanco();
		C1.setNumConta(2020);
		C1.setDono("Jubileu");
		C1.abrirConta("CC");
		C1.depositar(100);
		C1.estadoAtual();
		
		ContaBanco C2 = new ContaBanco();
		C2.setNumConta(2542);
		C2.setDono("Creuza");
		C2.abrirConta("CP");
		C2.depositar(350);
		C2.sacar(25);
		C2.fecharConta();
		C2.estadoAtual();
		
		
		

	}

}

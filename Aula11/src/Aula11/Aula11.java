package Aula11;

public class Aula11 {

	public static void main(String[] args) {
		/*Visitante p1 = new Visitante();
		p1.setNome("Pedro");
		p1.setIdade(15);
		p1.setSexo("M");

		System.out.println(p1.toString());*/
		
		Aluno a1 = new Aluno();
		a1.setNome("Joao");
		a1.setIdade(23);
		a1.setSexo("M");
		a1.setCurso("História");
		a1.setMatricula(2523);
		a1.pagarMen();
		
		Bolsista b1 = new Bolsista();
		b1.setNome("Aline");
		b1.setIdade(26);
		b1.setSexo("F");
		b1.setCurso("História");
		b1.setMatricula(5454);
		b1.pagarMen();
	}

}

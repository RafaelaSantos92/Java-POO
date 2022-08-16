package Aula10;

public class Aula10 {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		
		p1.setNome("Joao");
		p2.setNome("Aline");
		p3.setNome("Junior");
		p4.setNome("José");
		
		p1.setSexo("M");
		p3.receberAumento(500f);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
				

	}

}

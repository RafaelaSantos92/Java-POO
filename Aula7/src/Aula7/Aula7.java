package Aula7;

public class Aula7 {

	public static void main(String[] args) {
		Lutador L[] = new Lutador[6];
				
		L[0] = new Lutador("Joao","Brasil",8,1.80f,70.5f, 11, 12,5);
		L[1] = new Lutador("Jorge","Alemanha",25,1.80f,93.7f, 3, 2,6);
		L[2] = new Lutador("Fer","Grécia",58,1.80f,68.7f, 6, 6,8);
		L[3] = new Lutador("ADs","Mexico",20,1.80f,123.7f, 71, 6,7);
		L[4] = new Lutador("Fas","Tamandare",32,1.80f,120.7f, 8, 2,5);
		L[5] = new Lutador("Eer","Ipsep",17,1.80f,110.7f, 5, 7,4);
		
		
		Luta UEC01 = new Luta();
		UEC01.marcarLuta(L[0], L[5]);
		UEC01.lutar();
		
				
		
	}

}

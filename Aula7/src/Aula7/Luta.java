package Aula7;

import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int roud;
	private boolean aprovada;
	
	public void marcarLuta(Lutador L1, Lutador L2) {
		if(L1.getCategoria() == L2.getCategoria() && L1 != L2) {
			this.aprovada = true;
			this.desafiado = L1;
			this.desafiante = L2;
		} else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}
	
	public void lutar() {
		if (this.aprovada) {
			System.out.println("\n### Desafiado ###");
			this.desafiado.apresentar();
			System.out.println("\n### Desafiante ###");
			this.desafiante.apresentar();
			System.out.println("\nComeçando a luta");
			
			Random aleatorio = new Random(); 
			int vencedor = aleatorio.nextInt(3);
			switch(vencedor) {
			case 0:
				System.out.println("\nEmpatou!");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
				
			case 1:
				System.out.println("\nGanhou Desafiante");
				this.desafiado.perderLuta();
				this.desafiante.ganharLuta();
				break;
			case 2:
				System.out.println("\nGanhou Desafiador");
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
			}
			
		} else {
			System.out.println("\nA luta não pode acontecer");
		}
		
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRoud() {
		return roud;
	}

	public void setRoud(int roud) {
		this.roud = roud;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	
	}

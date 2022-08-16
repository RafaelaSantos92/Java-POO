package Aula5;

public class ContaBanco {
	
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	public void estadoAtual(){
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo " + this.getSaldo());
		System.out.println("Status " + this.isStatus());
	}
	
	
	public ContaBanco() {
		super();
		this.saldo = 0;
		this.status = false;
	}
	
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {
			this.setSaldo(50);
		} else {
			this.setSaldo(150);
		}
	}
	public void fecharConta() {
		if (this.getSaldo()>0) {
			System.out.println("Saldo positivo. N�o � poss�vel encerrar a conta.");
		} else if (this.getSaldo()<0){
			System.out.println("Saldo negativo. Resolva as pendencias antes de finalizar a conta");
		} else {
			this.setStatus(false);
			System.out.println("Conta encerrada com sucesso! At� a pr�xima");
		}
	}
	public void depositar(float v) {
		if (this.status == true) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Deposito realizado com sucesso na conta de " + this.getDono());
		} else {
			System.out.println("Deposito n�o realizado. Verifique as informa��es.");
		}
	}
	public void sacar(float v) {
		if (this.isStatus()) {
			if (this.getSaldo()>= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado da conta de " + this.getDono());
			} else {
				System.out.println("Saldo insulficiente para saque!");
			}
		}
		else {
			System.out.println("Conta n�o localizada");
		}
	}
	public void pagarMensal() {
		int v = 0;
		if (this.getTipo() == "CC") {
			v = 12;			
		} else if (this.getTipo() == "CP") {
			v = 20;
		}
		if (this.isStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso por " + this.getDono());
		} else {
			System.out.println("ERRO");

		}
		
	}
	

}

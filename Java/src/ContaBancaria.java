
public class ContaBancaria {
	
	private String id;  	//private significa que só a propria classe pode acessar o valor do atributo
	private double saldo;   
	
	public void sacar(double valor) {
		saldo = saldo - valor;
		
	}
	
	public void depositar(double valor) {
		saldo = saldo + valor;
				
	}

	public double lerSaldo() {
		return saldo;
		
	}
	
}


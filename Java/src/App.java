
public class App {

	public static void main(String[] args) {
		
		ContaBancaria conta = new ContaBancaria();
		conta.depositar(280.0);
		conta.depositar(20);
		conta.sacar(50);
		
		double saldoAtual = conta.lerSaldo();
		System.out.println("Saldo: " + saldoAtual);
		
		

	}

}

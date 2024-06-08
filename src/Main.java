
public class Main {

	public static void main(String[] args) {
		Cliente guilherme = new Cliente();
		guilherme.setNome("Guilherme");
		
		Conta cc = new ContaCorrente(guilherme);
		Conta poupanca = new ContaPoupanca(guilherme);

		cc.depositar(500);
		cc.transferir(100, poupanca);
		cc.sacar(100);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}

package andre.uespi.prp.br;

public class Conta {
	String titular, agencia, DataAbertura;
	int numero;
	double saldo;

	double sacar(double valor) {
		saldo = saldo - valor;
		return saldo;
	}

	double deposita(double valor) {
		saldo = saldo + valor;
		return saldo;
	}

	double CalculaRendimento() {
		saldo = saldo * 0.1;
		return saldo;
	}

	String recuperaDadosParaImpressao() {
		return titular + " " + agencia + " " + numero + " " + DataAbertura + " " + saldo;
	}

}

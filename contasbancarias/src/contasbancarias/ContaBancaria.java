package contasbancarias;
public class ContaBancaria {

    // atributos
    String nomeCliente;
    String cpf;
    String nomeBanco;
    int agencia;
    int numeroConta;
    double saldo = 500.00; // começa com 500

    // método sacar
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    // mostrar dados
    public void mostrarDados() {
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("CPF: " + cpf);
        System.out.println("Banco: " + nomeBanco);
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo: R$ " + saldo);
    }
}
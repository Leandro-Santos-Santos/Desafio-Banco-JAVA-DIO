public class Principal {
    public static void main(String[] args) {
        Conta cc = new contaCorrente();
        cc.depositar(1000);
        Conta poupanca = new contaPoupanca();
    
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    
    }
}

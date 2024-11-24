public class Principal {
    public static void main(String[] args) {
        Cliente claudio = new Cliente();
        claudio.setNome("Claudio");
        
        Conta contaCorrente = new contaCorrente(claudio);
        Conta poupanca = new contaPoupanca(claudio);
    
        contaCorrente.depositar(1000);
        contaCorrente.transferir(100, poupanca);

        contaCorrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    
    }
}

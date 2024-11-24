public class contaPoupanca extends Conta{
    @Override
    public void imprimirExtrato() {
        System.out.println("===Extrato Conta Poupança===");
        super.imprimirInfosComuns();
        throw new UnsupportedOperationException("Unimplemented method 'imprimirExtrato'");
    }
}


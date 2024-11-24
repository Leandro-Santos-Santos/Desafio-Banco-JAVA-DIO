public class contaCorrente extends Conta{

    @Override
    public void imprimirExtrato() {
        System.out.println("===Extrato Conta Corrente===");
        super.imprimirInfosComuns();
        throw new UnsupportedOperationException("Unimplemented method 'imprimirExtrato'");
    }

    
    
}

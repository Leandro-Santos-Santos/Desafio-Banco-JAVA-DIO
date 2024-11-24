import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Cliente claudio = new Cliente();
        claudio.setNome("Claudio");
        
        Conta contaCorrente = new contaCorrente(claudio);
        Conta poupanca = new contaPoupanca(claudio);
    
        //contaCorrente.depositar(1000);
        //contaCorrente.transferir(100, poupanca);

        contaCorrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nBem-vindo ao Banco!");
            System.out.println("Escolha uma opção:");
            System.out.println("1. Depositar na Conta Corrente");
            System.out.println("2. Sacar da Conta Corrente");
            System.out.println("3. Transferir para a Conta Poupança");
            System.out.println("4. Imprimir Extrato");
            System.out.println("5. Sair");
            System.out.print("Digite sua escolha: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a depositar na Conta Corrente: ");
                    double valorDeposito = scanner.nextDouble();
                    contaCorrente.depositar(valorDeposito);
                    System.out.println("Depósito realizado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o valor a sacar da Conta Corrente: ");
                    double valorSaque = scanner.nextDouble();
                    contaCorrente.sacar(valorSaque);
                    System.out.println("Saque realizado com sucesso!");
                    break;

                case 3:
                    System.out.print("Digite o valor a transferir para a Conta Poupança: ");
                    double valorTransferencia = scanner.nextDouble();
                    contaCorrente.transferir(valorTransferencia, poupanca);
                    System.out.println("Transferência realizada com sucesso!");
                    break;

                case 4:
                    System.out.println("Extrato da Conta Corrente:");
                    contaCorrente.imprimirInfosComuns();
                    System.out.println("\nExtrato da Conta Poupança:");
                    poupanca.imprimirInfosComuns();
                    break;

                case 5:
                    System.out.println("Obrigado por usar o banco. Até logo!");
                    running = false;
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }


}


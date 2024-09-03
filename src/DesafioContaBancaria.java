import java.util.Scanner;

public class DesafioContaBancaria {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        double saldo = 2500;
        String nome = "Erick Alves";
        String tipoConta = "Corrente";
        String menu = """
               
               ** OPERAÇÕES **
               1 - Consultar saldos
               2 - Receber valor
               3 - Transferir valor
               4 - Sair
               
               Digite a opcao desejada:
               
               """;
        System.out.println("---------------------------------------------");
        System.out.println("Dados iniciais da conta do cliente: \n");
        System.out.println("Nome:          " + nome);
        System.out.println("Tipo conta:    " + tipoConta);
        System.out.println("Saldo inicial: R$ " + saldo);
        System.out.println("---------------------------------------------");

        int opcaoEscolhida;
        do {
            System.out.println(menu);
            opcaoEscolhida = input.nextInt();

            switch (opcaoEscolhida) {
                case 1:
                    System.out.println("O saldo atual é: R$ " + saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor a receber: ");
                    double valorRecebido = input.nextDouble();
                    saldo += valorRecebido;
                    System.out.printf("Saldo atualizado R$: %.2f", saldo);
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja transferir: ");
                    double valorTransferido = input.nextDouble();
                    if (valorTransferido > saldo) {
                        System.out.println("Não há saldo suficiente em conta para fazer essa transferencia!");
                        break;
                    } else {
                        saldo -= valorTransferido;
                        System.out.printf("Saldo atualizado R$: %.2f", saldo);
                    }
                    break;
            }
        } while (opcaoEscolhida != 4);


    }
}

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        Boolean continuar = true;

        while (continuar) {
            System.out.println("----------------------------------------");
            System.out.println("Seja Bem Vindo ao Nosso Banco!");
            System.out.println("Escolha uma das Opção:");
            System.out.println("1 - Despositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("0 - encerrar");
            int opcao = scanner.nextInt();
            System.out.println("----------------------------------------");

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor que deseja Depositar");
                    double saldoDepositado = scanner.nextDouble();
                    if (saldoDepositado > 0) {
                        saldo += saldoDepositado;
                        System.out.println("Novo Saldo de: R$ " + saldo);
                    } else {
                        System.out.println("Não foi possivel depositar o valor de: R$ " + saldoDepositado);
                    }

                    break;
                case 2:
                    System.out.println("Digite o valor que deseja sacar: ");
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque > 0 && valorSaque < saldo) {
                        saldo -= valorSaque;
                        System.out.println("Saque realizado de: R$ " + valorSaque);
                        System.out.println("Saldo Atual: R$ " + saldo);
                    } else if (valorSaque > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        System.out.println("Valor Invalido");
                    }

                    break;

                case 3:
                    System.out.println("Saldo da conta: R$ " + saldo);

                    break;

                case 0:
                    System.out.println("Programa Encerrado!");
                    continuar = false;

                    break;

                default:
                    System.out.println("Opção Inválida. Tente Novamente.");
                    break;
            }
        }
        scanner.close();
    }
}

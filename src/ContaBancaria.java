import java.util.Scanner;
import java.util.Locale;

public class ContaBancaria {
    public static void main(String[] args) throws Exception {
        Scanner banco = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe Seu primeiro Nome:");
        String nome = banco.next();

        System.out.println("Informe seu segundo Nome:");
        String sobrenome = banco.next();

        System.out.println("Infome sua Idade:");
        int idade = banco.nextInt();

        System.out.println("Valor que deseja colocar de inicio:");
        int valor = banco.nextInt();

        System.out.println("Suas Informação São: ");
        System.out.println("------------------------------------");
        System.out.println("Nome Completo: " + nome + " " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("valor que tem na conta: " + valor);
        System.out.println("------------------------------------");

    }
}

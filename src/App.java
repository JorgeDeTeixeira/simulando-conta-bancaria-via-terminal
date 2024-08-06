import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();

        try {
            System.out.println("Informe os seu dados por favor.");
            System.out.println();

            System.out.print("Número: ");
            conta.setNumero(leitor.nextInt());
            leitor.nextLine();

            System.out.print("Agência: ");
            conta.setAgencia(leitor.nextLine());

            System.out.print("Nome: ");
            conta.setNomeCliente(leitor.nextLine());

            System.out.print("Saldo R$: ");
            conta.setSaldo(leitor.nextDouble());

            System.out.println(conta.toString());
        } catch (InputMismatchException e) {
            System.out.println("Erro na entrada de dados. Por favor, insira os dados corretamente.");
        } finally {
            leitor.close();
        }
    }
}

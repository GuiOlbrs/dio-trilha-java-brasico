import java.util.Locale;
import java.util.Scanner; 

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o número da Agência: ");
        String agencia = scanner.next();

        System.err.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá ".toString().concat(nome) + ", obrigado por criar uma conta em nosso banco, sua agência é ".toString().concat(agencia) + ", Conta: " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
    
}

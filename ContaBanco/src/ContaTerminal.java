import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO Conhecer e importar a classe scanner

        Scanner scanner = new Scanner(System.in);
           
        //Exibir as mensagens para o usuario
        System.out.println("Por favor, digite o numero da Agencia:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o numero da Conta");
        int numero = scanner.nextInt();
        scanner.nextLine(); //Apertar o Enter

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();
        
        
        //Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
        + "sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");

scanner.close();
    }
}

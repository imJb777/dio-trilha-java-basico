import java.util.Scanner;

public class scannernext { public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);


System.out.println("Por favor,digite o nome do cliente");
    String NomeCliente = scanner.nextLine();

    System.out.println("Por favor,digite o número da agência");
    String agência = scanner.nextLine();
   
    System.out.println("Por favor,digite o número da Conta");
    int numero = scanner.nextInt();
    
    System.out.println("Por favor,digite o saldo incial");
    double saldo = scanner.nextDouble();

   String mensagem = "Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                          + agência + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
    
    System.out.println(mensagem);
    scanner.close();}
}



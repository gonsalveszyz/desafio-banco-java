import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Roberto";
        String tipoConta = "Corrente";
        double saldo = 1599.99;

        System.out.println("**********************");
        System.out.println("\nNome do Cliente " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo da Conta: " + saldo);
        System.out.println("\n**********************");

        String menu = """
                    ***Digite sua opcao***
                    
                    1 - Consultar Saldo da Conta
                    2 - Transferir Saldo da Conta
                    3 - Receber um valor 
                    4 - Sair 
                """;
        Scanner ler = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 4) {
            System.out.println(menu);
            opcao = ler.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado e "  + saldo);
            }else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir ");
                double valor = ler.nextDouble();
                if(valor > saldo){
                    System.out.println("Nao a saldo para transferir");
                }else {
                    saldo = saldo - valor;
                    System.out.println("O novo saldo atualizado e " + saldo);
                }
            }else if (opcao == 3) {
                System.out.println("Qual o valor recebido:  ");
                double valor = ler.nextDouble();
                saldo += valor;
            }else if (opcao != 4) {
                System.out.println("Opcao invalida");
            }

        }
    }
}
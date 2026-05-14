import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        /*String nome = "Roberto";
        String tipoConta = "Corrente";
        double saldo = 1599.99;*/

        System.out.println("digite o nome do cliente");
        String nomeCleinte = ler.nextLine();
        System.out.println("digite o tipo de conta: ");
        String tipoDaconta = ler.nextLine();
        System.out.println("digite o saldo da conta: ");
        double saldoCleinte = ler.nextDouble();

        System.out.println("**********************");
        System.out.println("\nNome do Cliente: " + nomeCleinte);
        System.out.println("Tipo de Conta: " + tipoDaconta);
        System.out.println("Saldo da Conta: " + saldoCleinte);
        System.out.println("\n**********************");
        
        /*System.out.println("**********************");
        System.out.println("\nNome do Cliente " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo da Conta: " + saldo);
        System.out.println("\n**********************");*/

        String menu = """
                    ***Digite sua opcao***
                    
                    1 - Consultar Saldo da Conta
                    2 - Transferir Saldo da Conta
                    3 - Receber um valor 
                    4 - Sair 
                """;

        int opcao = 0;
        while (opcao != 4) {
            System.out.println(menu);
            opcao = ler.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado e "  + saldoCleinte);
            }else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir ");
                double valor = ler.nextDouble();
                if(valor > saldoCleinte){
                    System.out.println("Nao a saldo para transferir");
                }else {
                    saldoCleinte = saldoCleinte - valor;
                    System.out.println("O novo saldo atualizado e " + saldoCleinte);
                }
            }else if (opcao == 3) {
                System.out.println("Qual o valor recebido:  ");
                double valor = ler.nextDouble();
                saldoCleinte += valor;
            }else if (opcao != 4) {
                System.out.println("Opcao invalida");
            }

        }
    }
}
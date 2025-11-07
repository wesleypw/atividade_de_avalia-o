import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cadastro c = new Cadastro();

        int opcao;
        do{
            System.out.println("Menu:");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Adicionar pessoa");
            System.out.println("4 - Listar pessoas");
            System.out.println("5 - Registrar venda");
            System.out.println("6 - Ver total de vendas");
            System.out.println("0 - Sair");
            System.out.print("Digite sua opção: ");
            opcao = sc.nextInt();
            switch(opcao){
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nomeProduto = sc.next();
                    System.out.print("Digite o valor unitário do produto: ");
                    double valorUnitario = sc.nextDouble();
                    System.out.print("Digite a quantidade do produto: ");
                    int quantidade = sc.nextInt();
                    c.adicionarProduto(new Produto(nomeProduto, valorUnitario, quantidade));
                    break;
                case 2:
                    c.listarProdutos();
                    break;
                case 3:
                    System.out.print("Digite o nome da pessoa: ");
                    String nomePessoa = sc.next();
                    System.out.print("Digite o CPF da pessoa: ");
                    long cpf = sc.nextLong();
                    System.out.print("Digite a idade da pessoa: ");
                    int idade = sc.nextInt();
                    c.adicionarPessoa(new Pessoa(nomePessoa, cpf, idade));
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }while(opcao != 0);

        sc.close();
    }
}

package javaapplication1;
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Carro
        Carro meuCarro = new Carro("Ferrari");

        // Exibindo o modelo do carro
        System.out.println("Modelo do carro: " + meuCarro.getModelo());

        // Criando Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja acessar o painel?\nDigite 1 para sim ou 2 para não");
        int res = scanner.nextInt();
        
        // Verifica a escolha do usuário
        if(res == 1){
            painel(scanner, meuCarro);  // Chama o método painel passando o scanner
        } else {
            System.out.println("Você escolheu não acessar o painel.");
        }

        // Fechando Scanner para evitar vazamento de recursos
        scanner.close();
        
        System.out.println("Você saiu do Painel!.");

    }
    
    // Método do painel
    public static void painel(Scanner scanner, Carro carro){
        System.out.println("Painel acessado!");
        int opcao = 0;
        while(opcao != 5) {
            System.out.println("Escolha uma opção:\n"
                + "1 - Acelerar\n"
                + "2 - Frear\n"
                + "3 - Ligar farol\n"
                + "4 - Desligar farol\n"
                + "5 - Sair do painel");

        
            opcao = scanner.nextInt();
            scanner.nextLine();
        
           switch(opcao){
                case 1:
                    carro.acelerar();
                    break;
                case 2:
                    carro.frear();
                    break;
                case 3:
                    carro.ligarFarol();
                    break;
                case 4:
                    System.out.println("Farol desligado!");
                    break;
                case 5:
                    System.out.println("Saindo do painel...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            } 
        }
    }
}

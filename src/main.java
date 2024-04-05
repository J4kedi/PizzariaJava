import models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Inicializando o scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Lista de itens do cardápio
        List<Produto> cardapio = criarCardapio();

        // Lista de itens do pedido
        List<Produto> itensPedido = new ArrayList<>();

        int option = 0;
        while (option != 4) {
            // Exibe o menu
            System.out.println("\n------ NOTA DE PAGAMENTO -------");
            System.out.println("Menu:");
            System.out.println("1. Cardápio");
            System.out.println("2. Fazer Pedido");
            System.out.println("3. Ver Nota");
            System.out.println("4. Sair");

            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    // Exibir cardápio
                    exibirCardapio(cardapio);
                    break;
                case 2:
                    // Fazer pedido
                    fazerPedido(cardapio, itensPedido, scanner);
                    break;
                case 3:
                    // Ver nota
                    verNota(itensPedido);
                    break;
                case 4:
                    // Sair do programa
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        // Fechando o scanner
        scanner.close();
    }

    // Método para criar o cardápio inicial
    private static List<Produto> criarCardapio() {
        List<Produto> cardapio = new ArrayList<>();
        cardapio.add(new Produto("Calabresa", "29.90", "Pizza"));
        cardapio.add(new Produto("Peperoni", "31.90", "Pizza"));
        cardapio.add(new Produto("Quatro Queijos", "30.90", "Pizza"));
        cardapio.add(new Produto("Brócolis", "28.90", "Pizza"));
        cardapio.add(new Produto("Refrigerante", "5.00", "Bebida"));
        return cardapio;
    }

    // Método para exibir o cardápio
    private static void exibirCardapio(List<Produto> cardapio) {
        System.out.println("\n--- Cardápio ---");
        for (int i = 0; i < cardapio.size(); i++) {
            Produto produto = cardapio.get(i);
            System.out.println((i + 1) + ". " + produto.getNomeDoItem() + " (" + produto.getCategoriaDoItem() + ") - R$" + produto.getPrecoDoItem());
        }
    }

    // Método para fazer o pedido
    private static void fazerPedido(List<Produto> cardapio, List<Produto> itensPedido, Scanner scanner) {
        exibirCardapio(cardapio);
        System.out.println("Selecione o item pelo número:");
        int opcao = scanner.nextInt();
        if (opcao >= 1 && opcao <= cardapio.size()) {
            // Adicionar o item ao pedido
            itensPedido.add(cardapio.get(opcao - 1));
            System.out.println("Item adicionado ao pedido.");
        } else {
            System.out.println("Opção inválida.");
        }
    }

    // Método para ver a nota do pedido
    private static void verNota(List<Produto> itensPedido) {
        System.out.println("\n--- Nota de Pedido ---");
        double total = 0;
        for (Produto item : itensPedido) {
            System.out.println("- " + item.getNomeDoItem() + " (" + item.getCategoriaDoItem() + ") - R$" + item.getPrecoDoItem());
            total += Double.parseDouble(item.getPrecoDoItem());
        }
        System.out.println("Total: R$" + total);
    }
}

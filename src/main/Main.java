package main;

import biblioteca.Biblioteca;
import enums.Genero;
import models.Livro;
import models.Revista;
import models.Material;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        boolean sair = false;
        while (!sair) {
            System.out.println("\nSistema de Gerenciamento de Biblioteca");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Adicionar Revista");
            System.out.println("3. Pesquisar Material");
            System.out.println("4. Excluir Material");
            System.out.println("5. Listar Materiais");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Título: ");
                    String tituloLivro = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autorLivro = scanner.nextLine();
                    System.out.print("Gênero (ex: TERROR): ");
                    String generoStr = scanner.nextLine();
                    Genero genero = Genero.valueOf(generoStr.toUpperCase());

                    biblioteca.adicionarMaterial(new Livro(tituloLivro, autorLivro, genero));
                    break;

                case 2:
                    System.out.print("Título: ");
                    String tituloRevista = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autorRevista = scanner.nextLine();
                    System.out.print("Número da Revista: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine();

                    biblioteca.adicionarMaterial(new Revista(tituloRevista, autorRevista, numero));
                    break;

                case 3:
                    System.out.print("Digite o título para pesquisar: ");
                    String tituloPesquisa = scanner.nextLine();
                    Material encontrado = biblioteca.pesquisarPorTitulo(tituloPesquisa);
                    if (encontrado != null) {
                        System.out.println("Encontrado: " + encontrado);
                    } else {
                        System.out.println("Material não encontrado!");
                    }
                    break;

                case 4:
                    System.out.print("Digite o título para excluir: ");
                    String tituloExcluir = scanner.nextLine();
                    boolean foiExcluido = biblioteca.excluirMaterial(tituloExcluir);

                    if (!foiExcluido) {
                        System.out.println("Não foi possível excluir, pois o material não foi encontrado!");
                    }
                    break;

                case 5:
                    biblioteca.listarMateriais();
                    break;

                case 6:
                    sair = true;
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Por favor, escolha novamente.");
            }
        }

        scanner.close();
    }
}

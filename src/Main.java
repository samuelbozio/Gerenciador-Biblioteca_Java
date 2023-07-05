import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        int opcao = 0;


        while (opcao != 5) {

            System.out.println("Qual operação deseja realizar? ");
            System.out.println("[1] Para cadastrar um livro. ");
            System.out.println("[2] Para mostrar a lista completa do acervo. ");
            System.out.println("[3] Para buscar um livro em específico. ");
            System.out.println("[4] Para remover um livro pelo título. ");
            System.out.println("[5] Para sair da operação. ");
            opcao = sc.nextInt();
            sc.nextLine();


            switch (opcao) {
                case 1:
                    boolean enquanto = true;
                    while (enquanto) {
                        System.out.println("Digite o título do livro: ");
                        String titulo = sc.nextLine();
                        Livros livro = new Livros(titulo);
                        biblioteca.addLivro(livro);
                        System.out.println("Deseja cadastrar mais um livro? [Y/N]");
                        String resposta = sc.nextLine();

                        if (Objects.equals(resposta, "N")) {
                            enquanto = false;
                            System.out.println("Livros Cadastrados: ");
                            biblioteca.mostrarTodosLivros();
                        }
                    }
                case 2:
                    biblioteca.mostrarTodosLivros();
                    break;

                case 3:
                    System.out.println("Qual livro você está buscando? ");
                    String titulo = sc.nextLine();
                    biblioteca.mostrarUmLivro(titulo);
                    break;
                case 4:
                    System.out.println("Qual livro deseja remover? ");
                    titulo = sc.nextLine();
                    biblioteca.removerLivro(titulo);


            }
        }
        System.out.println("Finalizando o programa! ");

    }
}
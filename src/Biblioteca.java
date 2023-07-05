import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class Biblioteca {

    ArrayList<Livros> livro = new ArrayList<>();

    public void addLivro(Livros titulo) {
        livro.add(titulo);
    }

    public void mostrarTodosLivros() {

        livro.sort(Comparator.comparing(Livros::getTitulo));
        for (Livros mostraLivros : livro) {
            System.out.println(mostraLivros.getTitulo());
        }

    }

    public void mostrarUmLivro(String titulo) {


        for (Livros mostraLivro : livro) {
            if (Objects.equals(mostraLivro.getTitulo(), titulo)) {
                System.out.println(mostraLivro.getTitulo());
                break;
            } else System.out.println("Não encontrado.");
            break;
        }


    }

    public void removerLivro(String titulo) {

        for (Livros remocaoLivro : livro) {
            if (Objects.equals(remocaoLivro.getTitulo(), titulo))
                System.out.println(titulo + " REMOVIDO.");
            remocaoLivro.setTitulo(null);
            System.out.println(remocaoLivro.getTitulo());
        }
    }



}

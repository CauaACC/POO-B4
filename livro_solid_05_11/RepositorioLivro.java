package livro_solid_05_11;

public class RepositorioLivro {
    public void salvar(Livro livro) {
        System.out.println("Livro" + livro.getTitulo() + "salvo no banco");
    }
}


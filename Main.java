public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Davi Veiga", "Java para iniciantes");
        RepositorioLivro repositorio = new RepositorioLivro();
        repositorio.salvar(livro);
    }
}
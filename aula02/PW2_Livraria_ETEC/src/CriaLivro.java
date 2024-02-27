public class CriaLivro {
    public static void main(String[] args) {
        Livro primeiroLivro = new Livro();
        primeiroLivro.setTitulo("hari pote");
        primeiroLivro.setAutor("eu");
        primeiroLivro.setEditora("panini");
        primeiroLivro.setPreco(30.00f);
        primeiroLivro.setResumo("O harry potter quase morreu pro menino sem nazria ai o harry potter creasceu e tento mata o menino sem nariz");

        primeiroLivro.status();
    }
}

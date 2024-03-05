public class CriaLivro {
    public static void main(String[] args) {


        Livro primeiroLivro = new Livro();
        primeiroLivro.setTitulo("hari pote");
        primeiroLivro.setAutor("eu");
        primeiroLivro.getEditoraLivro().setNomeEditora("pitoco");
        primeiroLivro.getEditoraLivro().setSite("www.pitoco.com.br");
        primeiroLivro.setPreco(30.00f);
        primeiroLivro.setResumo("O harry potter quase morreu pro menino sem nazria ai o harry potter creasceu e tento mata o menino sem nariz");
        primeiroLivro.setTipoDaCapa(TipoCapaEnum.DURA);
        primeiroLivro.status();
    }


}

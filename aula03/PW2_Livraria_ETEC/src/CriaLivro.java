import javax.swing.JOptionPane;

public class CriaLivro {
    public static void main(String[] args) {


        Livro primeiroLivro = new Livro();
        primeiroLivro.setTitulo("hari pote");
        primeiroLivro.setAutor("eu");
        primeiroLivro.setPreco(30.00f);
        primeiroLivro.setResumo("O harry potter quase morreu pro menino sem nazria ai o harry potter creasceu e tento mata o menino sem nariz");
        primeiroLivro.setPaginas(100);
        primeiroLivro.getEditoraLivro().setSite("www.pitoco.com.br");
        primeiroLivro.getEditoraLivro().setNomeEditora("pitoco");
        primeiroLivro.status();


        Livro segundoLivro = new Livro();
        segundoLivro.setTitulo("roblox");
        segundoLivro.setAutor("david bazuca");
        segundoLivro.getEditoraLivro().setNomeEditora("roblox company");
        segundoLivro.getEditoraLivro().setSite("www.trojan.com");
        segundoLivro.setPreco(100.00f);
        segundoLivro.setResumo("###### o roblox");
        segundoLivro.setPaginas(30);
        segundoLivro.status();

    }


}

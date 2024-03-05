import java.sql.SQLOutput;

public class Livro {

    private String titulo;
    private String autor;
    private Editora editoraLivro = new Editora();
    private float preco;
    public TipoCapaEnum tipoDaCapa = new TipoCapaEnum();
    private String resumo;
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }

    public Editora getEditoraLivro() {
        return editoraLivro;
    }

    public TipoCapaEnum getTipoDaCapa(){
        return this.tipoDaCapa;
    }

    public void setTipoDaCapa(TipoCapaEnum tipoDaCapa){
        this.tipoDaCapa = tipoDaCapa;
    }

    public void setEditoraLivro(Editora editoraLivro) {
        this.editoraLivro = editoraLivro;
    }

    public void status(){
        System.out.println("titulo: " + this.getTitulo());
        System.out.println("autor: " + this.getAutor());
        System.out.println("nome da editora: " + this.getEditoraLivro().getNomeEditora());
        System.out.println("nomde do site: " + this.getEditoraLivro().getSite());
        System.out.println("resumo: " + this.getResumo());
        System.out.println("preco: " + this.getPreco());
        System.out.println("tipo da capa: " + this.getTipoDaCapa());
    }
    public float getPreco(){
        return this.preco;
    }
    public void setPreco(float preco){
        this.preco = preco;
    }
    public String getResumo(){
        return this.resumo;
    }
    public void setResumo(String resumo){
        this.resumo = resumo;
    }



    public void comprarOLivro(){
        System.out.println("livro adquirido");
    }

    public void abrirOLivro(){
        System.out.println("livro aberto");
    }

    public void lerOLivro(){
        System.out.println("livro lido");
    }



}

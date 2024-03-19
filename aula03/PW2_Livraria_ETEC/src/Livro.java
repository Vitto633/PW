import javax.swing.*;

public class Livro {

    private int paginas;
    private String titulo;
    private String autor;
    private Editora editoraLivro = new Editora();
    TipoCapaEnum capaEnum = TipoCapaEnum.DURA;
    private float preco;
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
    public void setEditoraLivro(Editora editoraLivro) {
        this.editoraLivro = editoraLivro;
    }

    public void status(){
        JOptionPane.showMessageDialog(null, "\n titulo: " + this.getTitulo() +
                "\n autor: " + this.getAutor() +
                "\n nome da editora: " + this.getEditoraLivro() +
                "\n nome do site: " +  this.getEditoraLivro().getSite() +
                "\n resumo: " + this.getResumo() +
                "\n preco: " + this.formatarValor(this.getPreco()) +
                "\n numero de paginas: " + this.getPaginas() +
                "\n tipo da capa: " + this.capaEnum +
                "\n a taxa de envio do livro é: " + this.getTaxaEnvio() +
                "\n Preço final: " + this.formatarValor(this.getDesconto(this.preco))  +
                "\n"
    );

    }

    public void statusPobre() {
        System.out.println("titulo: " + this.getTitulo());
        System.out.println("autor: " + this.getAutor());
        System.out.println("nome da editora: " + this.getEditoraLivro().getNomeEditora());
        System.out.println("nome do site: " + this.getEditoraLivro().getSite());
        System.out.println("resumo: " + this.getResumo());
        System.out.println("numero de paginas: " + this.getPaginas());
        System.out.println("tipo da capa: " + this.capaEnum);
        System.out.println("preco: " + this.formatarValor(this.getPreco()));
        System.out.println("a taxa de envio do livro eh: " + this.getTaxaEnvio());
        System.out.println("Preço final: " + this.formatarValor(this.getDesconto(this.preco)));
    }
    public void exibir() {
        JOptionPane.showMessageDialog(null,"nome da editora: " + this.getEditoraLivro().getNomeEditora() +
                "\n nome do site editora: " + this.getEditoraLivro().getSite());
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
    public int getPaginas() {
        return this.paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
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

    public double getTaxaEnvio() {
        return this.preco * 0.05;
    }

    public String formatarValor(double preco){
        return String.format("R$ %.2f", preco);
    }

    public double getDesconto(double preco){
        return preco - (preco * 0.15);
    }



}

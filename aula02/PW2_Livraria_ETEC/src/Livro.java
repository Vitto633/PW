public class Livro {
    private String titulo;
    private String autor;
    private String editora;
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
    public String getEditora(){
        return this.editora;
    }
    public void setEditora(String editora){
        this.editora = editora;
    }

    public void status(){
        System.out.println("titulo: " + this.getTitulo());
        System.out.println("autor: " + this.getAutor());
        System.out.println("editora: " + this.getEditora());
        System.out.println("resumo: " + this.getResumo());
        System.out.println("preco: " + this.getPreco());
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

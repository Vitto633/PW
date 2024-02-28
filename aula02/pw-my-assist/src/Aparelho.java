public class Aparelho {
    private String tipo;
    private String problema;
    private Cliente dono;

    public Aparelho(String tipo, String problema, String nome, String email) {
        this.setTipo(tipo);
        this.setProblema(problema);
        this.dono = new Cliente(nome, email);
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setTipo( String tipo){
        this.tipo = tipo;
    }

    public String getProblema(){
        return this.problema;
    }

    public void setProblema(String problema){
        this.problema = problema;
    }

    public Cliente getDono(){
        return this.dono;
    }

    public void setDono(Cliente dono){
        this.dono = dono;
    }
}

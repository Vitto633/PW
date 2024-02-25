/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programaassistenciatecnica;

/**
 *
 * @author Pichau
 */
public class Cliente {
    private String nome;
    public Aparelho celular;
    private boolean problema;
    
    public Cliente(String nome, Aparelho celular){
        this.setNome(nome);
        
    }
    
    public boolean temProblema(){
        if(this.celular.getContador() == 10){
            this.problema = true;
        }
        else{
            this.problema = false;
        }
        
        return this.problema;
    }
    
    public void setProblema(int valor){
        this.celular.setContador(valor);
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
}

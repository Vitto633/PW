/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programaassistenciatecnica;

/**
 *
 * @author Pichau
 */
public class Aparelho {
    private Cliente dono;
    private String nome;
    private String tipo;
    private int contador = 0;
    
    public int getContador(){
        return this.contador;
    }
    
    public void setContador(int valor){
        this.contador = valor;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    
    public void ligar(){
        if(this.dono.temProblema() == false){
        System.out.println("Celular ligando com sucesso");            
        this.setContador(this.getContador() + 1);
        }
        else{
            System.out.println("Celular estah quebrado nao liga");
        }
    }
}

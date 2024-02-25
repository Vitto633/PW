/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programaassistenciatecnica;

/**
 *
 * @author Pichau
 */
public class Tecnico {
    private String nome;
    private String servico;
    private Cliente aparelho;
    
    public void receberAparelho(Cliente aparelho){
        this.aparelho = aparelho;
    }
    
    public void concertarAparelho(){
        if(this.aparelho.temProblema() == true){
        System.out.println("O " + this.aparelho + " foi concertado com sucesso.");
        this.aparelho.celular.setContador(0);
        }
        else{
            System.out.println("O aparelho nao estah quebrado.");    
        }
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getServico(){
        return this.servico;
    }
    
    public void setServico(String servico){
        this.servico = servico;
    }
}

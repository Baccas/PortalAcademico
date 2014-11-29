/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.portalacademico.Orientador;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Administrator
 */
@ManagedBean
public class Orientador {
    private String nome;
    private int cpf;
    private String instituicao;
    private String titulacao;

    public void setNome (String nomne){
        this.nome=nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setCpf(int cpf){
        this.cpf=cpf;
    }
    public int getCpf(){
        return cpf;

   }
    
    public void setInstituicao(String instituicao){
        this.instituicao=instituicao;
    }
    
    public String getInstituicao(){
        return instituicao;
    }
    
    public void setTitulacao(String titulacao){
        this.titulacao=titulacao;
    }
    
    public String getTitulacao(){
        return titulacao;
    }
    
    
    
}

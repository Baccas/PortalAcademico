/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.portalacademico.publicacao;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Elza
 */
@ManagedBean
public class Publicacao {
    private String titulo;
    private String dataPublicacao;
    private String tipo;

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the dataPublicacao
     */
    public String getDataPublicacao() {
        return dataPublicacao;
    }

    /**
     * @param dataPublicacao the dataPublicacao to set
     */
    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
         
    
    
    
    
}

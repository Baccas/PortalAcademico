/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.portalacademico.publicacao;

import br.com.portalacademico.curso.Curso;
import br.com.portalacademico.Orientador.Orientador;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Elza
 */
@ManagedBean
public class PublicacaoDao {
    
    ArrayList<Publicacao> repPublic = new ArrayList();
    
    public void salvar(Publicacao publicacao){
        repPublic.add(publicacao);
    }
    
    public void remover(String titulo){
        Publicacao publicacao =new Publicacao();
        for (int i = 0; i < repPublic.size(); i++) {
            publicacao = repPublic.get(i);
            if (titulo.equals(publicacao.getTitulo())) {
                repPublic.remove(i);
            }
        }
    }
}
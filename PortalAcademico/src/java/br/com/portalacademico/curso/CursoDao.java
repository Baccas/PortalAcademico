/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.portalacademico.curso;

import br.com.portalacademico.Orientador.Orientador;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Elza
 */
@ManagedBean
public class CursoDao {
    
    ArrayList<Curso> repCurso = new ArrayList();
    
    public void salvar(Curso curso){
        repCurso.add(curso);
    }
    
    public void remover(String nome){
        Curso curso = new Curso();
        for (int i = 0; i < repCurso.size(); i++) {
            curso = repCurso.get(i);
            if (curso.equals(curso.getNome())) {
                repCurso.remove(i);
            }
        }
    }
    
    public ArrayList<Curso> listar(){    
        return repCurso;
    }
    
}

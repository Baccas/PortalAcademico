/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.portalacademico;

import br.com.portalacademico.aluno.Aluno;
import br.com.portalacademico.aluno.AlunoDao;

/**
 *
 * @author Administrator
 */
public class PortalAcademico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Aluno objAluno = new Aluno();
        AlunoDao repositorio = new AlunoDao();
        
        objAluno.setNome("guilherme");
        objAluno.setCpf(1324567);
        objAluno.setMatricula(01065);
        repositorio.salvar(objAluno);
        
        repositorio.remover(objAluno.getMatricula());
        
        
        
        
        
        
         
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.portalacademico.aluno;

import br.com.portalacademico.Orientador.Orientador;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Administrator
 */
@ManagedBean
public class AlunoDao {

    private ArrayList<Aluno> repAluno =  new ArrayList();
    Aluno aluno= new Aluno();
    
    public Aluno test(){
        
        aluno.setNome("Guilherme");
        aluno.setCpf(123);
        aluno.setMatricula(12323);
        return aluno;
    }
    
    public void salvar(Aluno vAluno){
        repAluno.add(vAluno);
    }
    
    public void remover(int matricula){
        Aluno aluno = new Aluno();
        for(int i=0; i<repAluno.size(); i++){
            aluno =repAluno.get(i);
            if(matricula==aluno.getMatricula()){
                repAluno.remove(i);
                i=repAluno.size();
            }
        } 
    }
    
    public Aluno imprimir(){
        return test();
    }
    
    public ArrayList<Aluno> listar(){
        return repAluno;
    }
    
    
    
    
}

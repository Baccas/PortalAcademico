/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.portalacademico.aluno;

import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;

/**
 *
 * @author Elza
 */
@ManagedBean
public class AlunoReceive {
    Aluno aluno = new Aluno();
    AlunoDao alunoRep = new AlunoDao();
    
    
    
    
    public String getNome(){
        aluno =alunoRep.imprimir();
        return aluno.getNome();
        //return "Teste";
    }

    public int getMatricula() {
        return aluno.getMatricula();
    }

    public void setMatricula(int matricula) {
        aluno.setMatricula(matricula);
    }

    public int getCpf() {
        return aluno.getCpf();
    }

    public void setCpf(int cpf) {
        aluno.setCpf(cpf);
    }
    
    public void salvar(ActionEvent e){
        alunoRep.salvar(aluno);
    }
}

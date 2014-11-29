/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.portalacademico.Orientador;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Elza
 */
@ManagedBean
public class OrientadorDao {
    
    private ArrayList<Orientador> repOri = new ArrayList();
    
    public void salvar(Orientador orientador){
        repOri.add(orientador);
    }
    
    public void remover(int cpf){
        Orientador orientador = new Orientador();
        for (int i = 0; i < repOri.size(); i++) {
            orientador=repOri.get(i);
            if (cpf==orientador.getCpf()) {
                repOri.remove(i);
            }
        }
    }
    public ArrayList<Orientador> listar(){
        return repOri;
    }
    
    public void editarTitulo(int cpf, String titulo){
        Orientador orientador = new Orientador();
        for (int i = 0; i < repOri.size(); i++) {
            orientador=repOri.get(i);
            if (cpf==orientador.getCpf()) {
                repOri.remove(i);
                orientador.setTitulacao(titulo);
            }
        }
    }
    
    public void editarInstituicao(int cpf, String instituicao){
        Orientador orientador = new Orientador();
        for (int i = 0; i < repOri.size(); i++) {
            orientador=repOri.get(i);
            if (cpf==orientador.getCpf()) {
                repOri.remove(i);
                orientador.setTitulacao(instituicao);
            }
        }
        
    }
}

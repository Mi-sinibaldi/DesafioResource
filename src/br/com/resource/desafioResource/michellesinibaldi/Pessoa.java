/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.resource.desafioResource.michellesinibaldi;

/**
 *
 * @author mia_a
 */
public class Pessoa {
    
    private ContaCorrente cc;
    private ContaPoupanca cp;
    
    private String nome;

    public Pessoa(ContaCorrente cc, ContaPoupanca cp, String nome) {
        this.cc = cc;
        this.cp = cp;
        this.nome = nome;
    }
    
    

    public ContaCorrente getCc() {
        return cc;
    }

    public void setCc(ContaCorrente cc) {
        this.cc = cc;
    }

    public ContaPoupanca getCp() {
        return cp;
    }

    public void setCp(ContaPoupanca cp) {
        this.cp = cp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    
}

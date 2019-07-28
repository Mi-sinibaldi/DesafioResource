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
public class Lancamento {
    
    private double valor;
    private String tipoTransacao;

    public Lancamento(double valor, String tipoTransacao) {
        this.valor = valor;
        this.tipoTransacao = tipoTransacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(String tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }
    
    
}

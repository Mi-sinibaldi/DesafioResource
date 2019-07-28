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
public class LancamentoDto {
    
    private String agencia;
    private String conta;
    private String valor_transacao;
    private String tipo_transacao;
    private String tipo_conta;
    private String saldo;
    private String nome;

    public LancamentoDto(String agencia, String conta, String valor_transacao, String tipo_transacao,
            String saldo, String tipo_conta, String nome) {
        this.agencia = agencia;
        this.conta = conta;
        this.valor_transacao = valor_transacao;
        this.tipo_transacao = tipo_transacao;
        this.saldo = saldo;
        this.tipo_conta = tipo_conta;
        this.nome = nome;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getConta() {
        return conta;
    }

    public String getValor_transacao() {
        return valor_transacao;
    }

    public String getTipo_transacao() {
        return tipo_transacao;
    }

    public String getSaldo() {
        return saldo;
    }

    public String getTipo_conta() {
        return tipo_conta;
    }

    public String getNome() {
        return nome;
    }
}

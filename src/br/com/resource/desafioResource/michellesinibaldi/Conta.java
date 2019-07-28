package br.com.resource.desafioResource.michellesinibaldi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mia_a
 */
public class Conta {

    private int agencia, conta;
    private double saldo;
    private List<Lancamento> lancamentos = new ArrayList<Lancamento>();
    
    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }
    
    

    public double getSaldo() {
        double saldoConta = 0;
        for (Lancamento lance : lancamentos) {
            if (lance.getTipoTransacao().toLowerCase().equals("credito")) {
                saldoConta = saldoConta + lance.getValor();
            } else if (lance.getTipoTransacao().toLowerCase().equals("debito")) {
                saldoConta = saldoConta - lance.getValor();
            }
        }
        return saldoConta;
    }
    
    public boolean adicionarLancamento (String tipoTransacao, double valor){
        lancamentos.add(new Lancamento(valor, tipoTransacao));
        return true;
    }
}

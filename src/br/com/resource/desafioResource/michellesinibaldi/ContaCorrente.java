
package br.com.resource.desafioResource.michellesinibaldi;

/**
 *
 * @author mia_a
 */
public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int conta) {
        this.setAgencia(agencia);
        this.setConta(conta);
    }
   

    public boolean sacar(double valor) {
        valor = valor + 10;
        if (valor < 0) {
            return false;
        }
        if (this.getSaldo() >= valor) {
            double aux = this.getSaldo() - valor;
            return this.adicionarLancamento("debito", valor);
        }
        return false;
    }

    public boolean depositar(double valor) {
        if (valor < 0) {
            return false;
        }
        double aux = this.getSaldo() + valor;
        return this.adicionarLancamento("credito", valor);
    }
}

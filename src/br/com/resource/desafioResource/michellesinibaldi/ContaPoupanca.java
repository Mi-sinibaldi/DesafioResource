
package br.com.resource.desafioResource.michellesinibaldi;

/**
 *
 * @author mia_a
 */
public class ContaPoupanca extends Conta {
    
    public ContaPoupanca(int id, double saldo) {
        this.setId(id);
        this.setSaldo(saldo);
    }
    
    public boolean sacar(double valor) {
        valor = valor + 10;
        if (valor < 0) {
            return false;
        }
        if (this.getSaldo() >= valor) {
            double aux = this.getSaldo() - valor;
            this.setSaldo(aux);
            return true;

        }
        return false;
    }
    
    public boolean depositar(double valor) {
        if (valor < 0) {
            return false;
        }
        double aux = this.getSaldo() + valor;

        this.setSaldo(aux);
        return true;
    }
    
}

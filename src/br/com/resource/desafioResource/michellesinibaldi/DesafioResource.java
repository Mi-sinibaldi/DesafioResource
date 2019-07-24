/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.resource.desafioResource.michellesinibaldi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mia_a
 */
public class DesafioResource {

    /**
     * @param args the command line arguments
     */
    public static Scanner entrada;

    public static List<Pessoa> pessoas = new ArrayList<Pessoa>();

    ;

    public static void main(String[] args) {

        pessoas.add(new Pessoa(new ContaCorrente(1, 200), new ContaPoupanca(1, 300), 1, "Murilo"));
        pessoas.add(new Pessoa(new ContaCorrente(2, 500), new ContaPoupanca(2, 100), 2, "Michelle"));
        pessoas.add(new Pessoa(new ContaCorrente(3, 50), new ContaPoupanca(3, 150), 3, "Henrique"));
        pessoas.add(new Pessoa(new ContaCorrente(4, 750), new ContaPoupanca(4, 1200), 4, "Cleyton"));

        entrada = new Scanner(System.in);
        boolean sair = false;
        while (!sair) {
            System.out.println("Escolha uma operação:");
            System.out.println("(1) mostrar saldos de todos os clientes");
            System.out.println("(2) sacar");
            System.out.println("(3) depositar");
            System.out.println("(4) transferir");
            System.out.println("(5) sair");
            System.out.print("Opção escolhida: ");
            int escolha = entrada.nextInt();
            System.out.println();

            int idPessoa = 0, tipoConta;
            double valor, saldo = 0;

            switch (escolha) {
                case 1:
                    mostrarSaldos(idPessoa, saldo);
                    break;
                case 2:
                    System.out.println("Digite o id do titular da Conta que deseja"
                            + "realizar o saque: ");
                    idPessoa = entrada.nextInt();
                    System.out.println("Digite o tipo da Conta: (Corrente - 1 / Poupança - 2)");
                    tipoConta = entrada.nextInt();
                    System.out.println("Digite o valor do saque:");
                    valor = entrada.nextDouble();
                    System.out.println(sacar(idPessoa, tipoConta, valor));
                    break;
                case 3:
                    System.out.println("Digite o id do titular da Conta que deseja"
                            + "realizar o deposito:");
                    idPessoa = entrada.nextInt();
                    System.out.println("Digite o tipo da Conta: (Corrente - 1 / Poupança - 2)");
                    tipoConta = entrada.nextInt();
                    System.out.println("Digite o valor que deseja depositar:");
                    valor = entrada.nextDouble();
                    System.out.println(depositar(idPessoa, tipoConta, valor));
                    break;
                case 4:
                    System.out.println("Digite o id do titular da Conta que deseja"
                            + "realizar a transferencia:");
                    idPessoa = entrada.nextInt();
                    System.out.println("Digite o tipo da Conta: (Corrente - 1 / Poupança - 2)");
                    tipoConta = entrada.nextInt();
                    System.out.println("Digite o valor da Transferencia:");
                    valor = entrada.nextDouble();
                    System.out.println(sacar(idPessoa, tipoConta, valor));

                    break;
                case 5:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            System.out.println();
        }
        System.out.println("Fim do programa!");
    }

    public static void mostrarSaldos(int idPessoas, double saldo) {
        System.out.println("Saldos de todos os clientes cadastrados:");
       for (Pessoa p : pessoas) {
           System.out.println("Nome: " + p.getNome() + " tem na conta corrente: R$"
                   + "" + p.getCc().getSaldo()
            + " e tem na conta poupança: R$ " + p.getCp().getSaldo());  
       }
        System.out.println();
    }
    
    
    private static String depositar(int idPessoa, int tipoConta, double valor) {
        if (valor <= 0) {
            return "Valor deve ser maior que zero!";
        }
        for (Pessoa p : pessoas) {
            if (p.getId() == idPessoa) {

                switch (tipoConta) {
                    case 1:
                        if (p.getCc().depositar(valor)) {
                            return "Deposito na Conta Corrente foi finalizado com sucesso!";
                        } else {
                            return "Deposito na Conta Corrente foi finalizado com Erro!";
                        }
                    case 2:
                        if (p.getCp().depositar(valor)) {
                            return "Deposito na Conta Poupança foi finalizado com sucesso!";
                        } else {
                            return "Deposito na Conta Poupança foi finalizado com Erro!";
                        }
                    default:
                        return "Tipo de Conta invalida";
                }

            }
        }
        return "Conta não encontrada!";
    }

    private static String sacar(int idPessoa, int tipoConta, double valor) {
        if (valor <= 0) {
            return "Valor deve ser maior que zero!";
        }
        for (Pessoa p : pessoas) {
            if (p.getId() == idPessoa) {
                switch (tipoConta) {
                    case 1:
                        if (p.getCc().sacar(valor)) {
                            return "Saque na Conta Corrente foi finalizado com sucesso!";
                        } else {
                            return "Saque na Conta Corrente foi finalizado com Erro!";
                        }
                    case 2:
                        if (p.getCp().sacar(valor)) {
                            return "Saque na Conta Poupança foi finalizado com sucesso!";
                        } else {
                            return "Saque na Conta Poupança foi finalizado com Erro!";
                        }
                    default:
                        return "Tipo de Conta invalida";
                }

            }
        }
        return "Conta não encontrada!";
    }

    private String Transaferir(int idPessoaOrigem, int tipoContaOrigem, double valor, int idPessoaDest, int tipoContaDest) {
        if (valor <= 0) {
            return "Valor deve ser maior que zero!";
        }
        boolean PessoaOrigemExiste = false;
        boolean PessoaOrigemTemSaldo = false;
        boolean PessoaDestExiste = false;

        for (Pessoa p : pessoas) {
            if (p.getId() == idPessoaOrigem) {
                PessoaOrigemExiste = true;
                switch (tipoContaOrigem) {
                    case 1:
                        if (p.getCc().getSaldo() > (valor + 10)) {
                            PessoaOrigemTemSaldo = true;
                        }
                    case 2:
                        if (p.getCp().getSaldo() > (valor + 10)) {
                            PessoaOrigemTemSaldo = true;
                        }
                    default:
                        return "Tipo de Conta invalida";
                }

            }
            if (p.getId() == idPessoaDest) {
                PessoaDestExiste = true;
            }
        }
        
        for (Pessoa p : pessoas) {
            if (p.getId() == idPessoaOrigem) {
                switch (tipoContaOrigem) {
                    case 1:
                        p.getCc().sacar(valor);
                    case 2:
                        p.getCp().sacar(valor);
                    default:
                        return "Tipo de Conta invalida";
                }

            }
            if (p.getId() == idPessoaDest) {
                switch (tipoContaDest) {
                    case 1:
                        p.getCc().depositar(valor);
                    case 2:
                        p.getCp().depositar(valor);
                    default:
                        return "Tipo de Conta invalida";
                }
            }
        }

        return "Transferencia efetuada com sucesso!";
    }

}

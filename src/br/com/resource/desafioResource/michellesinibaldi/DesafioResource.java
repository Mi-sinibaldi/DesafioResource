/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.resource.desafioResource.michellesinibaldi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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

    public static List<Pessoa> pessoas = new ArrayList<>();

    public static void main(String[] args) {
        carregarContas();
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
            System.out.println("Nome: " + p.getNome());
            if (p.getCc() != null) {
                System.out.println("Saldo CC: " + p.getCc().getSaldo());
            }

            if (p.getCp() != null) {
                System.out.println("Saldo CP: " + p.getCp().getSaldo());
            }

        }
        System.out.println();
    }

    private static String depositar(int idPessoa, int tipoConta, double valor) {
        if (valor <= 0) {
            return "Valor deve ser maior que zero!";
        }
//        for (Pessoa p : pessoas) {
//            if (p.getId() == idPessoa) {
//
//                switch (tipoConta) {
//                    case 1:
//                        if (p.getCc().depositar(valor)) {
//                            return "Deposito na Conta Corrente foi finalizado com sucesso!";
//                        } else {
//                            return "Deposito na Conta Corrente foi finalizado com Erro!";
//                        }
//                    case 2:
//                        if (p.getCp().depositar(valor)) {
//                            return "Deposito na Conta Poupança foi finalizado com sucesso!";
//                        } else {
//                            return "Deposito na Conta Poupança foi finalizado com Erro!";
//                        }
//                    default:
//                        return "Tipo de Conta invalida";
//                }
//
//            }
//        }
        return "Conta não encontrada!";
    }

    private static String sacar(int idPessoa, int tipoConta, double valor) {
        if (valor <= 0) {
            return "Valor deve ser maior que zero!";
        }
//        for (Pessoa p : pessoas) {
//            if (p.getId() == idPessoa) {
//                switch (tipoConta) {
//                    case 1:
//                        if (p.getCc().sacar(valor)) {
//                            return "Saque na Conta Corrente foi finalizado com sucesso!";
//                        } else {
//                            return "Saque na Conta Corrente foi finalizado com Erro!";
//                        }
//                    case 2:
//                        if (p.getCp().sacar(valor)) {
//                            return "Saque na Conta Poupança foi finalizado com sucesso!";
//                        } else {
//                            return "Saque na Conta Poupança foi finalizado com Erro!";
//                        }
//                    default:
//                        return "Tipo de Conta invalida";
//                }
//
//            }
//        }
        return "Conta não encontrada!";
    }

    private String Transaferir(int idPessoaOrigem, int tipoContaOrigem, double valor, int idPessoaDest, int tipoContaDest) {
        if (valor <= 0) {
            return "Valor deve ser maior que zero!";
        }
        boolean PessoaOrigemExiste = false;
        boolean PessoaOrigemTemSaldo = false;
        boolean PessoaDestExiste = false;

//        for (Pessoa p : pessoas) {
//            if (p.getId() == idPessoaOrigem) {
//                PessoaOrigemExiste = true;
//                switch (tipoContaOrigem) {
//                    case 1:
//                        if (p.getCc().getSaldo() > (valor + 10)) {
//                            PessoaOrigemTemSaldo = true;
//                        }
//                    case 2:
//                        if (p.getCp().getSaldo() > (valor + 10)) {
//                            PessoaOrigemTemSaldo = true;
//                        }
//                    default:
//                        return "Tipo de Conta invalida";
//                }
//
//            }
//            if (p.getId() == idPessoaDest) {
//                PessoaDestExiste = true;
//            }
//        }
//
//        for (Pessoa p : pessoas) {
//            if (p.getId() == idPessoaOrigem) {
//                switch (tipoContaOrigem) {
//                    case 1:
//                        p.getCc().sacar(valor);
//                    case 2:
//                        p.getCp().sacar(valor);
//                    default:
//                        return "Tipo de Conta invalida";
//                }
//
//            }
//            if (p.getId() == idPessoaDest) {
//                switch (tipoContaDest) {
//                    case 1:
//                        p.getCc().depositar(valor);
//                    case 2:
//                        p.getCp().depositar(valor);
//                    default:
//                        return "Tipo de Conta invalida";
//                }
//            }
//        }
        return "Transferencia efetuada com sucesso!";
    }

    public static void carregarContas() {
        List<LancamentoDto> dto = ArquivoHelper.Read("C:\\Users\\mia_a\\Desktop\\conta\\conta_desafio.csv");
        for (LancamentoDto lancamento : dto) {
            if (pessoas.isEmpty()) {
                if (lancamento.getConta().toLowerCase().equals("contacorrente")) {
                    //Crio um conta corrente em memoria
                    ContaCorrente cc = new ContaCorrente(Integer.parseInt(lancamento.getAgencia()), Integer.parseInt(lancamento.getConta()));
                    //Adiciono o lancamento a conta
                    cc.adicionarLancamento(lancamento.getTipo_transacao(), Double.parseDouble(lancamento.getValor_transacao()));
                    //Crio o Objeto Pessoa e inicializo ele
                    Pessoa p = new Pessoa(
                            cc, null, lancamento.getNome()
                    );
                    //Adiciono pessoa a minha lista
                    pessoas.add(p);
                } else {
                    ContaPoupanca cp = new ContaPoupanca(Integer.parseInt(lancamento.getAgencia()), Integer.parseInt(lancamento.getConta()));
                    //Adiciono o lancamento a conta
                    cp.adicionarLancamento(lancamento.getTipo_transacao(), Double.parseDouble(lancamento.getValor_transacao()));
                    //Crio o Objeto Pessoa e inicializo ele
                    Pessoa p = new Pessoa(
                            null, cp, lancamento.getNome()
                    );
                    //Adiciono pessoa a minha lista
                    pessoas.add(p);
                    continue;
                }

            } else {
                int tamanho = pessoas.size();
                Boolean Atualizado = false;

                for (int i = 0; i < tamanho; i++) {
                    Pessoa p = pessoas.get(i);
                    ///Achar o fela na lista
                    if (p.getNome().equals(lancamento.getNome())) {
                        if (lancamento.getTipo_conta().toLowerCase().equals("contacorrente")) {
                            if (p.getCc() != null) {
                                p.getCc().adicionarLancamento(lancamento.getTipo_transacao(), Double.parseDouble(lancamento.getValor_transacao()));
                            } else {
                                p.setCc(new ContaCorrente(Integer.parseInt(lancamento.getAgencia()), Integer.parseInt(lancamento.getConta())));
                                p.getCc().adicionarLancamento(lancamento.getTipo_transacao(), Double.parseDouble(lancamento.getValor_transacao()));
                            }
                        } else {
                            if (p.getCp() != null) {
                                p.getCp().adicionarLancamento(lancamento.getTipo_transacao(), Double.parseDouble(lancamento.getValor_transacao()));
                            } else {
                                p.setCp(new ContaPoupanca(Integer.parseInt(lancamento.getAgencia()), Integer.parseInt(lancamento.getConta())));
                                p.getCp().adicionarLancamento(lancamento.getTipo_transacao(), Double.parseDouble(lancamento.getValor_transacao()));
                            }
                        }
                        Atualizado = true;
                    }

                }
                if (Atualizado == false) {
                    if (lancamento.getTipo_conta().toLowerCase().equals("contacorrente")) {
                        //Crio um conta corrente em memoria
                        ContaCorrente cc = new ContaCorrente(Integer.parseInt(lancamento.getAgencia()), Integer.parseInt(lancamento.getConta()));
                        //Adiciono o lancamento a conta
                        cc.adicionarLancamento(lancamento.getTipo_transacao(), Double.parseDouble(lancamento.getValor_transacao()));
                        //Crio o Objeto Pessoa e inicializo ele
                        Pessoa pcc = new Pessoa(
                                cc, null, lancamento.getNome()
                        );
                        //Adiciono pessoa a minha lista
                        pessoas.add(pcc);
                    } 
                    
                    if (lancamento.getTipo_conta().toLowerCase().equals("contapoupanca")) {
                        ContaPoupanca cp = new ContaPoupanca(Integer.parseInt(lancamento.getAgencia()), Integer.parseInt(lancamento.getConta()));
                        //Adiciono o lancamento a conta
                        cp.adicionarLancamento(lancamento.getTipo_transacao(), Double.parseDouble(lancamento.getValor_transacao()));
                        //Crio o Objeto Pessoa e inicializo ele
                        Pessoa pcp = new Pessoa(
                                null, cp, lancamento.getNome()
                        );
                        //Adiciono pessoa a minha lista
                        pessoas.add(pcp);
                    }
                }

            }
        }
    }
}

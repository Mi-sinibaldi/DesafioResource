/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.resoure.lerEscreverArquivoTxt;

/**
 *
 * @author mia_a
 */
public class LerEscreverArquivo {

    public static void main(String[] args) {
        String arq = "conta.txt";

        //GRAVAÇÃO
        String texto = "agencia;conta;valor_transacao;tipo_transacao;saldo\n"
                + "125;5479;R$ 500;entarda;R$ 500\n"
                + "475;5796;R$ 158;saida;R$ 367\n"
                + "157;3647;R$ 612;saida;R$ 212\n"
                + "267;8900;R$ 80;saida;R$ 12,68";

        if (Arquivo.Write(arq, texto)) {
            System.out.println("Arquivo salvo com sucesso!");
        } else {
            System.out.println("Erro ao salvar o arquivo!");
        }

        //LEITURA
        String text = Arquivo.Read(arq);
        if (texto.isEmpty()) {
            System.out.println("Erro ao ler do arquivo!");
        } else {
            System.out.println(texto);
        }

    }

}

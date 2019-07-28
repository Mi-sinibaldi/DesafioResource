/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.resource.desafioResource.michellesinibaldi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mia_a
 */
public class ArquivoHelper {

    public static List<LancamentoDto> Read(String Caminho) {
        List<LancamentoDto> lancamentos = new ArrayList<LancamentoDto>();
        try {
            FileReader arq = new FileReader(Caminho);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = "";
            try {
                linha = lerArq.readLine();
                //ignorar a primeira linhda o arquivo
                int contador = 0;
                while (linha != null) {
                    if (contador != 0) {
                        String[] array = linha.split(";");
                        lancamentos.add(new LancamentoDto(array[0],
                                array[1], array[2], array[3],
                                array[4], array[5], array[6]));
                    }
                    contador++;
                    linha = lerArq.readLine();
                }
                arq.close();
                return lancamentos;
            } catch (IOException e) {
                System.out.println("Não foi possível ler o arquivo!");
                return null;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
            return null;
        }
    }

    public static boolean Write(String Caminho, String Texto) {
        try {
            FileWriter arq = new FileWriter(Caminho);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.println(Texto);
            gravarArq.close();
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}

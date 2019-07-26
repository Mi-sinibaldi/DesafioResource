/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.resource.lerEscreverArquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author mia_a
 */
public class Arquivo {

    //metodo necessário para a leitura do arquivo
    public static String Read(String caminho) throws FileNotFoundException {
        String text = "";
        try {
            FileReader file = new FileReader(caminho);
            //O buffer é quando o programa ler um pouquinho e carrega um pouquinho por vez
            BufferedReader readFile = new BufferedReader(file);
            String linha = "";
            try {
                linha = readFile.readLine();
                while (linha != null) {
                    text += linha + "\r\n";
                    String array[] = new String[5];
                    text.split(";");
                    linha = readFile.readLine();
                }
                file.close();
                return text;
            } catch (IOException e) {
                System.out.println("Não foi possível ler o arquivo!");
                return "";
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
            return "";
        }
    }

    //metodo necessário para a escrita do arquivo
    public static boolean Write(String caminho, String text) throws IOException {
        try {
            FileWriter file = new FileWriter(caminho);
            //é como uma impressora. Mostro o que eu quero "imprimir"
            PrintWriter saveFile = new PrintWriter(file);
            //uso o println para converser tudo para string
            saveFile.println(text);
            saveFile.close();
            return true;

            //caso algo de errado ao salvar meu arquivo, imprpimo a mensagem de erro no console.
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}

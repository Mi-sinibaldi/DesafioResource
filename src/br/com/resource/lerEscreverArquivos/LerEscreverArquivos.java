/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.resource.lerEscreverArquivos;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author mia_a
 */
public class LerEscreverArquivos {

    public static void main(String[] args) throws IOException {   
        
        String file = "C:/Users/mia_a/Desktop/conta/conta_desafio.csv";

        String textRead = Arquivo.Read("conta.txt");
        if (textRead.isEmpty()) {
            System.out.println("Não é possível ler, o arquivo esta vazio!");
        } else {
            System.out.println(textRead);
        }
    }

}

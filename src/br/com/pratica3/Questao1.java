package br.com.pratica3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/*
    Implemente uma pilha que leia um arquivo de texto contendo frases
    buscadas em um software, como uma lista de frases de busca do Google.
    O programa deverá empilhar todo conteúdo em uma estrutura de pilha.
    Mostrar as top 10 frases mais buscadas por último
    Desempilhar o restante dos dados depois da 10ª frase.
*/
public class Questao1 {
    public void Frases() {

        try {
            Stack frases = new Stack();
            Scanner scan = new Scanner(new File("Frases.txt"));

            while (scan.hasNextLine()) {
                frases.push(scan.nextLine());
            }
            for (int i = 0; i < 10; i++) {
                var txt = frases.pop();
                System.out.println(txt);
            }

            while (!frases.empty()) {
                frases.pop();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

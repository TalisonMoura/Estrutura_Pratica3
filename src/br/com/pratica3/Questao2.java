package br.com.pratica3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.util.*;

/*
    Implemente uma estrutura de fila que corresponde a entrada de pessoas em um show de rock.
    O programa deverá receber um arquivo de ingressos vendidos e colocá-los na fila.
    Os 10 primeiros ingressos vendidos serão exibidos na tela para entrada VIP.
    O programa também sorteará aleatoriamente uma posição da Fila para exibir o
    ingresso com a descrição "Pessoa de Sorteada para conhecer a banda"
*/
public class Questao2 {
    public void Ingressos() throws FileNotFoundException {
        Random random = new Random();
        Queue<String> ingressos = new PriorityQueue<>();
        Scanner scan = new Scanner(new File("Ingressos.txt"));

        while (scan.hasNextLine()) {
            ingressos.add(scan.nextLine());
        }

        for (int i = 0; i < 20; i++) {
            ingressos.poll();
        }

        int sort = random.nextInt(ingressos.size());
        System.out.println("Sorteado: " + sort);
        System.out.println("Ingressos Antecipados: " + ingressos);
    }
}

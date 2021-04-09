package mepo02;

import java.util.Random;
import java.util.Scanner;

public class MEPO02 {

    public static void main(String[] args) {
        Random gerador = new Random(); // biblioteca do java para gerar numeros aleatÃ³rios

        int array[] = new int[10];  // criando o array com n posiÃ§Ãµes

        for (int i = 0; i < array.length; i++) {
            array[i] = gerador.nextInt(); // usando o gerador de numeros aleatorios para alimentar os espaÃ§os do array
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.println();
        System.out.println();

        String sequencia = "";
        int somaMaior = 0;
        int somaAtual = 0;

        for (int i = 0; i < array.length -2; i++) {
            somaAtual = array[i] + array[i + 1] + array[i + 2];
            System.out.println(array[i] + " + " + array[i + 1] + " + " + array[i + 2] + " = " + somaAtual);
            if (somaAtual > somaMaior) {
              somaMaior = somaAtual;
              sequencia = array[i] + " + " + array[i + 1] + " + " + array[i + 2] + " = " + somaAtual;
            }
        }

        System.out.println();
        System.out.println("Maior soma Ã©: " + sequencia);
    }
    
}

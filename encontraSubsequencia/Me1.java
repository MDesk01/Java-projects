package mepo02;
import java.util.Random;
import java.util.Scanner;

public class MEPO02 {

    public static void main(String[] args) {
        Random gerador = new Random(); //+1

        int array[] = new int[10];  //+1

        for (int i = 0; i < array.length; i++) { //1+1+n+n
            array[i] = gerador.nextInt(); //10
        }

        for (int i = 0; i < array.length; i++) { //1+1+n+n
            System.out.print(array[i] + ", "); //+10
        }

        System.out.println(); //0
        System.out.println();//0

        String sequencia = ""; //+1
        int somaMaior = 0; //+n
        int somaAtual = 0; //+n

        for (int i = 0; i < array.length -2; i++) { //1+1+n+n
            somaAtual = array[i] + array[i + 1] + array[i + 2]; //+1
            System.out.println(array[i] + " + " + array[i + 1] + " + " + array[i + 2] + " = " + somaAtual); //+1
            if (somaAtual > somaMaior) { //+1
              somaMaior = somaAtual; //+1
              sequencia = array[i] + " + " + array[i + 1] + " + " + array[i + 2] + " = " + somaAtual; //+1
            }
        }

        System.out.println();
        System.out.println("Maior soma: " + sequencia); //+1
    }
}
//contagem de instruções: 35 + 8n
//complexidade: O(1+n^2) =>N (é a quantidade de entradas/saídas de iterações);
//                       =>1+ (é o if aninhado com o For)
//Esse algoritmo é bom, pois: dispensa entrada de informações, realiza a contagem automaticamente com números inteiros(positivos ou não)
// tempo de execução 0.055ms
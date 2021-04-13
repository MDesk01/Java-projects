package main;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    arvorebinaria a =new arvorebinaria();
    int op=0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("MENU");
            System.out.println("1- Inserir um numero.");
            System.out.println("2- In Ordem.");
            System.out.println("3- Pós Ordem.");
            System.out.println("4 - Pré Ordem.");
            op=scan.nextInt();
            if (op==1){
                int num=0;
                System.out.println("Digite o numero.");
                num=scan.nextInt();
                a.inserir(num);

            }
            if (op==2){
                a.InOrdem();
            }
            if (op==3){
                a.PosOrdem();
            }
            if (op==4){
                a.PreOrdem();
            }
        }while(op!=0);
    }
}
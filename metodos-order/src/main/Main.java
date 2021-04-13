package main;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    ArvoreBinaria a =new ArvoreBinaria();
    int x=0;
        Scanner ler = new Scanner(System.in);

        do {
            System.out.println("MÉTODOS DE ORDENAÇÃO");
            System.out.println("1- Inserir um numero");
            System.out.println("2- In Ordem");
            System.out.println("3- Pós Ordem");
            System.out.println("4 - Pré Ordem");
            System.out.println("0 - Sair");
            x=ler.nextInt();
            if (x==1){
                int num=0;
                System.out.println("Digite o numero.");
                num=ler.nextInt();
                a.inserir(num);
            }
            if (x==2){
                a.InOrdem();
            }
            if (x==3){
                a.PosOrdem();
            }
            if (x==4){
                a.PreOrdem();
            }
        }while(x!=0);
    }
}
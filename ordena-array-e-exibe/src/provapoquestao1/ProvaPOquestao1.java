package provapoquestao1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ProvaPOquestao1 {

    public static void main(String[] args) {
        
        //GERANDO ARRAY COM NÚMERO ALEATÓRIOS SEM REPETIÇÕES
        Random gerador = new Random();
        int array[] = new int[40];
        int numero;
      
        for(int i=0; i<array.length; i++){
             numero = gerador.nextInt(100)+1;
             for(int j=0; j<array.length; j++){
                   if(numero == array[j] && j != i){
                         numero = gerador.nextInt(100) + 1;
                   }else{
                        array[i] = numero;
                   }
             }
        }
        //IMPRIMINDO OS NÚMEROS GERADOS
        System.out.println("Números gerados: ");
                for(int i=0; i<array.length; i++){
             System.out.print("["+array[i]+"]");
        }
        System.out.println();   

        //COMPARANDO E FORMANDO PARES SEM REPETIÇÕES
        System.out.println("Todas as combinações possíveis em pares:");
        List<List<Integer>> pairs = new ArrayList<>();
array = Arrays.stream(array).distinct().toArray();

for (int i = 0; i < array.length - 1; i++) {
    for (int j = i + 1; j < array.length; j++) {
        List<Integer> pair = new ArrayList<>();
        pair.add(array[i]);
        pair.add(array[j]);
        pairs.add(pair);
    }
}    
for (List<?> pair : pairs) {
    System.out.println(pair);
}
    }
    
}

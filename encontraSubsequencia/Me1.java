package me1;

/**
 *
 * @author maateus a.
 */
public class Me1 {
        
    private static final int  A[] = {-2,3,4,12,7,-5,-11,-17,34,33,35};
    private static int maior[], maiorPos;

    public static void main(String[] args) {
        maior = new int[A.length];
        maiorPos = 0;
        int s[] = new int[A.length];
        for (int i = 0; i < s.length; i++) {
            s[i] = 0;
        }
        subsequenciaMaxima(s, 0, 0, 0);
        print(maior, maiorPos);
        
    }

    public static void subsequenciaMaxima(int s[], int pos, int posSol, int i) {
        for (int j = pos; j < A.length; j++) {
            if (i <= A[j]) {
                s[posSol] = (int) A[j];
                subsequenciaMaxima(s, j + 1, posSol + 1, A[j]);
            } else {
                verificaMaior(s, posSol);
            }
        }
        verificaMaior(s, posSol);
    }

    public static void print(int[] v, int lastPos) {
        System.out.println("Maior subsequência: ");
        for (int i = 0; i < lastPos; i++) {
            
        System.out.print(v[i] + " ");
        }
        System.out.println("");
    }
    
    private static void verificaMaior(int[] s, int posSol) {
        if (posSol > maiorPos) {
            for (int i = 0; i < s.length; i++) {
                maior[i] = s[i];
            }
            maiorPos = posSol;
        }
    }
    
    
}

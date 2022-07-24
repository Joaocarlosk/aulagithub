package matriz;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        
        Scanner le = new Scanner(System.in);

        int n = le.nextInt();

        int[][] mat = new int[n][n];
        
        // Método length em vetores          
        for (int i=0; i<mat.length; i++){ //QUANTIDADE DE LINHAS 
            for (int j=0; j<mat[i].length; j++){ //QUANTIDADE DE COLUNAS
                mat[i][j] = le.nextInt();
            }
        }
        
        /*for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                mat[i][j] = le.nextInt();
            }
        }*/

        System.out.println();
        System.out.println("Main Diagonal");
        for (int i=0; i<n; i++){
            System.out.print(mat[i][i] + " ");
        }

        System.out.println();

        int cont = 0;
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (mat[i][i] < 0){
                    System.out.print(mat[i][i] + " ");
                    cont++;
                }
            }
        }
        System.out.println();
        System.out.println("Negative numbers: " + cont);
    }
    
}

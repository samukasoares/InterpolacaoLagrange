
package interpolacaolagrange;

import java.util.Scanner;

public class InterpolacaoDeLagrange {
    public static void main(String[] args){
       Scanner entrada = new Scanner (System.in);
        int i,k,n,cont=0;
       double x[] = new double [10];
       double y[] = new double [10];
       double xin, yin, L = 0;
       
        System.out.print("Dê o número total de pontos disponíveis: ");
        n = entrada.nextInt();
        System.out.println("");
        
        for(i = 0; i<=n-1; i++){
            cont++;
            System.out.println("Dê o " + cont + "º valor de X e o correspondente de Y...");
            System.out.print("X: ");
            x[i] = entrada.nextDouble();
            
            System.out.print("Y: ");
            y[i] = entrada.nextDouble();
            
            System.out.println("");
        }
        
        System.out.print("Dê o valor de X para interpolação: ");
        xin = entrada.nextDouble();
        yin = 0;
        
        for(k=0; k<=n-1; k++){
            L = 1;
                for (i=0; i<= n-1; i++){
                    if (i!= k){
                        L = L * ((xin-x[i])/(x[k]-x[i]));
                    }
                }   
          yin = L * y[k] + yin;      
        }
        
        System.out.println("");
        System.out.println("X: " + xin + "    Y: "+ yin);
    }
    
}

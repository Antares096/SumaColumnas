package matrizsumacolumna;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
       int numeros [][] = MatrizColumnas();
       
       int totales [] = SumatoriaColumna(numeros);
       ImprimeListaSumatorias(totales);
    }
    
    public static int [][] MatrizColumnas()
    {
        int m_numero [][] = new int[4][4];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 4; i++) 
        {
            for(int j = 0; j < 4; j++)
            {
                m_numero[i][j] = sc.nextInt();
            }
        }
        String renglon = "";
        
        System.out.println("Números ordenados en forma de matriz: ");
        
        for (int i = 0; i < 4; i++)
        {
            renglon = "";
            for (int j = 0; j < 4; j++) 
            {
                renglon = renglon +" "+m_numero[i][j];
            }
            System.out.println(renglon);
        }
        
        return m_numero;
    }
    
    public static int [] SumatoriaColumna(int [][] numeros)
    {
        int total_columna [] = new int[4];
        int sumatoria = 0;
        
        for(int i = 0; i < numeros.length; i++)
        {
            for(int j = 0; j < numeros.length; j++)
            {
                sumatoria += numeros[j][i];  
            }
            total_columna[i] = sumatoria;
            sumatoria = 0;
        }
        
        return total_columna;
    }
    
    public static void ImprimeListaSumatorias(int totales [])
    {
        System.out.println("Lista de números: ");
        
        for(int i = 0; i < totales.length; i++)
        {
            System.out.println("T["+(i+i)+"]= "+totales[i]);
        }
    }
}

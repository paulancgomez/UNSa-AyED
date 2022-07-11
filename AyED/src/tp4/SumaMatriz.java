package tp4;

import java.util.Scanner;

/*
  Suma los elementos de una matriz 
 
*/

public class SumaMatriz {

	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		int m,n;
		System.out.println("ingrese el numero de filas: ");
		m= dato.nextInt();
		
		System.out.println("ingrese el numero de columnas: ");
		n= dato.nextInt();
		
		int matriz[][]= new int[m][n];
		
		int elemento;
		
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++) {
			   System.out.println("ingrese elemento: ");
			   elemento= dato.nextInt();
			   matriz[i][j] = elemento;
			}
		}
		
		dato.close();
        
		//int suma=sumaMatriz(matriz,0,0,0);
		
		int suma=sumaMatriz(matriz,m-1,n-1,n-1);
        System.out.println("La suma de los elementos de la matriz es: "+suma);
	}

	/*
	static int sumaMatriz(int matriz[][], int i, int j, int suma) {
		if(i>=matriz.length) {
			return suma;
		}
		suma=suma+matriz[i][j];
		j++;
		if(j>=matriz[0].length) {
			i=i+1;
			j=0;
		}
		return sumaMatriz(matriz, i, j, suma);
	}
	*/
	
	static int sumaMatriz(int matriz[][], int m, int n, int j) {
		if(m<0)
			return 0;
		if(j<0)
			return sumaMatriz(matriz,m-1,n,n);
		else
		    return matriz[m][j]+sumaMatriz(matriz,m,n,j-1);
			
	}
	
}

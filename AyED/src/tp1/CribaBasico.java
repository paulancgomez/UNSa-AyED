package tp1;

import java.util.Scanner;

//Implementar la Criba de Eratóstenes para devolver los números primos entre 2 y n.
public class CribaBasico {
	public static void main(String[] args){
		/*int fin,i,j,n;
		
		fin = 12;
		n=fin;
		
		int Vec[] = new int[fin];
		
		for(i=0;i<(fin-1);i++){
			Vec[i] = i+2;
		}
		
		i=0;
		j=i+1;
		
		while(i<(int)Math.sqrt(fin)){ 
			while(j<fin){ 
				if(Vec[j] % Vec[i] == 0){
					for(int k=j;k<(fin-1);k++){
						Vec[k] = Vec[k+1];
					}
					fin=fin-1;
				}
				else{
					j = j+1;
				}
			}
			
			i=i+1;
			j=i+1;
		}
		
		System.out.println("Los numeros primos entre 2 y "+n+" son: ");
		System.out.print(Vec[0]);
		for(int k=1;k<fin;k++){
			System.out.print(" ; "+Vec[k]);
		}*/
		
		//Realice una nueva versión que permita obtener los números primos entre m y n (m<n).
		int m,n;
		
		//Asi se pide los datos por consola:
		Scanner dato = new Scanner(System.in);
		do{
			System.out.println("Ingrese inicio y fin de la lista: ");
			m = dato.nextInt();//se pone .nextInt porque m es un numero entero
			n = dato.nextInt();
		} while(m>=n || m<=1 || n<=1);//controla que sea m>=n,que m no sea negativo o cero y que n no sea negativo o cero 
		dato.close();//cierro o desactivo la variable dato de tipo Scanner
		
		int Vec[] = new int[n];//declaro un vector de 0 a n

		int numCriba = m;//realizo una copia del inicio de la lista
		int fin = ((n-m)+1);//realizo una copia del final de la lista
		
		for(int i=0;i<fin;i++){
			Vec[i] = numCriba;
			numCriba = numCriba + 1;
		}
		
		System.out.println("Los elementos de la lista son: ");
		for(int i=0;i<fin;i++){
			System.out.print(Vec[i]+" ; ");
		}
		System.out.println();
		
		int indice = 0;
		int divisor = 2;
		int ultimoDiv = (int)(Math.sqrt(n));//saco la raiz caudrada del fin de la lista 
		while(divisor <= ultimoDiv){
			while(indice<fin){
				if((Vec[indice]!=divisor) && ((Vec[indice] % divisor) == 0)){
					for(int k=indice;k<(fin-1);k++){
						Vec[k] = Vec[k+1];
					}
					fin = fin -1;
				}
				else{
					indice = indice +1;
				}
			}
			divisor = divisor +1;
			indice = 0;
		}
		System.out.println("Los numeros primos entre "+m+" y "+n+" son:");
		for(int i=0;i<fin;i++){
			System.out.print(Vec[i]+" ; ");
	    }
    }
}
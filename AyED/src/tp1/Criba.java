package tp1;
//Criba de Eratostenes

import java.util.Scanner;

public class Criba {
	public static void main(String[] args){
		Scanner dato = new Scanner(System.in);
		
		int m , n;
		
		do{
			System.out.println("Ingrese inicio de la lista: ");
			m = dato.nextInt();
			
			System.out.println("Ingrese el fin de la lista: ");
			n = dato.nextInt(); 
		}while(m>n || m<=1 || n<=1);
		dato.close();
		
		System.out.println("Los numero primos entre "+m+" y "+n+" son: ");
		criba(m,n);
	}
	
	
	static void CrearVec(int Vec[], int ini){
		for(int i=0;i<(Vec.length);i++){ //.length te dice cual es el tamaño del vector
			Vec[i]=ini;
			ini = ini + 1;
		}
	}
	static void MostrarVec(int Vec[], int fin){
		for(int i=0;i<fin;i++){
			System.out.print(" | "+Vec[i]);
		}
	}
	static void criba(int m , int n){
		int fin = (n-m)+1;
		
		int Vec[] = new int[fin];
		CrearVec(Vec,m);
		
		int divisor = 2;
		while(divisor<=(int)(Math.sqrt(n))){//sqrt se usa para aplicar la raiz cuadrada de n
			int i = 0;
			while(i<fin){
				if(Vec[i] != divisor && (Vec[i]%divisor)==0){
					for(int j=i;j<(fin-1);j++){
						Vec[j] = Vec[j+1];
					}
					fin = fin -1;
				}
				else{
					i = i +1;
				}
			}
			divisor = divisor +1;
		}
		MostrarVec(Vec,fin);
	}
}
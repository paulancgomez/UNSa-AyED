package tp2;

import java.util.Scanner;

public class Mcd {
	public static void main(String[] args){
		Scanner dato = new Scanner(System.in);
		int cant,nro;
		
		System.out.println("Ingrese la cantidad de numeros a analizar: ");
		do{
			cant = dato.nextInt();
		}while(cant<=0);
		
		int vec[]=new int[cant];
		
		for(int i=1;i<cant;i++){
			System.out.println("Ingrese numero: ");
			nro = dato.nextInt();
			vec[i]= nro;
		}
		dato.close();
	}
	
	static boolean esPrimo(int x){
		int pd = 2;
		
		for(int i=2;i<=(x/2);i++){
			if((x%i)==0){//el mod en java se representa con el simbolo %
				pd = pd +1;
			}
		}
		if(pd==2 && x!=1){
			return true;
		}
		else{
			return false;
		}
	}
	
	static void factPrimos2(int nro){
		
		
		if(esPrimo(nro)){
			System.out.println("El unico factor primo del numero "+nro+" es "+nro);
		}
		else{
			int tamVec = (int)Math.sqrt(nro);//sqrt calcula la raiz cuadrada del numero
			tamVec= tamVec+1;//lo agrego por el 8
			int vec[] = new int[tamVec];
			int aux = nro;
			
			int indice=0;
			int posibleDivisor = 2;
			
			while(aux!=1){
				while(esPrimo(posibleDivisor)==true && aux%posibleDivisor==0){
					vec[indice] = posibleDivisor;
					indice=indice+1;
					aux = aux/posibleDivisor;
				}
				posibleDivisor=posibleDivisor+1;
			}
			
			for(int i=0;i<tamVec;i++){
				if(vec[i]!=0){
					System.out.print(" "+vec[i]+" ");
				}
			}	
		}
	}
}